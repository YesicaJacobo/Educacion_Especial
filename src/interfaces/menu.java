/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import interfaces.datos;
import op.opiniones;
import ejercicios.*;
import javax.swing.JOptionPane;

/**
 * @author Yesica
 */

public class menu extends javax.swing.JFrame {

   
    public menu() {
        initComponents();
        
        datos d = new datos();
        d.setVisible(false);
        EDAD.setText("Edad:"+d.em);
        
        g1.setEnabled(false);
        g2.setEnabled(false);
        g3.setEnabled(false);
        g4.setEnabled(false);
        g5.setEnabled(false);
        g6.setEnabled(false);
        int e;
        e = Integer.parseInt(d.em);
        switch  (e) {
                case 6:
                    g1.setEnabled(true);
                    break;
                case 7:
                    g1.setEnabled(true);
                    g2.setEnabled(true);
                    break;
                case 8:
                    g1.setEnabled(true);
                    g2.setEnabled(true);
                    g3.setEnabled(true);
                    break;
                case 9:
                    g1.setEnabled(true);
                    g2.setEnabled(true);
                    g3.setEnabled(true);
                    g4.setEnabled(true);
                    break;
                case 10:
                    g1.setEnabled(true);
                    g2.setEnabled(true);
                    g3.setEnabled(true);
                    g4.setEnabled(true);
                    g5.setEnabled(true);
                    break;
                default:
                    g1.setEnabled(true);
                    g2.setEnabled(true);
                    g3.setEnabled(true);
                    g4.setEnabled(true);
                    g5.setEnabled(true);
                    g6.setEnabled(true);
                    break;
                    
            }
        primero gg1 = new primero();
        gg1.setVisible(false);
        if (gg1.terminado1 == true) {
            saludo1.setText("Buen trabajo "+d.no);
            saludo.setText("Sigamos con 2°");
        }
        segundo gg2 = new segundo();
        gg2.setVisible(false);
        if (gg2.terminado2 == true) {
            saludo1.setText("Sigue asi!! "+d.no);
            saludo.setText("Sigamos con 3°");
            g3.setEnabled(true);
        }
        tercero gg3 = new tercero();
        gg3.setVisible(false);
        if (gg3.terminado3 == true) {
            saludo1.setText("Muy bien!! "+d.no);
            saludo.setText("Sigamos con 4°");
        }
        cuarto gg4 = new cuarto();
        gg4.setVisible(false);
        if (gg4.terminado4 == true) {
            saludo1.setText("Excelente "+d.no);
            saludo.setText("Sigamos con 5°");
        }
        quinto gg5 = new quinto();
        gg5.setVisible(false);
        if (gg5.terminado5 == true) {
            saludo1.setText("Wow lo haces muy bien"+d.no);
            saludo.setText("Sigamos con 6°");
        }
        sexto gg6 = new sexto();
        gg6.setVisible(false);
        if (gg6.terminado6 == true) {
            JOptionPane.showMessageDialog(null,"Felicidades terminaste todos los niveles, puedes seguir repasando si asi lo quieres");
            saludo1.setText("Felicidades terminaste"+d.no);
            saludo.setText("Todos los niveles");
            JOptionPane.showMessageDialog(null,"No te olvides de darnos tu opinion :)");
        }
  
    }
    
  
        


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        saludo = new javax.swing.JLabel();
        g3 = new javax.swing.JButton();
        g1 = new javax.swing.JButton();
        g2 = new javax.swing.JButton();
        g6 = new javax.swing.JButton();
        g5 = new javax.swing.JButton();
        g4 = new javax.swing.JButton();
        saludo1 = new javax.swing.JLabel();
        oys = new javax.swing.JButton();
        EDAD1 = new javax.swing.JLabel();
        EDAD2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EDAD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(255, 153, 153));
        salir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(153, 0, 0));
        salir.setText("Salir");
        salir.setBorder(null);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel2.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 100, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Toca el grado adecuado para ti");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 370, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e2.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 150, 130));

        saludo.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        saludo.setForeground(new java.awt.Color(204, 102, 0));
        saludo.setText("estamos listos :)");
        jPanel2.add(saludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 150, -1));

        g3.setBackground(new java.awt.Color(255, 255, 255));
        g3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png"))); // NOI18N
        g3.setBorder(null);
        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });
        jPanel2.add(g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, 90));

        g1.setBackground(new java.awt.Color(255, 255, 255));
        g1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N
        g1.setBorder(null);
        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });
        jPanel2.add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        g2.setBackground(new java.awt.Color(255, 255, 255));
        g2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N
        g2.setBorder(null);
        g2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g2ActionPerformed(evt);
            }
        });
        jPanel2.add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        g6.setBackground(new java.awt.Color(255, 255, 255));
        g6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6.png"))); // NOI18N
        g6.setBorder(null);
        g6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g6ActionPerformed(evt);
            }
        });
        jPanel2.add(g6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        g5.setBackground(new java.awt.Color(255, 255, 255));
        g5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png"))); // NOI18N
        g5.setBorder(null);
        g5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g5ActionPerformed(evt);
            }
        });
        jPanel2.add(g5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        g4.setBackground(new java.awt.Color(255, 255, 255));
        g4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png"))); // NOI18N
        g4.setBorder(null);
        g4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g4ActionPerformed(evt);
            }
        });
        jPanel2.add(g4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        saludo1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        saludo1.setForeground(new java.awt.Color(204, 102, 0));
        saludo1.setText("        Ahora si");
        saludo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(saludo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 230, -1));

        oys.setBackground(new java.awt.Color(255, 153, 153));
        oys.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        oys.setForeground(new java.awt.Color(153, 0, 0));
        oys.setText("Opiniones");
        oys.setBorder(null);
        oys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oysActionPerformed(evt);
            }
        });
        jPanel2.add(oys, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 100, 30));

        EDAD1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        EDAD1.setForeground(new java.awt.Color(0, 0, 102));
        EDAD1.setText("y sugerencias");
        jPanel2.add(EDAD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 80, 20));

        EDAD2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        EDAD2.setForeground(new java.awt.Color(0, 0, 102));
        EDAD2.setText("Danos tus opiniones");
        jPanel2.add(EDAD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 110, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 460, 520));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fm.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 580));

        EDAD.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        EDAD.setForeground(new java.awt.Color(0, 0, 102));
        EDAD.setText("Edad: ");
        jPanel1.add(EDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        inicio i  = new inicio();
        i.setVisible(true);
        i.show();
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void oysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oysActionPerformed
        opiniones o = new opiniones();
        o.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_oysActionPerformed

    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        primero g1 = new primero();
        g1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_g1ActionPerformed

    private void g2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g2ActionPerformed
        segundo g2 = new segundo();
        g2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_g2ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        tercero g3 = new tercero();
        g3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_g3ActionPerformed

    private void g4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g4ActionPerformed
        cuarto g4 = new cuarto();
        g4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_g4ActionPerformed

    private void g5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g5ActionPerformed
        quinto g5 = new quinto();
        g5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_g5ActionPerformed

    private void g6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g6ActionPerformed
        sexto g6 = new sexto();
        g6.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_g6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel EDAD;
    public static javax.swing.JLabel EDAD1;
    public static javax.swing.JLabel EDAD2;
    private javax.swing.JButton g1;
    private javax.swing.JButton g2;
    private javax.swing.JButton g3;
    private javax.swing.JButton g4;
    private javax.swing.JButton g5;
    private javax.swing.JButton g6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton oys;
    private javax.swing.JButton salir;
    public javax.swing.JLabel saludo;
    public javax.swing.JLabel saludo1;
    // End of variables declaration//GEN-END:variables
}
