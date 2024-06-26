package br.com.salomaotech.genesys.model.agenda;

import br.com.salomaotech.sistema.algoritmos.Datas;
import br.com.salomaotech.sistema.algoritmos.ValidaStringIsEmpty;
import br.com.salomaotech.sistema.jpa.JPQL;
import br.com.salomaotech.sistema.jpa.Paginador;
import br.com.salomaotech.sistema.jpa.Repository;
import br.com.salomaotech.sistema.swing.MudaCorLinhaJtable;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import static java.util.Objects.isNull;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AgendaPesquisa {

    private Date dataInicialDate;
    private Date dataFinalDate;
    private String nomeCliente;
    private String status;
    private final JTable jTresultados;
    private final JComboBox jCpaginador;
    private boolean isDataAnterior;

    public AgendaPesquisa(JTable jTresultados, JComboBox jCpaginador) {
        this.jTresultados = jTresultados;
        this.jCpaginador = jCpaginador;
    }

    private void popularDados(List<AgendaModelo> agendaModeloList) {

        DefaultTableModel defaultTableModel = (DefaultTableModel) this.jTresultados.getModel();
        defaultTableModel.setNumRows(0);
        List<Color> colorList = new ArrayList();
        int contador = 0;

        /* itera a lista de dados do modelo */
        for (AgendaModelo agendaModelo : agendaModeloList) {

            /* popula linhas da DefaultTableModel */
            Object[] linhaDefaultTableModel = new Object[]{
                agendaModelo.getId(),
                Datas.calendarParaStringBr(agendaModelo.getDataAgenda()),
                agendaModelo.getDataHora() + ":" + agendaModelo.getDataMinuto(),
                agendaModelo.getNomeCliente(),
                agendaModelo.getTelefone(),
                agendaModelo.getStatus()

            };

            /* cria uma data completa com dia, mes, ano, hora, minuto */
            Calendar dataCompleta = (Calendar) agendaModelo.getDataAgenda().clone();
            dataCompleta.set(Calendar.HOUR_OF_DAY, Integer.parseInt(agendaModelo.getDataHora()));
            dataCompleta.set(Calendar.MINUTE, Integer.parseInt(agendaModelo.getDataMinuto()));
            dataCompleta.set(Calendar.SECOND, 0);
            dataCompleta.set(Calendar.MILLISECOND, 0);

            /* data de agora com segundos, milissegundos zerados */
            Calendar dataAgoraCalendar = Calendar.getInstance();
            dataAgoraCalendar.set(Calendar.SECOND, 0);
            dataAgoraCalendar.set(Calendar.MILLISECOND, 0);

            /* valida se a data de agendamento já estourou */
            if (dataCompleta.compareTo(dataAgoraCalendar) == -1) {

                colorList.add(Color.decode("#e4b7bc"));

            } else {

                colorList.add(Color.decode("#b2ddc3"));

            }

            defaultTableModel.insertRow(contador, linhaDefaultTableModel);
            contador++;

        }

        /* popula cores */
        MudaCorLinhaJtable.mudar(this.jTresultados, colorList);

    }

    public void setDataInicialDate(Date dataInicialDate) {
        this.dataInicialDate = dataInicialDate;
    }

    public void setDataFinalDate(Date dataFinalDate) {
        this.dataFinalDate = dataFinalDate;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIsDataAnterior(boolean isDataAnterior) {
        this.isDataAnterior = isDataAnterior;
    }

    public void pesquisar() {

        JPQL jpql = new JPQL(new AgendaModelo());
        jpql.addParametroLike("nomeCliente", nomeCliente);
        jpql.addOrderBy("dataAgenda", "ASC");
        jpql.addOrderBy("dataHora", "ASC");
        jpql.addOrderBy("dataMinuto", "ASC");
        jpql.addOrderBy("id", "ASC");

        if (isDataAnterior) {

            /* pesquisa data igual menor */
            jpql.addParametroMenorIgual("dataAgenda", dataInicialDate);

        } else {

            if (!isNull(dataInicialDate) && !isNull(dataFinalDate)) {

                /* pesquisa entre datas */
                jpql.addParametroMaiorIgual("dataAgenda", dataInicialDate);
                jpql.addParametroMenorIgual("dataAgenda", dataFinalDate);

            } else {

                /* pesquisa exatamente a data inicial */
                if (!isNull(dataInicialDate)) {

                    jpql.addParametroIgual("dataAgenda", dataInicialDate);

                }

                /* pesquisa da data final para trás */
                if (!isNull(dataFinalDate)) {

                    jpql.addParametroMenorIgual("dataAgenda", dataFinalDate);

                }

            }

        }

        /* valida status */
        if (!ValidaStringIsEmpty.isEmpty(status)) {

            if (!status.equals("Todos")) {

                jpql.addParametroIgual("status", status);

            }

        }

        /* pesquisa os dados */
        Paginador paginador = new Paginador(jpql, jCpaginador, new AgendaModelo());
        Repository repository = new Repository(new AgendaModelo());
        List<AgendaModelo> agendaModeloList = repository.getResultsComPaginador(jpql.construirSelect(), paginador.getPageNumber(), paginador.getPageSize());
        popularDados(agendaModeloList);

    }

}
