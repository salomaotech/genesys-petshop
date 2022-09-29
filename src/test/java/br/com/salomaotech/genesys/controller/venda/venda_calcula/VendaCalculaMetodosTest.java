package br.com.salomaotech.genesys.controller.venda.venda_calcula;

import br.com.salomaotech.genesys.controller.venda.venda_inicia.VendaIniciaMetodos;
import br.com.salomaotech.genesys.model.produto.ProdutoModelo;
import br.com.salomaotech.genesys.view.JFvendaCalcula;
import br.com.salomaotech.genesys.view.JFvendaInicia;
import br.com.salomaotech.sistema.jpa.Repository;
import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

public class VendaCalculaMetodosTest {

    private final JFvendaCalcula view = new JFvendaCalcula();
    private final JFvendaInicia jFvendaInicia = new JFvendaInicia();
    private final ProdutoModelo produtoModelo = new ProdutoModelo();

    private final VendaCalculaMetodos vendaCalculaMetodos = new VendaCalculaMetodos(view);
    private final VendaIniciaMetodos vendaIniciaMetodos = new VendaIniciaMetodos(jFvendaInicia);

    public VendaCalculaMetodosTest() {

        new Repository(new ProdutoModelo()).deleteTodos();
        produtoModelo.setNome("Teste");
        produtoModelo.setValorVenda(new BigDecimal(140));
        produtoModelo.setPeso(new BigDecimal(15));
        new Repository(produtoModelo).save();

    }

    @Test
    public void testSetProdutoModelo() {

        boolean isErro = false;

        try {

            vendaCalculaMetodos.setProdutoModelo(produtoModelo);

        } catch (Exception ex) {

            isErro = true;

        }

        System.out.println("Testando classe VendaCalculaMetodos metodo: setProdutoModelo");
        assertEquals(false, isErro);

    }

    @Test
    public void testSetVendaIniciaMetodos() {

        boolean isErro = false;

        try {

            vendaCalculaMetodos.setVendaIniciaMetodos(vendaIniciaMetodos);

        } catch (Exception ex) {

            isErro = true;

        }

        System.out.println("Testando classe VendaCalculaMetodos metodo: setVendaIniciaMetodos");
        assertEquals(false, isErro);

    }

    @Test
    public void testCalcular() {

        vendaCalculaMetodos.setProdutoModelo(produtoModelo);
        vendaCalculaMetodos.setVendaIniciaMetodos(vendaIniciaMetodos);

        /* calcula por valor */
        vendaCalculaMetodos.calcularPorValor(new BigDecimal("150"));
        System.out.println("Testando classe VendaCalculaMetodos metodo: calcular");
        assertEquals(true, view.jTresultado.getText().equals("1.07"));
        assertEquals(true, jFvendaInicia.jTprodutoQuantidade.getText().equals("1.07"));

        /* calcula por peso */
        vendaCalculaMetodos.calcularPorPeso(new BigDecimal("35"));
        assertEquals(true, view.jTresultado.getText().equals("2.33"));
        assertEquals(true, jFvendaInicia.jTprodutoQuantidade.getText().equals("2.33"));

    }

}
