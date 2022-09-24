package br.com.salomaotech.genesys.controller.venda.venda_inicia;

import br.com.salomaotech.genesys.controller.venda.venda_conclui.VendaConcluiController;
import br.com.salomaotech.genesys.model.produto.ProdutoModelo;
import br.com.salomaotech.genesys.model.venda.VendaModelo;
import br.com.salomaotech.genesys.model.venda.VendaModeloItem;
import br.com.salomaotech.genesys.view.JFvendaInicia;
import br.com.salomaotech.sistema.algoritmos.BigDecimais;
import br.com.salomaotech.sistema.algoritmos.ConverteNumeroParaMoedaBr;
import br.com.salomaotech.sistema.jpa.Repository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VendaIniciaMetodos {

    private final JFvendaInicia view;
    private VendaModelo vendaModelo = new VendaModelo();
    private List<VendaModeloItem> vendaModeloItemList = new ArrayList();

    public VendaIniciaMetodos(JFvendaInicia view) {
        this.view = view;
    }

    public void exibirProdutoSelecionado(ProdutoModelo produtoModelo) {

        view.jTprodutoCodigo.setText(String.valueOf(produtoModelo.getId()));
        view.jTprodutoDescricao.setText(produtoModelo.getDescricao());
        view.jTprodutoPreco.setText(ConverteNumeroParaMoedaBr.converter(produtoModelo.getValorVenda().toString()));
        view.jTprodutoTotal.setText(ConverteNumeroParaMoedaBr.converter(calcularProdutoSelecionado(produtoModelo).toString()));
        habilitarCamposDeAdicionarProduto(produtoModelo);

    }

    public void limparProdutoSelecionado() {

        exibirProdutoSelecionado(new ProdutoModelo());
        view.jTprodutoQuantidade.setText("");
        view.jTprodutoDesconto.setText("");
        view.jTprodutoTotal.setText("");

        /* evita erro de indexOfBounds no select */
        try {

            view.jCprodutoLista.setSelectedIndex(0);

        } catch (Exception ex) {

            view.jCprodutoLista.addItem("");
            view.jCprodutoLista.setSelectedIndex(0);

        }

    }

    public void adicionarProdutoNaLista(ProdutoModelo produtoModelo) {

        VendaModeloItem vendaModeloItem = new VendaModeloItem();
        vendaModeloItem.setIdProduto(produtoModelo.getId());
        vendaModeloItem.setValor(produtoModelo.getValorVenda());
        vendaModeloItem.setQuantidade(BigDecimais.formatarParaBigDecimal(view.jTprodutoQuantidade.getText()));
        vendaModeloItem.setDesconto(BigDecimais.formatarParaBigDecimal(view.jTprodutoDesconto.getText()));
        vendaModeloItemList.add(vendaModeloItem);

        /* atualiza a view */
        limparProdutoSelecionado();
        exibirProdutosSelecionados();

    }

    public void removerProdutoNaLista() {

        try {

            vendaModeloItemList.remove(view.jTprodutoSelecionado.getSelectedRow());

        } catch (Exception ex) {

        }

        exibirProdutosSelecionados();
        habilitarCamposDeExcluirProdutoAdicionado();

    }

    private void exibirProdutosSelecionados() {

        DefaultTableModel defaultTableModel = (DefaultTableModel) view.jTprodutoSelecionado.getModel();
        defaultTableModel.setNumRows(0);
        int contador = 0;
        BigDecimal valorTotal = new BigDecimal(0);

        for (VendaModeloItem vendaModeloItem : vendaModeloItemList) {

            ProdutoModelo produtoModelo = (ProdutoModelo) new Repository(new ProdutoModelo()).findById(vendaModeloItem.getIdProduto());
            BigDecimal preco = vendaModeloItem.getValor().multiply(vendaModeloItem.getQuantidade()).subtract(vendaModeloItem.getDesconto());

            Object[] linhaDefaultTableModel = new Object[]{
                vendaModeloItem.getQuantidade(),
                produtoModelo.getNome(),
                ConverteNumeroParaMoedaBr.converter(vendaModeloItem.getDesconto().toString()),
                ConverteNumeroParaMoedaBr.converter(preco.toString())

            };

            valorTotal = valorTotal.add(preco);
            defaultTableModel.insertRow(contador, linhaDefaultTableModel);
            contador++;

        }

        view.jTvendaValorTotal.setText(ConverteNumeroParaMoedaBr.converter(valorTotal.toString()));

    }

    public BigDecimal calcularProdutoSelecionado(ProdutoModelo produtoModelo) {

        BigDecimal quantidade = BigDecimais.formatarParaBigDecimal(view.jTprodutoQuantidade.getText());
        BigDecimal desconto = BigDecimais.formatarParaBigDecimal(view.jTprodutoDesconto.getText());
        return produtoModelo.getValorVenda().multiply(quantidade).subtract(desconto);

    }

    public void habilitarCamposDeAdicionarProduto(ProdutoModelo produtoModelo) {

        view.jBprodutoAdicionaItem.setVisible(produtoModelo.getId() != 0);
        view.jBprodutoLimpaItem.setVisible(produtoModelo.getId() != 0);

    }

    public void habilitarCamposDeExcluirVenda() {

        view.jBvendaExcluir.setVisible(vendaModelo.getId() != 0);
        view.jBimprimir.setVisible(vendaModelo.getId() != 0);

    }

    public void habilitarCamposDeExcluirProdutoAdicionado() {

        view.jBprodutoSelecionadoRemoverItem.setEnabled(view.jTprodutoSelecionado.getSelectedRow() != -1);

    }

    public void finalizarVenda() {

        vendaModelo.setVendaModeloItemList(vendaModeloItemList);
        new VendaConcluiController(vendaModelo, view).construir();

    }

    public boolean excluir() {

        return new Repository(new VendaModelo()).delete(vendaModelo.getId());

    }

    public void abrirCadastro(long id) {

        view.setId(id);
        vendaModelo = (VendaModelo) new Repository(new VendaModelo()).findById(id);
        vendaModeloItemList = vendaModelo.getVendaModeloItemList();
        exibirProdutosSelecionados();

    }

}
