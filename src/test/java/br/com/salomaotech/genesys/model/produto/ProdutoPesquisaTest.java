package br.com.salomaotech.genesys.model.produto;

import br.com.salomaotech.genesys.model.produto.ProdutoPesquisa;
import br.com.salomaotech.genesys.model.produto.ProdutoModelo;
import br.com.salomaotech.genesys.view.JFproduto;
import br.com.salomaotech.sistema.jpa.Repository;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProdutoPesquisaTest {

    private final JFproduto view = new JFproduto();
    private final ProdutoModelo produtoModelo = new ProdutoModelo();
    private ProdutoPesquisa produtoPesquisa;

    public ProdutoPesquisaTest() {

        /* simula cadastro de produtos */
        new Repository(new ProdutoModelo()).deleteTodos();
        produtoModelo.setNome("Teste");
        produtoModelo.setValorCusto(new BigDecimal(100));
        produtoModelo.setCategoria("ABC");
        new Repository(produtoModelo).save();

    }

    @Test
    public void testSetNome() {

        produtoPesquisa = new ProdutoPesquisa(view.jTresultados);
        produtoPesquisa.setNome(produtoModelo.getNome());
        produtoPesquisa.pesquisar();
        System.out.println("Testando classe ProdutoPesquisa metodo: setNome");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

    }

    @Test
    public void testSetCategoria() {

        produtoPesquisa = new ProdutoPesquisa(view.jTresultados);
        produtoPesquisa.setCategoria(produtoModelo.getCategoria());
        produtoPesquisa.pesquisar();
        System.out.println("Testando classe ProdutoPesquisa metodo: setCategoria");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

    }

    @Test
    public void testPesquisar() {

        /* utilizando filtro: nenhum */
        view.jTpesquisaNome.setText(null);
        view.jCpesquisaCategoria.getEditor().setItem("");
        produtoPesquisa = new ProdutoPesquisa(view.jTresultados);
        produtoPesquisa.pesquisar();
        System.out.println("Testando classe ProdutoPesquisa metodo: pesquisar etapa 01");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

        /* utilizando filtro: nome */
        view.jTpesquisaNome.setText(produtoModelo.getNome());
        view.jCpesquisaCategoria.getEditor().setItem("");
        produtoPesquisa = new ProdutoPesquisa(view.jTresultados);
        produtoPesquisa.pesquisar();
        System.out.println("Testando classe ProdutoPesquisa metodo: pesquisar etapa 02");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

        /* utilizando filtro: categoria */
        view.jTpesquisaNome.setText(null);
        view.jCpesquisaCategoria.getEditor().setItem(produtoModelo.getCategoria());
        produtoPesquisa = new ProdutoPesquisa(view.jTresultados);
        produtoPesquisa.pesquisar();
        System.out.println("Testando classe ProdutoPesquisa metodo: pesquisar etapa 03");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

        /* utilizando filtro: todos */
        view.jTpesquisaNome.setText(produtoModelo.getNome());
        view.jCpesquisaCategoria.getEditor().setItem(produtoModelo.getCategoria());
        produtoPesquisa = new ProdutoPesquisa(view.jTresultados);
        produtoPesquisa.pesquisar();
        System.out.println("Testando classe ProdutoPesquisa metodo: pesquisar etapa 04");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

    }

}