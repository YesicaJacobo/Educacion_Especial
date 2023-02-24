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
public class tercero extends javax.swing.JFrame {

    /**
     * Creates new form tercero
     */
    public tercero() {
        initComponents();
        
        TerceroJ.setEnabledAt(1, false);
        TerceroJ.setEnabledAt(2, false);
        TerceroJ.setEnabledAt(3, false);
        TerceroJ.setEnabledAt(4, false);
    }
    public static boolean terminado3 = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TerceroJ = new javax.swing.JTabbedPane();
        mult = new javax.swing.JScrollPane();
        multiplicar = new javax.swing.JPanel();
        e = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        siguiente1 = new javax.swing.JButton();
        e15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        e5 = new javax.swing.JLabel();
        e20 = new javax.swing.JLabel();
        e75 = new javax.swing.JLabel();
        e31 = new javax.swing.JLabel();
        mult2 = new javax.swing.JScrollPane();
        multiplicar5 = new javax.swing.JPanel();
        e33 = new javax.swing.JLabel();
        e34 = new javax.swing.JLabel();
        siguiente2 = new javax.swing.JButton();
        e43 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        e44 = new javax.swing.JLabel();
        e45 = new javax.swing.JLabel();
        e46 = new javax.swing.JLabel();
        e76 = new javax.swing.JLabel();
        e47 = new javax.swing.JLabel();
        mult3 = new javax.swing.JScrollPane();
        multiplicar6 = new javax.swing.JPanel();
        e35 = new javax.swing.JLabel();
        e36 = new javax.swing.JLabel();
        siguiente3 = new javax.swing.JButton();
        e48 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        e49 = new javax.swing.JLabel();
        e50 = new javax.swing.JLabel();
        e51 = new javax.swing.JLabel();
        e77 = new javax.swing.JLabel();
        e52 = new javax.swing.JLabel();
        mult4 = new javax.swing.JScrollPane();
        multiplicar7 = new javax.swing.JPanel();
        e37 = new javax.swing.JLabel();
        e38 = new javax.swing.JLabel();
        siguiente4 = new javax.swing.JButton();
        e53 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        e54 = new javax.swing.JLabel();
        e55 = new javax.swing.JLabel();
        e56 = new javax.swing.JLabel();
        e78 = new javax.swing.JLabel();
        e57 = new javax.swing.JLabel();
        mult5 = new javax.swing.JScrollPane();
        multiplicar8 = new javax.swing.JPanel();
        e39 = new javax.swing.JLabel();
        e40 = new javax.swing.JLabel();
        siguiente5 = new javax.swing.JButton();
        e58 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        e59 = new javax.swing.JLabel();
        e60 = new javax.swing.JLabel();
        e61 = new javax.swing.JLabel();
        e79 = new javax.swing.JLabel();
        e62 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TerceroJ.setBackground(new java.awt.Color(243, 243, 105));
        TerceroJ.setForeground(new java.awt.Color(0, 51, 153));
        TerceroJ.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        mult.setBackground(new java.awt.Color(180, 255, 180));

