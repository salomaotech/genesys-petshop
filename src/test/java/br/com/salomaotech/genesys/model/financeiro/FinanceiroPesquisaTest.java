package br.com.salomaotech.genesys.model.financeiro;

import br.com.salomaotech.genesys.model.centro_custo.CentroCustoModelo;
import br.com.salomaotech.genesys.view.JFfinanceiro;
import br.com.salomaotech.sistema.jpa.Repository;
import java.math.BigDecimal;
import java.util.Calendar;
import static org.junit.Assert.*;
import org.junit.Test;

public class FinanceiroPesquisaTest {

    private JFfinanceiro view = new JFfinanceiro();
    private final Calendar calendar = Calendar.getInstance();
    private final CentroCustoModelo centroCustoModelo = new CentroCustoModelo();
    private final FinanceiroModelo financeiroModelo = new FinanceiroModelo();
    private FinanceiroPesquisa financeiroPesquisa = new FinanceiroPesquisa(view.jTresultados, view.jCpaginador, view.jLsaldo);

    public FinanceiroPesquisaTest() {

        /* simula cadastro de centro de custo */
        new Repository(new CentroCustoModelo()).deleteTodos();
        centroCustoModelo.setCodigo("1.0");
        centroCustoModelo.setNome("Teste");
        new Repository(centroCustoModelo).save();

        /* simula cadastro de financeiro */
        new Repository(new FinanceiroModelo()).deleteTodos();
        financeiroModelo.setData(calendar);
        financeiroModelo.setValor(new BigDecimal(100));
        financeiroModelo.setDescricao("Teste A");
        financeiroModelo.setIdCentroCusto(centroCustoModelo.getId());
        financeiroModelo.setIsPago(true);
        financeiroModelo.setIsDespesa(true);
        new Repository(financeiroModelo).save();

    }

    @Test
    public void testSetDataInicialDate() {

        boolean isErro = false;

        try {

            financeiroPesquisa.setDataInicialDate(calendar);

        } catch (Exception ex) {

            isErro = true;

        }

        System.out.println("Testando classe FinanceiroPesquisa metodo: setDataInicialDate");
        assertEquals(false, isErro);

    }

    @Test
    public void testSetDataFinalDate() {

        boolean isErro = false;

        try {

            financeiroPesquisa.setDataFinalDate(calendar);

        } catch (Exception ex) {

            isErro = true;

        }

        System.out.println("Testando classe FinanceiroPesquisa metodo: setDataFinalDate");
        assertEquals(false, isErro);

    }

    @Test
    public void testSetPagamentoRealizado() {

        financeiroPesquisa.setPagamentoRealizado("Sim");
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: setPagamentoRealizado etapa 01");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

        financeiroPesquisa.setPagamentoRealizado("Nao");
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: setPagamentoRealizado etapa 02");
        assertEquals(true, view.jTresultados.getRowCount() == 0);

        financeiroPesquisa.setPagamentoRealizado("Todos");
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: setPagamentoRealizado etapa 03");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

    }

    @Test
    public void testSetPagamentoDespesa() {

        financeiroPesquisa.setPagamentoDespesa("Pagar");
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: setPagamentoDespesa etapa 01");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

        financeiroPesquisa.setPagamentoDespesa("Receber");
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: setPagamentoDespesa etapa 02");
        assertEquals(true, view.jTresultados.getRowCount() == 0);

        financeiroPesquisa.setPagamentoDespesa("Todos");
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: setPagamentoDespesa etapa 03");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

    }

