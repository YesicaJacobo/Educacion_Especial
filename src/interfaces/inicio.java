package interfaces;

import javax.swing.*;
import interfaces.datos;
import op.Administrador;
/**
 * @author Yesica
**/

public class inicio extends javax.swing.JFrame {
String userAdmin = "Admin";
String passAdmin = "123";

    
    public inicio() {
        initComponents();
        
        e.setVisible(false);
        e2.setVisible(false);
        e3.setVisible(false);
        bEntrar.setVisible(false);
        bEntrarAdm.setVisible(false);
        a1.setVisible(false);
        a2.setVisible(false);
        r1.setVisible(false);
        r2.setVisible(false);
        regresar.setVisible(false);
        
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        e = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        bEntrar = new javax.swing.JButton();
        pregunta = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        user = new javax.swing.JButton();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        r1 = new javax.swing.JTextField();
        r2 = new javax.swing.JTextField();
        bEntrarAdm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(195, 251, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e2.png"))); // NOI18N
        jPanel1.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 220, 150, 130));

        e2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e2.setForeground(new java.awt.Color(204, 102, 0));
        e2.setText("para empezar?");
        jPanel1.add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        e3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e3.setForeground(new java.awt.Color(204, 102, 0));
        e3.setText("¿Estas listo ");
        jPanel1.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        bEntrar.setBackground(new java.awt.Color(255, 255, 0));
        bEntrar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bEntrar.setForeground(new java.awt.Color(204, 102, 0));
        bEntrar.setText("Iniciar ");
        bEntrar.setToolTipText("");
        bEntrar.setBorder(null);
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(bEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 120, 40));

        pregunta.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        pregunta.setForeground(new java.awt.Color(204, 102, 0));
        pregunta.setText("¿Eres administrador o usuario?");
        jPanel1.add(pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        admin.setBackground(new java.awt.Color(255, 255, 0));
        admin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        admin.setForeground(new java.awt.Color(204, 102, 0));
        admin.setText("Administrador");
        admin.setToolTipText("");
        admin.setBorder(null);
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 140, 40));

        user.setBackground(new java.awt.Color(255, 255, 0));
        user.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        user.setForeground(new java.awt.Color(204, 102, 0));
        user.setText("Usuario");
        user.setToolTipText("");
        user.setBorder(null);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 120, 40));

        a1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        a1.setForeground(new java.awt.Color(204, 102, 0));
        a1.setText("Contraseña:");
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        a2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        a2.setForeground(new java.awt.Color(204, 102, 0));
        a2.setText("Usuario:");
        jPanel1.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        r1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, -1));

        r2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, -1));

        bEntrarAdm.setBackground(new java.awt.Color(255, 255, 0));
        bEntrarAdm.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bEntrarAdm.setForeground(new java.awt.Color(204, 102, 0));
        bEntrarAdm.setText("Iniciar ");
        bEntrarAdm.setToolTipText("");
        bEntrarAdm.setBorder(null);
        bEntrarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarAdmActionPerformed(evt);
            }
        });
        jPanel1.add(bEntrarAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 120, 40));

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 490, 180));

        regresar.setBackground(new java.awt.Color(204, 255, 204));
        regresar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        regresar.setForeground(new java.awt.Color(51, 153, 0));
        regresar.setText("Regresar");
        regresar.setToolTipText("");
        regresar.setBorder(null);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 120, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 460, 330));

        jLabel4.setBackground(new java.awt.Color(0, 255, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fp.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 540, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        pregunta.setVisible(false);
        admin.setVisible(false);
        user.setVisible(false);
        
        a1.setVisible(true);
        a2.setVisible(true);
        r1.setVisible(true);
        r2.setVisible(true);
        bEntrarAdm.setVisible(true);
        regresar.setVisible(true);
       
    }//GEN-LAST:event_adminActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        e.setVisible(true);
        e2.setVisible(true);
        e3.setVisible(true);
        bEntrar.setVisible(true);
        
        pregunta.setVisible(false);
        admin.setVisible(false);
        user.setVisible(false);
        regresar.setVisible(true);
    }//GEN-LAST:event_userActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed

        JOptionPane.showMessageDialog(null,"Bienvenido a educación especial :)");
        datos d = new datos();
        d.show();
        this.setVisible(false);
    }//GEN-LAST:event_bEntrarActionPerformed

    private void bEntrarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarAdmActionPerformed
        
        
        if((r2.getText().equals(userAdmin)) || (r1.getText().equals(passAdmin))){
            JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
            Administrador a = new Administrador();
            a.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Datos Incorrectos");
        }
    }//GEN-LAST:event_bEntrarAdmActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        pregunta.setVisible(true);
        admin.setVisible(true);
        user.setVisible(true);
        
        e.setVisible(false);
        e2.setVisible(false);
        e3.setVisible(false);
        bEntrar.setVisible(false);
        bEntrarAdm.setVisible(false);
        a1.setVisible(false);
        a2.setVisible(false);
        r1.setVisible(false);
        r2.setVisible(false);
        regresar.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JButton admin;
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bEntrarAdm;
    private javax.swing.JLabel e;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pregunta;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r2;
    private javax.swing.JButton regresar;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
}
