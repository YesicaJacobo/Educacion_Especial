/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import interfaces.*;
/**
 *
 * @author Yesica
 */
public class sexto extends javax.swing.JFrame {
    /**
     * Creates new form sexto
     */
    public sexto() {
        initComponents();
        
        SextoJ.setEnabledAt(1, false);
        mostrar1.setVisible(false);
        siguiente3.setVisible(false);
    }
    public static boolean terminado6 = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        SextoJ = new javax.swing.JTabbedPane();
        his = new javax.swing.JScrollPane();
        historia = new javax.swing.JPanel();
        per1 = new javax.swing.JButton();
        per2 = new javax.swing.JButton();
        per3 = new javax.swing.JButton();
        per4 = new javax.swing.JButton();
        per5 = new javax.swing.JButton();
        e = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        siguiente1 = new javax.swing.JButton();
        e5 = new javax.swing.JLabel();
        e6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextPane();
        ej1 = new javax.swing.JScrollPane();
        Ej1 = new javax.swing.JPanel();
        e34 = new javax.swing.JLabel();
        r5 = new javax.swing.JTextField();
        r6 = new javax.swing.JTextField();
        r7 = new javax.swing.JTextField();
        r8 = new javax.swing.JTextField();
        mostrar1 = new javax.swing.JButton();
        revisar1 = new javax.swing.JButton();
        siguiente3 = new javax.swing.JButton();
        aviso1 = new javax.swing.JLabel();
        e46 = new javax.swing.JLabel();
        r9 = new javax.swing.JTextField();
        e49 = new javax.swing.JLabel();
        e51 = new javax.swing.JLabel();
        e52 = new javax.swing.JLabel();
        e53 = new javax.swing.JLabel();
        e54 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SextoJ.setBackground(new java.awt.Color(243, 243, 105));
        SextoJ.setForeground(new java.awt.Color(0, 51, 153));
        SextoJ.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        his.setBackground(new java.awt.Color(180, 255, 180));

