/**
 * FormRegistros.java
 *
 * Clase creada el 3 de diciembre de 2023
 *
 */
package gui;

import util.Control;
import java.awt.Color;
import javax.swing.JFrame;
import objetosNegocio.EmpresaProductora;

/**
 * Esta clase es un frame base para hacer los registros CRUD de las entidades
 *
 * @author Fabricio Aldaco Aguilera 0000235101
 *
 */
public class GuiProductores extends javax.swing.JFrame {

    Control control;
    EmpresaProductora e;

    /**
     * Creates new form FormRegistros
     *
     * @param e
     */
    public GuiProductores(EmpresaProductora e) {

        control = Control.getInstance();
        setUndecorated(true);
        this.e = e;
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setExtendedState(GuiProductores.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTranslado = new javax.swing.JLabel();
        txtBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnTranslado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTransportadora1 = new javax.swing.JLabel();
        btnTransportadora1 = new javax.swing.JButton();
        txtProductora = new javax.swing.JLabel();
        btnTransportadora2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtBienvenida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setSize(this.getSize());
        jPanel1.setPreferredSize(this.getSize());
        jPanel1.setLayout(null);

        txtTranslado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t1t.png"))); // NOI18N
        txtTranslado.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtTranslado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTranslado.setPreferredSize(new java.awt.Dimension(289, 205));
        txtTranslado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTransladoMouseClicked(evt);
            }
        });
        jPanel1.add(txtTranslado);
        txtTranslado.setBounds(68, 182, 289, 209);

        txtBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/holaa.png"))); // NOI18N
        txtBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBackMouseClicked(evt);
            }
        });
        jPanel1.add(txtBack);
        txtBack.setBounds(1265, 28, 40, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closeRegg-5.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1323, 20, 40, 40);

        btnTranslado.setBackground(new java.awt.Color(244, 244, 244));
        btnTranslado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnTranslado.setText("Registrar Translado Completo");
        btnTranslado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTranslado.setMargin(new java.awt.Insets(10, 10, 10, 10));
        btnTranslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransladoActionPerformed(evt);
            }
        });
        jPanel1.add(btnTranslado);
        btnTranslado.setBounds(85, 419, 244, 39);

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(690, 338, 0, 0);

        txtTransportadora1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a.png"))); // NOI18N
        txtTransportadora1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtTransportadora1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTransportadora1.setPreferredSize(new java.awt.Dimension(289, 205));
        txtTransportadora1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTransportadora1MouseClicked(evt);
            }
        });
        jPanel1.add(txtTransportadora1);
        txtTransportadora1.setBounds(541, 182, 289, 209);

        btnTransportadora1.setBackground(new java.awt.Color(244, 244, 244));
        btnTransportadora1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnTransportadora1.setText("Residuos");
        btnTransportadora1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransportadora1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        btnTransportadora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransportadora1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransportadora1);
        btnTransportadora1.setBounds(588, 419, 178, 39);

        txtProductora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1.png"))); // NOI18N
        txtProductora.setAlignmentX(1.0F);
        txtProductora.setAlignmentY(1.0F);
        txtProductora.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtProductora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtProductora.setPreferredSize(new java.awt.Dimension(289, 205));
        txtProductora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProductoraMouseClicked(evt);
            }
        });
        //labelfert.setBorder(BorderFactory.createCompoundBorder(
            //new MatteBorder(2, 2, 2, 2, Color.RED),
            //BorderFactory.createEmptyBorder(10, 10, 0, 0)));
    jPanel1.add(txtProductora);
    txtProductora.setBounds(1016, 182, 289, 205);

    btnTransportadora2.setBackground(new java.awt.Color(244, 244, 244));
    btnTransportadora2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    btnTransportadora2.setText("Registrar Nueva Empresa");
    btnTransportadora2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnTransportadora2.setMargin(new java.awt.Insets(10, 10, 10, 10));
    btnTransportadora2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTransportadora2ActionPerformed(evt);
        }
    });
    jPanel1.add(btnTransportadora2);
    btnTransportadora2.setBounds(1060, 420, 230, 39);

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    jLabel3.setText("Volver");
    jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel3MouseClicked(evt);
        }
    });
    jPanel1.add(jLabel3);
    jLabel3.setBounds(15, 645, 68, 32);

    txtBienvenida.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
    jPanel1.add(txtBienvenida);
    txtBienvenida.setBounds(190, 20, 990, 100);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1296, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
 private JFrame getFrame() {
        return this;
    }
    private void txtTransladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTransladoMouseClicked

        control.registrarTranslado(getFrame());

    }//GEN-LAST:event_txtTransladoMouseClicked

    private void txtBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtBackMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnTransladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransladoActionPerformed
        control.registrarTranslado(getFrame());

    }//GEN-LAST:event_btnTransladoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtBienvenida.setText("Bienvenido " + e.getNomEmpresa());

    }//GEN-LAST:event_formWindowOpened

    private void txtTransportadora1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTransportadora1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransportadora1MouseClicked

    private void btnTransportadora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransportadora1ActionPerformed

        control.registrarResiduo(getFrame());


    }//GEN-LAST:event_btnTransportadora1ActionPerformed

    private void txtProductoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductoraMouseClicked

    }//GEN-LAST:event_txtProductoraMouseClicked

    private void btnTransportadora2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransportadora2ActionPerformed
//        control.registrarEmpresaProductora(getFrame());
        new DlgEmpresaFabricante(getFrame(), true).setVisible(true);


    }//GEN-LAST:event_btnTransportadora2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        new MainGui().setVisible(true);

    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTranslado;
    private javax.swing.JButton btnTransportadora1;
    private javax.swing.JButton btnTransportadora2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtBack;
    private javax.swing.JLabel txtBienvenida;
    private javax.swing.JLabel txtProductora;
    private javax.swing.JLabel txtTranslado;
    private javax.swing.JLabel txtTransportadora1;
    // End of variables declaration//GEN-END:variables
}
