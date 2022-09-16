package br.com.salomaotech.genesys.controller.venda.venda_pesquisa;

import br.com.salomaotech.genesys.controller.venda.venda_visualiza.VendaVisualizaController;
import br.com.salomaotech.genesys.model.cliente.ComboBoxClientes;
import br.com.salomaotech.genesys.model.venda.VendaPesquisa;
import br.com.salomaotech.genesys.view.JFvendaPesquisa;

public class VendaPesquisaMetodos {

    final JFvendaPesquisa view;
    private ComboBoxClientes comboBoxClientesPesquisa;

    public VendaPesquisaMetodos(JFvendaPesquisa view) {
        this.view = view;
    }

    public void setComboBoxClientesPesquisa(ComboBoxClientes comboBoxClientesPesquisa) {
        this.comboBoxClientesPesquisa = comboBoxClientesPesquisa;
    }

    public void pesquisar() {

        VendaPesquisa vendaPesquisa = new VendaPesquisa(view.jTresultados, view.jCpaginador);
        vendaPesquisa.setData(view.jDpesquisaData.getCalendar());
        vendaPesquisa.setIdCliente(comboBoxClientesPesquisa.getIdSelecionado());
        vendaPesquisa.pesquisar();

    }

    public void abrirCadastro(long id) {

        new VendaVisualizaController(id).construir();

    }

}