        historia.setBackground(new java.awt.Color(204, 255, 204));
        historia.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        historia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        per1.setBackground(new java.awt.Color(184, 219, 255));
        per1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        per1.setForeground(new java.awt.Color(0, 0, 204));
        per1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personaje1.jpg"))); // NOI18N
        per1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        per1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per1ActionPerformed(evt);
            }
        });
        historia.add(per1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 170, 260));

        per2.setBackground(new java.awt.Color(184, 219, 255));
        per2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        per2.setForeground(new java.awt.Color(0, 0, 204));
        per2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personaje2.jpg"))); // NOI18N
        per2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        per2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per2ActionPerformed(evt);
            }
        });
        historia.add(per2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 190, 150));

        per3.setBackground(new java.awt.Color(184, 219, 255));
        per3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        per3.setForeground(new java.awt.Color(0, 0, 204));
        per3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personaje3.jpg"))); // NOI18N
        per3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        per3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per3ActionPerformed(evt);
            }
        });
        historia.add(per3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 230));

        per4.setBackground(new java.awt.Color(184, 219, 255));
        per4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        per4.setForeground(new java.awt.Color(0, 0, 204));
        per4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personaje4.jpg"))); // NOI18N
        per4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        per4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per4ActionPerformed(evt);
            }
        });
        historia.add(per4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 180, 260));

        per5.setBackground(new java.awt.Color(184, 219, 255));
        per5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        per5.setForeground(new java.awt.Color(0, 0, 204));
        per5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personaje5.jpg"))); // NOI18N
        per5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        per5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per5ActionPerformed(evt);
            }
        });
        historia.add(per5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, 190, 190));

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        historia.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 160, 130));

        e3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e3.setForeground(new java.awt.Color(204, 102, 0));
        e3.setText("¿Los conocias?");
        historia.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        siguiente1.setBackground(new java.awt.Color(255, 255, 0));
        siguiente1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        siguiente1.setForeground(new java.awt.Color(204, 102, 0));
        siguiente1.setText("Siguiente");
        siguiente1.setToolTipText("");
        siguiente1.setBorder(null);
        siguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente1ActionPerformed(evt);
            }
        });
        historia.add(siguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1090, 120, 40));

        e5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e5.setForeground(new java.awt.Color(0, 0, 255));
        e5.setText("al personaje.");
        historia.add(e5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        e6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e6.setForeground(new java.awt.Color(0, 0, 255));
        e6.setText("Da click sobre la imagen para conocer ");
        historia.add(e6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        info.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        info.setForeground(new java.awt.Color(0, 0, 204));
        jScrollPane2.setViewportView(info);

        historia.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 900, 400, 160));

        his.setViewportView(historia);

        SextoJ.addTab("Un poquito de historia mexicana", his);

        ej1.setBackground(new java.awt.Color(180, 255, 180));

        Ej1.setBackground(new java.awt.Color(255, 204, 204));
        Ej1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Ej1.setMinimumSize(new java.awt.Dimension(430, 1500));
        Ej1.setPreferredSize(new java.awt.Dimension(453, 1400));
        Ej1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        Ej1.add(e34, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 150, 130));

        r5.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r5.setForeground(new java.awt.Color(0, 0, 153));
        r5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 153), 3));
        Ej1.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 200, 30));

        r6.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r6.setForeground(new java.awt.Color(0, 0, 153));
        r6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 153), 3));
        Ej1.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 180, 30));

        r7.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r7.setForeground(new java.awt.Color(0, 0, 153));
        r7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 153), 3));
        Ej1.add(r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 200, 30));

        r8.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r8.setForeground(new java.awt.Color(0, 0, 153));
        r8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 153), 3));
        Ej1.add(r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 790, 190, 30));

        mostrar1.setBackground(new java.awt.Color(255, 255, 0));
        mostrar1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        mostrar1.setForeground(new java.awt.Color(204, 102, 0));
        mostrar1.setText("Mostrar respuestas");
        mostrar1.setToolTipText("");
        mostrar1.setBorder(null);
        mostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar1ActionPerformed(evt);
            }
        });
        Ej1.add(mostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1220, 190, 40));

        revisar1.setBackground(new java.awt.Color(255, 255, 0));
        revisar1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        revisar1.setForeground(new java.awt.Color(204, 102, 0));
        revisar1.setText("Revisar");
        revisar1.setToolTipText("");
        revisar1.setBorder(null);
        revisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revisar1ActionPerformed(evt);
            }
        });
        Ej1.add(revisar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1220, 120, 40));

        siguiente3.setBackground(new java.awt.Color(255, 255, 0));
        siguiente3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        siguiente3.setForeground(new java.awt.Color(204, 102, 0));
        siguiente3.setText("Siguiente");
        siguiente3.setToolTipText("");
        siguiente3.setBorder(null);
        siguiente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente3ActionPerformed(evt);
            }
        });
        Ej1.add(siguiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1290, 120, 40));

        aviso1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        aviso1.setForeground(new java.awt.Color(0, 0, 153));
        Ej1.add(aviso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1170, 320, 30));

        e46.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e46.setForeground(new java.awt.Color(204, 102, 0));
        e46.setText("¿Recuerdas sus nombres?");
        Ej1.add(e46, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        r9.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r9.setForeground(new java.awt.Color(0, 0, 153));
        r9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 153), 3));
        Ej1.add(r9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 1040, 200, 30));

        e49.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e49.setForeground(new java.awt.Color(255, 153, 0));
        e49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personaje1.jpg"))); // NOI18N
        Ej1.add(e49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 190, 210));

        e51.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e51.setForeground(new java.awt.Color(255, 153, 0));
        e51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personaje2.jpg"))); // NOI18N
        Ej1.add(e51, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 200, 160));

        e52.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e52.setForeground(new java.awt.Color(255, 153, 0));
        e52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personaje3.jpg"))); // NOI18N
        Ej1.add(e52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 200, 220));

        e53.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e53.setForeground(new java.awt.Color(255, 153, 0));
        e53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personaje4.jpg"))); // NOI18N
        Ej1.add(e53, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, 190, 260));

        e54.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e54.setForeground(new java.awt.Color(255, 153, 0));
        e54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personaje5.jpg"))); // NOI18N
        Ej1.add(e54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 930, 180, 210));

        ej1.setViewportView(Ej1);

        SextoJ.addTab("Ej.- 1", ej1);

        jPanel2.add(SextoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 460));

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
        jPanel2.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 460, 510));

        jLabel36.setBackground(new java.awt.Color(204, 255, 255));
        jLabel36.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 153));
        jLabel36.setText("Sexto Grado");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fe.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 580));

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

    private void per1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per1ActionPerformed
        info.setText(" ~ Porfirio Díaz ~ \n" +
            "Don Porfirio nació en 1830, en la ciudad de Oaxaca. Durante su juventud, decidió apostar por la carrera de las armas distinguiéndose notablemente en la lucha contra la intervención francesa. Fue presidente en 1876, y de 1877 a 1880, así como de 1884 a 1911. Fue derrocado por la Revolución iniciada por Madero que buscaba la “no reelección” en 1910; murió en la ciudad de París en 1915. \n" );
    }//GEN-LAST:event_per1ActionPerformed

    private void per2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per2ActionPerformed
        info.setText(" ~ Francisco I. Madero ~ \n" +
            "Nació en la ciudad de Parras, Coahuila en 1873. Después de haber realizado estudios de agricultura en Estados Unidos y de administración en Francia, Madero creó su propio partido, el Nacional Antireeleccionista (en 1909), cuyo movimiento cobró tal fuerza que el mismo presidente Díaz se vio a obligado encarcelarlo. Desde su prisión, Madero suscribió el Plan de San Luis cuya máxima era la no reelección de don Porfirio encabezando un movimiento que terminaría derrocando al general Díaz entre 1910 y 1911. Fue presidente de la nación hasta 1913 cuando un golpe militar, liderado por el general Victoriano Huerta, quien lo traicionó, lo derrocó y terminó con su vida en las cercanías del actual Archivo General de la Nación, junto con el vicepresidente Pino Suárez. \n");
    }//GEN-LAST:event_per2ActionPerformed

    private void per3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per3ActionPerformed
        info.setText(" ~ Emiliano Zapata ~ \n" +
            "Nació en Anenecuilco, Morelos, en 1883. De origen humilde, Zapata es sin duda el símbolo máximo de la Revolución Mexicana. Sus ideales de “Tierra y libertad” lo llevaron a proclamar, en 1911, el Plan de Ayala, documento que exigía a los dueños de las haciendas la devolución de las tierras a la clase trabajadora: la campesina. De acuerdo con la tradición, fue traicionado por el coronel Jesús Guajardo y asesinado a la entrada de la Hacienda de Chinameca, en las cercanías de Cuautla, Morelos, en 1919. \n" );
    }//GEN-LAST:event_per3ActionPerformed

    private void per4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per4ActionPerformed
        info.setText(" ~ Francisco Villa ~ \n" +
            "Doroteo Arango (su nombre real), nació en la población de San Juan del Río, Durango, en 1878. Es uno de los mexicanos más famosos en el mundo y eso quizá se deba a que, después de secundar la Revolución de Madero y colaborar con Venustiano Carranza para vencer al general Huerta, siempre se mantuvo en franca rebeldía contra todo sistema impuesto (incluso contra el mismo Carranza con quien combatió años después). Su fama de gran militar lo llevó a vencer a los enemigos de las fuerzas oficiales en Zacatecas e incluso a hacer una pequeña incursión militar en Columbus, Estados Unidos. Murió asesinado cerca del poblado de Hidalgo del Parral, Chihuahua, en 1923. \n");
    }//GEN-LAST:event_per4ActionPerformed

    private void per5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per5ActionPerformed
        info.setText(" ~ Venustiano Carranza ~ \n" +
            "Nació en Cuatro Ciénegas, Coahuila, en 1859. Después de derrotar a Huerta, fue presidente de 1917 a 1920. A él debemos la convocatoria al Congreso que el 5 de febrero de 1917 promulgó la Constitución que actualmente rige a nuestro país. Murió asesinado en Tlaxcalantongo, Puebla, en 1920. \n" );
    }//GEN-LAST:event_per5ActionPerformed

    private void siguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente1ActionPerformed
        SextoJ.setEnabledAt(1, true);
    }//GEN-LAST:event_siguiente1ActionPerformed

    private void mostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar1ActionPerformed
        r5.setText("Porfirio Díaz");
        r6.setText("Francisco I. Madero");
        r7.setText("Emiliano Zapata");
        r8.setText("Francisco Villa");
        r9.setText("Venustiano Carranza");

        siguiente3.setVisible(true);
    }//GEN-LAST:event_mostrar1ActionPerformed

    private void revisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revisar1ActionPerformed
        if(r5.getText().equals("")||r6.getText().equals("")||r7.getText().equals("")||r8.getText().equals("")||r9.getText().equals("")){
            aviso1.setText("Te faltan respuestas :(");
        }else{

            if(( r5.getText().equals("Porfirio Díaz"))&&
                (r6.getText().equals("Francisco I. Madero"))&&
                (r7.getText().equals("Emiliano Zapata"))&&
                (r8.getText().equals("Francisco Villa"))&&
                (r9.getText().equals("Venustiano Carranza"))){
                aviso1.setText("Muy bien, eres muy inteligente :D");
                siguiente3.setVisible(true);
            }else{
                aviso1.setText("Uy revisa tus respuestas de nuevo :)");
                mostrar1.setVisible(true);
            }
        }
    }//GEN-LAST:event_revisar1ActionPerformed

    private void siguiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente3ActionPerformed
        terminado6 = true;
        datos d = new datos();
        d.setVisible(false);
        
        if(Integer.parseInt(d.em)<=11){
            d.em=("11");
        }
        menu m = new menu();
        m.setVisible(true);
        this.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(sexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sexto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ej1;
    private javax.swing.JTabbedPane SextoJ;
    private javax.swing.JLabel aviso1;
    private javax.swing.JLabel e;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e34;
    private javax.swing.JLabel e46;
    private javax.swing.JLabel e49;
    private javax.swing.JLabel e5;
    private javax.swing.JLabel e51;
    private javax.swing.JLabel e52;
    private javax.swing.JLabel e53;
    private javax.swing.JLabel e54;
    private javax.swing.JLabel e6;
    private javax.swing.JScrollPane ej1;
    private javax.swing.JScrollPane his;
    private javax.swing.JPanel historia;
    private javax.swing.JTextPane info;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mostrar1;
    private javax.swing.JButton per1;
    private javax.swing.JButton per2;
    private javax.swing.JButton per3;
    private javax.swing.JButton per4;
    private javax.swing.JButton per5;
    private javax.swing.JTextField r5;
    private javax.swing.JTextField r6;
    private javax.swing.JTextField r7;
    private javax.swing.JTextField r8;
    private javax.swing.JTextField r9;
    private javax.swing.JButton revisar1;
    private javax.swing.JButton salir;
    private javax.swing.JButton siguiente1;
    private javax.swing.JButton siguiente3;
    // End of variables declaration//GEN-END:variables
}
