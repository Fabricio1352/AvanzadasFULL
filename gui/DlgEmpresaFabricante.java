package gui;

import dao.EmpresaProductoraDAO;
import dao.ResiduoDAO;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import util.Control;
import java.util.List;
import javax.swing.JOptionPane;
import objetosNegocio.EmpresaProductora;
import objetosNegocio.Residuo;
import util.ModeloLista;

/**
 *
 * @author Fabricio Aldaco
 */
public class DlgEmpresaFabricante extends javax.swing.JDialog {

    ModeloLista modelo, modeloEmpresas;
    EmpresaProductora e;
    EmpresaProductoraDAO dao;
    ResiduoDAO residuoDao;
    List<EmpresaProductora> eliminados;
    EmpresaProductora empresaEditar;

    public DlgEmpresaFabricante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        modeloEmpresas = new ModeloLista();
        modelo = new ModeloLista();
        dao = new EmpresaProductoraDAO();
        residuoDao = new ResiduoDAO();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtVerificacion4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtVerificacion6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtId = new javax.swing.JLabel();
        labelNombre = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEmpresas = new javax.swing.JList<>();
        botonBuscarNombre = new javax.swing.JButton();
        btnRegresarInterfaz = new javax.swing.JButton();
        txtVerificacion7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtId1 = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaEmpresas1 = new javax.swing.JList<>();
        botonBuscarNombre1 = new javax.swing.JButton();
        btnRegresarInterfaz1 = new javax.swing.JButton();
        btnEliminarEmpresas = new javax.swing.JButton();
        txtVerificacion8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnGuardarEditar = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();
        txtVerificacion5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreEditar = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        listResiduosEditar = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        btnRegresarInterfaz2 = new javax.swing.JButton();
        txtId2 = new javax.swing.JLabel();
        labelNombre2 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaEmpresas2 = new javax.swing.JList<>();
        botonBuscarNombre2 = new javax.swing.JButton();
        btnEditar2 = new javax.swing.JButton();
        txtVerificacion9 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Residuos fabricados:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setPreferredSize(new java.awt.Dimension(711, 371));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar ");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar ");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Volver");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setVisible(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(711, 371));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtVerificacion4.setFont(new java.awt.Font("Helvetica Neue", 2, 9)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombre de la empresa: ");

        txtVerificacion6.setFont(new java.awt.Font("Helvetica Neue", 2, 9)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVerificacion6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtVerificacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtVerificacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(txtVerificacion6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel3.setVisible(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(711, 371));
        jPanel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel3ComponentShown(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtId.setText("Ingresa el nombre:");

        labelNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                labelNombreKeyPressed(evt);
            }
        });

        listaEmpresas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        listaEmpresas.setModel(modeloEmpresas       );
        jScrollPane3.setViewportView(listaEmpresas);

        botonBuscarNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonBuscarNombre.setText("Buscar");
        botonBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarNombreActionPerformed(evt);
            }
        });

        btnRegresarInterfaz.setText("Regresar");
        btnRegresarInterfaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarInterfazActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresarInterfaz)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtId)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtVerificacion7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscarNombre)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVerificacion7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresarInterfaz)
                .addGap(19, 19, 19))
        );

        jPanel4.setVisible(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(711, 371));
        jPanel4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel4ComponentShown(evt);
            }
        });
        jPanel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel4KeyPressed(evt);
            }
        });

        txtId1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtId1.setText("Ingresa el nombre:");

        labelNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                labelNombre1KeyPressed(evt);
            }
        });

        listaEmpresas1.setModel(modeloEmpresas       );
        jScrollPane4.setViewportView(listaEmpresas1);

        botonBuscarNombre1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonBuscarNombre1.setText("Buscar");
        botonBuscarNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarNombre1ActionPerformed(evt);
            }
        });

        btnRegresarInterfaz1.setText("Regresar");
        btnRegresarInterfaz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarInterfaz1ActionPerformed(evt);
            }
        });

        btnEliminarEmpresas.setText("Eliminar");
        btnEliminarEmpresas.setVisible(false);
        btnEliminarEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpresasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnRegresarInterfaz1)
                        .addGap(380, 380, 380)
                        .addComponent(btnEliminarEmpresas))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtId1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVerificacion8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonBuscarNombre1)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtVerificacion8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarNombre1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarEmpresas)
                    .addComponent(btnRegresarInterfaz1))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel5.setVisible(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(711, 371));
        jPanel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel5ComponentShown(evt);
            }
        });

        btnGuardarEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardarEditar.setText("Guardar");
        btnGuardarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEditarActionPerformed(evt);
            }
        });

        btnCancelarEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelarEditar.setText("Cancelar");
        btnCancelarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditarActionPerformed(evt);
            }
        });

        txtVerificacion5.setFont(new java.awt.Font("Helvetica Neue", 2, 9)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nombre de la empresa: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Residuos fabricados:");

        txtNombreEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEditarActionPerformed(evt);
            }
        });

        listResiduosEditar.setModel(modelo       );
        jScrollPane5.setViewportView(listResiduosEditar);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnGuardarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtVerificacion5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnCancelarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtVerificacion5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel6.setVisible(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(711, 371));
        jPanel6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel6ComponentShown(evt);
            }
        });

        btnRegresarInterfaz2.setText("Regresar");
        btnRegresarInterfaz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarInterfaz2ActionPerformed(evt);
            }
        });

        txtId2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtId2.setText("Ingresa el nombre:");

        labelNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelNombre2ActionPerformed(evt);
            }
        });
        labelNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                labelNombre2KeyPressed(evt);
            }
        });

        listaEmpresas2.setModel(modeloEmpresas       );
        jScrollPane6.setViewportView(listaEmpresas2);

        botonBuscarNombre2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonBuscarNombre2.setText("Buscar");
        botonBuscarNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarNombre2ActionPerformed(evt);
            }
        });

        btnEditar2.setText("Editar");
        btnEditar2.setVisible(false);
        btnEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnRegresarInterfaz2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtId2)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVerificacion9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(labelNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(botonBuscarNombre2))))
                    .addComponent(jScrollPane6))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(txtVerificacion9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarNombre2))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresarInterfaz2)
                    .addComponent(btnEditar2))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(35, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (!Control.validar("^[a-zA-Z0-9\\s]{1,50}$", txtNombre.getText(), this)) {
            txtVerificacion7.setText("Solo texto y numeros, maximo 50");

        } else if (Control.validar("^$", txtNombre.getText(), null)) {
            txtVerificacion7.setText("No se encontraron resultados");
        } else {

            e.setNomEmpresa(txtNombre.getText());
            dao.agregar(e);
            JOptionPane.showMessageDialog(null, "Empresa Creada");
            jPanel1.setVisible(false);
            jPanel2.setVisible(true);
//            dao.editar(e);
//            dispose();
        }


    }//GEN-LAST:event_btnGuardarActionPerformed


    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
