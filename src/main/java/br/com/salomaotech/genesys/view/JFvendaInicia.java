/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.salomaotech.genesys.view;

/**
 *
 * @author usuario
 */
public class JFvendaInicia extends javax.swing.JFrame {

    private long id;

    /**
     * Creates new form JFvendaVenda
     */
    public JFvendaInicia() {
        initComponents();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPdadosPerfilFoto = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTprodutoCodigo = new javax.swing.JTextField();
        jTprodutoPreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTprodutoTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBprodutoAdicionaItem = new javax.swing.JButton();
        jBprodutoLimpaItem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTprodutoQuantidade = new javax.swing.JTextField();
        jTprodutoDesconto = new javax.swing.JTextField();
        jBcalcularGranel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        jBimprimir = new javax.swing.JButton();
        jBvendaExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jCprodutoLista = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTprodutoSelecionado = new javax.swing.JTable();
        jBprodutoSelecionadoRemoverItem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTvendaValorTotal = new javax.swing.JTextField();
        jBvendaFinaliza = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas - Genesys PetShop");
        setMinimumSize(new java.awt.Dimension(1024, 694));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPdadosPerfilFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPdadosPerfilFoto.setPreferredSize(new java.awt.Dimension(250, 250));

        javax.swing.GroupLayout jPdadosPerfilFotoLayout = new javax.swing.GroupLayout(jPdadosPerfilFoto);
        jPdadosPerfilFoto.setLayout(jPdadosPerfilFotoLayout);
        jPdadosPerfilFotoLayout.setHorizontalGroup(
            jPdadosPerfilFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPdadosPerfilFotoLayout.setVerticalGroup(
            jPdadosPerfilFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CÓDIGO:");

        jTprodutoCodigo.setEditable(false);
        jTprodutoCodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTprodutoCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTprodutoPreco.setEditable(false);
        jTprodutoPreco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTprodutoPreco.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PREÇO:");

        jTprodutoTotal.setEditable(false);
        jTprodutoTotal.setBackground(new java.awt.Color(0, 0, 0));
        jTprodutoTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTprodutoTotal.setForeground(new java.awt.Color(0, 204, 153));
        jTprodutoTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTprodutoTotal.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("TOTAL:");

        jBprodutoAdicionaItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBprodutoAdicionaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar32x.png"))); // NOI18N
        jBprodutoAdicionaItem.setText("ADICIONAR");
        jBprodutoAdicionaItem.setEnabled(false);

        jBprodutoLimpaItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBprodutoLimpaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove-item32x.png"))); // NOI18N
        jBprodutoLimpaItem.setText("LIMPAR");
        jBprodutoLimpaItem.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("QUANT:");

        jTprodutoQuantidade.setBackground(new java.awt.Color(0, 51, 102));
        jTprodutoQuantidade.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTprodutoQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        jTprodutoQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTprodutoQuantidade.setBorder(null);
        jTprodutoQuantidade.setCaretColor(new java.awt.Color(255, 255, 255));

        jTprodutoDesconto.setBackground(new java.awt.Color(153, 0, 0));
        jTprodutoDesconto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTprodutoDesconto.setForeground(new java.awt.Color(255, 255, 255));
        jTprodutoDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTprodutoDesconto.setBorder(null);
        jTprodutoDesconto.setCaretColor(new java.awt.Color(255, 255, 255));

        jBcalcularGranel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBcalcularGranel.setText("GRANEL");
        jBcalcularGranel.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DESC:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTprodutoPreco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTprodutoCodigo)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTprodutoQuantidade)
                                    .addComponent(jTprodutoDesconto))
                                .addGap(18, 18, 18)
                                .addComponent(jBcalcularGranel))
                            .addComponent(jTprodutoTotal)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPdadosPerfilFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 42, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBprodutoAdicionaItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBprodutoLimpaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPdadosPerfilFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTprodutoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTprodutoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBcalcularGranel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTprodutoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTprodutoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTprodutoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBprodutoAdicionaItem)
                    .addComponent(jBprodutoLimpaItem))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jBimprimir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/impressora32x.png"))); // NOI18N
        jBimprimir.setText("IMPRIMIR");
        jBimprimir.setEnabled(false);
        jBimprimir.setFocusable(false);
        jBimprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBimprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBimprimir);

        jBvendaExcluir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBvendaExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir32x.png"))); // NOI18N
        jBvendaExcluir.setText("EXCLUIR");
        jBvendaExcluir.setEnabled(false);
        jBvendaExcluir.setFocusable(false);
        jBvendaExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBvendaExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBvendaExcluir);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("  PRODUTO/SERVIÇO: ");
        jToolBar1.add(jLabel6);

        jCprodutoLista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jToolBar1.add(jCprodutoLista);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTprodutoSelecionado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTprodutoSelecionado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantidade", "Produto", "Desconto", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTprodutoSelecionado);
        if (jTprodutoSelecionado.getColumnModel().getColumnCount() > 0) {
            jTprodutoSelecionado.getColumnModel().getColumn(0).setMinWidth(85);
            jTprodutoSelecionado.getColumnModel().getColumn(0).setPreferredWidth(85);
            jTprodutoSelecionado.getColumnModel().getColumn(0).setMaxWidth(85);
            jTprodutoSelecionado.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTprodutoSelecionado.getColumnModel().getColumn(2).setMinWidth(125);
            jTprodutoSelecionado.getColumnModel().getColumn(2).setPreferredWidth(125);
            jTprodutoSelecionado.getColumnModel().getColumn(2).setMaxWidth(125);
            jTprodutoSelecionado.getColumnModel().getColumn(3).setMinWidth(125);
            jTprodutoSelecionado.getColumnModel().getColumn(3).setPreferredWidth(125);
            jTprodutoSelecionado.getColumnModel().getColumn(3).setMaxWidth(125);
        }

        jBprodutoSelecionadoRemoverItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBprodutoSelecionadoRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove-item32x.png"))); // NOI18N
        jBprodutoSelecionadoRemoverItem.setText("REMOVER ITEM");
        jBprodutoSelecionadoRemoverItem.setEnabled(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setText("TOTAL:");

        jTvendaValorTotal.setEditable(false);
        jTvendaValorTotal.setBackground(new java.awt.Color(0, 0, 0));
        jTvendaValorTotal.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jTvendaValorTotal.setForeground(new java.awt.Color(0, 204, 153));
        jTvendaValorTotal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTvendaValorTotal.setBorder(null);

        jBvendaFinaliza.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBvendaFinaliza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/concluir32x.png"))); // NOI18N
        jBvendaFinaliza.setText("FINALIZAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTvendaValorTotal)
                .addGap(18, 18, 18)
                .addComponent(jBvendaFinaliza)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBvendaFinaliza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTvendaValorTotal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBprodutoSelecionadoRemoverItem)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBprodutoSelecionadoRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(JFvendaInicia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFvendaInicia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFvendaInicia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFvendaInicia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFvendaInicia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBcalcularGranel;
    public javax.swing.JButton jBimprimir;
    public javax.swing.JButton jBprodutoAdicionaItem;
    public javax.swing.JButton jBprodutoLimpaItem;
    public javax.swing.JButton jBprodutoSelecionadoRemoverItem;
    public javax.swing.JButton jBvendaExcluir;
    public javax.swing.JButton jBvendaFinaliza;
    public javax.swing.JComboBox<String> jCprodutoLista;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPdadosPerfilFoto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JTextField jTprodutoCodigo;
    public javax.swing.JTextField jTprodutoDesconto;
    public javax.swing.JTextField jTprodutoPreco;
    public javax.swing.JTextField jTprodutoQuantidade;
    public javax.swing.JTable jTprodutoSelecionado;
    public javax.swing.JTextField jTprodutoTotal;
    public javax.swing.JTextField jTvendaValorTotal;
    // End of variables declaration//GEN-END:variables
}
