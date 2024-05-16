/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import dao.EmpresaTransporteDAO;
import dao.VehiculoDAO;
import java.awt.event.KeyEvent;
import java.util.List;
import util.Control;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import objetosNegocio.EmpresaProductora;
import objetosNegocio.EmpresaTransporte;
import objetosNegocio.Translado;
import objetosNegocio.Vehiculo;
import util.ModeloLista;

/**
 *
 * @author nvc02
 */
public class DlgEmpresaTransporte extends javax.swing.JDialog {
    
    EmpresaTransporte e;
    ModeloLista modelo, modeloEmpresas;
    DefaultComboBoxModel translados;
    Control control;
    EmpresaTransporteDAO dao;
    VehiculoDAO vehiculoDao;
    List<EmpresaTransporte> eliminados;
    EmpresaTransporte empresaEditar;
    
    public DlgEmpresaTransporte(java.awt.Frame parent, boolean modal, EmpresaTransporte e, ModeloLista modelo, DefaultComboBoxModel translados, Control control) {
        super(parent, modal);
        this.e = e;
        this.modelo = modelo;
        modeloEmpresas = new ModeloLista();
        this.translados = translados;
        this.control = control;
        dao = new EmpresaTransporteDAO();
        vehiculoDao = new VehiculoDAO();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbTranslado = new javax.swing.JComboBox<>();
        botonAceptar1 = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtVerificacion4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtId = new javax.swing.JLabel();
        labelNombre = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEmpresas = new javax.swing.JList<>();
        botonBuscarNombre = new javax.swing.JButton();
        btnRegresarInterfaz = new javax.swing.JButton();
        btnEditarNose = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtId1 = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaEmpresas1 = new javax.swing.JList<>();
        botonBuscarNombre1 = new javax.swing.JButton();
        btnRegresarInterfaz1 = new javax.swing.JButton();
        btnEliminarEmpresas = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txtVerificacion6 = new javax.swing.JLabel();
        cbTranslado1 = new javax.swing.JComboBox<>();
        botonAceptar2 = new javax.swing.JButton();
        botonCancelar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnRegresarInterfaz2 = new javax.swing.JButton();
        txtId2 = new javax.swing.JLabel();
        labelNombre2 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaEmpresas2 = new javax.swing.JList<>();
        botonBuscarNombre2 = new javax.swing.JButton();
        btnEditar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setPreferredSize(new java.awt.Dimension(711, 371));

        btnAgregar.setText("Agregar ");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar ");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1.setVisible(false);

        cbTranslado.setModel(translados);
        cbTranslado.setMaximumSize(new java.awt.Dimension(72, 23));

        botonAceptar1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        botonAceptar1.setText("Aceptar");
        botonAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptar1ActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        lista.setModel(modelo       );
        jScrollPane1.setViewportView(lista);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombre de la empresa: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Vehiculos utilizados: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Envio realizado: ");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtVerificacion4.setFont(new java.awt.Font("Helvetica Neue", 2, 9)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTranslado, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVerificacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVerificacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbTranslado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setVisible(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(572, 334));
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

        listaEmpresas.setModel(modeloEmpresas       );
        jScrollPane3.setViewportView(listaEmpresas);

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

        btnEditarNose.setVisible(false);
        btnEditarNose.setText("Editar");
        btnEditarNose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarNoseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRegresarInterfaz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarNose))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonBuscarNombre)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtId)
                                .addGap(36, 36, 36)
                                .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(botonBuscarNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarNose)
                    .addComponent(btnRegresarInterfaz))
                .addContainerGap(49, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(btnRegresarInterfaz1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(botonBuscarNombre1)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(txtId1)
                                    .addGap(36, 36, 36)
                                    .addComponent(labelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(143, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarEmpresas)
                        .addGap(120, 120, 120))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(botonBuscarNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(btnEliminarEmpresas))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addComponent(btnRegresarInterfaz1)
                        .addGap(17, 17, 17))))
        );

        jPanel5.setVisible(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(711, 371));
        jPanel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel5ComponentShown(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Envio realizado: ");

        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });

        txtVerificacion6.setFont(new java.awt.Font("Helvetica Neue", 2, 9)); // NOI18N

        cbTranslado1.setModel(translados);
        cbTranslado1.setMaximumSize(new java.awt.Dimension(72, 23));

        botonAceptar2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        botonAceptar2.setText("Aceptar");
        botonAceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptar2ActionPerformed(evt);
            }
        });

        botonCancelar1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        botonCancelar1.setText("Cancelar");
        botonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelar1ActionPerformed(evt);
            }
        });

        lista1.setModel(modelo       );
        jScrollPane2.setViewportView(lista1);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Nombre de la empresa: ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Vehiculos utilizados: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonAceptar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTranslado1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botonCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVerificacion6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVerificacion6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbTranslado1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        labelNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                labelNombre2KeyPressed(evt);
            }
        });

        listaEmpresas2.setModel(modeloEmpresas       );
        jScrollPane6.setViewportView(listaEmpresas2);

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
                .addContainerGap()
                .addComponent(btnRegresarInterfaz2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(botonBuscarNombre2)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(txtId2)
                                    .addGap(36, 36, 36)
                                    .addComponent(labelNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(193, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar2)
                        .addGap(208, 208, 208))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(botonBuscarNombre2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addComponent(btnRegresarInterfaz2)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(btnEditar2))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar1ActionPerformed
        if (!Control.validar("^[a-zA-Z0-9\\s]{1,50}$", txtNombre.getText(), this)) {
            txtVerificacion4.setText("Solo texto y numeros, maximo 50");
            
        } else {
            e.setNomEmpresa(txtNombre.getText());
            e.setVehiculos(lista.getSelectedValuesList());
            e.setTranslado((Translado) cbTranslado.getSelectedItem());
            control.actualizarEmpresaTransporte(e);
            jPanel2.setVisible(true);
            jPanel1.setVisible(false);
        }
        

    }//GEN-LAST:event_botonAceptar1ActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
