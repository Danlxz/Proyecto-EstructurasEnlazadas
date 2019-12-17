
package Ejercicio_2;

import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JOptionPane;

public class Interfaz_2 extends javax.swing.JFrame {
    
    public static Estructuras_Dobles es = new Estructuras_Dobles();

    public Interfaz_2() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        comandos2 = new javax.swing.JTabbedPane();
        insercion2 = new javax.swing.JPanel();
        Insertar_Inicio = new javax.swing.JLabel();
        Insertar_Final = new javax.swing.JLabel();
        Insertar_Posicion = new javax.swing.JLabel();
        eliminacion2 = new javax.swing.JPanel();
        Eliminar_Inicio = new javax.swing.JLabel();
        Eliminar_Final = new javax.swing.JLabel();
        Eliminar_Posicion = new javax.swing.JLabel();
        Eliminar_Dato = new javax.swing.JLabel();
        Eliminar_Todo = new javax.swing.JLabel();
        otros2 = new javax.swing.JPanel();
        Verificar = new javax.swing.JLabel();
        Modificar = new javax.swing.JLabel();
        Promedio = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        total_2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_2 = new javax.swing.JTable();
        opciones_2 = new javax.swing.JComboBox();
        s1 = new javax.swing.JSeparator();
        txt_2 = new javax.swing.JTextField();
        cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(0, 153, 153));

        Titulo.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Ejercicio 2 : Listas Doblemente Enlazadas");
        Titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        comandos2.setBackground(new java.awt.Color(255, 255, 255));
        comandos2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        comandos2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comandos2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N

        insercion2.setBackground(new java.awt.Color(0, 153, 153));

        Insertar_Inicio.setBackground(new java.awt.Color(33, 63, 83));
        Insertar_Inicio.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Insertar_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Insertar_Inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insertar_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/subir_blanco.png"))); // NOI18N
        Insertar_Inicio.setText("Insertar al Inicio");
        Insertar_Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Insertar_Inicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Insertar_Inicio.setIconTextGap(9);
        Insertar_Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insertar_InicioMouseClicked(evt);
            }
        });

        Insertar_Final.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Insertar_Final.setForeground(new java.awt.Color(255, 255, 255));
        Insertar_Final.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insertar_Final.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/subir_blanco.png"))); // NOI18N
        Insertar_Final.setText("Insertar al Final");
        Insertar_Final.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Insertar_Final.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Insertar_Final.setIconTextGap(9);
        Insertar_Final.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insertar_FinalMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout insercion2Layout = new javax.swing.GroupLayout(insercion2);
        insercion2.setLayout(insercion2Layout);
        insercion2Layout.setHorizontalGroup(
            insercion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insercion2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(insercion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insercion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Insertar_Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Insertar_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Insertar_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        insercion2Layout.setVerticalGroup(
            insercion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insercion2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(Insertar_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Insertar_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Insertar_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        comandos2.addTab("   INSERCION   ", insercion2);

        eliminacion2.setBackground(new java.awt.Color(0, 153, 153));

        Eliminar_Inicio.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Eliminar_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eliminar_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/bajar_blanco.png"))); // NOI18N
        Eliminar_Inicio.setText("Eliminar al Inicio");
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
        Eliminar_Final.setText("Eliminar al Final");
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

        javax.swing.GroupLayout eliminacion2Layout = new javax.swing.GroupLayout(eliminacion2);
        eliminacion2.setLayout(eliminacion2Layout);
        eliminacion2Layout.setHorizontalGroup(
            eliminacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminacion2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(eliminacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Eliminar_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar_Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar_Todo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(eliminacion2Layout.createSequentialGroup()
                .addGap(0, 67, Short.MAX_VALUE)
                .addGroup(eliminacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Eliminar_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        eliminacion2Layout.setVerticalGroup(
            eliminacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminacion2Layout.createSequentialGroup()
                .addComponent(Eliminar_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar_Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar_Todo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        comandos2.addTab("   ELIMINACION   ", eliminacion2);

        otros2.setBackground(new java.awt.Color(0, 153, 153));

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

        javax.swing.GroupLayout otros2Layout = new javax.swing.GroupLayout(otros2);
        otros2.setLayout(otros2Layout);
        otros2Layout.setHorizontalGroup(
            otros2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otros2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(otros2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Promedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        otros2Layout.setVerticalGroup(
            otros2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otros2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        comandos2.addTab("   OTROS   ", otros2);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comandos2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(comandos2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        total_2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        total_2.setForeground(new java.awt.Color(0, 153, 153));
        total_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabla_2.setBackground(new java.awt.Color(0, 153, 153));
        tabla_2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        tabla_2.setForeground(new java.awt.Color(255, 255, 255));
        tabla_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ));
        tabla_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_2.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_2.setRowHeight(25);
        tabla_2.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tabla_2);

        opciones_2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        opciones_2.setForeground(new java.awt.Color(0, 153, 153));
        opciones_2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "< NOMBRE >", "< CODIGO >" }));
        opciones_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        s1.setBackground(new java.awt.Color(0, 153, 153));

        txt_2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        txt_2.setForeground(new java.awt.Color(0, 153, 153));
        txt_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_2.setText("Escriba para Buscar");
        txt_2.setBorder(null);
        txt_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_2KeyTyped(evt);
            }
        });

        cerrar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        cerrar.setForeground(new java.awt.Color(0, 153, 153));
        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setText("X");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(opciones_2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(txt_2))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(total_2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opciones_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_2KeyTyped
        es.EventoFiltro();
    }//GEN-LAST:event_txt_2KeyTyped

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void Insertar_InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insertar_InicioMouseClicked
        try {
        setOpacity((float)0.8);
        String nombre= JOptionPane.showInputDialog(null,"< NOMBRE >","  º INSERTAR AL INICIO º ",JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"< CODIGO >","  º INSERTAR AL INICIO º ",JOptionPane.QUESTION_MESSAGE));
        Doble_Nodo n = new Doble_Nodo(nombre, codigo, null, null);
        es.InsertarAlinicio(n);
        es.MostrarTabla();
        total_2.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Insertar_InicioMouseClicked

    private void Insertar_FinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insertar_FinalMouseClicked
        try {
        setOpacity((float)0.8);
        String nombre = JOptionPane.showInputDialog(null,"< NOMBRE >","  º INSERTAR AL FINAL º ",JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"< CODIGO >","  º INSERTAR AL FINAL º ",JOptionPane.QUESTION_MESSAGE));
        Doble_Nodo n = new Doble_Nodo(nombre, codigo, null, null);
        es.InsertarAlfinal(n);
        es.MostrarTabla();
        total_2.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Insertar_FinalMouseClicked

    private void Insertar_PosicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insertar_PosicionMouseClicked
        try {
        setOpacity((float)0.8);
        int pos = Integer.parseInt(JOptionPane.showInputDialog(null,"< POSICION >","  º INSERTAR POR POSICION º ",JOptionPane.QUESTION_MESSAGE));
        String nombre= JOptionPane.showInputDialog(null,"< NOMBRE >","  º INSERTAR POR POSICION º ",JOptionPane.QUESTION_MESSAGE);
        int cod = Integer.parseInt(JOptionPane.showInputDialog(null,"< CODIGO >","  º INSERTAR POR POSICION º ",JOptionPane.QUESTION_MESSAGE));
        Doble_Nodo n = new Doble_Nodo(nombre, cod, null, null);
        es.InsertarPosicion(pos, n);
        es.MostrarTabla();
        total_2.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Insertar_PosicionMouseClicked

    private void Eliminar_PosicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_PosicionMouseClicked
        try {
        setOpacity((float)0.8);
        int pos = Integer.parseInt(JOptionPane.showInputDialog(null,"< POSICION >","  º ELIMINAR POR POSICION º ",JOptionPane.QUESTION_MESSAGE));
        es.EliminarPosicion(pos);
        es.MostrarTabla();
        total_2.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Eliminar_PosicionMouseClicked

    private void Eliminar_TodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_TodoMouseClicked
        setOpacity((float)0.8);
        es.EliminarTodo();
        es.MostrarTabla();
        total_2.setText(""+es.numElementos());
        setOpacity((float)1.0);
    }//GEN-LAST:event_Eliminar_TodoMouseClicked

    private void VerificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerificarMouseClicked
        try {
        setOpacity((float)0.8);
        String nombre= JOptionPane.showInputDialog(null,"< NOMBRE >","  º VERIFICAR º ",JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"< CODIGO >","  º VERIFICAR º ",JOptionPane.QUESTION_MESSAGE));
        int rep= es.Verificar(nombre, codigo);
        JOptionPane.showMessageDialog(null, "- La Persona: "+nombre+" ---> con Codigo: "+codigo+"\n - Se Repite: "+rep+" Veces");
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_VerificarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        try {
        setOpacity((float)0.8);
        int pos = Integer.parseInt(JOptionPane.showInputDialog(null,"< POSICION >","  º MODIFICAR º ",JOptionPane.QUESTION_MESSAGE));
        String nombre= JOptionPane.showInputDialog(null,"< NOMBRE >","  º MODIFICAR º ",JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"< CODIGO >","  º MODIFICAR º ",JOptionPane.QUESTION_MESSAGE));
        es.Modificar(pos, nombre, codigo);
        es.MostrarTabla();
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ModificarMouseClicked

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        setOpacity((float)1.0);
    }//GEN-LAST:event_formMouseReleased

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x= evt.getX();   y= evt.getY();
        setOpacity((float)0.8);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p= MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x-x, p.y-y);
    }//GEN-LAST:event_formMouseDragged

    private void Eliminar_InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_InicioMouseClicked
        setOpacity((float)0.8);
        es.EliminarIncio();
        es.MostrarTabla();
        total_2.setText(""+es.numElementos());
        setOpacity((float)1.0);
    }//GEN-LAST:event_Eliminar_InicioMouseClicked

    private void Eliminar_FinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_FinalMouseClicked
        setOpacity((float)0.8);
        es.EliminarFinal();
        es.MostrarTabla();
        total_2.setText(""+es.numElementos());
        setOpacity((float)1.0);
    }//GEN-LAST:event_Eliminar_FinalMouseClicked

    private void Eliminar_DatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_DatoMouseClicked
        try {
        setOpacity((float)0.8);
        String nombre= JOptionPane.showInputDialog(null,"< NOMBRE >","  º ELIMINAR POR DATO º ",JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"< CODIGO >","  º ELIMINAR POR DATO º ",JOptionPane.QUESTION_MESSAGE));
        es.EliminarDato(nombre, codigo);
        es.MostrarTabla();
        total_2.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Eliminar_DatoMouseClicked

    private void PromedioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PromedioMouseClicked
        double rep= es.Promedio(es.numElementos());
        JOptionPane.showMessageDialog(null, "- PROMEDIO: "+rep);
    }//GEN-LAST:event_PromedioMouseClicked

    int x,y;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_2().setVisible(true);
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
    private javax.swing.JTabbedPane comandos2;
    private javax.swing.JPanel eliminacion2;
    private javax.swing.JPanel insercion2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JComboBox opciones_2;
    private javax.swing.JPanel otros2;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JSeparator s1;
    public static javax.swing.JTable tabla_2;
    private javax.swing.JLabel total_2;
    public static javax.swing.JTextField txt_2;
    // End of variables declaration//GEN-END:variables
}
