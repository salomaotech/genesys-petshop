package br.com.salomaotech.genesys.controller.venda_pesquisar;

import br.com.salomaotech.genesys.controller.venda.VendaController;
import br.com.salomaotech.genesys.model.cliente.ComboBoxClientes;
import br.com.salomaotech.genesys.view.JFvendaPesquisa;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VendaPesquisarEventos {

    private final JFvendaPesquisa view;
    private VendaPesquisarMetodos vendaPesquisarMetodos;
    private ComboBoxClientes comboBoxClientesPesquisa;

    public VendaPesquisarEventos(JFvendaPesquisa view) {
        this.view = view;
    }

    public void setVendaPesquisarMetodos(VendaPesquisarMetodos vendaPesquisarMetodos) {
        this.vendaPesquisarMetodos = vendaPesquisarMetodos;
    }

    public void setComboBoxClientesPesquisa(ComboBoxClientes comboBoxClientesPesquisa) {
        this.comboBoxClientesPesquisa = comboBoxClientesPesquisa;
    }

    public void addEventos() {

        /* atalho para cadastro */
        view.jBatalhoCadastro.addActionListener((ActionEvent e) -> {

            new VendaController().construir();
            view.dispose();

        });

        /* pesquisa */
        view.jBpesquisa.addActionListener((ActionEvent e) -> {

            vendaPesquisarMetodos.pesquisar();

        });

        /* paginador */
        view.jBpaginador.addActionListener((ActionEvent e) -> {

            vendaPesquisarMetodos.pesquisar();

        });

        /* atualiza lista de clientes */
        view.jBpesquisaNomeClienteRefresh.addActionListener((ActionEvent e) -> {

            comboBoxClientesPesquisa.preencher();

        });

        /* abre */
        view.jTresultados.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                if (e.getClickCount() == 2) {

                    long id = (long) view.jTresultados.getModel().getValueAt(view.jTresultados.getSelectedRow(), 0);
                    vendaPesquisarMetodos.abrirCadastro(id);

                }

            }

        });

    }

}