//        dao.Fachada fachade = dao.Fachada.getInstance();
//        fachade.eliminar(EmpresaTransporte.class, e.getIdEmpresa());
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
//        dao.Fachada fachade = dao.Fachada.getInstance();
//        fachade.eliminar(EmpresaTransporte.class, e.getIdEmpresa());
        dispose();

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        jPanel4.setVisible(true);
        jPanel2.setVisible(false);

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        jPanel3.setVisible(true);
        jPanel2.setVisible(false);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        jPanel6.setVisible(true);
        jPanel2.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void labelNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelNombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarResultadosPorNomnbre();
            mostrarResultados();
            
        }
    }//GEN-LAST:event_labelNombreKeyPressed

    private void botonBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarNombreActionPerformed
        buscarResultadosPorNomnbre();
        if (!modeloEmpresas.isEmpty()) {
            btnEditarNose.setVisible(true);
        }
    }//GEN-LAST:event_botonBuscarNombreActionPerformed

    private void btnRegresarInterfazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarInterfazActionPerformed
        this.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_btnRegresarInterfazActionPerformed

    private void jPanel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentShown
        
        modeloEmpresas.removeAllElements();
    }//GEN-LAST:event_jPanel3ComponentShown

    private void labelNombre1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelNombre1KeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarResultadosPorNomnbre();
            mostrarResultados();
            
        }
    }//GEN-LAST:event_labelNombre1KeyPressed

    private void botonBuscarNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarNombre1ActionPerformed
        mostrarResultados();
        if(!modeloEmpresas.isEmpty()){
           btnEliminarEmpresas.setVisible(true);
        }
    }//GEN-LAST:event_botonBuscarNombre1ActionPerformed

    private void btnRegresarInterfaz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarInterfaz1ActionPerformed
        
        jPanel2.setVisible(true);
        jPanel4.setVisible(false);

    }//GEN-LAST:event_btnRegresarInterfaz1ActionPerformed

    private void btnEliminarEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpresasActionPerformed
        eliminados = listaEmpresas1.getSelectedValuesList();
        for (EmpresaTransporte e : eliminados) {
            dao.eliminar(e);
        }
        JOptionPane.showMessageDialog(null, "Empresa Eliminada");
        jPanel4.setVisible(false);
        jPanel2.setVisible(true);

    }//GEN-LAST:event_btnEliminarEmpresasActionPerformed

    private void jPanel4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel4ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4ComponentShown

    private void jPanel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel4KeyPressed

    }//GEN-LAST:event_jPanel4KeyPressed

    private void jPanel5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel5ComponentShown
        
        txtNombre1.setText(empresaEditar.getNomEmpresa());
        ModeloLista otro = new ModeloLista();
        List<Vehiculo> vehiculosEditar = vehiculoDao.obtenerVehiculosDeEmpresa(listaEmpresas2.getSelectedValue());
        for (int i = 0; i < vehiculosEditar.size(); i++) {
            
            if (otro.contains(vehiculosEditar.get(i))) {
                i++;
            } else {
                otro.agregar(vehiculosEditar.get(i));
                
            }
        }
        lista1.setModel(otro);
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5ComponentShown

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void botonAceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAceptar2ActionPerformed

    private void botonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelar1ActionPerformed

    private void btnRegresarInterfaz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarInterfaz2ActionPerformed
        this.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_btnRegresarInterfaz2ActionPerformed

    private void labelNombre2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelNombre2KeyPressed

    }//GEN-LAST:event_labelNombre2KeyPressed

    private void botonBuscarNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarNombre2ActionPerformed
        buscarResultadosPorNomnbre();
        btnEditar2.setVisible(true);
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

    private void jPanel6ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel6ComponentShown
        labelNombre2.setText("");
        modeloEmpresas.clear();
    }//GEN-LAST:event_jPanel6ComponentShown

    private void btnEditarNoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarNoseActionPerformed
        
        if (listaEmpresas2.getSelectedIndices().length > 1) {
            JOptionPane.showMessageDialog(null, "Solo edite una empresa a la vez");
            jPanel6.setVisible(true);
            return;
        }
        
        empresaEditar = listaEmpresas2.getSelectedValue();
        jPanel6.setVisible(false);
        jPanel5.setVisible(true);
        

    }//GEN-LAST:event_btnEditarNoseActionPerformed
    
    private void mostrarResultados() {
        List<EmpresaTransporte> empr = dao.buscarPorNombre(labelNombre1.getText());
        modeloEmpresas = new ModeloLista();
        for (int i = 0; i < empr.size(); i++) {
            
            if (modeloEmpresas.contains(empr.get(i))) {
                i++;
            } else {
                modeloEmpresas.agregar(empr.get(i));
                
            }
        }
        listaEmpresas1.setModel(modeloEmpresas);
//        btnEliminarEmpresas.setVisible(true);
        
    }
    
    private void buscarResultadosPorNomnbre() {
        List<EmpresaTransporte> empr = dao.buscarPorNombre(labelNombre2.getText());
        
        for (int i = 0; i < empr.size();) {
            
            if (modeloEmpresas.contains(empr.get(i))) {
                i++;
            } else {
                modeloEmpresas.agregar(empr.get(i));
            }
        }
        listaEmpresas.setModel(modeloEmpresas);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar1;
    private javax.swing.JButton botonAceptar2;
    private javax.swing.JButton botonBuscarNombre;
    private javax.swing.JButton botonBuscarNombre1;
    private javax.swing.JButton botonBuscarNombre2;
    public javax.swing.JButton botonCancelar;
    public javax.swing.JButton botonCancelar1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditar2;
    private javax.swing.JButton btnEditarNose;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarEmpresas;
    private javax.swing.JButton btnRegresarInterfaz;
    private javax.swing.JButton btnRegresarInterfaz1;
    private javax.swing.JButton btnRegresarInterfaz2;
    private javax.swing.JComboBox<Translado> cbTranslado;
    private javax.swing.JComboBox<Translado> cbTranslado1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField labelNombre;
    private javax.swing.JTextField labelNombre1;
    private javax.swing.JTextField labelNombre2;
    private javax.swing.JList<Vehiculo> lista;
    private javax.swing.JList<Vehiculo> lista1;
    private javax.swing.JList<EmpresaTransporte> listaEmpresas;
    private javax.swing.JList<EmpresaTransporte> listaEmpresas1;
    private javax.swing.JList<EmpresaTransporte> listaEmpresas2;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtId1;
    private javax.swing.JLabel txtId2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JLabel txtVerificacion4;
    private javax.swing.JLabel txtVerificacion6;
    // End of variables declaration//GEN-END:variables
}
