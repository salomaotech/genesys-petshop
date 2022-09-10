package br.com.salomaotech.genesys.model.produto;

import br.com.salomaotech.sistema.algoritmos.ConverteNumeroParaMoedaBr;
import br.com.salomaotech.sistema.algoritmos.ValidaStringIsEmpty;
import br.com.salomaotech.sistema.jpa.JPQL;
import br.com.salomaotech.sistema.jpa.Repository;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProdutoPesquisa {

    private final JTable jTresultados;
    private String nome;
    private String categoria;

    public ProdutoPesquisa(JTable jTresultados) {
        this.jTresultados = jTresultados;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    private void popularDados(List<ProdutoModelo> produtoModeloList) {

        DefaultTableModel defaultTableModel = (DefaultTableModel) jTresultados.getModel();
        defaultTableModel.setNumRows(0);
        int contador = 0;

        for (ProdutoModelo produtoModelo : produtoModeloList) {

            Object[] linhaDefaultTableModel = new Object[]{
                produtoModelo.getId(),
                produtoModelo.getNome(),
                ConverteNumeroParaMoedaBr.converter(produtoModelo.getValorVenda().toString()),
                produtoModelo.getMedida(),
                produtoModelo.getQuantidade(),
                produtoModelo.getCategoria()

            };

            defaultTableModel.insertRow(contador, linhaDefaultTableModel);
            contador++;

        }

    }

    public void pesquisar() {

        JPQL jpql = new JPQL(new ProdutoModelo());
        jpql.addParametroLike("nome", nome);
        jpql.addOrderBy("nome", "ASC");
        jpql.addOrderBy("id", "ASC");

        /* valida a categoria */
        if (!ValidaStringIsEmpty.isEmpty(categoria)) {

            jpql.addParametroIgual("categoria", categoria);

        }

        /* pesquisa os dados */
        Repository repository = new Repository(new ProdutoModelo());
        List<ProdutoModelo> produtoModeloList = repository.getResults(jpql.construirSelect());
        popularDados(produtoModeloList);

    }

}
