/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.salomaotech.genesys.view;

/**
 *
 * @author usuario
 */
public class JFprincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFprincipal
     */
    public JFprincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTagendaResultados = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jDagendaDataSemana = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jCpesquisaStatus = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jCpaginador = new javax.swing.JComboBox<>();
        jBpaginador = new javax.swing.JButton();
        jToolBarTopo = new javax.swing.JToolBar();
        jBatalhoConfiguracoesEmpresa = new javax.swing.JButton();
        jBatalhoClientes = new javax.swing.JButton();
        jBatalhoAnimais = new javax.swing.JButton();
        jBatalhoAgenda = new javax.swing.JButton();
        jBatalhoFornecedores = new javax.swing.JButton();
        jBatalhoProdutos = new javax.swing.JButton();
        jBatalhoServicos = new javax.swing.JButton();
        jBatalhoVenda = new javax.swing.JButton();
        jBatalhoFinanceiro = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel3 = new javax.swing.JLabel();
        jLabrirAjuda = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabrirSuporte = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnotificacoes = new javax.swing.JMenu();
        jMagenda = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMfinanceiroPagar = new javax.swing.JMenuItem();
        jMfinanceiroReceber = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Genesys PetShop - Taimber Software");
        setMinimumSize(new java.awt.Dimension(1024, 694));

        jTagendaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data", "Hora", "Cliente", "Observações", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTagendaResultados);
        if (jTagendaResultados.getColumnModel().getColumnCount() > 0) {
            jTagendaResultados.getColumnModel().getColumn(0).setMinWidth(85);
            jTagendaResultados.getColumnModel().getColumn(0).setPreferredWidth(85);
            jTagendaResultados.getColumnModel().getColumn(0).setMaxWidth(85);
            jTagendaResultados.getColumnModel().getColumn(1).setMinWidth(85);
            jTagendaResultados.getColumnModel().getColumn(1).setPreferredWidth(85);
            jTagendaResultados.getColumnModel().getColumn(1).setMaxWidth(85);
            jTagendaResultados.getColumnModel().getColumn(2).setMinWidth(85);
            jTagendaResultados.getColumnModel().getColumn(2).setPreferredWidth(85);
            jTagendaResultados.getColumnModel().getColumn(2).setMaxWidth(85);
            jTagendaResultados.getColumnModel().getColumn(5).setMinWidth(125);
            jTagendaResultados.getColumnModel().getColumn(5).setPreferredWidth(125);
            jTagendaResultados.getColumnModel().getColumn(5).setMaxWidth(125);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agenda de hoje", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Status:");

        jCpesquisaStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "1 - Agendado", "2 - Atendido", "3 - Cancelado" }));

        jLabel2.setText("Página:");

        jBpaginador.setText("Abrir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCpesquisaStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDagendaDataSemana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCpaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBpaginador)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCpesquisaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDagendaDataSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBpaginador)
                    .addComponent(jCpaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBarTopo.setFloatable(false);
        jToolBarTopo.setRollover(true);

        jBatalhoConfiguracoesEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/empresa64x.png"))); // NOI18N
        jBatalhoConfiguracoesEmpresa.setText("Empresa");
        jBatalhoConfiguracoesEmpresa.setFocusable(false);
        jBatalhoConfiguracoesEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBatalhoConfiguracoesEmpresa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarTopo.add(jBatalhoConfiguracoesEmpresa);

        jBatalhoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add-cliente64x.png"))); // NOI18N
        jBatalhoClientes.setText("Clientes");
        jBatalhoClientes.setFocusable(false);
        jBatalhoClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBatalhoClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarTopo.add(jBatalhoClientes);

        jBatalhoAnimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/animal64x.png"))); // NOI18N
        jBatalhoAnimais.setText("Animais");
        jBatalhoAnimais.setFocusable(false);
        jBatalhoAnimais.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBatalhoAnimais.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarTopo.add(jBatalhoAnimais);

        jBatalhoAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/agenda64x.png"))); // NOI18N
        jBatalhoAgenda.setText("Agenda");
        jBatalhoAgenda.setFocusable(false);
        jBatalhoAgenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBatalhoAgenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarTopo.add(jBatalhoAgenda);

        jBatalhoFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add-fornecedor64x.png"))); // NOI18N
        jBatalhoFornecedores.setText("Fornecedores");
        jBatalhoFornecedores.setFocusable(false);
        jBatalhoFornecedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBatalhoFornecedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarTopo.add(jBatalhoFornecedores);

        jBatalhoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/produto64x.png"))); // NOI18N
        jBatalhoProdutos.setText("Produtos");
        jBatalhoProdutos.setFocusable(false);
        jBatalhoProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBatalhoProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarTopo.add(jBatalhoProdutos);

        jBatalhoServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/servico64x.png"))); // NOI18N
        jBatalhoServicos.setText("Serviços");
        jBatalhoServicos.setFocusable(false);
        jBatalhoServicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBatalhoServicos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarTopo.add(jBatalhoServicos);

        jBatalhoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/venda64x.png"))); // NOI18N
        jBatalhoVenda.setText("Vendas");
        jBatalhoVenda.setFocusable(false);
        jBatalhoVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBatalhoVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarTopo.add(jBatalhoVenda);

        jBatalhoFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/financeiro64x.png"))); // NOI18N
        jBatalhoFinanceiro.setText("Financeiro");
        jBatalhoFinanceiro.setFocusable(false);
        jBatalhoFinanceiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBatalhoFinanceiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarTopo.add(jBatalhoFinanceiro);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("V 1.0        ");
        jToolBar2.add(jLabel3);

        jLabrirAjuda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabrirAjuda.setForeground(new java.awt.Color(0, 153, 204));
        jLabrirAjuda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabrirAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ajuda16x.png"))); // NOI18N
        jLabrirAjuda.setText("Documentação");
        jLabrirAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToolBar2.add(jLabrirAjuda);

        jLabel5.setText("         ");
        jToolBar2.add(jLabel5);

        jLabrirSuporte.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabrirSuporte.setForeground(new java.awt.Color(0, 153, 204));
        jLabrirSuporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/clique16.png"))); // NOI18N
        jLabrirSuporte.setText("Suporte: www.taimber.com");
        jLabrirSuporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToolBar2.add(jLabrirSuporte);

        jMnotificacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/notificar24x.png"))); // NOI18N
        jMnotificacoes.setText("Notificações");

        jMagenda.setText("Agenda");
        jMnotificacoes.add(jMagenda);

        jMenu1.setText("Financeiro");

        jMfinanceiroPagar.setText("Pagar");
        jMenu1.add(jMfinanceiroPagar);

        jMfinanceiroReceber.setText("Receber");
        jMenu1.add(jMfinanceiroReceber);

        jMnotificacoes.add(jMenu1);

        jMenuBar1.add(jMnotificacoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBarTopo, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBarTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(JFprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBatalhoAgenda;
    public javax.swing.JButton jBatalhoAnimais;
    public javax.swing.JButton jBatalhoClientes;
    public javax.swing.JButton jBatalhoConfiguracoesEmpresa;
    public javax.swing.JButton jBatalhoFinanceiro;
    public javax.swing.JButton jBatalhoFornecedores;
    public javax.swing.JButton jBatalhoProdutos;
    public javax.swing.JButton jBatalhoServicos;
    public javax.swing.JButton jBatalhoVenda;
    public javax.swing.JButton jBpaginador;
    public javax.swing.JComboBox<String> jCpaginador;
    public javax.swing.JComboBox<String> jCpesquisaStatus;
    public com.toedter.calendar.JCalendar jDagendaDataSemana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabrirAjuda;
    public javax.swing.JLabel jLabrirSuporte;
    public javax.swing.JMenuItem jMagenda;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMfinanceiroPagar;
    public javax.swing.JMenuItem jMfinanceiroReceber;
    public javax.swing.JMenu jMnotificacoes;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTable jTagendaResultados;
    private javax.swing.JToolBar jToolBar2;
    public javax.swing.JToolBar jToolBarTopo;
    // End of variables declaration//GEN-END:variables
}