//        dao.eliminar(e);
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        jPanel3.setVisible(true);
        jPanel2.setVisible(false);


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        jPanel6.setVisible(true);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        e = new EmpresaProductora();
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void botonBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarNombreActionPerformed
        if (!Control.validar("^[a-zA-Z0-9\\s]{1,50}$", labelNombre.getText(), this)) {
            txtVerificacion7.setText("Solo texto y numeros, maximo 50");

        } else {
            buscarResultadosPorNomnbre(1);
        }


    }//GEN-LAST:event_botonBuscarNombreActionPerformed

    private void btnRegresarInterfazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarInterfazActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);

    }//GEN-LAST:event_btnRegresarInterfazActionPerformed
    private void buscarResultadosPorNomnbre(int opcion) {

        List<EmpresaProductora> empr = new ArrayList<>();
        modeloEmpresas = new ModeloLista<>();
        if (opcion == 1) {
            empr = dao.buscarPorNombre(labelNombre.getText());

        }
        if (opcion == 2) {
            empr = dao.buscarPorNombre(labelNombre1.getText());

        }
        if (opcion == 3) {
            empr = dao.buscarPorNombre(labelNombre2.getText());

        }
        for (int i = 0; i < empr.size();) {

            if (modeloEmpresas.contains(empr.get(i))) {
                i++;
            } else {
                modeloEmpresas.agregar(empr.get(i));
            }

        }
        if (!modeloEmpresas.isEmpty()) {
            botonBuscarNombre.setVisible(false);
            botonBuscarNombre1.setVisible(false);
            botonBuscarNombre2.setVisible(false);

        }
        if (opcion == 1) {
            listaEmpresas.setModel(modeloEmpresas);

        }
        if (opcion == 2) {
            listaEmpresas1.setModel(modeloEmpresas);
            btnEliminarEmpresas.setVisible(true);
        }
        if (opcion == 3) {
            listaEmpresas2.setModel(modeloEmpresas);
            btnEditar2.setVisible(true);

        }

    }
    private void labelNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelNombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!Control.validar("^[a-zA-Z0-9\\s]{1,50}$", labelNombre.getText(), this)) {
                txtVerificacion7.setText("Solo texto y numeros, maximo 50");

            } else {
                buscarResultadosPorNomnbre(1);
            }

        }

    }//GEN-LAST:event_labelNombreKeyPressed

    private void jPanel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentShown
        botonBuscarNombre.setVisible(true);
        modeloEmpresas.removeAllElements();
        labelNombre.setText("");
    }//GEN-LAST:event_jPanel3ComponentShown

    private void labelNombre1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelNombre1KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!Control.validar("^[a-zA-Z0-9\\s]{1,50}$", labelNombre1.getText(), this)) {
                txtVerificacion8.setText("Solo texto y numeros, maximo 50");

            } else {
                buscarResultadosPorNomnbre(2);
            }

        }
    }//GEN-LAST:event_labelNombre1KeyPressed

    private void botonBuscarNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarNombre1ActionPerformed
        if (!Control.validar("^[a-zA-Z0-9\\s]{1,50}$", labelNombre1.getText(), this)) {
            txtVerificacion8.setText("Solo texto y numeros, maximo 50");

        } else {
            buscarResultadosPorNomnbre(2);
        }


    }//GEN-LAST:event_botonBuscarNombre1ActionPerformed
    private void mostrarResultados() {
        List<EmpresaProductora> empr = dao.buscarPorNombre(labelNombre1.getText());
        modeloEmpresas = new ModeloLista();
        for (int i = 0; i < empr.size(); i++) {

            if (modeloEmpresas.contains(empr.get(i))) {
                i++;
            } else {
                modeloEmpresas.agregar(empr.get(i));

            }
        }
        listaEmpresas1.setModel(modeloEmpresas);
        if (!empr.isEmpty()) {
            btnEliminarEmpresas.setVisible(true);

        }

    }
    private void btnRegresarInterfaz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarInterfaz1ActionPerformed
        jPanel4.setVisible(false);
        jPanel2.setVisible(true);


    }//GEN-LAST:event_btnRegresarInterfaz1ActionPerformed

    private void jPanel4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel4ComponentShown
        botonBuscarNombre1.setVisible(true);
        modeloEmpresas.removeAllElements();
        labelNombre1.setText("");


    }//GEN-LAST:event_jPanel4ComponentShown

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        jPanel4.setVisible(true);
        jPanel2.setVisible(false);


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpresasActionPerformed
        eliminados = listaEmpresas1.getSelectedValuesList();
        for (EmpresaProductora er : eliminados) {
            dao.eliminar(er);
        }
        JOptionPane.showMessageDialog(null, "Empresa Eliminada");
        jPanel4.setVisible(false);
        jPanel2.setVisible(true);


    }//GEN-LAST:event_btnEliminarEmpresasActionPerformed

    private void jPanel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel4KeyPressed

    }//GEN-LAST:event_jPanel4KeyPressed

    private void btnGuardarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEditarActionPerformed
        if (!Control.validar("^[a-zA-Z0-9\\s]{1,50}$", txtNombreEditar.getText(), this)) {
            txtVerificacion4.setText("Solo texto y numeros, maximo 50");

        } else {
            e.setNomEmpresa(txtNombreEditar.getText());
            e.setResiduos(listResiduosEditar.getSelectedValuesList());
            dao.editar(e);

            jPanel5.setVisible(false);
            jPanel2.setVisible(true);
        }
    }//GEN-LAST:event_btnGuardarEditarActionPerformed

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        dao.eliminar(e);
        dispose();
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void txtNombreEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEditarActionPerformed

    }//GEN-LAST:event_txtNombreEditarActionPerformed

    private void btnRegresarInterfaz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarInterfaz2ActionPerformed
        jPanel6.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_btnRegresarInterfaz2ActionPerformed

    private void labelNombre2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelNombre2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!Control.validar("^([a-zA-Z0-9\\s]{1,50})?$", labelNombre2.getText(), null)) {
                txtVerificacion9.setText("Solo texto y números, máximo 50");
            } else if (Control.validar("^$", labelNombre2.getText(), null)) {
                txtVerificacion9.setText("No se encontraron resultados");
            } else {
                buscarResultadosPorNomnbre(3);
                if (modeloEmpresas.isEmpty()) {
                    txtVerificacion9.setText("No se encontraron resultados");
                }
            }
        }
    }//GEN-LAST:event_labelNombre2KeyPressed

    private void botonBuscarNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarNombre2ActionPerformed
        if (!Control.validar("^([a-zA-Z0-9\\s]{1,50})?$", labelNombre2.getText(), null)) {
            txtVerificacion9.setText("Solo texto y números, máximo 50");
        } else if (Control.validar("^$", labelNombre2.getText(), null)) {
            txtVerificacion9.setText("No se encontraron resultados");
        } else {
            buscarResultadosPorNomnbre(3);
            if (modeloEmpresas.isEmpty()) {
                txtVerificacion9.setText("No se encontraron resultados");
            }
        }
    }//GEN-LAST:event_botonBuscarNombre2ActionPerformed

    private void btnEditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar2ActionPerformed
        if (listaEmpresas2.getSelectedIndices().length > 1) {
            JOptionPane.showMessageDialog(null, "Solo edite una empresa a la vez");
            jPanel6.setVisible(true);
            return;
        }

        empresaEditar = listaEmpresas2.getSelectedValue();
        jPanel6.setVisible(false);
        jPanel5.setVisible(true);


    }//GEN-LAST:event_btnEditar2ActionPerformed

    private void jPanel5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel5ComponentShown

        txtNombreEditar.setText(empresaEditar.getNomEmpresa());
        ModeloLista otro = new ModeloLista();
        List<Residuo> residuosEditar = residuoDao.obtenerResiduos();
        for (int i = 0; i < residuosEditar.size(); i++) {

            if (otro.contains(residuosEditar.get(i))) {
                i++;
            } else {
                otro.agregar(residuosEditar.get(i));

            }
        }
        listResiduosEditar.setModel(otro);
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5ComponentShown

    private void jPanel6ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel6ComponentShown
        labelNombre2.setText("");
        botonBuscarNombre2.setVisible(true);
        modeloEmpresas.clear();

    }//GEN-LAST:event_jPanel6ComponentShown

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing


    }//GEN-LAST:event_formWindowClosing

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        this.dispose();

    }//GEN-LAST:event_jLabel5MouseClicked

    private void labelNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelNombre2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        modeloEmpresas.clear();


    }//GEN-LAST:event_formWindowOpened

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        txtVerificacion9.setText("");
        txtVerificacion4.setText("");
        txtVerificacion5.setText("");
        txtVerificacion5.setText("");
        txtVerificacion6.setText("");
        txtVerificacion7.setText("");
        txtVerificacion8.setText("");


    }//GEN-LAST:event_formComponentShown

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        txtNombre.setText("");


    }//GEN-LAST:event_jPanel1ComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarNombre;
    private javax.swing.JButton botonBuscarNombre1;
    private javax.swing.JButton botonBuscarNombre2;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditar2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarEmpresas;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarEditar;
    private javax.swing.JButton btnRegresarInterfaz;
    private javax.swing.JButton btnRegresarInterfaz1;
    private javax.swing.JButton btnRegresarInterfaz2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField labelNombre;
    private javax.swing.JTextField labelNombre1;
    private javax.swing.JTextField labelNombre2;
    private javax.swing.JList<Residuo> listResiduosEditar;
    private javax.swing.JList<Residuo> listaEmpresas;
    private javax.swing.JList<EmpresaProductora> listaEmpresas1;
    private javax.swing.JList<EmpresaProductora> listaEmpresas2;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtId1;
    private javax.swing.JLabel txtId2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEditar;
    private javax.swing.JLabel txtVerificacion4;
    private javax.swing.JLabel txtVerificacion5;
    private javax.swing.JLabel txtVerificacion6;
    private javax.swing.JLabel txtVerificacion7;
    private javax.swing.JLabel txtVerificacion8;
    private javax.swing.JLabel txtVerificacion9;
    // End of variables declaration//GEN-END:variables
}
