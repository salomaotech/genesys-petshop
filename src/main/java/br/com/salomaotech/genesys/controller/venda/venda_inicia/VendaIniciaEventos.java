package br.com.salomaotech.genesys.controller.venda.venda_inicia;

import br.com.salomaotech.genesys.model.venda.ItemVenda;
import br.com.salomaotech.genesys.controller.venda.venda_calcula.VendaCalculaController;
import br.com.salomaotech.genesys.model.configuracoes.PastasSistema;
import br.com.salomaotech.genesys.model.venda.ComboBoxItemVenda;
import br.com.salomaotech.genesys.model.venda.VendaComprovantePdf;
import br.com.salomaotech.genesys.view.JFvendaInicia;
import br.com.salomaotech.sistema.algoritmos.ConverteNumeroParaMoedaBr;
import br.com.salomaotech.sistema.patterns.Command;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.util.Objects.isNull;
import javax.swing.JOptionPane;

public class VendaIniciaEventos implements Command {

    private final JFvendaInicia view;
    private VendaIniciaMetodos vendaIniciaMetodos;
    private ComboBoxItemVenda comboBoxItemVenda;
    private ItemVenda itemVenda = new ItemVenda();

    public VendaIniciaEventos(JFvendaInicia view) {
        this.view = view;
    }

    public void setVendaIniciaMetodos(VendaIniciaMetodos vendaIniciaMetodos) {
        this.vendaIniciaMetodos = vendaIniciaMetodos;
    }

    public void setComboBoxItemVenda(ComboBoxItemVenda comboBoxItemVenda) {
        this.comboBoxItemVenda = comboBoxItemVenda;
    }

    private void carregarProduto() {

        if (!isNull(comboBoxItemVenda)) {

            /* carrega o objeto */
            Object object = comboBoxItemVenda.getObjecHashMap().get(comboBoxItemVenda.getIdSelecionado());

            itemVenda = new ItemVenda(comboBoxItemVenda.getIdSelecionado(), object);
            vendaIniciaMetodos.exibirProdutoSelecionado(itemVenda);
            vendaIniciaMetodos.limparCalculosProdutoSelecionado();

        }

    }

    public void addEventos() {

        /* quantidade */
        view.jTprodutoQuantidade.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

                view.jTprodutoTotal.setText(ConverteNumeroParaMoedaBr.converter(vendaIniciaMetodos.calcularProdutoSelecionado(itemVenda).toString()));

            }

        });

        /* desconto */
        view.jTprodutoDesconto.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

                view.jTprodutoTotal.setText(ConverteNumeroParaMoedaBr.converter(vendaIniciaMetodos.calcularProdutoSelecionado(itemVenda).toString()));

            }

        });

        /* limpar produto selecionado */
        view.jBprodutoLimpaItem.addActionListener((ActionEvent e) -> {

            vendaIniciaMetodos.limparProdutoSelecionado();

        });

        /* adiciona um item de produto */
        view.jBprodutoAdicionaItem.addActionListener((ActionEvent e) -> {

            vendaIniciaMetodos.adicionarProdutoNaLista(itemVenda);

        });

        /* finalizar venda */
        view.jBvendaFinaliza.addActionListener((ActionEvent e) -> {

            vendaIniciaMetodos.finalizarVenda();

        });

        /* excluir */
        view.jBvendaExcluir.addActionListener((ActionEvent e) -> {

            if (JOptionPane.showConfirmDialog(null, "Excluir registro?") == 0) {

                /* valida se excluiu e atualiza os dados na view */
                if (vendaIniciaMetodos.excluir()) {

                    /* informa que foi excluido, e fecha a view */
                    JOptionPane.showMessageDialog(null, "Registro excluido! Acompanhe as contas a receber no seu financeiro.");
                    view.dispose();

                } else {

                    JOptionPane.showMessageDialog(null, "Registro não excluido!");

                }

            }

        });

        /* produto selecionado */
        view.jTprodutoSelecionado.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                vendaIniciaMetodos.habilitarCamposDeExcluirProdutoAdicionado();

            }

        });

        /* produto selecionado */
        view.jTprodutoSelecionado.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

                vendaIniciaMetodos.habilitarCamposDeExcluirProdutoAdicionado();

            }

        });

        /* remover item de produto selecionado */
        view.jBprodutoSelecionadoRemoverItem.addActionListener((ActionEvent e) -> {

            vendaIniciaMetodos.removerProdutoNaLista();

        });

        /* botão imprimir */
        view.jBimprimir.addActionListener((ActionEvent e) -> {

            new VendaComprovantePdf(new PastasSistema().getSubPastaImpressao(), view.getId()).gerar();

        });

        /* botão calcular granel */
        view.jBcalcularGranel.addActionListener((ActionEvent e) -> {

            if (!isNull(comboBoxItemVenda)) {

                new VendaCalculaController(itemVenda, vendaIniciaMetodos).construir();

            }

        });

    }

    @Override
    public void executar(Object arg) {

        carregarProduto();

    }

}
