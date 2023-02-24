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
public class primero extends javax.swing.JFrame {

    /**
     * Creates new form primero
     */
    public primero() {
        initComponents();
        
        PrimeroJ.setEnabledAt(1, false);
        PrimeroJ.setEnabledAt(2, false);
        mostrar.setVisible(false);
        siguiente3.setVisible(false);
    }
    public static boolean terminado1 = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PrimeroJ = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        abecedario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        siguiente1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        vocales = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        Siguiente2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ej1 = new javax.swing.JPanel();
        revisar = new javax.swing.JButton();
        c4 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        r1 = new javax.swing.JTextField();
        r2 = new javax.swing.JTextField();
        r3 = new javax.swing.JTextField();
        r4 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        c6 = new javax.swing.JTextField();
        c7 = new javax.swing.JTextField();
        c8 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        e5 = new javax.swing.JLabel();
        aviso = new javax.swing.JLabel();
        e7 = new javax.swing.JLabel();
        siguiente3 = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        r5 = new javax.swing.JTextField();
        r6 = new javax.swing.JTextField();
        r7 = new javax.swing.JTextField();
        r8 = new javax.swing.JTextField();
        e8 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrimeroJ.setBackground(new java.awt.Color(243, 243, 105));
        PrimeroJ.setForeground(new java.awt.Color(0, 51, 153));
        PrimeroJ.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jScrollPane3.setBackground(new java.awt.Color(180, 255, 180));

