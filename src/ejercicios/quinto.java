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

public class quinto extends javax.swing.JFrame {



    /**

     * Creates new form quinto

     */


    public quinto() {

        initComponents();

        

        QuintoJ.setEnabledAt(1, false);

        QuintoJ.setEnabledAt(2, false);

        mostrar.setVisible(false);

        mostrar1.setVisible(false);

        siguiente2.setVisible(false);

        siguiente3.setVisible(false);

    }
    public static boolean terminado5 = false;
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        QuintoJ = new javax.swing.JTabbedPane();
        geo = new javax.swing.JScrollPane();
        geografia = new javax.swing.JPanel();
        America1 = new javax.swing.JButton();
        America2 = new javax.swing.JButton();
        Africa = new javax.swing.JButton();
        Antartida = new javax.swing.JButton();
        Europa = new javax.swing.JButton();
        Asia = new javax.swing.JButton();
        Oseania = new javax.swing.JButton();
        e = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        siguiente1 = new javax.swing.JButton();
        e5 = new javax.swing.JLabel();
        e6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
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
        e7 = new javax.swing.JLabel();
        e8 = new javax.swing.JLabel();
        e9 = new javax.swing.JLabel();
        e10 = new javax.swing.JLabel();
        e11 = new javax.swing.JLabel();
        e12 = new javax.swing.JLabel();
        ej2 = new javax.swing.JScrollPane();
        Ej2 = new javax.swing.JPanel();
        e34 = new javax.swing.JLabel();
        e43 = new javax.swing.JLabel();
        r5 = new javax.swing.JTextField();
        r6 = new javax.swing.JTextField();
        r7 = new javax.swing.JTextField();
        r8 = new javax.swing.JTextField();
        mostrar1 = new javax.swing.JButton();
        revisar1 = new javax.swing.JButton();
        siguiente3 = new javax.swing.JButton();
        aviso1 = new javax.swing.JLabel();
        e46 = new javax.swing.JLabel();
        e48 = new javax.swing.JLabel();
        r9 = new javax.swing.JTextField();
        e49 = new javax.swing.JLabel();
        e50 = new javax.swing.JLabel();
        e51 = new javax.swing.JLabel();
        e52 = new javax.swing.JLabel();
        e53 = new javax.swing.JLabel();
        e54 = new javax.swing.JLabel();
        r10 = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QuintoJ.setBackground(new java.awt.Color(243, 243, 105));
        QuintoJ.setForeground(new java.awt.Color(0, 51, 153));
        QuintoJ.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        geo.setBackground(new java.awt.Color(180, 255, 180));

