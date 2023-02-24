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
public class cuarto extends javax.swing.JFrame {

    /**
     * Creates new form cuarto
     */
    public cuarto() {
        initComponents();
        
        CuartoJ.setEnabledAt(1, false);
        CuartoJ.setEnabledAt(2, false);
        mostrar.setVisible(false);
        mostrar1.setVisible(false);
        siguiente2.setVisible(false);
        siguiente3.setVisible(false);
    }
    public static boolean terminado4 = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CuartoJ = new javax.swing.JTabbedPane();
        mult = new javax.swing.JScrollPane();
        multiplicar = new javax.swing.JPanel();
        e = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        siguiente1 = new javax.swing.JButton();
        e5 = new javax.swing.JLabel();
        ej1 = new javax.swing.JScrollPane();
        Ej1 = new javax.swing.JPanel();
        e31 = new javax.swing.JLabel();
        e33 = new javax.swing.JLabel();
        siguiente2 = new javax.swing.JButton();
        r1 = new javax.swing.JTextField();
        r2 = new javax.swing.JTextField();
        r3 = new javax.swing.JTextField();
        r4 = new javax.swing.JTextField();
        revisar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ej2 = new javax.swing.JScrollPane();
        Ej2 = new javax.swing.JPanel();
        e34 = new javax.swing.JLabel();
        e43 = new javax.swing.JLabel();
        e44 = new javax.swing.JLabel();
        e45 = new javax.swing.JLabel();
        r5 = new javax.swing.JTextField();
        e47 = new javax.swing.JLabel();
        r6 = new javax.swing.JTextField();
        e49 = new javax.swing.JLabel();
        r7 = new javax.swing.JTextField();
        r8 = new javax.swing.JTextField();
        e51 = new javax.swing.JLabel();
        mostrar1 = new javax.swing.JButton();
        revisar1 = new javax.swing.JButton();
        siguiente3 = new javax.swing.JButton();
        aviso1 = new javax.swing.JLabel();
        e52 = new javax.swing.JLabel();
        e46 = new javax.swing.JLabel();
        e48 = new javax.swing.JLabel();
        e50 = new javax.swing.JLabel();
        e53 = new javax.swing.JLabel();
        e54 = new javax.swing.JLabel();
        e55 = new javax.swing.JLabel();
        r9 = new javax.swing.JTextField();
        e56 = new javax.swing.JLabel();
        e57 = new javax.swing.JLabel();
        e58 = new javax.swing.JLabel();
        e59 = new javax.swing.JLabel();
        e60 = new javax.swing.JLabel();
        e61 = new javax.swing.JLabel();
        e62 = new javax.swing.JLabel();
        e63 = new javax.swing.JLabel();
        e64 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CuartoJ.setBackground(new java.awt.Color(243, 243, 105));
        CuartoJ.setForeground(new java.awt.Color(0, 51, 153));
        CuartoJ.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        mult.setBackground(new java.awt.Color(180, 255, 180));

