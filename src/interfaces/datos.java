/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import interfaces.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Yesica
 */
public class datos extends javax.swing.JFrame {
    
    public datos() {
        initComponents();
        listo.setVisible(false);
        
        
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true); 

    }
    public static String no,em,ef;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        sig = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        nom1 = new javax.swing.JLabel();
        edadf = new javax.swing.JTextField();
        nom2 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        saludo = new javax.swing.JLabel();
        dnombre = new javax.swing.JLabel();
        listo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inf = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(255, 153, 153));
        salir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(153, 0, 0));
        salir.setText("Atras");
        salir.setBorder(null);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel2.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 373, 100, 30));

        sig.setBackground(new java.awt.Color(255, 153, 51));
        sig.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sig.setForeground(new java.awt.Color(204, 102, 0));
        sig.setText("Siguiente");
        sig.setBorder(null);
        sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigActionPerformed(evt);
            }
        });
        jPanel2.add(sig, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 90, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Solo unas cuantas cositas :D");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 350, 40));

        nom.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        nom.setForeground(new java.awt.Color(0, 0, 102));
        nom.setText("Nombre: ");
        jPanel2.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 90, -1));

        nombre.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 102));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 180, 30));

        nom1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        nom1.setForeground(new java.awt.Color(0, 0, 102));
        nom1.setText("Edad fisica:");
        jPanel2.add(nom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 100, -1));

        edadf.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        edadf.setForeground(new java.awt.Color(0, 0, 102));
        jPanel2.add(edadf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 180, 30));

        nom2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        nom2.setForeground(new java.awt.Color(0, 0, 102));
        nom2.setText("Edad mental:");
        jPanel2.add(nom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 110, -1));

        edad.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        edad.setForeground(new java.awt.Color(0, 0, 102));
        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });
        jPanel2.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 180, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 310, 160, 140));

        saludo.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        saludo.setForeground(new java.awt.Color(204, 102, 0));
        saludo.setText("Cuentanos un");
        jPanel2.add(saludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        dnombre.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        dnombre.setForeground(new java.awt.Color(204, 102, 0));
        dnombre.setText("poco sobre ti!!!");
        jPanel2.add(dnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        listo.setBackground(new java.awt.Color(255, 153, 51));
        listo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        listo.setForeground(new java.awt.Color(204, 102, 0));
        listo.setText("Listo");
        listo.setBorder(null);
        listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listoActionPerformed(evt);
            }
        });
        jPanel2.add(listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 373, 70, 30));

        inf.setEditable(false);
        inf.setBackground(new java.awt.Color(204, 255, 255));
        inf.setBorder(null);
        inf.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        inf.setForeground(new java.awt.Color(0, 0, 102));
        jScrollPane1.setViewportView(inf);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 170, 110));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 440, 430));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fd.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 550, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        inicio i  = new inicio();
        i.show();
        this.setVisible(false);
        
    }//GEN-LAST:event_salirActionPerformed

    private void sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigActionPerformed
        

        int e;
        
        no = nombre.getText();
        em = edad.getText();
        ef = edadf.getText();
        e = Integer.parseInt(em);
        
        if(nombre.getText().equals("")||edad.getText().equals("")||edadf.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Datos incompletos");
        }else{
        
        if ( e>= 6) {
            switch  (e) {
                case 6:
                    listo.setVisible(true);
                    sig.setVisible(false);
                    saludo.setText("Holaa!!!");
                    dnombre.setText(no);
                    inf.setText("El mejor contenido para ti es el del primer grado");
                    
                    break;
                case 7:
                    listo.setVisible(true);
                    sig.setVisible(false);
                    saludo.setText("Holaa!!!");
                    dnombre.setText(no);
                    inf.setText("El mejor contenido para ti es el del segundo grado");
                    
                    //m.moderar(2);
                    break;
                case 8:
                    listo.setVisible(true);
                    sig.setVisible(false);
                    saludo.setText("Holaa!!!");
                    dnombre.setText(no);
                    inf.setText("El mejor contenido para ti es el del tercer grado");
                    
                    //m.moderar(3);
                    break;
                case 9:
                    listo.setVisible(true);
                    sig.setVisible(false);
                    saludo.setText("Holaa!!!");
                    dnombre.setText(no);
                    inf.setText("El mejor contenido para ti es el del cuarto grado");
                    
                    //m.moderar(4);
                    break;
                case 10:
                    listo.setVisible(true);
                    sig.setVisible(false);
                    saludo.setText("Holaa!!!");
                    dnombre.setText(no);
                    inf.setText("El mejor contenido para ti es el del quinto grado");
                    
                    //m.moderar(5);
                    break;
                case 11:
                   listo.setVisible(true);
                    sig.setVisible(false);
                    saludo.setText("Holaa!!!");
                    dnombre.setText(no);
                    inf.setText("El mejor contenido para ti es el del sexto grado");
                    
                    //m.moderar(6);
                    break;
                default:
                    listo.setVisible(true);
                    sig.setVisible(false);
                    saludo.setText("Holaa!!!");
                    dnombre.setText(no);
                    inf.setText("El contenido es supeer facil para ti, seguro todo sera pan comido!!!");
                    
                    //m.moderar(6);
                    break;
                    
            }
            
        }else{
            listo.setVisible(false);
            sig.setVisible(false);
            saludo.setText("Holaa!!!");
            dnombre.setText(no);
            inf.setText("Eres muy pequeño aun para el contenido lo siento");
            
        }
        }
    }//GEN-LAST:event_sigActionPerformed

    private void listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listoActionPerformed
        no = nombre.getText();
        em = edad.getText();
        
        menu m  = new menu();
        m.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_listoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

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
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dnombre;
    public static javax.swing.JTextField edad;
    public static javax.swing.JTextField edadf;
    private javax.swing.JTextPane inf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listo;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel nom1;
    private javax.swing.JLabel nom2;
    public static javax.swing.JTextField nombre;
    private javax.swing.JButton salir;
    private javax.swing.JLabel saludo;
    private javax.swing.JButton sig;
    // End of variables declaration//GEN-END:variables
}
