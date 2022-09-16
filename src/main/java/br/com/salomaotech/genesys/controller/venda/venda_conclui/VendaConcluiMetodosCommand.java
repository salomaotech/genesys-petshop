package br.com.salomaotech.genesys.controller.venda.venda_conclui;

import br.com.salomaotech.genesys.model.cliente.ClienteModelo;
import br.com.salomaotech.genesys.model.cliente.ComboBoxClientes;
import br.com.salomaotech.genesys.view.JFvendaConclui;
import br.com.salomaotech.sistema.jpa.Repository;
import br.com.salomaotech.sistema.patterns.Command;
import static java.util.Objects.isNull;

public class VendaConcluiMetodosCommand implements Command {

    private final JFvendaConclui view;
    private ComboBoxClientes comboBoxClientes;

    public VendaConcluiMetodosCommand(JFvendaConclui view) {
        this.view = view;
    }

    public void setComboBoxClientes(ComboBoxClientes comboBoxClientes) {
        this.comboBoxClientes = comboBoxClientes;
    }

    @Override
    public void executar(Object arg) {

        if (!isNull(this.comboBoxClientes)) {

            ClienteModelo clienteModelo = (ClienteModelo) new Repository(new ClienteModelo()).findById(comboBoxClientes.getIdSelecionado());
            view.jTclienteCpf.setText(clienteModelo.getCpf());

        }

    }

}