
package Ejercicio_3;

import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JOptionPane;

public class Interfaz_3 extends javax.swing.JFrame {

    public static Estructuras_DoblesC es = new Estructuras_DoblesC();
    
    public Interfaz_3() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        comandos3 = new javax.swing.JTabbedPane();
        insercion3 = new javax.swing.JPanel();
        Insertar_Inicio = new javax.swing.JLabel();
        Insertar_Final = new javax.swing.JLabel();
        Insertar_Posicion = new javax.swing.JLabel();
        eliminacion3 = new javax.swing.JPanel();
        Eliminar_Inicio = new javax.swing.JLabel();
        Eliminar_Final = new javax.swing.JLabel();
        Eliminar_Posicion = new javax.swing.JLabel();
        Eliminar_Dato = new javax.swing.JLabel();
        Eliminar_Todo = new javax.swing.JLabel();
        otros3 = new javax.swing.JPanel();
        Modificar = new javax.swing.JLabel();
        Verificar = new javax.swing.JLabel();
        Promedio = new javax.swing.JLabel();
        pp2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_3 = new javax.swing.JTable();
        total_3 = new javax.swing.JLabel();
        opciones_3 = new javax.swing.JComboBox();
        s1 = new javax.swing.JSeparator();
        txt_3 = new javax.swing.JTextField();
        cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        pp1.setBackground(new java.awt.Color(0, 0, 51));

        Titulo.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Ejercicio 3 : Listas Doblemente Circulares");
        Titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        comandos3.setBackground(new java.awt.Color(255, 255, 255));
        comandos3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comandos3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N

        insercion3.setBackground(new java.awt.Color(0, 0, 51));

