/**
 * FormRegistros.java
 *
 * Clase creada el 3 de diciembre de 2023
 *
 */
package gui;

import util.Control;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 * Esta clase es un frame base para hacer los registros CRUD de las entidades
 *
 * @author Fabricio Aldaco Aguilera 0000235101
 *
 */
public class GuiTransportistas extends javax.swing.JFrame {

    Control control;

    /**
     * Creates new form FormRegistros
     */
    public GuiTransportistas() {

        control = Control.getInstance();
        setUndecorated(true);
        initComponents();

        // Iconos ic = Iconos.getInstance();
        //Image imagen = new ImageIcon(getClass().getResource("/principal1.png")).getImage();
        //  ic.iconos(imagen, this);
        getContentPane().setBackground(Color.WHITE);
//        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        GraphicsDevice gd = ge.getDefaultScreenDevice();
//        gd.setFullScreenWindow(this);
        setExtendedState(GuiTransportistas.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProductora1 = new javax.swing.JLabel();
        asdasdasdasd = new javax.swing.JButton();
        txtTransportadora = new javax.swing.JLabel();
        asdasdasdasd1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setSize(this.getSize());
        jPanel1.setPreferredSize(this.getSize());

        txtBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/holaa.png"))); // NOI18N
        txtBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBackMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closeRegg-5.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtProductora1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssd.png"))); // NOI18N
        txtProductora1.setAlignmentX(1.0F);
        txtProductora1.setAlignmentY(1.0F);
        txtProductora1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtProductora1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtProductora1.setPreferredSize(new java.awt.Dimension(289, 205));
        txtProductora1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProductora1MouseClicked(evt);
            }
        });
        //labelfert.setBorder(BorderFactory.createCompoundBorder(
            //new MatteBorder(2, 2, 2, 2, Color.RED),
            //BorderFactory.createEmptyBorder(10, 10, 0, 0)));

    asdasdasdasd.setBackground(new java.awt.Color(244, 244, 244));
    asdasdasdasd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    asdasdasdasd.setText("Registrar vehiculos");
    asdasdasdasd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    asdasdasdasd.setMargin(new java.awt.Insets(10, 10, 10, 10));
    asdasdasdasd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            asdasdasdasdActionPerformed(evt);
        }
    });

    txtTransportadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t1.png"))); // NOI18N
    txtTransportadora.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    txtTransportadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    txtTransportadora.setPreferredSize(new java.awt.Dimension(289, 205));
    txtTransportadora.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtTransportadoraMouseClicked(evt);
        }
    });

    asdasdasdasd1.setBackground(new java.awt.Color(244, 244, 244));
    asdasdasdasd1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    asdasdasdasd1.setText("Registrar Nueva Empresa");
    asdasdasdasd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    asdasdasdasd1.setMargin(new java.awt.Insets(10, 10, 10, 10));
    asdasdasdasd1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            asdasdasdasd1ActionPerformed(evt);
        }
    });

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    jLabel3.setText("Volver");
    jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel3MouseClicked(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtBack)
            .addGap(18, 18, 18)
            .addComponent(jLabel1)
            .addGap(14, 14, 14))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(204, 204, 204)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(asdasdasdasd, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(asdasdasdasd1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(371, 371, 371))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(txtProductora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(276, 276, 276)
                    .addComponent(txtTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(322, Short.MAX_VALUE))))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addComponent(jLabel3)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE)))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(txtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
            .addGap(107, 107, 107)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(txtProductora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(asdasdasdasd)
                .addComponent(asdasdasdasd1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
            .addComponent(jLabel3)
            .addGap(37, 37, 37))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
 private JFrame getFrame() {
        return this;
    }
    private void txtBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackMouseClicked
        this.dispose();

    }//GEN-LAST:event_txtBackMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void txtProductora1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductora1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductora1MouseClicked

    private void asdasdasdasdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asdasdasdasdActionPerformed
        control.registrarVehiculos(getFrame());


    }//GEN-LAST:event_asdasdasdasdActionPerformed

    private void txtTransportadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTransportadoraMouseClicked

    }//GEN-LAST:event_txtTransportadoraMouseClicked

    private void asdasdasdasd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asdasdasdasd1ActionPerformed
        control.registrarEmpresaTransportadora(getFrame());


    }//GEN-LAST:event_asdasdasdasd1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        this.dispose();
        new MainGui().setVisible(true);


    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asdasdasdasd;
    private javax.swing.JButton asdasdasdasd1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtBack;
    private javax.swing.JLabel txtProductora1;
    private javax.swing.JLabel txtTransportadora;
    // End of variables declaration//GEN-END:variables
}