        multiplicar.setBackground(new java.awt.Color(204, 255, 204));
        multiplicar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        multiplicar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        multiplicar.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 130));

        e3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e3.setForeground(new java.awt.Color(204, 102, 0));
        e3.setText("Vamos aprender las tablas de multiplicar");
        multiplicar.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

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
        multiplicar.add(siguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 690, 120, 40));

        e15.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e15.setForeground(new java.awt.Color(102, 255, 204));
        e15.setText("----------------------");
        multiplicar.add(e15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tab2.png"))); // NOI18N
        multiplicar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 150, 200));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tab1.jpg"))); // NOI18N
        multiplicar.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        e4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        e4.setForeground(new java.awt.Color(0, 0, 255));
        e4.setText("Primero la tabla del 1 y 2");
        multiplicar.add(e4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        e5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e5.setForeground(new java.awt.Color(0, 0, 255));
        e5.setText("Las tienesque estudiar mucho mucho mucho");
        multiplicar.add(e5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        e20.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e20.setForeground(new java.awt.Color(102, 255, 204));
        e20.setText("----------------------");
        multiplicar.add(e20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, -1, 50));

        e75.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e75.setForeground(new java.awt.Color(0, 0, 255));
        e75.setText("y aprendertelas de memoria.");
        multiplicar.add(e75, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        e31.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e31.setForeground(new java.awt.Color(102, 255, 204));
        e31.setText("----------------------");
        multiplicar.add(e31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, 50));

        mult.setViewportView(multiplicar);

        TerceroJ.addTab("Tabla 1 y 2", mult);

        mult2.setBackground(new java.awt.Color(180, 255, 180));

        multiplicar5.setBackground(new java.awt.Color(204, 255, 204));
        multiplicar5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        multiplicar5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        multiplicar5.add(e33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 130));

        e34.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e34.setForeground(new java.awt.Color(204, 102, 0));
        e34.setText("Vamos aprender las tablas de multiplicar");
        multiplicar5.add(e34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

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
        multiplicar5.add(siguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 660, 120, 40));

        e43.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e43.setForeground(new java.awt.Color(102, 255, 204));
        e43.setText("----------------------");
        multiplicar5.add(e43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tab4.jpg"))); // NOI18N
        multiplicar5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 150, 200));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tab3.png"))); // NOI18N
        multiplicar5.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        e44.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        e44.setForeground(new java.awt.Color(0, 0, 255));
        e44.setText("Tablas del 3 y 4");
        multiplicar5.add(e44, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        e45.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e45.setForeground(new java.awt.Color(0, 0, 255));
        e45.setText("Las tienesque estudiar mucho mucho mucho");
        multiplicar5.add(e45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        e46.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e46.setForeground(new java.awt.Color(102, 255, 204));
        e46.setText("----------------------");
        multiplicar5.add(e46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, -1, 50));

        e76.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e76.setForeground(new java.awt.Color(0, 0, 255));
        e76.setText("y aprendertelas de memoria.");
        multiplicar5.add(e76, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        e47.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e47.setForeground(new java.awt.Color(102, 255, 204));
        e47.setText("----------------------");
        multiplicar5.add(e47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, 50));

        mult2.setViewportView(multiplicar5);

        TerceroJ.addTab("Tabla 3 y 4", mult2);

        mult3.setBackground(new java.awt.Color(180, 255, 180));

        multiplicar6.setBackground(new java.awt.Color(204, 255, 204));
        multiplicar6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        multiplicar6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        multiplicar6.add(e35, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 130));

        e36.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e36.setForeground(new java.awt.Color(204, 102, 0));
        e36.setText("Vamos aprender las tablas de multiplicar");
        multiplicar6.add(e36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

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
        multiplicar6.add(siguiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 690, 120, 40));

        e48.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e48.setForeground(new java.awt.Color(102, 255, 204));
        e48.setText("----------------------");
        multiplicar6.add(e48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tab6.png"))); // NOI18N
        multiplicar6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 150, 200));

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tab5.jpg"))); // NOI18N
        multiplicar6.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        e49.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        e49.setForeground(new java.awt.Color(0, 0, 255));
        e49.setText("Tablas del 5 y 6");
        multiplicar6.add(e49, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        e50.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e50.setForeground(new java.awt.Color(0, 0, 255));
        e50.setText("Las tienesque estudiar mucho mucho mucho");
        multiplicar6.add(e50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        e51.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e51.setForeground(new java.awt.Color(102, 255, 204));
        e51.setText("----------------------");
        multiplicar6.add(e51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, -1, 50));

        e77.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e77.setForeground(new java.awt.Color(0, 0, 255));
        e77.setText("y aprendertelas de memoria.");
        multiplicar6.add(e77, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        e52.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e52.setForeground(new java.awt.Color(102, 255, 204));
        e52.setText("----------------------");
        multiplicar6.add(e52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, 50));

        mult3.setViewportView(multiplicar6);

        TerceroJ.addTab("Tabla 5 y 6", mult3);

        mult4.setBackground(new java.awt.Color(180, 255, 180));

        multiplicar7.setBackground(new java.awt.Color(204, 255, 204));
        multiplicar7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        multiplicar7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        multiplicar7.add(e37, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 130));

        e38.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e38.setForeground(new java.awt.Color(204, 102, 0));
        e38.setText("Vamos aprender las tablas de multiplicar");
        multiplicar7.add(e38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        siguiente4.setBackground(new java.awt.Color(255, 255, 0));
        siguiente4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        siguiente4.setForeground(new java.awt.Color(204, 102, 0));
        siguiente4.setText("Siguiente");
        siguiente4.setToolTipText("");
        siguiente4.setBorder(null);
        siguiente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente4ActionPerformed(evt);
            }
        });
        multiplicar7.add(siguiente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 660, 120, 40));

        e53.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e53.setForeground(new java.awt.Color(102, 255, 204));
        e53.setText("----------------------");
        multiplicar7.add(e53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tab8.png"))); // NOI18N
        multiplicar7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 150, 200));

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tab7.jpg"))); // NOI18N
        multiplicar7.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        e54.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        e54.setForeground(new java.awt.Color(0, 0, 255));
        e54.setText("Tablas del 7 y 8");
        multiplicar7.add(e54, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        e55.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e55.setForeground(new java.awt.Color(0, 0, 255));
        e55.setText("Las tienesque estudiar mucho mucho mucho");
        multiplicar7.add(e55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        e56.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e56.setForeground(new java.awt.Color(102, 255, 204));
        e56.setText("----------------------");
        multiplicar7.add(e56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, -1, 50));

        e78.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e78.setForeground(new java.awt.Color(0, 0, 255));
        e78.setText("y aprendertelas de memoria.");
        multiplicar7.add(e78, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        e57.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e57.setForeground(new java.awt.Color(102, 255, 204));
        e57.setText("----------------------");
        multiplicar7.add(e57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, 50));

        mult4.setViewportView(multiplicar7);

        TerceroJ.addTab("Tabla 7 y 8", mult4);

        mult5.setBackground(new java.awt.Color(180, 255, 180));

        multiplicar8.setBackground(new java.awt.Color(204, 255, 204));
        multiplicar8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        multiplicar8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        multiplicar8.add(e39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 130));

        e40.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e40.setForeground(new java.awt.Color(204, 102, 0));
        e40.setText("Vamos aprender las tablas de multiplicar");
        multiplicar8.add(e40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        siguiente5.setBackground(new java.awt.Color(255, 255, 0));
        siguiente5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        siguiente5.setForeground(new java.awt.Color(204, 102, 0));
        siguiente5.setText("Siguiente");
        siguiente5.setToolTipText("");
        siguiente5.setBorder(null);
        siguiente5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente5ActionPerformed(evt);
            }
        });
        multiplicar8.add(siguiente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 660, 120, 40));

        e58.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e58.setForeground(new java.awt.Color(102, 255, 204));
        e58.setText("----------------------");
        multiplicar8.add(e58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 50));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tab10.png"))); // NOI18N
        multiplicar8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 150, 200));

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tab9.jpg"))); // NOI18N
        multiplicar8.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        e59.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        e59.setForeground(new java.awt.Color(0, 0, 255));
        e59.setText("Por ultimo las tablas del 9 y 10");
        multiplicar8.add(e59, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        e60.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e60.setForeground(new java.awt.Color(0, 0, 255));
        e60.setText("Las tienesque estudiar mucho mucho mucho");
        multiplicar8.add(e60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        e61.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e61.setForeground(new java.awt.Color(102, 255, 204));
        e61.setText("----------------------");
        multiplicar8.add(e61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, -1, 50));

        e79.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e79.setForeground(new java.awt.Color(0, 0, 255));
        e79.setText("y aprendertelas de memoria.");
        multiplicar8.add(e79, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        e62.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e62.setForeground(new java.awt.Color(102, 255, 204));
        e62.setText("----------------------");
        multiplicar8.add(e62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, 50));

        mult5.setViewportView(multiplicar8);

        TerceroJ.addTab("Tabla 9 y 10", mult5);

        jPanel2.add(TerceroJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 460));

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
        jLabel36.setText("Tercer Grado");
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

    private void siguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente1ActionPerformed
        TerceroJ.setEnabledAt(1, true);
    }//GEN-LAST:event_siguiente1ActionPerformed

    private void siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente2ActionPerformed
        TerceroJ.setEnabledAt(2, true);
    }//GEN-LAST:event_siguiente2ActionPerformed

    private void siguiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente3ActionPerformed
        TerceroJ.setEnabledAt(3, true);
    }//GEN-LAST:event_siguiente3ActionPerformed

    private void siguiente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente4ActionPerformed
        TerceroJ.setEnabledAt(4, true);
    }//GEN-LAST:event_siguiente4ActionPerformed

    private void siguiente5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente5ActionPerformed
        
        terminado3 = true;
        datos d = new datos();
        d.setVisible(false);
        if(Integer.parseInt(d.em)<=9){
            d.em=("9");
        }
            
        menu m = new menu();

        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_siguiente5ActionPerformed

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
            java.util.logging.Logger.getLogger(tercero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tercero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tercero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tercero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tercero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TerceroJ;
    private javax.swing.JLabel e;
    private javax.swing.JLabel e15;
    private javax.swing.JLabel e20;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e31;
    private javax.swing.JLabel e33;
    private javax.swing.JLabel e34;
    private javax.swing.JLabel e35;
    private javax.swing.JLabel e36;
    private javax.swing.JLabel e37;
    private javax.swing.JLabel e38;
    private javax.swing.JLabel e39;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel e40;
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
    private javax.swing.JLabel e75;
    private javax.swing.JLabel e76;
    private javax.swing.JLabel e77;
    private javax.swing.JLabel e78;
    private javax.swing.JLabel e79;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane mult;
    private javax.swing.JScrollPane mult2;
    private javax.swing.JScrollPane mult3;
    private javax.swing.JScrollPane mult4;
    private javax.swing.JScrollPane mult5;
    private javax.swing.JPanel multiplicar;
    private javax.swing.JPanel multiplicar5;
    private javax.swing.JPanel multiplicar6;
    private javax.swing.JPanel multiplicar7;
    private javax.swing.JPanel multiplicar8;
    private javax.swing.JButton salir;
    private javax.swing.JButton siguiente1;
    private javax.swing.JButton siguiente2;
    private javax.swing.JButton siguiente3;
    private javax.swing.JButton siguiente4;
    private javax.swing.JButton siguiente5;
    // End of variables declaration//GEN-END:variables
}
