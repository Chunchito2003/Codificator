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
import javax.swing.SwingUtilities;

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
                    SwingUtilities.invokeLater(() -> opTxt1.requestFocusInWindow());
                    break;
                case 2:
                    c.show(container, "codAvanzado_card");
                    SwingUtilities.invokeLater(() -> opTxt3.requestFocusInWindow());
                    break;
                case 3:
                    c.show(container, "decoSimple_card");
                    SwingUtilities.invokeLater(() -> opTxt2.requestFocusInWindow());
                    break;
                case 4:
                    c.show(container, "decoAvanzado_card");
                    SwingUtilities.invokeLater(() -> opTxt5.requestFocusInWindow());
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
        opTxt1.addActionListener(e -> {
            texto = opTxt1.getText();
            if (texto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un texto válido");
            } else {
                texto = codificador.codificar(texto);
                jTextArea3.setText(texto);
            }
        });
        opTxt3.addActionListener(e -> {
            SwingUtilities.invokeLater(() -> opTxt4.requestFocusInWindow());
        });
        opTxt4.addActionListener(e -> {
            texto = opTxt3.getText();
            clave = opTxt4.getText();
            if (texto.isEmpty() || clave.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un texto y una clave válidos");
            } else {
                texto = vigenere.codificar(texto, clave);
                jTextArea4.setText(texto);
            }
        });
        opTxt2.addActionListener(e -> {
            texto = opTxt2.getText();
            if (texto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un texto válido");
            } else {
                texto = codificador.decodificar(texto);
                jTextArea1.setText(texto);
            }
        });
        opTxt5.addActionListener(e -> {
            SwingUtilities.invokeLater(() -> opTxt6.requestFocusInWindow());
        });
        opTxt6.addActionListener(e -> {
            texto = opTxt5.getText();
            clave = opTxt6.getText();
            if (texto.isEmpty() || clave.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un texto y una clave válidos");
            } else {
                texto = vigenere.decodificar(texto, clave);
                jTextArea2.setText(texto);
            }
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
        btn_info1 = new javax.swing.JLabel();
        btn_info2 = new javax.swing.JLabel();
        btn_info3 = new javax.swing.JLabel();
        btn_info4 = new javax.swing.JLabel();
        info_codSimple = new javax.swing.JPanel();
        tittle5 = new javax.swing.JLabel();
        op16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        info_codAvanzado = new javax.swing.JPanel();
        tittle6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        op18 = new javax.swing.JLabel();
        info_decoSimple = new javax.swing.JPanel();
        tittle8 = new javax.swing.JLabel();
        op17 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        info_decoAvanzado = new javax.swing.JPanel();
        tittle7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        op19 = new javax.swing.JLabel();
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
        tittle.setText("Menú Principal");

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

        btn_info1.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        btn_info1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_info1.setText("i");
        btn_info1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_info1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_info1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_info1MouseClicked(evt);
            }
        });

        btn_info2.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        btn_info2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_info2.setText("i");
        btn_info2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_info2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_info2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_info2MouseClicked(evt);
            }
        });

        btn_info3.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        btn_info3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_info3.setText("i");
        btn_info3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_info3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_info3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_info3MouseClicked(evt);
            }
        });

        btn_info4.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        btn_info4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_info4.setText("i");
        btn_info4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_info4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_info4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_info4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_opTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(in_opTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                .addComponent(line_opTxt, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(op15))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(op4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_info4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(220, 220, 220))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuLayout.createSequentialGroup()
                                .addComponent(op1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_info1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                            .addComponent(op2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_info2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(op3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_info3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(246, 246, 246))))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(op1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_info1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(op2)
                    .addComponent(btn_info2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(op3)
                    .addComponent(btn_info3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_info4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(op4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_opTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(in_opTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line_opTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        container.add(menu, "menu_card");

        info_codSimple.setBackground(new java.awt.Color(255, 255, 255));

        tittle5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tittle5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle5.setText("Codificación Simple");

        op16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        op16.setText("<html><p>La codificación con mapeo consiste en reemplazar cada letra del mensaje original por otra letra, siguiendo una tabla de mapeo o diccionario que se define antes de comenzar. Es como hacer un \"cambio de letras\" fijo. Este método es simple y rápido, pero fácil de descifrar si se descubre el patrón.</p></p><p style='margin-top:3; '><i><u>Ejemplo de mapeo:</u></i></p><ul style='margin-top:0; margin-bottom:4px;'><li><b>a</b> → <b>g</b></li><li><b>b</b> → <b>e</b></li><li><b>c</b> → <b>x</b></li><li><b>d</b> → <b>i</b></li><li><b>e</b> → <b>z</b></li></ul><p style='margin-top:0; margin-bottom:4px; '><i><u>Ejemplo de codificación:</u></i></p><p>Mensaje original: \"<b>beca</b>\"</p><p>Paso a paso:</p><ol style='margin-top:0; margin-bottom:4px; '><li>La letra \"<b>b</b>\" se reemplaza por \"<b>e</b>\"</li><li>La letra \"<b>e</b>\" se reemplaza por \"<b>z</b>\"</li><li>La letra \"<b>c</b>\" se reemplaza por \"<b>x</b>\"</li><li>La letra \"<b>a</b>\" se reemplaza por \"<b>g</b>\"</li></ol><p>Mensaje codificado:  \"<b>ezxg</b>\"</p></html> ");
        op16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        op16.setMinimumSize(new java.awt.Dimension(585, 585));
        op16.setPreferredSize(new java.awt.Dimension(585, 162));

        jLabel10.setBackground(new java.awt.Color(51, 102, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Volver");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout info_codSimpleLayout = new javax.swing.GroupLayout(info_codSimple);
        info_codSimple.setLayout(info_codSimpleLayout);
        info_codSimpleLayout.setHorizontalGroup(
            info_codSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_codSimpleLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(tittle5, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_codSimpleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(op16, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        info_codSimpleLayout.setVerticalGroup(
            info_codSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_codSimpleLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tittle5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op16, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        container.add(info_codSimple, "info_codSimple_card");

        info_codAvanzado.setBackground(new java.awt.Color(255, 255, 255));

        tittle6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tittle6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle6.setText("Codificación Avanzada");

        jLabel11.setBackground(new java.awt.Color(51, 102, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Volver");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        op18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        op18.setText("<html><p>Para la codificación avanzada utilizamos Vigenère, que usa una palabra clave (que se repite hasta que tenga la misma longitud que el mensaje) que determina cómo se va modificando cada letra del mensaje. Cada letra de la clave indica cuántos lugares se va a \"correr\" cada letra del mensaje en el alfabeto. Como la clave se repite, el cifrado varía todo el tiempo, lo que lo hace más difícil de descifrar sin la clave.</p><p style='margin-top:3; '><u><i>Ejemplo:</p></u></i><p> - Mensaje original: \"<b>casa</b>\"</p><p> - Clave: \"<b>sol</b>\"</p><p> - Alfabeto: a=0, b=1, c=2, ..., z=25</p>\n    <div style='text-align: center;'><table border='1' cellpadding='3' cellspacing='0' style='margin-top:5; '>\n    <tr><th style='padding:0, 8px;'>  Letra del mensaje </th><th style='padding:0, 8px;'>  Clave </th><th style='padding:0, 8px;'>  Operaciones </th><th style='padding:0, 8px;'> Resultado </th></tr>\n    <tr><td>c (2)</td><td>s (18)</td><td>2 + 18 = 20</td><td>u (20)</td></tr>\n    <tr><td>a (0)</td><td>o (14)</td><td>0 + 14 = 14</td><td>o (14)</td></tr>\n    <tr><td>s (18)</td><td>l (11)</td><td>18 + 11 = 29 - 26 = 3</td><td>d (3)</td></tr>\n    <tr><td>a (0)</td><td>s (18)</td><td>0 + 18 = 18</td><td>s (18)</td></tr>\n    </table></div>\n<p style='margin-top:5; '>- Mensaje codificado: \"<b>uods</b>\"</p>\n</html> ");
        op18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        op18.setMinimumSize(new java.awt.Dimension(585, 585));
        op18.setPreferredSize(new java.awt.Dimension(585, 162));

        javax.swing.GroupLayout info_codAvanzadoLayout = new javax.swing.GroupLayout(info_codAvanzado);
        info_codAvanzado.setLayout(info_codAvanzadoLayout);
        info_codAvanzadoLayout.setHorizontalGroup(
            info_codAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_codAvanzadoLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(tittle6, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
            .addGroup(info_codAvanzadoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(op18, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        info_codAvanzadoLayout.setVerticalGroup(
            info_codAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_codAvanzadoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tittle6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op18, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        container.add(info_codAvanzado, "info_codAvanzado_card");

        info_decoSimple.setBackground(new java.awt.Color(255, 255, 255));

        tittle8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tittle8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle8.setText("Decodificación Simple");

        op17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        op17.setText("<html><p>Para decodificar con mapeo, se hace el proceso inverso: se reemplaza cada letra del mensaje codificado por la letra original usando la misma tabla, pero invertida.</p></p><p style='margin-top:3; '><i><u>Ejemplo de mapeo invertido:</u></i></p><ul style='margin-top:0; margin-bottom:4px;'><li><b>g</b> → <b>a</b></li><li><b>e</b> → <b>b</b></li><li><b>x</b> → <b>c</b></li><li><b>i</b> → <b>d</b></li><li><b>z</b> → <b>e</b></li></ul><p style='margin-top:0; margin-bottom:4px; '><i><u>Ejemplo de decodificación:</u></i></p><p>Mensaje codificado: \"<b>ezxg</b>\"</p><p>Paso a paso:</p><ol style='margin-top:0; margin-bottom:4px; '><li>La letra \"<b>e</b>\" se reemplaza por \"<b>b</b>\"</li><li>La letra \"<b>z</b>\" se reemplaza por \"<b>e</b>\"</li><li>La letra \"<b>x</b>\" se reemplaza por \"<b>c</b>\"</li><li>La letra \"<b>g</b>\" se reemplaza por \"<b>a</b>\"</li></ol><p>Mensaje original:  \"<b>beca</b>\"</p></html> ");
        op17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        op17.setMinimumSize(new java.awt.Dimension(585, 585));
        op17.setPreferredSize(new java.awt.Dimension(585, 162));

        jLabel17.setBackground(new java.awt.Color(51, 102, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Volver");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout info_decoSimpleLayout = new javax.swing.GroupLayout(info_decoSimple);
        info_decoSimple.setLayout(info_decoSimpleLayout);
        info_decoSimpleLayout.setHorizontalGroup(
            info_decoSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_decoSimpleLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(tittle8, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_decoSimpleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(op17, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        info_decoSimpleLayout.setVerticalGroup(
            info_decoSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_decoSimpleLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tittle8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op17, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        container.add(info_decoSimple, "info_decoSimple_card");

        info_decoAvanzado.setBackground(new java.awt.Color(255, 255, 255));

        tittle7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tittle7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle7.setText("Decodificación Avanzada");

        jLabel12.setBackground(new java.awt.Color(51, 102, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Volver");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        op19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        op19.setText("<html><p>Para recuperar el mensaje original de un texto cifrado con Vigenère, se utiliza exactamente la misma palabra clave que se empleó en la codificación. Sin embargo, en lugar de sumar el valor de la clave, se debe restar ese valor. Si el resultado es negativo, se debe sumar 26 (el total de letras del alfabeto).</p><p style='margin-top:3; '><u><i>Ejemplo:</p></u></i><p> - Mensaje codificado: \"<b>uods</b>\"</p><p> - Clave: \"<b>sol</b>\"</p><p> - Alfabeto: a=0, b=1, c=2, ..., z=25</p>\n    <div style='text-align: center;'><table border='1' cellpadding='3' cellspacing='0' style='margin-top:5; '>\n    <tr><th style='padding:0, 8px;'>  Letra del mensaje </th><th style='padding:0, 8px;'>  Clave </th><th style='padding:0, 8px;'>  Operaciones </th><th style='padding:0, 8px;'>  Resultado </th></tr>\n    <tr><td>u (20)</td><td>s (18)</td><td>20 - 18= 2</td><td>c (2)</td></tr>\n    <tr><td>o (14)</td><td>o (14)</td><td>14 - 14 = 0</td><td>a (0)</td></tr>\n    <tr><td>d (3)</td><td>l (11)</td><td>3 - 11= -8 + 26= 18</td><td>s (18)</td></tr>\n    <tr><td>s (18)</td><td>s (18)</td><td>18 - 18 = 0</td><td>a (0)</td></tr>\n    </table></div>\n<p style='margin-top:5; '>- Mensaje original: \"<b>casa</b>\"</p>\n</html> ");
        op19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        op19.setMinimumSize(new java.awt.Dimension(585, 585));
        op19.setPreferredSize(new java.awt.Dimension(585, 162));

        javax.swing.GroupLayout info_decoAvanzadoLayout = new javax.swing.GroupLayout(info_decoAvanzado);
        info_decoAvanzado.setLayout(info_decoAvanzadoLayout);
        info_decoAvanzadoLayout.setHorizontalGroup(
            info_decoAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_decoAvanzadoLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(tittle7, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
            .addGroup(info_decoAvanzadoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(op19, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        info_decoAvanzadoLayout.setVerticalGroup(
            info_decoAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_decoAvanzadoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tittle7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op19, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        container.add(info_decoAvanzado, "info_decoAvanzado_card");

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
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
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
                .addGap(0, 101, Short.MAX_VALUE))
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        container.add(codAvanzado, "codAvanzado_card");

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
                .addGap(0, 108, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        container.add(decoSimple, "decoSimple_card");

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
            .addComponent(tittle4, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        container.add(decoAvanzado, "decoAvanzado_card");

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
                    SwingUtilities.invokeLater(() -> opTxt1.requestFocusInWindow());
                    break;
                case 2:
                    c.show(container, "codAvanzado_card");
                    SwingUtilities.invokeLater(() -> opTxt3.requestFocusInWindow());
                    break;
                case 3:
                    c.show(container, "decoSimple_card");
                    SwingUtilities.invokeLater(() -> opTxt2.requestFocusInWindow());
                    break;
                case 4:
                    c.show(container, "decoAvanzado_card");
                    SwingUtilities.invokeLater(() -> opTxt5.requestFocusInWindow());
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
        SwingUtilities.invokeLater(() -> in_opTxt.requestFocusInWindow());
    }                                    

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "menu_card");
        opTxt2.setText("");
        jTextArea1.setText("");
        texto = "";
        SwingUtilities.invokeLater(() -> in_opTxt.requestFocusInWindow());
    }                                    

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "menu_card");
        opTxt1.setText("");
        jTextArea3.setText("");
        texto = "";
        SwingUtilities.invokeLater(() -> in_opTxt.requestFocusInWindow());
    }                                    

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {                                     
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "menu_card");
        opTxt3.setText("");
        opTxt4.setText("");
        jTextArea4.setText("");
        texto = "";
        clave = "";
        SwingUtilities.invokeLater(() -> in_opTxt.requestFocusInWindow());
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
    
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {                                      
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "menu_card");
        SwingUtilities.invokeLater(() -> in_opTxt.requestFocusInWindow());
    }                                     

    private void btn_info1MouseClicked(java.awt.event.MouseEvent evt) {                                       
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "info_codSimple_card");
    }                                                                        

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {                                      
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "menu_card");
        SwingUtilities.invokeLater(() -> in_opTxt.requestFocusInWindow());
    }                                     

    private void btn_info2MouseClicked(java.awt.event.MouseEvent evt) {                                       
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "info_codAvanzado_card");
    }                                      

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {                                      
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "menu_card");
        SwingUtilities.invokeLater(() -> in_opTxt.requestFocusInWindow());
    }                                     

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {                                      
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "menu_card");
        SwingUtilities.invokeLater(() -> in_opTxt.requestFocusInWindow());
    }                                     

    private void btn_info3MouseClicked(java.awt.event.MouseEvent evt) {                                       
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "info_decoSimple_card");
    }                                      

    private void btn_info4MouseClicked(java.awt.event.MouseEvent evt) {                                       
        CardLayout c = (CardLayout) container.getLayout();
        c.show(container, "info_decoAvanzado_card");
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
    private javax.swing.JLabel btn_info1;
    private javax.swing.JLabel btn_info2;
    private javax.swing.JLabel btn_info3;
    private javax.swing.JLabel btn_info4;
    private javax.swing.JLabel close;
    private javax.swing.JPanel codAvanzado;
    private javax.swing.JPanel codSimple;
    private javax.swing.JPanel container;
    private javax.swing.JPanel decoAvanzado;
    private javax.swing.JPanel decoSimple;
    private javax.swing.JTextField in_opTxt;
    private javax.swing.JPanel info_codAvanzado;
    private javax.swing.JPanel info_codSimple;
    private javax.swing.JPanel info_decoAvanzado;
    private javax.swing.JPanel info_decoSimple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel op16;
    private javax.swing.JLabel op17;
    private javax.swing.JLabel op18;
    private javax.swing.JLabel op19;
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
    private javax.swing.JLabel tittle5;
    private javax.swing.JLabel tittle6;
    private javax.swing.JLabel tittle7;
    private javax.swing.JLabel tittle8;
    Diccionario diccionario = new Diccionario();
    Codificador codificador = new Codificador(diccionario);
    Vignere vigenere = new Vignere();
    String texto;
    String clave;
}