        geografia.setBackground(new java.awt.Color(204, 255, 204));
        geografia.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        geografia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        America1.setBackground(new java.awt.Color(184, 219, 255));
        America1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        America1.setForeground(new java.awt.Color(0, 0, 204));
        America1.setText("America");
        America1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        America1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                America1ActionPerformed(evt);
            }
        });
        geografia.add(America1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 80, 20));

        America2.setBackground(new java.awt.Color(184, 219, 255));
        America2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        America2.setForeground(new java.awt.Color(0, 0, 204));
        America2.setText("America");
        America2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        America2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                America2ActionPerformed(evt);
            }
        });
        geografia.add(America2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 80, 20));

        Africa.setBackground(new java.awt.Color(184, 219, 255));
        Africa.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Africa.setForeground(new java.awt.Color(0, 0, 204));
        Africa.setText("Africa");
        Africa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Africa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfricaActionPerformed(evt);
            }
        });
        geografia.add(Africa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 60, 20));

        Antartida.setBackground(new java.awt.Color(184, 219, 255));
        Antartida.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Antartida.setForeground(new java.awt.Color(0, 0, 204));
        Antartida.setText("Antartida");
        Antartida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Antartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AntartidaActionPerformed(evt);
            }
        });
        geografia.add(Antartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 80, 20));

        Europa.setBackground(new java.awt.Color(184, 219, 255));
        Europa.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Europa.setForeground(new java.awt.Color(0, 0, 204));
        Europa.setText("Europa");
        Europa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Europa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EuropaActionPerformed(evt);
            }
        });
        geografia.add(Europa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 60, 20));

        Asia.setBackground(new java.awt.Color(184, 219, 255));
        Asia.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Asia.setForeground(new java.awt.Color(0, 0, 204));
        Asia.setText("Asia");
        Asia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Asia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsiaActionPerformed(evt);
            }
        });
        geografia.add(Asia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 60, 20));

        Oseania.setBackground(new java.awt.Color(184, 219, 255));
        Oseania.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Oseania.setForeground(new java.awt.Color(0, 0, 204));
        Oseania.setText("Oceania");
        Oseania.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Oseania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OseaniaActionPerformed(evt);
            }
        });
        geografia.add(Oseania, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 60, 20));

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        geografia.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 160, 130));

        e3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e3.setForeground(new java.awt.Color(204, 102, 0));
        e3.setText("¿Sabes cuales son los 6 continentes?");
        geografia.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

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
        geografia.add(siguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 740, 120, 40));

        e5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e5.setForeground(new java.awt.Color(0, 0, 255));
        e5.setText("saber 3 datos interesantes sobre el.");
        geografia.add(e5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        e6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e6.setForeground(new java.awt.Color(0, 0, 255));
        e6.setText("Da click sobre el nombre del continente para ");
        geografia.add(e6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/continentes.jpg"))); // NOI18N
        geografia.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 255));

        info.setColumns(20);
        info.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        info.setForeground(new java.awt.Color(0, 0, 153));
        info.setRows(5);
        jScrollPane1.setViewportView(info);

        geografia.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 420, 140));

        geo.setViewportView(geografia);

        QuintoJ.addTab("Los 6 continentes", geo);

        ej1.setBackground(new java.awt.Color(180, 255, 180));

        Ej1.setBackground(new java.awt.Color(255, 204, 204));
        Ej1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Ej1.setPreferredSize(new java.awt.Dimension(475, 1120));
        Ej1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        Ej1.add(e31, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 150, 130));

        e33.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e33.setForeground(new java.awt.Color(204, 102, 0));
        e33.setText("Completa las oraciones");
        Ej1.add(e33, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

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
        Ej1.add(siguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 120, 40));

        r1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r1.setForeground(new java.awt.Color(0, 0, 153));
        r1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 2));
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        Ej1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 140, 30));

        r2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r2.setForeground(new java.awt.Color(0, 0, 153));
        r2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 2));
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        Ej1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 140, 30));

        r3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r3.setForeground(new java.awt.Color(0, 0, 153));
        r3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 2));
        Ej1.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 140, 30));

        r4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r4.setForeground(new java.awt.Color(0, 0, 153));
        r4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 2));
        Ej1.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 140, 30));

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
        Ej1.add(revisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 120, 40));

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
        Ej1.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 190, 40));

        aviso.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        aviso.setForeground(new java.awt.Color(0, 0, 153));
        Ej1.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 320, 30));

        e7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        e7.setForeground(new java.awt.Color(0, 0, 255));
        e7.setText("743,7 millones de habitantes.");
        Ej1.add(e7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        e8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        e8.setForeground(new java.awt.Color(0, 0, 255));
        e8.setText("1.-                    es el continente mas pequeño.");
        Ej1.add(e8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        e9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        e9.setForeground(new java.awt.Color(0, 0, 255));
        e9.setText("2.-                    es el continente mas frio.");
        Ej1.add(e9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        e10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        e10.setForeground(new java.awt.Color(0, 0, 255));
        e10.setText("4.-                    es el continente mas grande.");
        Ej1.add(e10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        e11.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        e11.setForeground(new java.awt.Color(0, 0, 255));
        e11.setText("3.-                    tiene una población de ");
        Ej1.add(e11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        e12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        e12.setForeground(new java.awt.Color(0, 0, 255));
        e12.setText("3.-                    tiene una población de ");
        Ej1.add(e12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        ej1.setViewportView(Ej1);

        QuintoJ.addTab("Ej.- 1", ej1);

        ej2.setBackground(new java.awt.Color(180, 255, 180));

        Ej2.setBackground(new java.awt.Color(255, 204, 204));
        Ej2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Ej2.setPreferredSize(new java.awt.Dimension(453, 1380));
        Ej2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        Ej2.add(e34, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 150, 130));

        e43.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e43.setForeground(new java.awt.Color(204, 102, 0));
        e43.setText("estos continentes?");
        Ej2.add(e43, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        r5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r5.setForeground(new java.awt.Color(0, 0, 153));
        r5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 153), 3));
        Ej2.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 200, 30));

        r6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r6.setForeground(new java.awt.Color(0, 0, 153));
        r6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 153), 3));
        Ej2.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 180, 30));

        r7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r7.setForeground(new java.awt.Color(0, 0, 153));
        r7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 153), 3));
        Ej2.add(r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 200, 30));

        r8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r8.setForeground(new java.awt.Color(0, 0, 153));
        r8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 153), 3));
        Ej2.add(r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 700, 200, 30));

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
        Ej2.add(mostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1150, 190, 40));

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
        Ej2.add(revisar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1150, 120, 40));

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
        Ej2.add(siguiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1220, 120, 40));

        aviso1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        aviso1.setForeground(new java.awt.Color(0, 0, 153));
        Ej2.add(aviso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1110, 320, 30));

        e46.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e46.setForeground(new java.awt.Color(204, 102, 0));
        e46.setText("¿Sabes como se llaman");
        Ej2.add(e46, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        e48.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e48.setForeground(new java.awt.Color(255, 153, 0));
        e48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cont7.png"))); // NOI18N
        Ej2.add(e48, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 920, 240, 160));

        r9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r9.setForeground(new java.awt.Color(0, 0, 153));
        r9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 153), 3));
        Ej2.add(r9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 830, 200, 30));

        e49.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e49.setForeground(new java.awt.Color(255, 153, 0));
        e49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cont1.png"))); // NOI18N
        Ej2.add(e49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 260, 160));

        e50.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e50.setForeground(new java.awt.Color(255, 153, 0));
        e50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cont2.png"))); // NOI18N
        Ej2.add(e50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 160));

        e51.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e51.setForeground(new java.awt.Color(255, 153, 0));
        e51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cont3.png"))); // NOI18N
        Ej2.add(e51, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 260, 160));

        e52.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e52.setForeground(new java.awt.Color(255, 153, 0));
        e52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cont4.png"))); // NOI18N
        Ej2.add(e52, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 520, 200, 160));

        e53.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e53.setForeground(new java.awt.Color(255, 153, 0));
        e53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cont5.png"))); // NOI18N
        Ej2.add(e53, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 200, 160));

        e54.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        e54.setForeground(new java.awt.Color(255, 153, 0));
        e54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cont6.png"))); // NOI18N
        Ej2.add(e54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 200, 160));

        r10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        r10.setForeground(new java.awt.Color(0, 0, 153));
        r10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 153), 3));
        Ej2.add(r10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 980, 200, 30));

        ej2.setViewportView(Ej2);

        QuintoJ.addTab("Ej.- 2", ej2);

        jPanel2.add(QuintoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 460));

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
        jLabel36.setText("Quinto Grado");
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

        r5.setText("America");

        r6.setText("Antartida");

        r7.setText("Africa");

        r8.setText("Europa");

        r9.setText("Oseania");

        r10.setText("Asia");



        siguiente3.setVisible(true);

    }//GEN-LAST:event_mostrar1ActionPerformed



    private void revisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revisar1ActionPerformed

        if(r5.getText().equals("")||r6.getText().equals("")||r7.getText().equals("")||r8.getText().equals("")||r9.getText().equals("")||r10.getText().equals("")){

            aviso1.setText("Te faltan respuestas :(");

        }else{



            if(( r5.getText().equals("America")||r5.getText().equals("america"))&&

                (r6.getText().equals("Antartida")||r6.getText().equals("antartida"))&&

                (r7.getText().equals("Africa")||r7.getText().equals("africa"))&&

                (r8.getText().equals("Europa")||r8.getText().equals("europa"))&&

                (r9.getText().equals("Oseania")||r9.getText().equals("oseania"))&&

                (r10.getText().equals("Asia")||r10.getText().equals("asia"))){

                aviso1.setText("Muy bien, eres muy inteligente :D");

                siguiente3.setVisible(true);

            }else{

                aviso1.setText("Uy revisa tus respuestas de nuevo :)");

                mostrar1.setVisible(true);

            }

        }

    }//GEN-LAST:event_revisar1ActionPerformed



    private void siguiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente3ActionPerformed

        terminado5 = true;
        datos d = new datos();
        d.setVisible(false);
        
        if(Integer.parseInt(d.em)<=11){
            d.em=("11");
        }
        menu m = new menu();
        m.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_siguiente3ActionPerformed



    private void siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente2ActionPerformed

        QuintoJ.setEnabledAt(2, true);

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



            if((r1.getText().equals("oseania")||r1.getText().equals("Oseania"))&&

                (r2.getText().equals("antartida")||r2.getText().equals("Antartida"))&&

                (r3.getText().equals("europa")||r3.getText().equals("Europa"))&&

                (r4.getText().equals("asia")||r4.getText().equals("Asia"))){

                aviso.setText("Muy bien, eres muy inteligente :D");

                siguiente2.setVisible(true);

            }else{

                aviso.setText("Uy revisa tus respuestas de nuevo :)");

                mostrar.setVisible(true);

            }

        }

    }//GEN-LAST:event_revisarActionPerformed



    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed

        r1.setText("Oseania");

        r2.setText("Antartida");

        r3.setText("Europa");

        r4.setText("Asia");



        siguiente2.setVisible(true);

    }//GEN-LAST:event_mostrarActionPerformed



    private void siguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente1ActionPerformed

        QuintoJ.setEnabledAt(1, true);

    }//GEN-LAST:event_siguiente1ActionPerformed



    private void America2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_America2ActionPerformed

        info.setText(" ~ America ~ \n" +

                     "1.- Ocupa el segundo lugar en extensión territorial con mas de 43 millones de Km^2. \n" +

                     "2.- Tiene una población de 1022 millones de habitantes. \n" +

                     "3.- Se divide en América del Norte, América del Sur y Centro América.");

    }//GEN-LAST:event_America2ActionPerformed



    private void America1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_America1ActionPerformed

        info.setText(" ~ America ~ \n" +

                     "1.- Ocupa el segundo lugar en extensión territorial con mas de 43 millones de Km^2. \n" +

                     "2.- Tiene una población de 1022 millones de habitantes. \n" +

                     "3.- Se divide en América del Norte, América del Sur y Centro América.");

    }//GEN-LAST:event_America1ActionPerformed



    private void AfricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfricaActionPerformed

        info.setText(" ~ Africa ~ \n" +

                     "1.- Ocupa el tercer lugar en extensión territorial, con 30.22 millones de Km^2. \n" +

                     "2.- Población de 1322 millones de habitantes. \n" +

                     "3.- Se compone de 54 países independientes, dos con reconocimiento limitado y dos territorios dependientes.");

    }//GEN-LAST:event_AfricaActionPerformed



    private void EuropaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EuropaActionPerformed

        info.setText(" ~ Europa ~ \n" +

                     "1.- Es el segundo continente mas pequeño, con una extensión de 10,5 millones de Km^2. \n" +

                     "2.- Tiene una población de 743,7 millones de habitantes. \n" +

                     "3.- Lo conforman 50 países, 6 dependencias y 8 no reconocidos.");

    }//GEN-LAST:event_EuropaActionPerformed



    private void AsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsiaActionPerformed

        info.setText(" ~ Asia ~ \n" +

                     "1.- Es el continente más extenso, con una superficie de 44,5 millones de km^2. \n" +

                     "2.- También es el continente más poblado, con más de 4580 millones de habitantes. \n" +

                     "3.- Se extiende desde el Océano Glacial Ártico al Norte hasta el Océano Indico al Sur.");

    }//GEN-LAST:event_AsiaActionPerformed



    private void OseaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OseaniaActionPerformed

        info.setText(" ~ Oseania ~ \n" +

                     "1.- Es el continente más pequeño y es el continente insular. \n" +

                     "2.- Su extensión es de 9 millones de Km^2 y una población de 41 millones de habitantes. \n" +

                     "3.- Está conformado por 14 países.");

    }//GEN-LAST:event_OseaniaActionPerformed



    private void AntartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AntartidaActionPerformed

        info.setText(" ~ Antartida ~ \n" +

                     "1.- Ocupa el cuarto lugar en extensión territorial, con 14 millones de Km^2. \n" +

                     "2.- Es el continente más frio y más seco de la Tierra. \n" +

                     "3.- Es el continente más austral, es decir, completamente al sur del círculo polar antártico y rodeada por el Océano Antártico.");

    }//GEN-LAST:event_AntartidaActionPerformed



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

            java.util.logging.Logger.getLogger(quinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {

            java.util.logging.Logger.getLogger(quinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {

            java.util.logging.Logger.getLogger(quinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(quinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        //</editor-fold>



        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new quinto().setVisible(true);

            }

        });

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Africa;
    private javax.swing.JButton America1;
    private javax.swing.JButton America2;
    private javax.swing.JButton Antartida;
    private javax.swing.JButton Asia;
    private javax.swing.JPanel Ej1;
    private javax.swing.JPanel Ej2;
    private javax.swing.JButton Europa;
    private javax.swing.JButton Oseania;
    private javax.swing.JTabbedPane QuintoJ;
    private javax.swing.JLabel aviso;
    private javax.swing.JLabel aviso1;
    private javax.swing.JLabel e;
    private javax.swing.JLabel e10;
    private javax.swing.JLabel e11;
    private javax.swing.JLabel e12;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e31;
    private javax.swing.JLabel e33;
    private javax.swing.JLabel e34;
    private javax.swing.JLabel e43;
    private javax.swing.JLabel e46;
    private javax.swing.JLabel e48;
    private javax.swing.JLabel e49;
    private javax.swing.JLabel e5;
    private javax.swing.JLabel e50;
    private javax.swing.JLabel e51;
    private javax.swing.JLabel e52;
    private javax.swing.JLabel e53;
    private javax.swing.JLabel e54;
    private javax.swing.JLabel e6;
    private javax.swing.JLabel e7;
    private javax.swing.JLabel e8;
    private javax.swing.JLabel e9;
    private javax.swing.JScrollPane ej1;
    private javax.swing.JScrollPane ej2;
    private javax.swing.JScrollPane geo;
    private javax.swing.JPanel geografia;
    private javax.swing.JTextArea info;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton mostrar1;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r10;
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

