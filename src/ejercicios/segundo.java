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
public class segundo extends javax.swing.JFrame {

    /**
     * Creates new form segundo
     */
    public segundo() {
        initComponents();
        
        SegundoJ.setEnabledAt(1, false);
        SegundoJ.setEnabledAt(2, false);
        siguiente2.setVisible(false);
        siguiente3.setVisible(false);
        mostrar.setVisible(false);
        mostrar1.setVisible(false);
    }
    public static boolean terminado2 = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        e14 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        SegundoJ = new javax.swing.JTabbedPane();
        sumar = new javax.swing.JScrollPane();
        sumaresta = new javax.swing.JPanel();
        e = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        siguiente1 = new javax.swing.JButton();
        e4 = new javax.swing.JLabel();
        e5 = new javax.swing.JLabel();
        e6 = new javax.swing.JLabel();
        e7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        e8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        e9 = new javax.swing.JLabel();
        e10 = new javax.swing.JLabel();
        e11 = new javax.swing.JLabel();
        e12 = new javax.swing.JLabel();
        e13 = new javax.swing.JLabel();
        e15 = new javax.swing.JLabel();
        e16 = new javax.swing.JLabel();
        e17 = new javax.swing.JLabel();
        e18 = new javax.swing.JLabel();
        e19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        e21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        e22 = new javax.swing.JLabel();
        e23 = new javax.swing.JLabel();
        e24 = new javax.swing.JLabel();
        e25 = new javax.swing.JLabel();
        e26 = new javax.swing.JLabel();
        e27 = new javax.swing.JLabel();
        e28 = new javax.swing.JLabel();
        e29 = new javax.swing.JLabel();
        e30 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        e32 = new javax.swing.JLabel();
        e20 = new javax.swing.JLabel();
        ej1 = new javax.swing.JScrollPane();
        Ej1 = new javax.swing.JPanel();
        e31 = new javax.swing.JLabel();
        e33 = new javax.swing.JLabel();
        siguiente2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        e35 = new javax.swing.JLabel();
        r1 = new javax.swing.JTextField();
        e37 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        e36 = new javax.swing.JLabel();
        e38 = new javax.swing.JLabel();
        r2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        e39 = new javax.swing.JLabel();
        e40 = new javax.swing.JLabel();
        r3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        e41 = new javax.swing.JLabel();
        e42 = new javax.swing.JLabel();
        r4 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        revisar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();
        ej2 = new javax.swing.JScrollPane();
        Ej2 = new javax.swing.JPanel();
        e34 = new javax.swing.JLabel();
        e43 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        e44 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        e45 = new javax.swing.JLabel();
        r5 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        e46 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        e47 = new javax.swing.JLabel();
        r6 = new javax.swing.JTextField();
        e48 = new javax.swing.JLabel();
        e49 = new javax.swing.JLabel();
        r7 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        e50 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        r8 = new javax.swing.JTextField();
        e51 = new javax.swing.JLabel();
        mostrar1 = new javax.swing.JButton();
        revisar1 = new javax.swing.JButton();
        siguiente3 = new javax.swing.JButton();
        aviso1 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        e14.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e14.setForeground(new java.awt.Color(255, 153, 0));
        e14.setText("3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SegundoJ.setBackground(new java.awt.Color(255, 204, 204));
        SegundoJ.setForeground(new java.awt.Color(0, 51, 153));
        SegundoJ.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        sumar.setBackground(new java.awt.Color(180, 255, 180));

        sumaresta.setBackground(new java.awt.Color(204, 255, 204));
        sumaresta.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        sumaresta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e2.png"))); // NOI18N
        sumaresta.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 160, 130));

        e3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e3.setForeground(new java.awt.Color(204, 102, 0));
        e3.setText("Vamos aprender a Sumar y Restar");
        sumaresta.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        e2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e2.setForeground(new java.awt.Color(153, 0, 0));
        e2.setText("+");
        sumaresta.add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, 50));

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
        sumaresta.add(siguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1130, 120, 40));

        e4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e4.setForeground(new java.awt.Color(0, 0, 255));
        e4.setText("Es juntar dos cantidades de algo.");
        sumaresta.add(e4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        e5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e5.setForeground(new java.awt.Color(153, 0, 204));
        e5.setText("Por ejemplo:");
        sumaresta.add(e5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        e6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e6.setForeground(new java.awt.Color(153, 0, 204));
        e6.setText("En casa quedaban 2 manzanas, pero mi");
        sumaresta.add(e6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        e7.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e7.setForeground(new java.awt.Color(153, 0, 204));
        e7.setText("mama compro 2 mas, ¿Cuantas tengo en");
        sumaresta.add(e7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        sumaresta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        sumaresta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        e8.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e8.setForeground(new java.awt.Color(153, 0, 204));
        e8.setText("total?");
        sumaresta.add(e8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        sumaresta.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        sumaresta.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        e9.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e9.setForeground(new java.awt.Color(255, 153, 0));
        e9.setText("3");
        e9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 5));
        sumaresta.add(e9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 1020, -1, 50));

        e10.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e10.setForeground(new java.awt.Color(153, 0, 0));
        e10.setText("=");
        sumaresta.add(e10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, 50));

        e11.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e11.setForeground(new java.awt.Color(0, 102, 0));
        e11.setText("4");
        sumaresta.add(e11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, 50));

        e12.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e12.setForeground(new java.awt.Color(255, 153, 0));
        e12.setText("1");
        sumaresta.add(e12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, 50));

        e13.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e13.setForeground(new java.awt.Color(255, 153, 0));
        e13.setText("2");
        sumaresta.add(e13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, -1, 50));

        e15.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e15.setForeground(new java.awt.Color(102, 255, 204));
        e15.setText("----------------------");
        sumaresta.add(e15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 590, -1, 50));

        e16.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e16.setForeground(new java.awt.Color(0, 51, 255));
        e16.setText("Es quitarle a una cantidades otra.");
        sumaresta.add(e16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 730, -1, -1));

        e17.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e17.setForeground(new java.awt.Color(153, 0, 255));
        e17.setText("Por ejemplo:");
        sumaresta.add(e17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 780, -1, -1));

        e18.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e18.setForeground(new java.awt.Color(153, 0, 255));
        e18.setText("En casa tenia 4 manzanas pero yo me");
        sumaresta.add(e18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 830, -1, -1));

        e19.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e19.setForeground(new java.awt.Color(153, 0, 255));
        e19.setText("comí 1, ¿Cuantas tengo en ahora?");
        sumaresta.add(e19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 860, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        sumaresta.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 950, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        sumaresta.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 950, -1, -1));

        e21.setFont(new java.awt.Font("Comic Sans MS", 1, 70)); // NOI18N
        e21.setForeground(new java.awt.Color(255, 255, 0));
        e21.setText("X");
        sumaresta.add(e21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 940, 70, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        sumaresta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 950, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        sumaresta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 950, -1, -1));

        e22.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e22.setForeground(new java.awt.Color(153, 0, 0));
        e22.setText("=");
        sumaresta.add(e22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 960, -1, 50));

        e23.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e23.setForeground(new java.awt.Color(0, 102, 0));
        e23.setText("3");
        sumaresta.add(e23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 960, -1, 50));

        e24.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e24.setForeground(new java.awt.Color(255, 255, 0));
        e24.setText("X");
        sumaresta.add(e24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 1000, 70, 100));

        e25.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e25.setForeground(new java.awt.Color(255, 153, 0));
        e25.setText("4");
        sumaresta.add(e25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 1020, -1, 50));

        e26.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e26.setForeground(new java.awt.Color(255, 153, 0));
        e26.setText("2");
        sumaresta.add(e26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1020, -1, 50));

        e27.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e27.setForeground(new java.awt.Color(255, 153, 0));
        e27.setText("1");
        sumaresta.add(e27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1020, -1, 50));

        e28.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e28.setForeground(new java.awt.Color(255, 153, 0));
        e28.setText("3");
        sumaresta.add(e28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, -1, 50));

        e29.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e29.setForeground(new java.awt.Color(255, 153, 0));
        e29.setText("Sumar");
        sumaresta.add(e29, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, 50));

        e30.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e30.setForeground(new java.awt.Color(255, 153, 0));
        e30.setText("Restar");
        sumaresta.add(e30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 650, -1, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        sumaresta.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 950, -1, -1));

        e32.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e32.setForeground(new java.awt.Color(153, 0, 0));
        e32.setText("-");
        sumaresta.add(e32, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 960, -1, 50));

        e20.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        e20.setForeground(new java.awt.Color(255, 153, 0));
        e20.setText("4");
        e20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 5));
        sumaresta.add(e20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, -1, 50));

        sumar.setViewportView(sumaresta);

        SegundoJ.addTab("Sumar y Restar", sumar);

        ej1.setBackground(new java.awt.Color(180, 255, 180));

        Ej1.setBackground(new java.awt.Color(255, 204, 204));
        Ej1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Ej1.setPreferredSize(new java.awt.Dimension(475, 1120));
        Ej1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        Ej1.add(e31, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 150, 130));

        e33.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e33.setForeground(new java.awt.Color(204, 102, 0));
        e33.setText("Resuelve las siguientes SUMAS");
        Ej1.add(e33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

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
        Ej1.add(siguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1080, 120, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        Ej1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        Ej1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        e35.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e35.setForeground(new java.awt.Color(153, 0, 0));
        e35.setText("+");
        Ej1.add(e35, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, 50));

        r1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r1.setForeground(new java.awt.Color(0, 0, 153));
        r1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        Ej1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 90, 90));

        e37.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e37.setForeground(new java.awt.Color(153, 0, 0));
        e37.setText("=");
        Ej1.add(e37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pastel.png"))); // NOI18N
        Ej1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        e36.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e36.setForeground(new java.awt.Color(153, 0, 0));
        e36.setText("+");
        Ej1.add(e36, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, 50));

        e38.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e38.setForeground(new java.awt.Color(153, 0, 0));
        e38.setText("=");
        Ej1.add(e38, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, 50));

        r2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r2.setForeground(new java.awt.Color(0, 0, 153));
        r2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        Ej1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 90, 90));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pastel.png"))); // NOI18N
        Ej1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pastel.png"))); // NOI18N
        Ej1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

        e39.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e39.setForeground(new java.awt.Color(153, 0, 0));
        e39.setText("+");
        Ej1.add(e39, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, -1, 50));

        e40.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e40.setForeground(new java.awt.Color(153, 0, 0));
        e40.setText("=");
        Ej1.add(e40, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, -1, 50));

        r3.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r3.setForeground(new java.awt.Color(0, 0, 153));
        r3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        Ej1.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 90, 90));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 760, -1, -1));

        e41.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e41.setForeground(new java.awt.Color(153, 0, 0));
        e41.setText("+");
        Ej1.add(e41, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 820, -1, 50));

        e42.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e42.setForeground(new java.awt.Color(153, 0, 0));
        e42.setText("=");
        Ej1.add(e42, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 820, -1, 50));

        r4.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r4.setForeground(new java.awt.Color(0, 0, 153));
        r4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        Ej1.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 800, 90, 90));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 820, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 840, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 820, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 800, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 740, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 760, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 780, -1, -1));

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
        Ej1.add(revisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1010, 120, 40));

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
        Ej1.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1010, 190, 40));

        aviso.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        aviso.setForeground(new java.awt.Color(0, 0, 153));
        Ej1.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 960, 320, 30));

        ej1.setViewportView(Ej1);

        SegundoJ.addTab("Ej.- 1", ej1);

        ej2.setBackground(new java.awt.Color(180, 255, 180));

        Ej2.setBackground(new java.awt.Color(255, 204, 204));
        Ej2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Ej2.setPreferredSize(new java.awt.Dimension(453, 1130));
        Ej2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        e34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        Ej2.add(e34, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 150, 130));

        e43.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e43.setForeground(new java.awt.Color(204, 102, 0));
        e43.setText("Resuelve las siguientes RESTAS");
        Ej2.add(e43, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        Ej2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        e44.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e44.setForeground(new java.awt.Color(153, 0, 0));
        e44.setText("-");
        Ej2.add(e44, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, 50));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        Ej2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        e45.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e45.setForeground(new java.awt.Color(153, 0, 0));
        e45.setText("=");
        Ej2.add(e45, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, 50));

        r5.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r5.setForeground(new java.awt.Color(0, 0, 153));
        r5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        Ej2.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 90, 90));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pastel.png"))); // NOI18N
        Ej2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        e46.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e46.setForeground(new java.awt.Color(153, 0, 0));
        e46.setText("-");
        Ej2.add(e46, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, 50));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pastel.png"))); // NOI18N
        Ej2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        e47.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e47.setForeground(new java.awt.Color(153, 0, 0));
        e47.setText("=");
        Ej2.add(e47, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, 50));

        r6.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r6.setForeground(new java.awt.Color(0, 0, 153));
        r6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        Ej2.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 90, 90));

        e48.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e48.setForeground(new java.awt.Color(153, 0, 0));
        e48.setText("-");
        Ej2.add(e48, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, -1, 50));

        e49.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e49.setForeground(new java.awt.Color(153, 0, 0));
        e49.setText("=");
        Ej2.add(e49, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, -1, 50));

        r7.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r7.setForeground(new java.awt.Color(0, 0, 153));
        r7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        Ej2.add(r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 90, 90));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 740, -1, -1));

        e50.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e50.setForeground(new java.awt.Color(153, 0, 0));
        e50.setText("-");
        Ej2.add(e50, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 790, -1, 50));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 790, -1, -1));

        r8.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        r8.setForeground(new java.awt.Color(0, 0, 153));
        r8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        Ej2.add(r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 770, 90, 90));

        e51.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        e51.setForeground(new java.awt.Color(153, 0, 0));
        e51.setText("=");
        Ej2.add(e51, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 790, -1, 50));

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
        Ej2.add(mostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 980, 190, 40));

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
        Ej2.add(revisar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 980, 120, 40));

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
        Ej2.add(siguiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1080, 120, 40));

        aviso1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        aviso1.setForeground(new java.awt.Color(0, 0, 153));
        Ej2.add(aviso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 920, 320, 30));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        Ej2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        Ej2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        Ej2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manzana.png"))); // NOI18N
        Ej2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 600, -1, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, -1, -1));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 500, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, -1, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piña.png"))); // NOI18N
        Ej2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 810, 100, -1));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 790, 100, -1));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 100, -1));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 100, -1));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, 100, -1));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dulce.png"))); // NOI18N
        Ej2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 750, 100, -1));

        ej2.setViewportView(Ej2);

        SegundoJ.addTab("Ej.- 2", ej2);

        jPanel2.add(SegundoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 460));

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
        jLabel36.setText("Segundo Grado");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

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
        SegundoJ.setEnabledAt(1, true);
    }//GEN-LAST:event_siguiente1ActionPerformed

    private void siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente2ActionPerformed
        SegundoJ.setEnabledAt(2, true);
    }//GEN-LAST:event_siguiente2ActionPerformed

    private void revisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revisarActionPerformed
        if(r1.getText().equals("")||r2.getText().equals("")||r3.getText().equals("")||r4.getText().equals("")){
            aviso.setText("Te faltan respuestas :(");
        }else{

            if((r1.getText().equals("2")||r1.getText().equals("dos"))&&
                (r2.getText().equals("3")||r2.getText().equals("tres"))&&
                (r3.getText().equals("8")||r3.getText().equals("ocho"))&&
                (r4.getText().equals("12")||r4.getText().equals("doce"))){
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
        r2.setText("3");
        r3.setText("8");
        r4.setText("12");

        siguiente2.setVisible(true);
    }//GEN-LAST:event_mostrarActionPerformed

    private void mostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar1ActionPerformed
        r5.setText("2");
        r6.setText("0");
        r7.setText("3");
        r8.setText("4");

        siguiente3.setVisible(true);
    }//GEN-LAST:event_mostrar1ActionPerformed

    private void revisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revisar1ActionPerformed
        if(r5.getText().equals("")||r6.getText().equals("")||r7.getText().equals("")||r8.getText().equals("")){
            aviso1.setText("Te faltan respuestas :(");
        }else{

            if((r5.getText().equals("2")||r5.getText().equals("dos"))&&
                (r6.getText().equals("0")||r6.getText().equals("cero"))&&
                (r7.getText().equals("3")||r7.getText().equals("tres"))&&
                (r8.getText().equals("4")||r8.getText().equals("cuatro"))){
                aviso1.setText("Muy bien, eres muy inteligente :D");
                siguiente3.setVisible(true);
            }else{
                aviso1.setText("Uy revisa tus respuestas de nuevo :)");
                mostrar1.setVisible(true);
            }
        }
    }//GEN-LAST:event_revisar1ActionPerformed

    private void siguiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente3ActionPerformed
        
        terminado2 = true;
        datos d = new datos();
        d.setVisible(false);
        if(Integer.parseInt(d.em)<=8){
            d.em=("8");
        }
        menu m = new menu();
        
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_siguiente3ActionPerformed

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
            java.util.logging.Logger.getLogger(segundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(segundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(segundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(segundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new segundo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ej1;
    private javax.swing.JPanel Ej2;
    private javax.swing.JTabbedPane SegundoJ;
    private javax.swing.JLabel aviso;
    private javax.swing.JLabel aviso1;
    private javax.swing.JLabel e;
    private javax.swing.JLabel e10;
    private javax.swing.JLabel e11;
    private javax.swing.JLabel e12;
    private javax.swing.JLabel e13;
    private javax.swing.JLabel e14;
    private javax.swing.JLabel e15;
    private javax.swing.JLabel e16;
    private javax.swing.JLabel e17;
    private javax.swing.JLabel e18;
    private javax.swing.JLabel e19;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e20;
    private javax.swing.JLabel e21;
    private javax.swing.JLabel e22;
    private javax.swing.JLabel e23;
    private javax.swing.JLabel e24;
    private javax.swing.JLabel e25;
    private javax.swing.JLabel e26;
    private javax.swing.JLabel e27;
    private javax.swing.JLabel e28;
    private javax.swing.JLabel e29;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e30;
    private javax.swing.JLabel e31;
    private javax.swing.JLabel e32;
    private javax.swing.JLabel e33;
    private javax.swing.JLabel e34;
    private javax.swing.JLabel e35;
    private javax.swing.JLabel e36;
    private javax.swing.JLabel e37;
    private javax.swing.JLabel e38;
    private javax.swing.JLabel e39;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel e40;
    private javax.swing.JLabel e41;
    private javax.swing.JLabel e42;
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
    private javax.swing.JLabel e6;
    private javax.swing.JLabel e7;
    private javax.swing.JLabel e8;
    private javax.swing.JLabel e9;
    private javax.swing.JScrollPane ej1;
    private javax.swing.JScrollPane ej2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton mostrar1;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r2;
    private javax.swing.JTextField r3;
    private javax.swing.JTextField r4;
    private javax.swing.JTextField r5;
    private javax.swing.JTextField r6;
    private javax.swing.JTextField r7;
    private javax.swing.JTextField r8;
    private javax.swing.JButton revisar;
    private javax.swing.JButton revisar1;
    private javax.swing.JButton salir;
    private javax.swing.JButton siguiente1;
    private javax.swing.JButton siguiente2;
    private javax.swing.JButton siguiente3;
    private javax.swing.JScrollPane sumar;
    private javax.swing.JPanel sumaresta;
    // End of variables declaration//GEN-END:variables
}