        multiplicar.setBackground(new java.awt.Color(204, 255, 204));
        multiplicar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        multiplicar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        multiplicar.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 130));

        e3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e3.setForeground(new java.awt.Color(204, 102, 0));
        e3.setText("Vamos a repasar las tablas de multiplicar");
        multiplicar.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

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
        multiplicar.add(siguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 120, 40));

        e5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e5.setForeground(new java.awt.Color(0, 0, 255));
        e5.setText("¿Estas listo?");
        multiplicar.add(e5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        mult.setViewportView(multiplicar);

        CuartoJ.addTab("Las tablas de multiplicar", mult);

        ej1.setBackground(new java.awt.Color(180, 255, 180));

        Ej1.setBackground(new java.awt.Color(255, 204, 204));
        Ej1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Ej1.setPreferredSize(new java.awt.Dimension(475, 1120));
        Ej1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        Ej1.add(e31, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 150, 130));

        e33.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e33.setForeground(new java.awt.Color(204, 102, 0));
        e33.setText("Acompleta las tablas de multiplicar");
        Ej1.add(e33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        siguiente2.setBackground(new java.awt.Color(255, 255, 0));
        siguiente2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        siguiente2.setForeground(new java.awt.Color(204, 102, 0));
        siguiente2.setText("Siguiente");
        siguiente2.setToolTipText("");
        siguiente2.setBorder(null);
        siguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente2ActionPerformed(evt);
            }
        });
        Ej1.add(siguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 120, 40));

        r1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r1.setForeground(new java.awt.Color(0, 0, 153));
        r1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 2));
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        Ej1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 20, 30));

        r2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r2.setForeground(new java.awt.Color(0, 0, 153));
        r2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 2));
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        Ej1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 20, 30));

        r3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r3.setForeground(new java.awt.Color(0, 0, 153));
        r3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 2));
        Ej1.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 30, 30));

        r4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r4.setForeground(new java.awt.Color(0, 0, 153));
        r4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 2));
        Ej1.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 20, 30));

        revisar.setBackground(new java.awt.Color(255, 255, 0));
        revisar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        revisar.setForeground(new java.awt.Color(204, 102, 0));
        revisar.setText("Revisar");
        revisar.setToolTipText("");
        revisar.setBorder(null);
        revisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revisarActionPerformed(evt);
            }
        });
        Ej1.add(revisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 120, 40));

        mostrar.setBackground(new java.awt.Color(255, 255, 0));
        mostrar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        mostrar.setForeground(new java.awt.Color(204, 102, 0));
        mostrar.setText("Mostrar respuestas");
        mostrar.setToolTipText("");
        mostrar.setBorder(null);
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        Ej1.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 190, 40));

        aviso.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        aviso.setForeground(new java.awt.Color(0, 0, 153));
        Ej1.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 320, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/probtab2.png"))); // NOI18N
        Ej1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        ej1.setViewportView(Ej1);

        CuartoJ.addTab("Ej.- 1", ej1);

        ej2.setBackground(new java.awt.Color(180, 255, 180));

        Ej2.setBackground(new java.awt.Color(255, 204, 204));
        Ej2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Ej2.setPreferredSize(new java.awt.Dimension(453, 1130));
        Ej2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        Ej2.add(e34, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 150, 130));

        e43.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e43.setForeground(new java.awt.Color(204, 102, 0));
        e43.setText("MULTIPLICACIONES");
        Ej2.add(e43, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        e44.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e44.setForeground(new java.awt.Color(255, 153, 0));
        e44.setText("9");
        Ej2.add(e44, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, 50));

        e45.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e45.setForeground(new java.awt.Color(153, 0, 0));
        e45.setText("=");
        Ej2.add(e45, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, 50));

        r5.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r5.setForeground(new java.awt.Color(0, 0, 153));
        r5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        Ej2.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 90, 90));

        e47.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e47.setForeground(new java.awt.Color(153, 0, 0));
        e47.setText("=");
        Ej2.add(e47, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, 50));

        r6.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r6.setForeground(new java.awt.Color(0, 0, 153));
        r6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        Ej2.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 90, 90));

        e49.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e49.setForeground(new java.awt.Color(153, 0, 0));
        e49.setText("=");
        Ej2.add(e49, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, 50));

        r7.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r7.setForeground(new java.awt.Color(0, 0, 153));
        r7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        Ej2.add(r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 90, 90));

        r8.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r8.setForeground(new java.awt.Color(0, 0, 153));
        r8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        Ej2.add(r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, 90, 90));

        e51.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e51.setForeground(new java.awt.Color(153, 0, 0));
        e51.setText("=");
        Ej2.add(e51, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, -1, 50));

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
        Ej2.add(mostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 940, 190, 40));

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
        Ej2.add(revisar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 940, 120, 40));

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
        Ej2.add(siguiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1040, 120, 40));

        aviso1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        aviso1.setForeground(new java.awt.Color(0, 0, 153));
        Ej2.add(aviso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 880, 320, 30));

        e52.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e52.setForeground(new java.awt.Color(153, 0, 0));
        e52.setText("X");
        Ej2.add(e52, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, 50));

        e46.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e46.setForeground(new java.awt.Color(204, 102, 0));
        e46.setText("Resuelve las siguientes ");
        Ej2.add(e46, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        e48.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e48.setForeground(new java.awt.Color(255, 153, 0));
        e48.setText("2");
        Ej2.add(e48, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 50));

        e50.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e50.setForeground(new java.awt.Color(255, 153, 0));
        e50.setText("5");
        Ej2.add(e50, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, 50));

        e53.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e53.setForeground(new java.awt.Color(153, 0, 0));
        e53.setText("X");
        Ej2.add(e53, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, 50));

        e54.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e54.setForeground(new java.awt.Color(255, 153, 0));
        e54.setText("3");
        Ej2.add(e54, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 50));

        e55.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e55.setForeground(new java.awt.Color(153, 0, 0));
        e55.setText("=");
        Ej2.add(e55, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 760, -1, 50));

        r9.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r9.setForeground(new java.awt.Color(0, 0, 153));
        r9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        Ej2.add(r9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 740, 90, 90));

        e56.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e56.setForeground(new java.awt.Color(255, 153, 0));
        e56.setText("4");
        Ej2.add(e56, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, 50));

        e57.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e57.setForeground(new java.awt.Color(153, 0, 0));
        e57.setText("X");
        Ej2.add(e57, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, 50));

        e58.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e58.setForeground(new java.awt.Color(255, 153, 0));
        e58.setText("4");
        Ej2.add(e58, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, -1, 50));

        e59.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e59.setForeground(new java.awt.Color(255, 153, 0));
        e59.setText("9");
        Ej2.add(e59, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, -1, 50));

        e60.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e60.setForeground(new java.awt.Color(153, 0, 0));
        e60.setText("X");
        Ej2.add(e60, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, -1, 50));

        e61.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e61.setForeground(new java.awt.Color(255, 153, 0));
        e61.setText("5");
        Ej2.add(e61, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, -1, 50));

        e62.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e62.setForeground(new java.awt.Color(255, 153, 0));
        e62.setText("6");
        Ej2.add(e62, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 760, -1, 50));

        e63.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e63.setForeground(new java.awt.Color(153, 0, 0));
        e63.setText("X");
        Ej2.add(e63, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 760, -1, 50));

        e64.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e64.setForeground(new java.awt.Color(255, 153, 0));
        e64.setText("6");
        Ej2.add(e64, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 760, -1, 50));

        ej2.setViewportView(Ej2);

        CuartoJ.addTab("Ej.- 2", ej2);

        jPanel2.add(CuartoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 460));

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
        jLabel36.setText("Cuarto Grado");
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

    private void mostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar1ActionPerformed
        r5.setText("18");
        r6.setText("15");
        r7.setText("16");
        r8.setText("45");
        r9.setText("36");

        siguiente3.setVisible(true);
    }//GEN-LAST:event_mostrar1ActionPerformed

    private void revisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revisar1ActionPerformed
        if(r5.getText().equals("")||r6.getText().equals("")||r7.getText().equals("")||r8.getText().equals("")||r9.getText().equals("")){
            aviso1.setText("Te faltan respuestas :(");
        }else{

            if(( r5.getText().equals("18"))&&
                (r6.getText().equals("15"))&&
                (r7.getText().equals("16"))&&
                (r8.getText().equals("45"))&&
                (r9.getText().equals("36"))){
                aviso1.setText("Muy bien, eres muy inteligente :D");
                siguiente3.setVisible(true);
            }else{
                aviso1.setText("Uy revisa tus respuestas de nuevo :)");
                mostrar1.setVisible(true);
            }
        }
    }//GEN-LAST:event_revisar1ActionPerformed

    private void siguiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente3ActionPerformed
        terminado4 = true;
        datos d = new datos();
        d.setVisible(false);
        
        if(Integer.parseInt(d.em)<=10){
            d.em=("10");
        }
        menu m = new menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_siguiente3ActionPerformed

    private void siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente2ActionPerformed
        CuartoJ.setEnabledAt(2, true);
    }//GEN-LAST:event_siguiente2ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void revisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revisarActionPerformed
        if(r1.getText().equals("")||r2.getText().equals("")||r3.getText().equals("")||r4.getText().equals("")){
            aviso.setText("Te faltan respuestas :(");
        }else{

            if((r1.getText().equals("2")||r1.getText().equals("dos"))&&
                (r2.getText().equals("8")||r2.getText().equals("ocho"))&&
                (r4.getText().equals("14")||r4.getText().equals("catorce"))&&
                (r3.getText().equals("20")||r3.getText().equals("veinte"))){
                aviso.setText("Muy bien, eres muy inteligente :D");
                siguiente2.setVisible(true);
            }else{
                aviso.setText("Uy revisa tus respuestas de nuevo :)");
                mostrar.setVisible(true);
            }
        }
    }//GEN-LAST:event_revisarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        r1.setText("2");
        r2.setText("8");
        r4.setText("14");
        r3.setText("20");

        siguiente2.setVisible(true);
    }//GEN-LAST:event_mostrarActionPerformed

    private void siguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente1ActionPerformed
        CuartoJ.setEnabledAt(1, true);
    }//GEN-LAST:event_siguiente1ActionPerformed

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
            java.util.logging.Logger.getLogger(cuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cuarto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane CuartoJ;
    private javax.swing.JPanel Ej1;
    private javax.swing.JPanel Ej2;
    private javax.swing.JLabel aviso;
    private javax.swing.JLabel aviso1;
    private javax.swing.JLabel e;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e31;
    private javax.swing.JLabel e33;
    private javax.swing.JLabel e34;
    private javax.swing.JLabel e43;
    private javax.swing.JLabel e44;
    private javax.swing.JLabel e45;
    private javax.swing.JLabel e46;
    private javax.swing.JLabel e47;
    private javax.swing.JLabel e48;
    private javax.swing.JLabel e49;
    private javax.swing.JLabel e5;
    private javax.swing.JLabel e50;
    private javax.swing.JLabel e51;
    private javax.swing.JLabel e52;
    private javax.swing.JLabel e53;
    private javax.swing.JLabel e54;
    private javax.swing.JLabel e55;
    private javax.swing.JLabel e56;
    private javax.swing.JLabel e57;
    private javax.swing.JLabel e58;
    private javax.swing.JLabel e59;
    private javax.swing.JLabel e60;
    private javax.swing.JLabel e61;
    private javax.swing.JLabel e62;
    private javax.swing.JLabel e63;
    private javax.swing.JLabel e64;
    private javax.swing.JScrollPane ej1;
    private javax.swing.JScrollPane ej2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton mostrar1;
    private javax.swing.JScrollPane mult;
    private javax.swing.JPanel multiplicar;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r2;
    private javax.swing.JTextField r3;
    private javax.swing.JTextField r4;
    private javax.swing.JTextField r5;
    private javax.swing.JTextField r6;
    private javax.swing.JTextField r7;
    private javax.swing.JTextField r8;
    private javax.swing.JTextField r9;
    private javax.swing.JButton revisar;
    private javax.swing.JButton revisar1;
    private javax.swing.JButton salir;
    private javax.swing.JButton siguiente1;
    private javax.swing.JButton siguiente2;
    private javax.swing.JButton siguiente3;
    // End of variables declaration//GEN-END:variables
}
