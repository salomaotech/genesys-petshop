package br.com.salomaotech.genesys.controller.principal;

import br.com.salomaotech.genesys.view.JFprincipal;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrincipalEventosTest {

    private final JFprincipal view = new JFprincipal();
    private final PrincipalEventos principalEventos = new PrincipalEventos(view);

    @Test
    public void testSetPrincipalMetodos() {

    }

    @Test
    public void testAddEventos() {

        /* adiciona eventos */
        principalEventos.addEventos();

        /* testa se os eventos foram adicionados */
        System.out.println("Testando classe PrincipalEventos metodo: addEventos");
        assertEquals(true, view.jBatalhoClientes.getActionListeners().length == 1);
        assertEquals(true, view.jBatalhoAgenda.getActionListeners().length == 1);
        assertEquals(true, view.jTagendaResultados.getMouseListeners().length == 3);
        assertEquals(true, view.jBpesquisar.getActionListeners().length == 1);
        assertEquals(true, view.jBatalhoProdutos.getActionListeners().length == 1);
        assertEquals(true, view.jBatalhoConfiguracoesEmpresa.getActionListeners().length == 1);
        assertEquals(true, view.jLabrirAjuda.getMouseListeners().length == 1);
        assertEquals(true, view.getWindowListeners().length == 1);
        assertEquals(true, view.jBpaginador.getActionListeners().length == 1);
        assertEquals(true, view.jLabrirSuporte.getMouseListeners().length == 1);
        assertEquals(true, view.jBatalhoAnimais.getMouseListeners().length == 1);
        assertEquals(true, view.jBatalhoVenda.getActionListeners().length == 1);
        assertEquals(true, view.jBatalhoFornecedores.getActionListeners().length == 1);
        assertEquals(true, view.jBatalhoFinanceiro.getActionListeners().length == 1);
        assertEquals(true, view.jBatalhoPdv.getActionListeners().length == 1);

    }

}