package gui;

import dao.EmpresaProductoraDAO;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import objetosNegocio.EmpresaProductora;
import util.Control;
import util.ModeloLista;

public class DlgRegistro extends javax.swing.JFrame {

    ModeloLista<EmpresaProductora> modeloEmpresas;
    EmpresaProductora e;
    EmpresaProductoraDAO dao;

    public DlgRegistro(EmpresaProductoraDAO dao) {
        this.dao = dao;
        e = new EmpresaProductora();
        modeloEmpresas = new ModeloLista<>();
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtVerificacion4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtVerificacion6 = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtId = new javax.swing.JLabel();
        labelNombre = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEmpresas = new javax.swing.JList<>();
        botonBuscarNombre = new javax.swing.JButton();
        btnRegresarInterfaz = new javax.swing.JButton();
        txtVerificacion7 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setVisible(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(830, 371));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.setLayout(null);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });
        jPanel1.add(txtNombre);
        txtNombre.setBounds(290, 110, 368, 42);

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar);
        btnGuardar.setBounds(110, 280, 146, 49);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(650, 280, 146, 49);

        txtVerificacion4.setFont(new java.awt.Font("Helvetica Neue", 2, 9)); // NOI18N
        jPanel1.add(txtVerificacion4);
        txtVerificacion4.setBounds(660, 110, 179, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido, registre su empresa");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 10, 700, 60);

        txtVerificacion6.setFont(new java.awt.Font("Helvetica Neue", 2, 9)); // NOI18N
        jPanel1.add(txtVerificacion6);
        txtVerificacion6.setBounds(290, 160, 360, 30);

        btnCancelar1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnCancelar1.setText("Buscar mi Empresa");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar1);
        btnCancelar1.setBounds(360, 280, 176, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre de la empresa: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 110, 202, 40);

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

        btnSeleccionar.setVisible(false);
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRegresarInterfaz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeleccionar))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresarInterfaz)
                    .addComponent(btnSeleccionar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(82, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (!Control.validar("^[a-zA-Z0-9\\s]{1,50}$", txtNombre.getText(), null)) {
            txtVerificacion6.setText("Solo texto y numeros, maximo 50");

        } else {

            e.setNomEmpresa(txtNombre.getText());
            dao.agregar(e);
//            dao.editar(e);
//            dispose();
            this.setVisible(false);
            new GuiProductores(e).setVisible(true);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dao.eliminar(e);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        jPanel1.setVisible(false);
        jPanel3.setVisible(true);


    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        dao.eliminar(e);
        dispose();


    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        dao.eliminar(e);
        dispose();

    }//GEN-LAST:event_formWindowClosing

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!Control.validar("^[a-zA-Z0-9\\s]{1,50}$", txtNombre.getText(), null)) {
                txtVerificacion6.setText("Solo texto y numeros, maximo 50");

            } else {

                e.setNomEmpresa(txtNombre.getText());
                dao.agregar(e);

//                dao.editar(e);
//                dispose();
                this.setVisible(false);
                new GuiProductores(e).setVisible(true);
            }

        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void labelNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelNombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!Control.validar("^([a-zA-Z0-9\\s]{1,50})?$", labelNombre.getText(), null)) {
                txtVerificacion7.setText("Solo texto y números, máximo 50");
            } else if (Control.validar("^$", labelNombre.getText(), null)) {
                txtVerificacion7.setText("No se encontraron resultados");
            } else {
                buscarResultadosPorNomnbre();
                if (modeloEmpresas.isEmpty()) {
                    txtVerificacion7.setText("No se encontraron resultados");
                }
            }

        }
    }//GEN-LAST:event_labelNombreKeyPressed

    private void botonBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarNombreActionPerformed

        if (!Control.validar("^([a-zA-Z0-9\\s]{1,50})?$", labelNombre.getText(), null)) {
            txtVerificacion7.setText("Solo texto y números, máximo 50");
        } else if (Control.validar("^$", labelNombre.getText(), null)) {
            txtVerificacion7.setText("No se encontraron resultados");
        } else {
            buscarResultadosPorNomnbre();
            if (modeloEmpresas.isEmpty()) {
                txtVerificacion7.setText("No se encontraron resultados");
            }
        }

    }//GEN-LAST:event_botonBuscarNombreActionPerformed

    private void btnRegresarInterfazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarInterfazActionPerformed
        jPanel3.setVisible(false);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_btnRegresarInterfazActionPerformed

    private void jPanel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentShown
        botonBuscarNombre.setVisible(true);
        labelNombre.setText("");
        modeloEmpresas.clear();

    }//GEN-LAST:event_jPanel3ComponentShown

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed

        if (listaEmpresas.getSelectedIndices().length > 1) {
            JOptionPane.showMessageDialog(null, "Seleccione su empresa");
        }
        if (listaEmpresas.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione su empresa");
        } else {
            e = dao.buscarPorId(listaEmpresas.getSelectedValue().getIdEmpresa());
            new GuiProductores(e).setVisible(true);
            this.setVisible(false);
//            this.dispose();
        }


    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated


    }//GEN-LAST:event_formWindowActivated

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown

        txtVerificacion7.setText("");


    }//GEN-LAST:event_jPanel1ComponentShown
    private void buscarResultadosPorNomnbre() {

        List<EmpresaProductora> empr = dao.buscarPorNombre(labelNombre.getText());
        modeloEmpresas = new ModeloLista<>();
        for (int i = 0; i < empr.size();) {

            if (modeloEmpresas.contains(empr.get(i))) {
                i++;
            } else {
                modeloEmpresas.agregar(empr.get(i));
            }

        }
        if (!modeloEmpresas.isEmpty()) {
//            botonBuscarNombre.setVisible(false);
            btnSeleccionar.setVisible(true);

        }
        listaEmpresas.setModel(modeloEmpresas);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarNombre;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresarInterfaz;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField labelNombre;
    private javax.swing.JList<EmpresaProductora> listaEmpresas;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtVerificacion4;
    private javax.swing.JLabel txtVerificacion6;
    private javax.swing.JLabel txtVerificacion7;
    // End of variables declaration//GEN-END:variables
}
