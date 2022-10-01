/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.salomaotech.genesys.view;

/**
 *
 * @author usuario
 */
public class JFagenda extends javax.swing.JFrame {

    private long id;

    /**
     * Creates new form JFagenda
     */
    public JFagenda() {
        initComponents();
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jBatalhoCadastro = new javax.swing.JButton();
        jBcadastroSalvar = new javax.swing.JButton();
        jBcadastroExcluir = new javax.swing.JButton();
        jBatalhoPesquisa = new javax.swing.JButton();
        jTabaPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTcadastroHistorico = new javax.swing.JTextArea();
        jCcadastroHora = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCcadastroMinuto = new javax.swing.JComboBox<>();
        jCstatus = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jDcadastroData = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jBpesquisaCliente = new javax.swing.JButton();
        jBpesquisaAnimal = new javax.swing.JButton();
        jBrefreshCliente = new javax.swing.JButton();
        jCcadastroNomeCliente = new javax.swing.JComboBox<>();
        jCcadastroNomeAnimal = new javax.swing.JComboBox<>();
        jBrefreshAnimais = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jDpesquisaDataInicio = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCpesquisaStatus = new javax.swing.JComboBox<>();
        jBpesquisa = new javax.swing.JButton();
        jCpesquisaNomeCliente = new javax.swing.JComboBox<>();
        jBpesquisaNomeClienteRefresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDPesquisaDataFim = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTresultados = new javax.swing.JTable();
        jBpaginador = new javax.swing.JButton();
        jCpaginador = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda - Genesys PetShop");
        setMinimumSize(new java.awt.Dimension(1024, 694));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jBatalhoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar32x.png"))); // NOI18N
        jBatalhoCadastro.setText("Nova agenda");
        jBatalhoCadastro.setFocusable(false);
        jBatalhoCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBatalhoCadastro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBatalhoCadastro);

        jBcadastroSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar32x.png"))); // NOI18N
        jBcadastroSalvar.setText("Salvar");
        jBcadastroSalvar.setFocusable(false);
        jBcadastroSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBcadastroSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBcadastroSalvar);

        jBcadastroExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove-item32x.png"))); // NOI18N
        jBcadastroExcluir.setText("Excluir");
        jBcadastroExcluir.setEnabled(false);
        jBcadastroExcluir.setFocusable(false);
        jBcadastroExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBcadastroExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBcadastroExcluir);

        jBatalhoPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisa32x.png"))); // NOI18N
        jBatalhoPesquisa.setText("Pesquisar");
        jBatalhoPesquisa.setFocusable(false);
        jBatalhoPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBatalhoPesquisa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBatalhoPesquisa);

        jTabaPrincipal.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel4.setText("Observações:");

        jTcadastroHistorico.setColumns(20);
        jTcadastroHistorico.setRows(5);
        jScrollPane1.setViewportView(jTcadastroHistorico);

        jCcadastroHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel6.setText("Hora:");

        jCcadastroMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jCstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - Agendado", "2 - Atendido", "3 - Cancelado", "4 - Remarcado" }));

        jLabel9.setText("Status:");

        jDcadastroData.setDateFormatString("dd/MM/yyyy");

        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Data:");

        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Cliente:");

        jLabel13.setText(":");

        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Animal:");

        jBpesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/buscar16x.png"))); // NOI18N
        jBpesquisaCliente.setText("Novo");

        jBpesquisaAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/buscar16x.png"))); // NOI18N
        jBpesquisaAnimal.setText("Novo");

        jBrefreshCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atualizar16x.png"))); // NOI18N

        jBrefreshAnimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atualizar16x.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(jDcadastroData, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(jCcadastroHora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13)
                        .addGap(12, 12, 12)
                        .addComponent(jCcadastroMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(jCcadastroNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBrefreshCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jBpesquisaCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel11)
                        .addGap(12, 12, 12)
                        .addComponent(jCcadastroNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBrefreshAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jBpesquisaAnimal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12)
                        .addComponent(jCstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDcadastroData, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addComponent(jCcadastroHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jCcadastroMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7))
                    .addComponent(jCcadastroNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBrefreshCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBpesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel11))
                    .addComponent(jCcadastroNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBrefreshAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBpesquisaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9))
                    .addComponent(jCstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(290, 290, 290))
        );

        jTabaPrincipal.addTab("Formulário", jPanel1);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar pesquisa"));

        jLabel10.setText("Data inicial:");

        jDpesquisaDataInicio.setDateFormatString("dd/MM/yyyy");

        jLabel5.setText("Cliente:");

        jLabel12.setText("Status:");

        jCpesquisaStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "1 - Agendado", "2 - Atendido", "3 - Cancelado", "4 - Remarcado" }));

        jBpesquisa.setText("Pesquisar");

        jBpesquisaNomeClienteRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atualizar16x.png"))); // NOI18N

        jLabel2.setText("Data final:");

        jDPesquisaDataFim.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCpesquisaNomeCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBpesquisa)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jDpesquisaDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDPesquisaDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jBpesquisaNomeClienteRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCpesquisaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDpesquisaDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jDPesquisaDataFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBpesquisaNomeClienteRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel12)
                        .addComponent(jCpesquisaNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCpesquisaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jBpesquisa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTresultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data", "Hora", "Cliente", "Telefone", "Animal", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTresultados);
        if (jTresultados.getColumnModel().getColumnCount() > 0) {
            jTresultados.getColumnModel().getColumn(0).setMinWidth(85);
            jTresultados.getColumnModel().getColumn(0).setPreferredWidth(85);
            jTresultados.getColumnModel().getColumn(0).setMaxWidth(85);
            jTresultados.getColumnModel().getColumn(1).setMinWidth(85);
            jTresultados.getColumnModel().getColumn(1).setPreferredWidth(85);
            jTresultados.getColumnModel().getColumn(1).setMaxWidth(85);
            jTresultados.getColumnModel().getColumn(2).setMinWidth(85);
            jTresultados.getColumnModel().getColumn(2).setPreferredWidth(85);
            jTresultados.getColumnModel().getColumn(2).setMaxWidth(85);
            jTresultados.getColumnModel().getColumn(4).setMinWidth(120);
            jTresultados.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTresultados.getColumnModel().getColumn(4).setMaxWidth(120);
            jTresultados.getColumnModel().getColumn(6).setMinWidth(125);
            jTresultados.getColumnModel().getColumn(6).setPreferredWidth(125);
            jTresultados.getColumnModel().getColumn(6).setMaxWidth(125);
        }

        jBpaginador.setText("Abrir");

        jLabel1.setText("Página:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCpaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBpaginador)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBpaginador)
                    .addComponent(jCpaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jTabaPrincipal.addTab("Pesquisa", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabaPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabaPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFagenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFagenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFagenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFagenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFagenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBatalhoCadastro;
    public javax.swing.JButton jBatalhoPesquisa;
    public javax.swing.JButton jBcadastroExcluir;
    public javax.swing.JButton jBcadastroSalvar;
    public javax.swing.JButton jBpaginador;
    public javax.swing.JButton jBpesquisa;
    public javax.swing.JButton jBpesquisaAnimal;
    public javax.swing.JButton jBpesquisaCliente;
    public javax.swing.JButton jBpesquisaNomeClienteRefresh;
    public javax.swing.JButton jBrefreshAnimais;
    public javax.swing.JButton jBrefreshCliente;
    public javax.swing.JComboBox<String> jCcadastroHora;
    public javax.swing.JComboBox<String> jCcadastroMinuto;
    public javax.swing.JComboBox<String> jCcadastroNomeAnimal;
    public javax.swing.JComboBox<String> jCcadastroNomeCliente;
    public javax.swing.JComboBox<String> jCpaginador;
    public javax.swing.JComboBox<String> jCpesquisaNomeCliente;
    public javax.swing.JComboBox<String> jCpesquisaStatus;
    public javax.swing.JComboBox<String> jCstatus;
    public com.toedter.calendar.JDateChooser jDPesquisaDataFim;
    public com.toedter.calendar.JDateChooser jDcadastroData;
    public com.toedter.calendar.JDateChooser jDpesquisaDataInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTabbedPane jTabaPrincipal;
    public javax.swing.JTextArea jTcadastroHistorico;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JTable jTresultados;
    // End of variables declaration//GEN-END:variables
}
