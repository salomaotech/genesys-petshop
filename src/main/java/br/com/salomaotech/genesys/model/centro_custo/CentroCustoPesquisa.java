package br.com.salomaotech.genesys.model.centro_custo;

import br.com.salomaotech.sistema.jpa.JPQL;
import br.com.salomaotech.sistema.jpa.Paginador;
import br.com.salomaotech.sistema.jpa.Repository;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CentroCustoPesquisa {

    private final JTable jTresultados;
    private final JComboBox jCpaginador;
    private String nome;

    public CentroCustoPesquisa(JTable jTresultados, JComboBox jCpaginador) {
        this.jTresultados = jTresultados;
        this.jCpaginador = jCpaginador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void popularDados(List<CentroCustoModelo> centroCustoModeloList) {

        DefaultTableModel defaultTableModel = (DefaultTableModel) jTresultados.getModel();
        defaultTableModel.setNumRows(0);
        int contador = 0;

        for (CentroCustoModelo centroCustoModelo : centroCustoModeloList) {

            String editavel;

            if (centroCustoModelo.isEditavel()) {

                editavel = "Sim";

            } else {

                editavel = "Nao";

            }

            Object[] linhaDefaultTableModel = new Object[]{
                centroCustoModelo.getId(),
                centroCustoModelo.getCodigo(),
                centroCustoModelo.getNome(),
                editavel

            };

            defaultTableModel.insertRow(contador, linhaDefaultTableModel);
            contador++;

        }

    }

    public void pesquisar() {

        JPQL jpql = new JPQL(new CentroCustoModelo());
        jpql.addParametroLike("nome", nome);
        jpql.addOrderBy("codigo", "ASC");
        jpql.addOrderBy("nome", "ASC");

        /* pesquisa os dados */
        Paginador paginador = new Paginador(jpql, jCpaginador, new CentroCustoModelo());
        Repository repository = new Repository(new CentroCustoModelo());
        List<CentroCustoModelo> centroCustoModeloList = repository.getResultsComPaginador(jpql.construirSelect(), paginador.getPageNumber(), paginador.getPageSize());
        popularDados(centroCustoModeloList);

    }

}