        abecedario.setBackground(new java.awt.Color(255, 204, 204));
        abecedario.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        abecedario.setPreferredSize(new java.awt.Dimension(453, 1279));
        abecedario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.png"))); // NOI18N
        abecedario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 148, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/a.png"))); // NOI18N
        abecedario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 148, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/c.png"))); // NOI18N
        abecedario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 148, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/d.jpg"))); // NOI18N
        abecedario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 269, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e.jpg"))); // NOI18N
        abecedario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 269, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/f.jpg"))); // NOI18N
        abecedario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 269, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/g.jpg"))); // NOI18N
        abecedario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 388, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/h.jpg"))); // NOI18N
        abecedario.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i.jpg"))); // NOI18N
        abecedario.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 388, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/j.jpg"))); // NOI18N
        abecedario.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 509, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/k.jpg"))); // NOI18N
        abecedario.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 509, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/l.jpg"))); // NOI18N
        abecedario.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 509, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/m.jpg"))); // NOI18N
        abecedario.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 629, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.jpg"))); // NOI18N
        abecedario.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 747, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/r.jpg"))); // NOI18N
        abecedario.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 863, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/u.jpg"))); // NOI18N
        abecedario.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 981, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/v.jpg"))); // NOI18N
        abecedario.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 981, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/s.jpg"))); // NOI18N
        abecedario.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 863, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/p.jpg"))); // NOI18N
        abecedario.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 747, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n.jpg"))); // NOI18N
        abecedario.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 629, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ñ.jpg"))); // NOI18N
        abecedario.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 629, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q.jpg"))); // NOI18N
        abecedario.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 747, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/t.jpg"))); // NOI18N
        abecedario.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 863, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/w.jpg"))); // NOI18N
        abecedario.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 981, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.jpg"))); // NOI18N
        abecedario.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 1094, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/y.jpg"))); // NOI18N
        abecedario.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 1094, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/z.jpg"))); // NOI18N
        abecedario.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 1094, -1, -1));

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e2.png"))); // NOI18N
        abecedario.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 130));

        e2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e2.setForeground(new java.awt.Color(204, 102, 0));
        e2.setText("¿puedes cantarlo?");
        abecedario.add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        e3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e3.setForeground(new java.awt.Color(204, 102, 0));
        e3.setText("Este es el abecedario!!!");
        abecedario.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

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
        abecedario.add(siguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1210, 120, 40));

        jScrollPane3.setViewportView(abecedario);

        PrimeroJ.addTab("El abecedario", jScrollPane3);

        jScrollPane2.setBackground(new java.awt.Color(180, 255, 180));

        vocales.setBackground(new java.awt.Color(204, 255, 204));
        vocales.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        vocales.setPreferredSize(new java.awt.Dimension(580, 567));
        vocales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/a.png"))); // NOI18N
        vocales.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 148, -1, -1));

        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e2.png"))); // NOI18N
        vocales.add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 130));

        e4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e4.setForeground(new java.awt.Color(204, 102, 0));
        e4.setText("Estas se llaman vocales");
        vocales.add(e4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e.jpg"))); // NOI18N
        vocales.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/u.jpg"))); // NOI18N
        vocales.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i.jpg"))); // NOI18N
        vocales.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.jpg"))); // NOI18N
        vocales.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        Siguiente2.setBackground(new java.awt.Color(255, 255, 0));
        Siguiente2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Siguiente2.setForeground(new java.awt.Color(204, 102, 0));
        Siguiente2.setText("Siguiente");
        Siguiente2.setToolTipText("");
        Siguiente2.setBorder(null);
        Siguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Siguiente2ActionPerformed(evt);
            }
        });
        vocales.add(Siguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 120, 40));

        jScrollPane2.setViewportView(vocales);

        PrimeroJ.addTab("Las vocales", jScrollPane2);

        jScrollPane4.setBackground(new java.awt.Color(180, 255, 180));

        ej1.setBackground(new java.awt.Color(255, 204, 204));
        ej1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ej1.setPreferredSize(new java.awt.Dimension(453, 670));
        ej1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        ej1.add(revisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 120, 40));

        c4.setEditable(false);
        c4.setBackground(new java.awt.Color(255, 204, 204));
        c4.setBorder(null);
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        ej1.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 70, 50));

        c1.setEditable(false);
        c1.setBackground(new java.awt.Color(255, 204, 204));
        c1.setBorder(null);
        ej1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, 50));

        c2.setEditable(false);
        c2.setBackground(new java.awt.Color(255, 204, 204));
        c2.setBorder(null);
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        ej1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 70, 50));

        c3.setEditable(false);
        c3.setBackground(new java.awt.Color(255, 204, 204));
        c3.setBorder(null);
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        ej1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 70, 50));

        r1.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        r1.setForeground(new java.awt.Color(0, 0, 153));
        ej1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 70, 30));

        r2.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        r2.setForeground(new java.awt.Color(0, 0, 153));
        ej1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 70, 30));

        r3.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        r3.setForeground(new java.awt.Color(0, 0, 153));
        ej1.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 70, 30));

        r4.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        r4.setForeground(new java.awt.Color(0, 0, 153));
        ej1.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 70, 30));

        c5.setEditable(false);
        c5.setBackground(new java.awt.Color(255, 204, 204));
        c5.setBorder(null);
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });
        ej1.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 70, 50));

        c6.setEditable(false);
        c6.setBackground(new java.awt.Color(255, 204, 204));
        c6.setBorder(null);
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });
        ej1.add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 70, 50));

        c7.setEditable(false);
        c7.setBackground(new java.awt.Color(255, 204, 204));
        c7.setBorder(null);
        c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7ActionPerformed(evt);
            }
        });
        ej1.add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 70, 50));

        c8.setEditable(false);
        c8.setBackground(new java.awt.Color(255, 204, 204));
        c8.setBorder(null);
        ej1.add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 70, 50));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/u.jpg"))); // NOI18N
        ej1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 50, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/s.jpg"))); // NOI18N
        ej1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 50, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/g.jpg"))); // NOI18N
        ej1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 40, 90));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/a.png"))); // NOI18N
        ej1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 40, -1));

        e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/e1.png"))); // NOI18N
        ej1.add(e5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 150, 130));

        aviso.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        aviso.setForeground(new java.awt.Color(0, 0, 153));
        ej1.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 320, 30));

        e7.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e7.setForeground(new java.awt.Color(204, 102, 0));
        e7.setText("Pon la letra con la que empieza");
        ej1.add(e7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

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
        ej1.add(siguiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 120, 40));

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
        ej1.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 190, 40));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/y.jpg"))); // NOI18N
        ej1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 50, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.jpg"))); // NOI18N
        ej1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 50, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/m.jpg"))); // NOI18N
        ej1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 50, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q.jpg"))); // NOI18N
        ej1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 50, -1));

        r5.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        r5.setForeground(new java.awt.Color(0, 0, 153));
        ej1.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 70, 30));

        r6.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        r6.setForeground(new java.awt.Color(0, 0, 153));
        ej1.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 70, 30));

        r7.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        r7.setForeground(new java.awt.Color(0, 0, 153));
        ej1.add(r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 70, 30));

        r8.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        r8.setForeground(new java.awt.Color(0, 0, 153));
        ej1.add(r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 70, 30));

        e8.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e8.setForeground(new java.awt.Color(204, 102, 0));
        e8.setText("cada imagen.");
        ej1.add(e8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jScrollPane4.setViewportView(ej1);

        PrimeroJ.addTab("Ej.- 1", jScrollPane4);

        jPanel2.add(PrimeroJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 460));

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
        jLabel36.setText("Primer Grado");
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
        PrimeroJ.setEnabledAt(1, true);
    }//GEN-LAST:event_siguiente1ActionPerformed

    private void Siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Siguiente2ActionPerformed
        PrimeroJ.setEnabledAt(2, true);
    }//GEN-LAST:event_Siguiente2ActionPerformed

    private void revisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revisarActionPerformed
        if(r1.getText().equals("")||r2.getText().equals("")||r3.getText().equals("")||r4.getText().equals("")||
          r8.getText().equals("")||r5.getText().equals("")||r6.getText().equals("")||r7.getText().equals("")){
            aviso.setText("Te faltan respuestas :(");
        }else{
        
        if((r1.getText().equals("a")||r1.getText().equals("A"))&&
            (r2.getText().equals("g")||r2.getText().equals("G"))&&
             (r3.getText().equals("u")||r3.getText().equals("U"))&&
              (r4.getText().equals("m")||r4.getText().equals("M"))&&
               (r5.getText().equals("y")||r5.getText().equals("Y"))&&
                (r6.getText().equals("o")||r6.getText().equals("O"))&&
                 (r7.getText().equals("q")||r7.getText().equals("Q"))&&
                  (r8.getText().equals("s")||r8.getText().equals("S"))){
                        aviso.setText("Muy bien, eres muy inteligente :D");
                        siguiente3.setVisible(true);
                    }else{
                        aviso.setText("Uy revisa tus respuestas de nuevo :)");
                        mostrar.setVisible(true);
                          }
        }
                                
        
        
    }//GEN-LAST:event_revisarActionPerformed

    private void siguiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente3ActionPerformed

        terminado1 = true;
        datos d = new datos();
        d.setVisible(false);
        if(Integer.parseInt(d.em)<=7){
            d.em=("7");
        }
        menu m = new menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_siguiente3ActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        r1.setText("a");
        r2.setText("g");
        r3.setText("u");
        r4.setText("m");
        r5.setText("y");
        r6.setText("o");
        r7.setText("q");
        r8.setText("s");
        
        siguiente3.setVisible(true);        
    }//GEN-LAST:event_mostrarActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c4ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c5ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c6ActionPerformed

    private void c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c7ActionPerformed

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
            java.util.logging.Logger.getLogger(primero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(primero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(primero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(primero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new primero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PrimeroJ;
    private javax.swing.JButton Siguiente2;
    private javax.swing.JPanel abecedario;
    private javax.swing.JLabel aviso;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField c6;
    private javax.swing.JTextField c7;
    private javax.swing.JTextField c8;
    private javax.swing.JLabel e;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel e5;
    private javax.swing.JLabel e7;
    private javax.swing.JLabel e8;
    private javax.swing.JPanel ej1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r2;
    private javax.swing.JTextField r3;
    private javax.swing.JTextField r4;
    private javax.swing.JTextField r5;
    private javax.swing.JTextField r6;
    private javax.swing.JTextField r7;
    private javax.swing.JTextField r8;
    private javax.swing.JButton revisar;
    private javax.swing.JButton salir;
    private javax.swing.JButton siguiente1;
    public javax.swing.JButton siguiente3;
    private javax.swing.JPanel vocales;
    // End of variables declaration//GEN-END:variables
}
