package resources;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Front extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    public static Color principalColor = new Color(51,102,255);
    
    public Front() {
        initComponents();
        setImageLabel(minimize, "img/minimize.png", 40, 28);
        setImageLabel(logo, "img/logoCodificador.png", 210, 210);
        setImageLabel(logo1, "img/logoCodificador.png", 130, 130);
        setImageLabel(logo2, "img/logoCodificador.png", 130, 130);
        setImageLabel(logo3, "img/logoCodificador.png", 130, 130);
        setImageLabel(logo4, "img/logoCodificador.png", 130, 130);

        in_opTxt.addActionListener(e -> {
            try {
            int op = Integer.parseInt(in_opTxt.getText());
            in_opTxt.setText("");
            CardLayout c = (CardLayout) container.getLayout();
            switch (op) {
                case 1:
                    c.show(container, "codSimple_card");
                    break;
                case 2:
                    c.show(container, "codAvanzado_card");
                    break;
                case 3:
                    c.show(container, "decoSimple_card");
                    break;
                case 4:
                    c.show(container, "decoAvanzado_card");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error: Opción Inválida");
                    break;
            }
        } catch (NumberFormatException e2) {
            in_opTxt.setText("");
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
        }
            System.out.println("");
        });
    }

    //@SuppressWarnings("unchecked")
    private void initComponents() {
        Ventana = new javax.swing.JPanel();
        btnBar = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        op1 = new javax.swing.JLabel();
        op2 = new javax.swing.JLabel();
        op3 = new javax.swing.JLabel();
        op4 = new javax.swing.JLabel();
        lb_opTxt = new javax.swing.JLabel();
        in_opTxt = new javax.swing.JTextField();
        line_opTxt = new javax.swing.JSeparator();
        op15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        decoAvanzado = new javax.swing.JPanel();
        tittle4 = new javax.swing.JLabel();
        op12 = new javax.swing.JLabel();
        opTxt5 = new javax.swing.JTextField();
        logo4 = new javax.swing.JLabel();
        line_opTxt5 = new javax.swing.JSeparator();
        op13 = new javax.swing.JLabel();
        op14 = new javax.swing.JLabel();
        opTxt6 = new javax.swing.JTextField();
        line_opTxt6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        decoSimple = new javax.swing.JPanel();
        tittle2 = new javax.swing.JLabel();
        op7 = new javax.swing.JLabel();
        opTxt2 = new javax.swing.JTextField();
        logo2 = new javax.swing.JLabel();
        line_opTxt2 = new javax.swing.JSeparator();
        op8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        codSimple = new javax.swing.JPanel();
        tittle1 = new javax.swing.JLabel();
        op5 = new javax.swing.JLabel();
        opTxt1 = new javax.swing.JTextField();
        logo1 = new javax.swing.JLabel();
        line_opTxt1 = new javax.swing.JSeparator();
        op6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        codAvanzado = new javax.swing.JPanel();
        tittle3 = new javax.swing.JLabel();
        op9 = new javax.swing.JLabel();
        opTxt3 = new javax.swing.JTextField();
        logo3 = new javax.swing.JLabel();
        line_opTxt3 = new javax.swing.JSeparator();
        op10 = new javax.swing.JLabel();
        op11 = new javax.swing.JLabel();
        opTxt4 = new javax.swing.JTextField();
        line_opTxt4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Codificador");
        setLocation(new java.awt.Point(450, 50));
        setUndecorated(true);
        setResizable(false);

        Ventana.setBackground(new java.awt.Color(255, 255, 255));
        Ventana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Ventana.setPreferredSize(new java.awt.Dimension(650, 700));

        btnBar.setBackground(new java.awt.Color(51, 102, 255));
        btnBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnBarMouseDragged(evt);
            }
        });
        btnBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBarMousePressed(evt);
            }
        });

        minimize.setBackground(new java.awt.Color(51, 102, 255));
        minimize.setFont(new java.awt.Font("Rubik", 1, 20)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.setOpaque(true);
        minimize.setPreferredSize(new java.awt.Dimension(80, 80));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });

        close.setBackground(new java.awt.Color(51, 102, 255));
        close.setFont(new java.awt.Font("Rubik", 1, 20)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setOpaque(true);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBarLayout = new javax.swing.GroupLayout(btnBar);
        btnBar.setLayout(btnBarLayout);
        btnBarLayout.setHorizontalGroup(
            btnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBarLayout.createSequentialGroup()
                .addGap(0, 530, Short.MAX_VALUE)
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnBarLayout.setVerticalGroup(
            btnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        container.setLayout(new java.awt.CardLayout());

        menu.setBackground(new java.awt.Color(255, 255, 255));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tittle.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Menu Principal");

        op1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op1.setText("1- Codificación Simple");

        op2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op2.setText("2- Codificación Avanzada");

        op3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op3.setText("3- Decodificación Simple");

        op4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op4.setText("4- Decodificación Avanzada");

        lb_opTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_opTxt.setText("Ingrese una opción (1-5):");

        in_opTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        in_opTxt.setBorder(null);
        in_opTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        line_opTxt.setForeground(new java.awt.Color(0, 0, 0));

        op15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op15.setText("5- Salir");

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aceptar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                                    .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(165, 165, 165))
                                .addComponent(op2)
                                .addComponent(op4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_opTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                            .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(243, 243, 243)))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(op15, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(in_opTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                .addComponent(line_opTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap())))
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tittle)
                .addGap(12, 12, 12)
                .addComponent(op1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_opTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(in_opTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line_opTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        container.add(menu, "menu_card");

        decoAvanzado.setBackground(new java.awt.Color(255, 255, 255));

        tittle4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tittle4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle4.setText("Decodificación Avanzada");

        op12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op12.setText("Ingrese el texto a decodificar:");

        opTxt5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opTxt5.setBorder(null);
        opTxt5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        logo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        line_opTxt5.setForeground(new java.awt.Color(0, 0, 0));

        op13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op13.setText("Texto decodificado:");

        op14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op14.setText("Ingrese la clave:");

        opTxt6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opTxt6.setBorder(null);
        opTxt6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        line_opTxt6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(51, 102, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Volver");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(51, 102, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Aceptar");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(51, 102, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Copiar");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout decoAvanzadoLayout = new javax.swing.GroupLayout(decoAvanzado);
        decoAvanzado.setLayout(decoAvanzadoLayout);
        decoAvanzadoLayout.setHorizontalGroup(
            decoAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decoAvanzadoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(tittle4, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
            .addGroup(decoAvanzadoLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(decoAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(decoAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(op14, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(op12, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(opTxt5)
                        .addComponent(line_opTxt5)
                        .addComponent(opTxt6)
                        .addComponent(line_opTxt6)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decoAvanzadoLayout.createSequentialGroup()
                            .addComponent(op13, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        decoAvanzadoLayout.setVerticalGroup(
            decoAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decoAvanzadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(decoAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tittle4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opTxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line_opTxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opTxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line_opTxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(decoAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(op13)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        container.add(decoAvanzado, "decoAvanzado_card");

        decoSimple.setBackground(new java.awt.Color(255, 255, 255));

        tittle2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tittle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle2.setText("Decodificación Simple");

        op7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op7.setText("Ingrese el texto a decodificar:");

        opTxt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opTxt2.setBorder(null);
        opTxt2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        line_opTxt2.setForeground(new java.awt.Color(0, 0, 0));

        op8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op8.setText("Texto decodificado:");

        jLabel3.setBackground(new java.awt.Color(51, 102, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Volver");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(51, 102, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Aceptar");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel15.setBackground(new java.awt.Color(51, 102, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Copiar");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout decoSimpleLayout = new javax.swing.GroupLayout(decoSimple);
        decoSimple.setLayout(decoSimpleLayout);
        decoSimpleLayout.setHorizontalGroup(
            decoSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decoSimpleLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 103, Short.MAX_VALUE))
            .addComponent(tittle2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(decoSimpleLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(decoSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(decoSimpleLayout.createSequentialGroup()
                        .addComponent(op8, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(opTxt2)
                    .addComponent(line_opTxt2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        decoSimpleLayout.setVerticalGroup(
            decoSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decoSimpleLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(decoSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tittle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line_opTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(decoSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(op8)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        container.add(decoSimple, "decoSimple_card");

        codSimple.setBackground(new java.awt.Color(255, 255, 255));

        tittle1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tittle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle1.setText("Codificación Simple");

        op5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op5.setText("Ingrese el texto a codificar:");

        opTxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opTxt1.setBorder(null);
        opTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        line_opTxt1.setForeground(new java.awt.Color(0, 0, 0));

        op6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op6.setText("Texto codificado:");

        jLabel4.setBackground(new java.awt.Color(51, 102, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Volver");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(51, 102, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Aceptar");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(51, 102, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Copiar");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout codSimpleLayout = new javax.swing.GroupLayout(codSimple);
        codSimple.setLayout(codSimpleLayout);
        codSimpleLayout.setHorizontalGroup(
            codSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, codSimpleLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
            .addComponent(tittle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(codSimpleLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(codSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(codSimpleLayout.createSequentialGroup()
                        .addComponent(op6, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(opTxt1)
                    .addComponent(line_opTxt1)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        codSimpleLayout.setVerticalGroup(
            codSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, codSimpleLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(codSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tittle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line_opTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(codSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(op6)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        container.add(codSimple, "codSimple_card");

        codAvanzado.setBackground(new java.awt.Color(255, 255, 255));

        tittle3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tittle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle3.setText("Codificación Avanzada");

        op9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op9.setText("Ingrese el texto a codificar:");

        opTxt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opTxt3.setBorder(null);
        opTxt3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        logo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        line_opTxt3.setForeground(new java.awt.Color(0, 0, 0));

        op10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op10.setText("Texto codificado:");

        op11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        op11.setText("Ingrese la clave:");

        opTxt4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opTxt4.setBorder(null);
        opTxt4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        line_opTxt4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setBackground(new java.awt.Color(51, 102, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Volver");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(51, 102, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Aceptar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(51, 102, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Copiar");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout codAvanzadoLayout = new javax.swing.GroupLayout(codAvanzado);
        codAvanzado.setLayout(codAvanzadoLayout);
        codAvanzadoLayout.setHorizontalGroup(
            codAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, codAvanzadoLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo3, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 96, Short.MAX_VALUE))
            .addComponent(tittle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(codAvanzadoLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(codAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(codAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(op11, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(op9, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(codAvanzadoLayout.createSequentialGroup()
                            .addComponent(op10, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(opTxt3)
                        .addComponent(line_opTxt3)
                        .addComponent(opTxt4)
                        .addComponent(line_opTxt4)
                        .addComponent(jScrollPane4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        codAvanzadoLayout.setVerticalGroup(
            codAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, codAvanzadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(codAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tittle3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line_opTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line_opTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(codAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(op10)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        container.add(codAvanzado, "codAvanzado_card");

        javax.swing.GroupLayout VentanaLayout = new javax.swing.GroupLayout(Ventana);
        Ventana.setLayout(VentanaLayout);
        VentanaLayout.setHorizontalGroup(
            VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        VentanaLayout.setVerticalGroup(
            VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaLayout.createSequentialGroup()
                .addComponent(btnBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana, 702, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {                                   
        close.setBackground(new Color(255,30,60));
    }                                  

    private void closeMouseExited(java.awt.event.MouseEvent evt) {                                  
        close.setBackground(principalColor);
    }                                 

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {                                   
        System.exit(0);
    }                                  

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {                                      
        minimize.setBackground(new Color(51,120,255));
    }                                     

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {                                     
        minimize.setBackground(principalColor);
    }                                    

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {                                      
        this.setExtendedState(1);
    }                                     

    private void btnBarMousePressed(java.awt.event.MouseEvent evt) {                                    
        xMouse = evt.getX();
        yMouse = evt.getY();
    }                                   

    private void btnBarMouseDragged(java.awt.event.MouseEvent evt) {                                    
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }                                   

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        try {
            int op = Integer.parseInt(in_opTxt.getText());
            in_opTxt.setText("");
            CardLayout c = (CardLayout) container.getLayout();
            switch (op) {
                case 1:
                    c.show(container, "codSimple_card");
                    break;
                case 2:
                    c.show(container, "codAvanzado_card");
                    break;
                case 3:
                    c.show(container, "decoSimple_card");
                    break;
                case 4:
                    c.show(container, "decoAvanzado_card");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error: Opción Inválida");
                    break;
            }
        } catch (NumberFormatException e) {
            in_opTxt.setText("");
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero");
        }
        
    }                                    

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "menu_card");
        opTxt5.setText("");
        opTxt6.setText("");
        jTextArea2.setText("");
        texto = "";
        clave = "";
    }                                    

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "menu_card");
        opTxt2.setText("");
        jTextArea1.setText("");
        texto = "";
    }                                    

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "menu_card");
        opTxt1.setText("");
        jTextArea3.setText("");
        texto = "";
    }                                    

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {                                     
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "menu_card");
        opTxt3.setText("");
        opTxt4.setText("");
        jTextArea4.setText("");
        texto = "";
        clave = "";
    }                                    

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {                                    
        texto = opTxt5.getText();
        clave = opTxt6.getText();
        if (texto.isEmpty() || clave.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un texto y una clave válidos");
        } else {
            texto = vigenere.decodificar(texto, clave);
            jTextArea2.setText(texto);
        }
    }                                    

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {                                     
        texto = opTxt2.getText();
        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un texto válido");
        } else {
            texto = codificador.decodificar(texto);
            jTextArea1.setText(texto);
        }
    }                                    

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {                                     
        texto = opTxt1.getText();
        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un texto válido");
        } else {
            texto = codificador.codificar(texto);
            jTextArea3.setText(texto);
        }
    }                                    

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {                                     
        texto = opTxt3.getText();
        clave = opTxt4.getText();
        if (texto.isEmpty() || clave.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un texto y una clave válidos");
        } else {
            texto = vigenere.codificar(texto, clave);
            jTextArea4.setText(texto);
        }
    }                                    

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {                                      
        StringSelection selection = new StringSelection(texto);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, selection);
        JOptionPane.showMessageDialog(null, "Copiado al portapapeles");
    }                                     

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {                                      
        StringSelection selection = new StringSelection(texto);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, selection);
        JOptionPane.showMessageDialog(null, "Copiado al portapapeles");
    }                                     

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {                                      
        StringSelection selection = new StringSelection(texto);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, selection);
        JOptionPane.showMessageDialog(null, "Copiado al portapapeles");
    }                                     

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {                                      
        StringSelection selection = new StringSelection(texto);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, selection);
        JOptionPane.showMessageDialog(null, "Copiado al portapapeles");
    }                                     
    
    private void setImageLabel(JLabel lb, String root, int w, int h) {
        ImageIcon img = new ImageIcon(Front.class.getResource(root));
        Icon icon = new ImageIcon(img.getImage().getScaledInstance(w, h, Image.SCALE_FAST));
        lb.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Ventana;
    private javax.swing.JPanel btnBar;
    private javax.swing.JLabel close;
    private javax.swing.JPanel codAvanzado;
    private javax.swing.JPanel codSimple;
    private javax.swing.JPanel container;
    private javax.swing.JPanel decoAvanzado;
    private javax.swing.JPanel decoSimple;
    private javax.swing.JTextField in_opTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel lb_opTxt;
    private javax.swing.JSeparator line_opTxt;
    private javax.swing.JSeparator line_opTxt1;
    private javax.swing.JSeparator line_opTxt2;
    private javax.swing.JSeparator line_opTxt3;
    private javax.swing.JSeparator line_opTxt4;
    private javax.swing.JSeparator line_opTxt5;
    private javax.swing.JSeparator line_opTxt6;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logo3;
    private javax.swing.JLabel logo4;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel op1;
    private javax.swing.JLabel op10;
    private javax.swing.JLabel op11;
    private javax.swing.JLabel op12;
    private javax.swing.JLabel op13;
    private javax.swing.JLabel op14;
    private javax.swing.JLabel op15;
    private javax.swing.JLabel op2;
    private javax.swing.JLabel op3;
    private javax.swing.JLabel op4;
    private javax.swing.JLabel op5;
    private javax.swing.JLabel op6;
    private javax.swing.JLabel op7;
    private javax.swing.JLabel op8;
    private javax.swing.JLabel op9;
    private javax.swing.JTextField opTxt1;
    private javax.swing.JTextField opTxt2;
    private javax.swing.JTextField opTxt3;
    private javax.swing.JTextField opTxt4;
    private javax.swing.JTextField opTxt5;
    private javax.swing.JTextField opTxt6;
    private javax.swing.JLabel tittle;
    private javax.swing.JLabel tittle1;
    private javax.swing.JLabel tittle2;
    private javax.swing.JLabel tittle3;
    private javax.swing.JLabel tittle4;
    Diccionario diccionario = new Diccionario();
    Codificador codificador = new Codificador(diccionario);
    Vignere vigenere = new Vignere();
    String texto;
    String clave;
}