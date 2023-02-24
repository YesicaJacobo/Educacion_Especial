package op;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import interfaces.menu;
import javax.swing.JOptionPane;

/**
 *
 * @author Yesica
 */
public class opiniones extends javax.swing.JFrame {
    
    
    private final String ruta = System.getProperties().getProperty("user.dir");
    
    public opiniones() {
        initComponents();
        
    }
	
	public void aniadirArchivo(String nombre, String opi) {
		FileWriter flwriter = null;
		try { 
                        flwriter = new FileWriter(ruta+"\\dopiniones.txt", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
                        
				bfwriter.write(nombre + " | " + opi + "\n");
			
			bfwriter.close();
                        JOptionPane.showMessageDialog(null, "Listo, Gracias");
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        benviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dnombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        op = new javax.swing.JTextPane();
        nom1 = new javax.swing.JLabel();
        nom2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jPanel2.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 100, 30));

        benviar.setBackground(new java.awt.Color(255, 153, 51));
        benviar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        benviar.setForeground(new java.awt.Color(204, 102, 0));
        benviar.setText("Enviar");
        benviar.setBorder(null);
        benviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benviarActionPerformed(evt);
            }
        });
        jPanel2.add(benviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 90, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Tu opinion nos importa");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 360, 40));

        nom.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        nom.setForeground(new java.awt.Color(0, 0, 102));
        nom.setText("o errores que hayas visto ");
        jPanel2.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 220, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 160, 140));

        dnombre.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        dnombre.setForeground(new java.awt.Color(204, 102, 0));
        dnombre.setText("¿Te gusta aprender conmigo?");
        jPanel2.add(dnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        op.setBorder(null);
        op.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        op.setForeground(new java.awt.Color(0, 0, 102));
        jScrollPane1.setViewportView(op);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 290, 110));

        nom1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        nom1.setForeground(new java.awt.Color(0, 0, 102));
        nom1.setText("Cuentanos sobre tu experiencia ");
        jPanel2.add(nom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 270, -1));

        nom2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        nom2.setForeground(new java.awt.Color(0, 0, 102));
        nom2.setText("Nombre: ");
        jPanel2.add(nom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 90, -1));

        nombre.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 102));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 180, 30));

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
        
        menu m  = new menu();
        m.setVisible(true);
        m.show();
        this.setVisible(false);

    }//GEN-LAST:event_salirActionPerformed

    private void benviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benviarActionPerformed

        if(nombre.getText().equals("")||op.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Datos incompletos");
            
        }else{
            
        aniadirArchivo(nombre.getText(), op.getText());
        
        nombre.setText("");
        op.setText("");
        }
    }//GEN-LAST:event_benviarActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(opiniones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opiniones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opiniones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opiniones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new opiniones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton benviar;
    private javax.swing.JLabel dnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel nom1;
    private javax.swing.JLabel nom2;
    public static javax.swing.JTextField nombre;
    private javax.swing.JTextPane op;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