        Insertar_Inicio.setBackground(new java.awt.Color(33, 63, 83));
        Insertar_Inicio.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Insertar_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Insertar_Inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insertar_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/subir_blanco.png"))); // NOI18N
        Insertar_Inicio.setText("Insertar Inicio");
        Insertar_Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Insertar_Inicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Insertar_Inicio.setIconTextGap(9);
        Insertar_Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insertar_InicioMouseClicked(evt);
            }
        });

        Insertar_Final.setBackground(new java.awt.Color(33, 63, 83));
        Insertar_Final.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Insertar_Final.setForeground(new java.awt.Color(255, 255, 255));
        Insertar_Final.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insertar_Final.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/subir_blanco.png"))); // NOI18N
        Insertar_Final.setText("Insertar Final");
        Insertar_Final.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Insertar_Final.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Insertar_Final.setIconTextGap(9);
        Insertar_Final.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insertar_FinalMouseClicked(evt);
            }
        });

        Insertar_Posicion.setBackground(new java.awt.Color(33, 63, 83));
        Insertar_Posicion.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Insertar_Posicion.setForeground(new java.awt.Color(255, 255, 255));
        Insertar_Posicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insertar_Posicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/subir_blanco.png"))); // NOI18N
        Insertar_Posicion.setText("Insertar por Posicion");
        Insertar_Posicion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Insertar_Posicion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Insertar_Posicion.setIconTextGap(9);
        Insertar_Posicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insertar_PosicionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout insercion3Layout = new javax.swing.GroupLayout(insercion3);
        insercion3.setLayout(insercion3Layout);
        insercion3Layout.setHorizontalGroup(
            insercion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insercion3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(insercion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Insertar_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(insercion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Insertar_Final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Insertar_Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        insercion3Layout.setVerticalGroup(
            insercion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insercion3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Insertar_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Insertar_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Insertar_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        comandos3.addTab("   INSERCION   ", insercion3);

        eliminacion3.setBackground(new java.awt.Color(0, 0, 51));

        Eliminar_Inicio.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Eliminar_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eliminar_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/bajar_blanco.png"))); // NOI18N
        Eliminar_Inicio.setText("Eliminar Inicio");
        Eliminar_Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar_Inicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Eliminar_Inicio.setIconTextGap(9);
        Eliminar_Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminar_InicioMouseClicked(evt);
            }
        });

        Eliminar_Final.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Eliminar_Final.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Final.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eliminar_Final.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/bajar_blanco.png"))); // NOI18N
        Eliminar_Final.setText(" Eliminar Final");
        Eliminar_Final.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar_Final.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Eliminar_Final.setIconTextGap(9);
        Eliminar_Final.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminar_FinalMouseClicked(evt);
            }
        });

        Eliminar_Posicion.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Eliminar_Posicion.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Posicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eliminar_Posicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/bajar_blanco.png"))); // NOI18N
        Eliminar_Posicion.setText("Eliminar por Posicion");
        Eliminar_Posicion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar_Posicion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Eliminar_Posicion.setIconTextGap(9);
        Eliminar_Posicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminar_PosicionMouseClicked(evt);
            }
        });

        Eliminar_Dato.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Eliminar_Dato.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Dato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eliminar_Dato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/bajar_blanco.png"))); // NOI18N
        Eliminar_Dato.setText("Eliminar por Dato");
        Eliminar_Dato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar_Dato.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Eliminar_Dato.setIconTextGap(9);
        Eliminar_Dato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminar_DatoMouseClicked(evt);
            }
        });

        Eliminar_Todo.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Eliminar_Todo.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Todo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eliminar_Todo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/bajar_blanco.png"))); // NOI18N
        Eliminar_Todo.setText("Eliminar Todo");
        Eliminar_Todo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar_Todo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Eliminar_Todo.setIconTextGap(9);
        Eliminar_Todo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminar_TodoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout eliminacion3Layout = new javax.swing.GroupLayout(eliminacion3);
        eliminacion3.setLayout(eliminacion3Layout);
        eliminacion3Layout.setHorizontalGroup(
            eliminacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminacion3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(eliminacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Eliminar_Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(eliminacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Eliminar_Final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Eliminar_Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                    .addComponent(Eliminar_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar_Todo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        eliminacion3Layout.setVerticalGroup(
            eliminacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminacion3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Eliminar_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar_Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar_Todo, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        comandos3.addTab("   ELIMINACION   ", eliminacion3);

        otros3.setBackground(new java.awt.Color(0, 0, 51));

        Modificar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/subir_blanco.png"))); // NOI18N
        Modificar.setText("Modificar Dato");
        Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Modificar.setIconTextGap(9);
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });

        Verificar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Verificar.setForeground(new java.awt.Color(255, 255, 255));
        Verificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Verificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/subir_blanco.png"))); // NOI18N
        Verificar.setText("Verificar Dato");
        Verificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Verificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Verificar.setIconTextGap(9);
        Verificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerificarMouseClicked(evt);
            }
        });

        Promedio.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Promedio.setForeground(new java.awt.Color(255, 255, 255));
        Promedio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Promedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/subir_blanco.png"))); // NOI18N
        Promedio.setText("Promedio");
        Promedio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Promedio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Promedio.setIconTextGap(9);
        Promedio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PromedioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout otros3Layout = new javax.swing.GroupLayout(otros3);
        otros3.setLayout(otros3Layout);
        otros3Layout.setHorizontalGroup(
            otros3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otros3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(otros3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Verificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(Promedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        otros3Layout.setVerticalGroup(
            otros3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otros3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        comandos3.addTab("   OTROS   ", otros3);

        javax.swing.GroupLayout pp1Layout = new javax.swing.GroupLayout(pp1);
        pp1.setLayout(pp1Layout);
        pp1Layout.setHorizontalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pp1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(comandos3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pp1Layout.setVerticalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp1Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(comandos3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pp2.setBackground(new java.awt.Color(255, 255, 255));

        tabla_3.setBackground(new java.awt.Color(0, 0, 51));
        tabla_3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        tabla_3.setForeground(new java.awt.Color(255, 255, 255));
        tabla_3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_3.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_3.setOpaque(false);
        tabla_3.setRowHeight(25);
        tabla_3.setRowSelectionAllowed(false);
        tabla_3.setShowHorizontalLines(false);
        tabla_3.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(tabla_3);

        total_3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        total_3.setForeground(new java.awt.Color(0, 0, 51));
        total_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        opciones_3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        opciones_3.setForeground(new java.awt.Color(0, 0, 51));
        opciones_3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "< NOMBRE >", "< CODIGO >" }));
        opciones_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        s1.setBackground(new java.awt.Color(0, 0, 51));

        txt_3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        txt_3.setForeground(new java.awt.Color(0, 0, 51));
        txt_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_3.setText("Escriba para Buscar");
        txt_3.setBorder(null);
        txt_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_3KeyTyped(evt);
            }
        });

        cerrar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        cerrar.setForeground(new java.awt.Color(0, 0, 51));
        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setText("X");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pp2Layout = new javax.swing.GroupLayout(pp2);
        pp2.setLayout(pp2Layout);
        pp2Layout.setHorizontalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(total_3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(opciones_3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pp2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pp2Layout.setVerticalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp2Layout.createSequentialGroup()
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opciones_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_3KeyTyped
        es.EventoFiltro();
    }//GEN-LAST:event_txt_3KeyTyped

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p= MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x-x, p.y-y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x= evt.getX();   y= evt.getY();
        setOpacity((float)0.8);
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        setOpacity((float)1.0);
    }//GEN-LAST:event_formMouseReleased

    private void VerificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerificarMouseClicked
        try {
        setOpacity((float)0.8);
        String nombre= JOptionPane.showInputDialog(null,"< NOMBRE >","  º VERIFICAR º ",JOptionPane.QUESTION_MESSAGE);
        String codigo= JOptionPane.showInputDialog(null,"< CODIGO >","  º VERIFICAR º ",JOptionPane.QUESTION_MESSAGE);
        int cod = Integer.parseInt(codigo);
        int rep= es.Verificar(nombre, cod);
        JOptionPane.showMessageDialog(null, "- La Persona: "+nombre+" ---> con Codigo: "+codigo+"\n - Se Repite: "+rep+" Veces");
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_VerificarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        try {
        setOpacity((float)0.8);
        String pos= JOptionPane.showInputDialog(null,"< POSICION >","  º MODIFICAR º ",JOptionPane.QUESTION_MESSAGE);
        int p = Integer.parseInt(pos);
        String nombre= JOptionPane.showInputDialog(null,"< NOMBRE >","  º MODIFICAR º ",JOptionPane.QUESTION_MESSAGE);
        String codigo= JOptionPane.showInputDialog(null,"< CODIGO >","  º MODIFICAR º ",JOptionPane.QUESTION_MESSAGE);
        int cod = Integer.parseInt(codigo);
        Doble_NodoC n = new Doble_NodoC(nombre, cod, null, null);
        es.Modificar(p, nombre, cod);
        es.Mostrar();
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ModificarMouseClicked

    private void Insertar_InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insertar_InicioMouseClicked
        try {
        setOpacity((float)0.8);
        String nombre= JOptionPane.showInputDialog(null,"< NOMBRE >","  º INSERTAR AL INICIO º ",JOptionPane.QUESTION_MESSAGE);
        String codigo= JOptionPane.showInputDialog(null,"< CODIGO >","  º INSERTAR AL INICIO º ",JOptionPane.QUESTION_MESSAGE);
        int cod = Integer.parseInt(codigo);
        Doble_NodoC n = new Doble_NodoC(nombre, cod, null, null);
        es.InsertarInicio(n);
        es.Mostrar();
        total_3.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Insertar_InicioMouseClicked

    private void Insertar_FinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insertar_FinalMouseClicked
        try {
        setOpacity((float)0.8);
        String nombre = JOptionPane.showInputDialog(null,"< NOMBRE >","  º INSERTAR AL FINAL º ",JOptionPane.QUESTION_MESSAGE);
        String codigo = JOptionPane.showInputDialog(null,"< CODIGO >","  º INSERTAR AL FINAL º ",JOptionPane.QUESTION_MESSAGE);
        int cod = Integer.parseInt(codigo);
        Doble_NodoC n = new Doble_NodoC(nombre, cod, null, null);
        es.InsertarFinal(n);
        es.Mostrar();
        total_3.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Insertar_FinalMouseClicked

    private void Eliminar_DatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_DatoMouseClicked
        try {
        setOpacity((float)0.8);
        String nombre = JOptionPane.showInputDialog(null,"< NOMBRE >","  º ELIMINAR POR DATO º ",JOptionPane.QUESTION_MESSAGE);
        String codigo = JOptionPane.showInputDialog(null,"< CODIGO >","  º ELIMINAR POR DATO º ",JOptionPane.QUESTION_MESSAGE);
        int cod = Integer.parseInt(codigo);
        es.EliminarDato(nombre, cod);
        es.Mostrar();
        total_3.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Eliminar_DatoMouseClicked

    private void Eliminar_PosicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_PosicionMouseClicked
        try {
        setOpacity((float)0.8);
        int pos = Integer.parseInt(JOptionPane.showInputDialog(null,"< POSICION >","  º ELIMINAR POR POSICION º ",JOptionPane.QUESTION_MESSAGE));
        es.EliminarPosicion(pos);
        es.Mostrar();
        total_3.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Eliminar_PosicionMouseClicked

    private void Eliminar_InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_InicioMouseClicked
        setOpacity((float)0.8);
        es.EliminarIncio();
        es.Mostrar();
        total_3.setText(""+es.numElementos());
        setOpacity((float)1.0);
    }//GEN-LAST:event_Eliminar_InicioMouseClicked

    private void Eliminar_FinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_FinalMouseClicked
        setOpacity((float)0.8);
        es.EliminarFinal();
        es.Mostrar();
        total_3.setText(""+es.numElementos());
        setOpacity((float)1.0);
    }//GEN-LAST:event_Eliminar_FinalMouseClicked

    private void Insertar_PosicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insertar_PosicionMouseClicked
        try {
        setOpacity((float)0.8);
        int pos = Integer.parseInt(JOptionPane.showInputDialog(null,"< POSICION >","  º INSERTAR POR POSICION º ",JOptionPane.QUESTION_MESSAGE));
        String nombre= JOptionPane.showInputDialog(null,"< NOMBRE >","  º INSERTAR POR POSICION º ",JOptionPane.QUESTION_MESSAGE);
        int cod = Integer.parseInt(JOptionPane.showInputDialog(null,"< CODIGO >","  º INSERTAR POR POSICION º ",JOptionPane.QUESTION_MESSAGE));
        Doble_NodoC n = new Doble_NodoC(nombre, cod, null, null);
        es.InsertarPosicion(pos, n);
        es.Mostrar();
        total_3.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Insertar_PosicionMouseClicked

    private void Eliminar_TodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_TodoMouseClicked
        setOpacity((float)0.8);
        es.EliminarTodo();
        es.Mostrar();
        total_3.setText(""+es.numElementos());
        setOpacity((float)1.0);
    }//GEN-LAST:event_Eliminar_TodoMouseClicked

    private void PromedioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PromedioMouseClicked
        double rep= es.Promedio(es.numElementos());
        JOptionPane.showMessageDialog(null, "- PROMEDIO: "+rep);
    }//GEN-LAST:event_PromedioMouseClicked

    int x,y;
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
            java.util.logging.Logger.getLogger(Interfaz_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Eliminar_Dato;
    public static javax.swing.JLabel Eliminar_Final;
    public static javax.swing.JLabel Eliminar_Inicio;
    public static javax.swing.JLabel Eliminar_Posicion;
    public static javax.swing.JLabel Eliminar_Todo;
    public static javax.swing.JLabel Insertar_Final;
    public static javax.swing.JLabel Insertar_Inicio;
    public static javax.swing.JLabel Insertar_Posicion;
    public static javax.swing.JLabel Modificar;
    public static javax.swing.JLabel Promedio;
    private javax.swing.JLabel Titulo;
    public static javax.swing.JLabel Verificar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JTabbedPane comandos3;
    private javax.swing.JPanel eliminacion3;
    private javax.swing.JPanel insercion3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JComboBox opciones_3;
    private javax.swing.JPanel otros3;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp2;
    private javax.swing.JSeparator s1;
    public static javax.swing.JTable tabla_3;
    private javax.swing.JLabel total_3;
    public static javax.swing.JTextField txt_3;
    // End of variables declaration//GEN-END:variables
}
