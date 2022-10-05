package br.com.salomaotech.genesys.model.venda;

import br.com.salomaotech.genesys.model.financeiro.FinanceiroModelo;
import br.com.salomaotech.genesys.model.produto.ProdutoModelo;
import br.com.salomaotech.sistema.jpa.JPQL;
import br.com.salomaotech.sistema.jpa.Repository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class VendaMovimentaTest {

    private final ProdutoModelo produtoModelo = new ProdutoModelo();
    private final List<VendaModeloItem> vendaModeloItemList = new ArrayList();
    private final List<VendaModeloItem> vendaModeloItemBaixaList = new ArrayList();
    private final List<VendaModeloItem> vendaModeloItemDevolveList = new ArrayList();
    private final VendaModelo vendaModelo = new VendaModelo();
    private final VendaMovimenta vendaMovimenta;

    public VendaMovimentaTest() {

        /* remove vendas antigas */
        new Repository(new VendaModelo()).deleteTodos();

        /* simula cadastro de produto */
        new Repository(new ProdutoModelo()).deleteTodos();
        produtoModelo.setNome("Teste");
        produtoModelo.setValorVenda(new BigDecimal(100));
        produtoModelo.setQuantidade(new BigDecimal(50));
        new Repository(produtoModelo).save();

        /* simula seleção de item de produto */
        VendaModeloItem vendaModeloItem = new VendaModeloItem();
        vendaModeloItem.setIdProduto(produtoModelo.getId());
        vendaModeloItem.setValor(produtoModelo.getValorVenda());
        vendaModeloItem.setDesconto(new BigDecimal(5));
        vendaModeloItem.setQuantidade(new BigDecimal(1));
        vendaModeloItemList.add(vendaModeloItem);

        /* adiciona os dados da venda */
        new Repository(new VendaModelo()).deleteTodos();
        vendaModelo.setData(Calendar.getInstance());
        vendaModelo.setVendaModeloItemList(vendaModeloItemList);
        vendaModelo.setNumeroParcelas(3);
        new Repository(vendaModelo).save();

        /* atualiza listas */
        vendaModeloItemBaixaList.add(vendaModeloItem);
        vendaModeloItemDevolveList.add(vendaModeloItem);

        /* seta venda */
        vendaMovimenta = new VendaMovimenta(vendaModelo, vendaModeloItemBaixaList, vendaModeloItemDevolveList);

    }

    @Test
    public void testFinalizar() {

        vendaMovimenta.finalizar();

        /* testa o número de revisões */
        System.out.println("Testando classe VendaMovimenta metodo: finalizar checa número de revisões");
        assertEquals(true, vendaModelo.getRevisoes() == 1);

        /* testa a baixa no estoque */
        System.out.println("Testando classe VendaMovimenta metodo: finalizar checa baixa em estoque");
        assertEquals(true, produtoModelo.getQuantidade().equals(new BigDecimal(49)));

        /* testa lançamentos financeiros */
        System.out.println("Testando classe VendaMovimenta metodo: finalizar checa lançamentos em financeiro");
        JPQL jpql = new JPQL(new FinanceiroModelo());
        jpql.addParametroIgual("idVenda", vendaModelo.getId());
        assertEquals(true, new Repository(new FinanceiroModelo()).countTodos(jpql.getCondicaoWhere()) == vendaModelo.getNumeroParcelas());

    }

    @Test
    public void testReabrir() {

        vendaMovimenta.finalizar();
        vendaMovimenta.reabrir();

        /* testa a volta ao estoque */
        System.out.println("Testando classe VendaMovimenta metodo: reabrir checa entrada em estoque");
        assertEquals(true, produtoModelo.getQuantidade().equals(new BigDecimal(50)));

        /* testa se excluiu lançamentos financeiros */
        System.out.println("Testando classe VendaMovimenta metodo: reabrir checa lançamentos em financeiro");
        JPQL jpql = new JPQL(new FinanceiroModelo());
        jpql.addParametroIgual("idVenda", vendaModelo.getId());
        assertEquals(true, new Repository(new FinanceiroModelo()).countTodos(jpql.getCondicaoWhere()) == 0);

    }

    @Test
    public void testExcluir() {

        vendaMovimenta.finalizar();
        vendaMovimenta.excluir();

        /* testa a volta ao estoque */
        System.out.println("Testando classe VendaMovimenta metodo: excluir checa entrada em estoque");
        assertEquals(true, produtoModelo.getQuantidade().equals(new BigDecimal(50)));

        /* testa se excluiu lançamentos financeiros */
        System.out.println("Testando classe VendaMovimenta metodo: excluir checa lançamentos em financeiro");
        JPQL jpql = new JPQL(new FinanceiroModelo());
        jpql.addParametroIgual("idVenda", vendaModelo.getId());
        assertEquals(true, new Repository(new FinanceiroModelo()).countTodos(jpql.getCondicaoWhere()) == 0);

    }

}