    @Test
    public void testPesquisar() {

        /* usando filtro: nenhum */
        view = new JFfinanceiro();
        financeiroPesquisa = new FinanceiroPesquisa(view.jTresultados, view.jCpaginador, view.jLsaldo);
        financeiroPesquisa.setDataInicialDate(null);
        financeiroPesquisa.setDataFinalDate(null);
        financeiroPesquisa.setPagamentoRealizado(null);
        financeiroPesquisa.setPagamentoDespesa(null);
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: pesquisar etapa 01");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

        /* usando filtro: data inicial */
        view = new JFfinanceiro();
        financeiroPesquisa = new FinanceiroPesquisa(view.jTresultados, view.jCpaginador, view.jLsaldo);
        financeiroPesquisa.setDataInicialDate(calendar);
        financeiroPesquisa.setDataFinalDate(null);
        financeiroPesquisa.setPagamentoRealizado(null);
        financeiroPesquisa.setPagamentoDespesa(null);
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: pesquisar etapa 02");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

        /* usando filtro: data final */
        view = new JFfinanceiro();
        financeiroPesquisa = new FinanceiroPesquisa(view.jTresultados, view.jCpaginador, view.jLsaldo);
        financeiroPesquisa.setDataInicialDate(null);
        financeiroPesquisa.setDataFinalDate(calendar);
        financeiroPesquisa.setPagamentoRealizado(null);
        financeiroPesquisa.setPagamentoDespesa(null);
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: pesquisar etapa 03");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

        /* usando filtro: pagamento realizado */
        view = new JFfinanceiro();
        financeiroPesquisa = new FinanceiroPesquisa(view.jTresultados, view.jCpaginador, view.jLsaldo);
        financeiroPesquisa.setDataInicialDate(null);
        financeiroPesquisa.setDataFinalDate(null);
        financeiroPesquisa.setPagamentoRealizado("Sim");
        financeiroPesquisa.setPagamentoDespesa(null);
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: pesquisar etapa 04");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

        /* usando filtro: pagamento não realizado */
        view = new JFfinanceiro();
        financeiroPesquisa = new FinanceiroPesquisa(view.jTresultados, view.jCpaginador, view.jLsaldo);
        financeiroPesquisa.setDataInicialDate(null);
        financeiroPesquisa.setDataFinalDate(null);
        financeiroPesquisa.setPagamentoRealizado("Nao");
        financeiroPesquisa.setPagamentoDespesa(null);
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: pesquisar etapa 05");
        assertEquals(true, view.jTresultados.getRowCount() == 0);

        /* usando filtro: pagamento realizado todos */
        view = new JFfinanceiro();
        financeiroPesquisa = new FinanceiroPesquisa(view.jTresultados, view.jCpaginador, view.jLsaldo);
        financeiroPesquisa.setDataInicialDate(null);
        financeiroPesquisa.setDataFinalDate(null);
        financeiroPesquisa.setPagamentoRealizado("Todos");
        financeiroPesquisa.setPagamentoDespesa(null);
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: pesquisar etapa 06");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

        /* usando filtro: pagamento é uma despesa */
        view = new JFfinanceiro();
        financeiroPesquisa = new FinanceiroPesquisa(view.jTresultados, view.jCpaginador, view.jLsaldo);
        financeiroPesquisa.setDataInicialDate(null);
        financeiroPesquisa.setDataFinalDate(null);
        financeiroPesquisa.setPagamentoRealizado(null);
        financeiroPesquisa.setPagamentoDespesa("Pagar");
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: pesquisar etapa 07");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

        /* usando filtro: pagamento é uma receita */
        view = new JFfinanceiro();
        financeiroPesquisa = new FinanceiroPesquisa(view.jTresultados, view.jCpaginador, view.jLsaldo);
        financeiroPesquisa.setDataInicialDate(null);
        financeiroPesquisa.setDataFinalDate(null);
        financeiroPesquisa.setPagamentoRealizado(null);
        financeiroPesquisa.setPagamentoDespesa("Receber");
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: pesquisar etapa 08");
        assertEquals(true, view.jTresultados.getRowCount() == 0);

        /* usando filtro: pagamento todos */
        view = new JFfinanceiro();
        financeiroPesquisa = new FinanceiroPesquisa(view.jTresultados, view.jCpaginador, view.jLsaldo);
        financeiroPesquisa.setDataInicialDate(null);
        financeiroPesquisa.setDataFinalDate(null);
        financeiroPesquisa.setPagamentoRealizado(null);
        financeiroPesquisa.setPagamentoDespesa("Todos");
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: pesquisar etapa 09");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

        /* usando filtro: todos */
        view = new JFfinanceiro();
        financeiroPesquisa = new FinanceiroPesquisa(view.jTresultados, view.jCpaginador, view.jLsaldo);
        financeiroPesquisa.setDataInicialDate(calendar);
        financeiroPesquisa.setDataFinalDate(calendar);
        financeiroPesquisa.setPagamentoRealizado("Sim");
        financeiroPesquisa.setPagamentoDespesa("Todos");
        financeiroPesquisa.pesquisar();
        System.out.println("Testando classe FinanceiroPesquisa metodo: pesquisar etapa 10");
        assertEquals(true, view.jTresultados.getRowCount() > 0);

    }

}
