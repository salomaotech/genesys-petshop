/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.salomaotech.genesys.view;

/**
 *
 * @author usuario
 */
public class JFproduto extends javax.swing.JFrame {

    private long id;

    /**
     * Creates new form JFagenda
     */
    public JFproduto() {
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTvalorCusto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTvalorVenda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTdescricao = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jCcategoria = new javax.swing.JComboBox<>();
        jBrefreshCategoria = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jCmedida = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTquantidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jCfornecedor = new javax.swing.JComboBox<>();
        jBrefreshFornecedor = new javax.swing.JButton();
        jBpesquisaFornecedor = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTestoqueMinimo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTpeso = new javax.swing.JTextField();
        jPdadosPerfilFoto = new javax.swing.JPanel();
        jToolBar3 = new javax.swing.JToolBar();
        jBadicionaFoto = new javax.swing.JButton();
        jBremoveFoto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTresultados = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTpesquisaNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCpesquisaCategoria = new javax.swing.JComboBox<>();
        jBrefreshPesquisaCategoria = new javax.swing.JButton();
        jCestoqueBaixo = new javax.swing.JCheckBox();
        jBpesquisa = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jCpaginador = new javax.swing.JComboBox<>();
        jBpaginador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos - Genesys PetShop");
        setMinimumSize(new java.awt.Dimension(1024, 694));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jBatalhoCadastro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBatalhoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar32x.png"))); // NOI18N
        jBatalhoCadastro.setText("Novo produto");
        jBatalhoCadastro.setFocusable(false);
        jBatalhoCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBatalhoCadastro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBatalhoCadastro);

        jBcadastroSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBcadastroSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar32x.png"))); // NOI18N
        jBcadastroSalvar.setText("Salvar");
        jBcadastroSalvar.setFocusable(false);
        jBcadastroSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBcadastroSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBcadastroSalvar);

        jBcadastroExcluir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBcadastroExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove-item32x.png"))); // NOI18N
        jBcadastroExcluir.setText("Excluir");
        jBcadastroExcluir.setEnabled(false);
        jBcadastroExcluir.setFocusable(false);
        jBcadastroExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBcadastroExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBcadastroExcluir);

        jBatalhoPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBatalhoPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisa32x.png"))); // NOI18N
        jBatalhoPesquisa.setText("Pesquisar");
        jBatalhoPesquisa.setFocusable(false);
        jBatalhoPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBatalhoPesquisa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBatalhoPesquisa);

        jTabaPrincipal.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabaPrincipal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Nome:");

        jTnome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Custo R$:");

        jTvalorCusto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTvalorCusto.setText("0");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Valor R$:");

        jTvalorVenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTvalorVenda.setText("0");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Descrição:");

        jTdescricao.setColumns(20);
        jTdescricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTdescricao.setRows(5);
        jScrollPane1.setViewportView(jTdescricao);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Categoria:");

        jCcategoria.setEditable(true);
        jCcategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jBrefreshCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBrefreshCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atualizar16x.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Medida:");

        jCmedida.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCmedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMPOLA", "BALDE", "BANDEJ", "BARRA", "BISNAG", "BLOCO", "BOBINA", "BOMB", "CAPS", "CART", "CENTO", "CJ", "CM", "CM2", "CX", "CX2", "CX3", "CX5", "CX10", "CX15", "CX20", "CX25", "CX50", "CX100", "DISP", "DUZIA", "EMBAL", "FARDO", "FOLHA", "FRASCO", "GALAO", "GF", "GRAMAS", "JOGO", "KG", "KIT", "LATA", "LITRO", "M", "M2", "M3", "MILHEI", "ML", "MWH", "PACOTE", "PALETE", "PARES", "PC", "POTE", "K", "RESMA", "ROLO", "SACO", "SACOLA", "TAMBOR", "TANQUE", "TON", "TUBO", "UNID", "VASIL", "VIDRO" }));
        jCmedida.setSelectedIndex(-1);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Quantidade:");

        jTquantidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTquantidade.setText("0");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Fornecedor:");

        jCfornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jBrefreshFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBrefreshFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atualizar16x.png"))); // NOI18N

        jBpesquisaFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBpesquisaFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/buscar16x.png"))); // NOI18N
        jBpesquisaFornecedor.setText("Novo");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Estoque mínimo:");

        jTestoqueMinimo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTestoqueMinimo.setText("0");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Peso KG:");

        jTpeso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addComponent(jTvalorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jTvalorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addComponent(jCcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBrefreshCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addComponent(jCmedida, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addGap(12, 12, 12)
                .addComponent(jTquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addComponent(jCfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBrefreshFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBpesquisaFornecedor))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel12)
                .addGap(12, 12, 12)
                .addComponent(jTestoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jTpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4))
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTvalorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTvalorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8))
                    .addComponent(jCcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jBrefreshCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addComponent(jCmedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel10))
                    .addComponent(jTquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11))
                    .addComponent(jCfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBrefreshFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBpesquisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTestoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1)))))
        );

        jTabbedPane1.addTab("Básico", jPanel4);

        jPdadosPerfilFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPdadosPerfilFoto.setMaximumSize(new java.awt.Dimension(192, 192));
        jPdadosPerfilFoto.setMinimumSize(new java.awt.Dimension(192, 192));

        javax.swing.GroupLayout jPdadosPerfilFotoLayout = new javax.swing.GroupLayout(jPdadosPerfilFoto);
        jPdadosPerfilFoto.setLayout(jPdadosPerfilFotoLayout);
        jPdadosPerfilFotoLayout.setHorizontalGroup(
            jPdadosPerfilFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPdadosPerfilFotoLayout.setVerticalGroup(
            jPdadosPerfilFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        jToolBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        jBadicionaFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/photo-camera.png"))); // NOI18N
        jBadicionaFoto.setEnabled(false);
        jBadicionaFoto.setFocusable(false);
        jBadicionaFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBadicionaFoto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(jBadicionaFoto);

        jBremoveFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove-item32x.png"))); // NOI18N
        jBremoveFoto.setEnabled(false);
        jBremoveFoto.setFocusable(false);
        jBremoveFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBremoveFoto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(jBremoveFoto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPdadosPerfilFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPdadosPerfilFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabaPrincipal.addTab("Formulário", jPanel1);

        jTresultados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTresultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Valor R$", "Medida", "Quantidade", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            jTresultados.getColumnModel().getColumn(2).setMinWidth(125);
            jTresultados.getColumnModel().getColumn(2).setPreferredWidth(125);
            jTresultados.getColumnModel().getColumn(2).setMaxWidth(125);
            jTresultados.getColumnModel().getColumn(3).setMinWidth(90);
            jTresultados.getColumnModel().getColumn(3).setPreferredWidth(90);
            jTresultados.getColumnModel().getColumn(3).setMaxWidth(90);
            jTresultados.getColumnModel().getColumn(4).setMinWidth(100);
            jTresultados.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTresultados.getColumnModel().getColumn(4).setMaxWidth(100);
            jTresultados.getColumnModel().getColumn(5).setMinWidth(175);
            jTresultados.getColumnModel().getColumn(5).setPreferredWidth(175);
            jTresultados.getColumnModel().getColumn(5).setMaxWidth(175);
        }

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nome:");

        jTpesquisaNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Categoria:");

        jCpesquisaCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jBrefreshPesquisaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atualizar16x.png"))); // NOI18N

        jCestoqueBaixo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCestoqueBaixo.setText("Estoque baixo");
        jCestoqueBaixo.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jBpesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBpesquisa.setText("Pesquisar");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jCestoqueBaixo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBpesquisa))
                    .addComponent(jTpesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCpesquisaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBrefreshPesquisaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBrefreshPesquisaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTpesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jCpesquisaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCestoqueBaixo)
                    .addComponent(jBpesquisa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Página:");

        jCpaginador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jBpaginador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBpaginador.setText("Abrir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(12, 12, 12)
                        .addComponent(jCpaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jBpaginador)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jCpaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBpaginador))
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
            java.util.logging.Logger.getLogger(JFproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new JFproduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBadicionaFoto;
    public javax.swing.JButton jBatalhoCadastro;
    public javax.swing.JButton jBatalhoPesquisa;
    public javax.swing.JButton jBcadastroExcluir;
    public javax.swing.JButton jBcadastroSalvar;
    public javax.swing.JButton jBpaginador;
    public javax.swing.JButton jBpesquisa;
    public javax.swing.JButton jBpesquisaFornecedor;
    public javax.swing.JButton jBrefreshCategoria;
    public javax.swing.JButton jBrefreshFornecedor;
    public javax.swing.JButton jBrefreshPesquisaCategoria;
    public javax.swing.JButton jBremoveFoto;
    public javax.swing.JComboBox<String> jCcategoria;
    public javax.swing.JCheckBox jCestoqueBaixo;
    public javax.swing.JComboBox<String> jCfornecedor;
    public javax.swing.JComboBox<String> jCmedida;
    public javax.swing.JComboBox<String> jCpaginador;
    public javax.swing.JComboBox<String> jCpesquisaCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPdadosPerfilFoto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTabbedPane jTabaPrincipal;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextArea jTdescricao;
    public javax.swing.JTextField jTestoqueMinimo;
    public javax.swing.JTextField jTnome;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar3;
    public javax.swing.JTextField jTpeso;
    public javax.swing.JTextField jTpesquisaNome;
    public javax.swing.JTextField jTquantidade;
    public javax.swing.JTable jTresultados;
    public javax.swing.JTextField jTvalorCusto;
    public javax.swing.JTextField jTvalorVenda;
    // End of variables declaration//GEN-END:variables
}
