/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.salomaotech.genesys.view;

/**
 *
 * @author usuario
 */
public class JFempresa extends javax.swing.JFrame {

    private long id;

    /**
     * Creates new form JFempresa2
     */
    public JFempresa() {
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

        jToolBar3 = new javax.swing.JToolBar();
        jBadicionaFoto = new javax.swing.JButton();
        jBremoveFoto = new javax.swing.JButton();
        jTabaCadastro = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTbasicoNome = new javax.swing.JTextField();
        jTcontatoTelefone = new javax.swing.JTextField();
        jTcontatoEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jFbasicoCnpj = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jFenderecoCep = new javax.swing.JFormattedTextField();
        jBenderecoBuscarCep = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTenderecoRua = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTenderecoQuadra = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTenderecoLote = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jCenderecoUf = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTenderecoNumero = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTenderecoBairro = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTenderecoCidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTenderecoComplemento = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPdadosPerfilFoto = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jBcadastroSalvar = new javax.swing.JButton();
        jBcadastroExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empresa - Genesys PetShop");
        setMinimumSize(new java.awt.Dimension(1024, 694));

        jToolBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        jBadicionaFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/photo-camera.png"))); // NOI18N
        jBadicionaFoto.setEnabled(false);
        jBadicionaFoto.setFocusable(false);
        jBadicionaFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBadicionaFoto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(jBadicionaFoto);

        jBremoveFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove-item24x.png"))); // NOI18N
        jBremoveFoto.setEnabled(false);
        jBremoveFoto.setFocusable(false);
        jBremoveFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBremoveFoto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(jBremoveFoto);

        jTabaCadastro.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Nome:");

        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("CNPJ:");

        jLabel8.setText("Telefone:");

        jLabel9.setText("E-mail:");

        try {
            jFbasicoCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(jTbasicoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(jFbasicoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(jTcontatoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12)
                        .addComponent(jTcontatoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(289, 289, 289))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addComponent(jTbasicoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addComponent(jFbasicoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8))
                    .addComponent(jTcontatoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addComponent(jTcontatoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(316, 316, 316))
        );

        jTabaCadastro.addTab("Básico", jPanel1);

        jLabel12.setText("CEP:");

        try {
            jFenderecoCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jBenderecoBuscarCep.setText("Buscar CEP");

        jLabel13.setText("Rua:");

        jLabel14.setText("Quadra:");

        jLabel15.setText("Lote:");

        jLabel17.setText("UF:");

        jCenderecoUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel16.setText("Número:");

        jLabel18.setText("Bairro:");

        jLabel19.setText("Cidade:");

        jTenderecoComplemento.setColumns(20);
        jTenderecoComplemento.setRows(5);
        jScrollPane1.setViewportView(jTenderecoComplemento);

        jLabel4.setText("Complemento:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel12)
                .addGap(12, 12, 12)
                .addComponent(jFenderecoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBenderecoBuscarCep))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel13)
                .addGap(12, 12, 12)
                .addComponent(jTenderecoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel14)
                .addGap(12, 12, 12)
                .addComponent(jTenderecoQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(12, 12, 12)
                .addComponent(jTenderecoLote, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel16)
                .addGap(12, 12, 12)
                .addComponent(jTenderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel17)
                .addGap(12, 12, 12)
                .addComponent(jCenderecoUf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel18)
                .addGap(12, 12, 12)
                .addComponent(jTenderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel19)
                .addGap(12, 12, 12)
                .addComponent(jTenderecoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jFenderecoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBenderecoBuscarCep, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel13))
                    .addComponent(jTenderecoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel14))
                    .addComponent(jTenderecoQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel15))
                    .addComponent(jTenderecoLote, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTenderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel17))
                    .addComponent(jCenderecoUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel18))
                    .addComponent(jTenderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel19))
                    .addComponent(jTenderecoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabaCadastro.addTab("Endereço", jPanel2);

        jPdadosPerfilFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPdadosPerfilFoto.setMaximumSize(new java.awt.Dimension(192, 192));
        jPdadosPerfilFoto.setMinimumSize(new java.awt.Dimension(192, 192));
        jPdadosPerfilFoto.setPreferredSize(new java.awt.Dimension(192, 192));

        javax.swing.GroupLayout jPdadosPerfilFotoLayout = new javax.swing.GroupLayout(jPdadosPerfilFoto);
        jPdadosPerfilFoto.setLayout(jPdadosPerfilFotoLayout);
        jPdadosPerfilFotoLayout.setHorizontalGroup(
            jPdadosPerfilFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        jPdadosPerfilFotoLayout.setVerticalGroup(
            jPdadosPerfilFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jBcadastroSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar32x.png"))); // NOI18N
        jBcadastroSalvar.setText("Salvar");
        jBcadastroSalvar.setFocusable(false);
        jBcadastroSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBcadastroSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jBcadastroSalvar);

        jBcadastroExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove-item32x.png"))); // NOI18N
        jBcadastroExcluir.setText("Excluir");
        jBcadastroExcluir.setEnabled(false);
        jBcadastroExcluir.setFocusable(false);
        jBcadastroExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBcadastroExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jBcadastroExcluir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabaCadastro)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPdadosPerfilFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPdadosPerfilFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(JFempresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFempresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFempresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFempresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFempresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBadicionaFoto;
    public javax.swing.JButton jBcadastroExcluir;
    public javax.swing.JButton jBcadastroSalvar;
    public javax.swing.JButton jBenderecoBuscarCep;
    public javax.swing.JButton jBremoveFoto;
    public javax.swing.JComboBox<String> jCenderecoUf;
    public javax.swing.JFormattedTextField jFbasicoCnpj;
    public javax.swing.JFormattedTextField jFenderecoCep;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPdadosPerfilFoto;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTabbedPane jTabaCadastro;
    public javax.swing.JTextField jTbasicoNome;
    public javax.swing.JTextField jTcontatoEmail;
    public javax.swing.JTextField jTcontatoTelefone;
    public javax.swing.JTextField jTenderecoBairro;
    public javax.swing.JTextField jTenderecoCidade;
    public javax.swing.JTextArea jTenderecoComplemento;
    public javax.swing.JTextField jTenderecoLote;
    public javax.swing.JTextField jTenderecoNumero;
    public javax.swing.JTextField jTenderecoQuadra;
    public javax.swing.JTextField jTenderecoRua;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    // End of variables declaration//GEN-END:variables
}