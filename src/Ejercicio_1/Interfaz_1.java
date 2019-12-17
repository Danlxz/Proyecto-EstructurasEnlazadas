
package Ejercicio_1;

import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JOptionPane;

public class Interfaz_1 extends javax.swing.JFrame {

    public static Estructuras_Enlazadas es = new Estructuras_Enlazadas();
    
    public Interfaz_1() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        comandos = new javax.swing.JTabbedPane();
        insercion = new javax.swing.JPanel();
        Insertar_Inicio = new javax.swing.JLabel();
        Insertar_Final = new javax.swing.JLabel();
        Insertar_Posicion = new javax.swing.JLabel();
        eliminacion = new javax.swing.JPanel();
        Eliminar_Inicio = new javax.swing.JLabel();
        Eliminar_Final = new javax.swing.JLabel();
        Eliminar_Posicion = new javax.swing.JLabel();
        Eliminar_Dato = new javax.swing.JLabel();
        Eliminar_Todo = new javax.swing.JLabel();
        otros = new javax.swing.JPanel();
        Verificar = new javax.swing.JLabel();
        Modificar = new javax.swing.JLabel();
        Promedio = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_1 = new javax.swing.JTable();
        opciones_1 = new javax.swing.JComboBox();
        txt_1 = new javax.swing.JTextField();
        total_1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("   º  LISTA LINEAL  º");
        setBackground(new java.awt.Color(0, 102, 102));
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

        panel.setBackground(new java.awt.Color(33, 63, 83));

        Titulo.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Ejercicio 1 : Listas Enlazadas Simples");
        Titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        comandos.setBackground(new java.awt.Color(255, 255, 255));
        comandos.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        comandos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comandos.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N

        insercion.setBackground(new java.awt.Color(33, 63, 83));

        Insertar_Inicio.setBackground(new java.awt.Color(33, 63, 83));
        Insertar_Inicio.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Insertar_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Insertar_Inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insertar_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/subir_blanco.png"))); // NOI18N
        Insertar_Inicio.setText("Insertar al Inicio");
        Insertar_Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Insertar_Inicio.setFocusable(false);
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

        javax.swing.GroupLayout insercionLayout = new javax.swing.GroupLayout(insercion);
        insercion.setLayout(insercionLayout);
        insercionLayout.setHorizontalGroup(
            insercionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insercionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(insercionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Insertar_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insertar_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insertar_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        insercionLayout.setVerticalGroup(
            insercionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insercionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Insertar_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Insertar_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Insertar_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        comandos.addTab("INSERCION", insercion);

        eliminacion.setBackground(new java.awt.Color(33, 63, 83));

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

        javax.swing.GroupLayout eliminacionLayout = new javax.swing.GroupLayout(eliminacion);
        eliminacion.setLayout(eliminacionLayout);
        eliminacionLayout.setHorizontalGroup(
            eliminacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminacionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(eliminacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eliminacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Eliminar_Final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Eliminar_Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Eliminar_Todo, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(Eliminar_Dato)
                    .addComponent(Eliminar_Posicion))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        eliminacionLayout.setVerticalGroup(
            eliminacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminacionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Eliminar_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar_Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar_Todo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        comandos.addTab("ELIMINACION", eliminacion);

        otros.setBackground(new java.awt.Color(33, 63, 83));

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

        javax.swing.GroupLayout otrosLayout = new javax.swing.GroupLayout(otros);
        otros.setLayout(otrosLayout);
        otrosLayout.setHorizontalGroup(
            otrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otrosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(otrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(Verificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Promedio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        otrosLayout.setVerticalGroup(
            otrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otrosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(Promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        comandos.addTab("OTROS", otros);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comandos, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comandos, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        tabla_1.setBackground(new java.awt.Color(33, 63, 83));
        tabla_1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        tabla_1.setForeground(new java.awt.Color(255, 255, 255));
        tabla_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ));
        tabla_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_1.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_1.setRowHeight(25);
        tabla_1.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tabla_1);

        opciones_1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        opciones_1.setForeground(new java.awt.Color(33, 63, 83));
        opciones_1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "< NOMBRE >", "< CODIGO >" }));
        opciones_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        txt_1.setForeground(new java.awt.Color(33, 63, 83));
        txt_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_1.setText("Escriba para Buscar");
        txt_1.setBorder(null);
        txt_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_1KeyTyped(evt);
            }
        });

        total_1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        total_1.setForeground(new java.awt.Color(33, 63, 83));
        total_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator1.setBackground(new java.awt.Color(0, 140, 200));

        cerrar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        cerrar.setForeground(new java.awt.Color(33, 63, 83));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(total_1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(opciones_1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(txt_1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opciones_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_1KeyTyped
        es.EventoFiltro();
    }//GEN-LAST:event_txt_1KeyTyped

    private void Insertar_InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insertar_InicioMouseClicked
        try {
        setOpacity((float)0.8);
        String nombre= JOptionPane.showInputDialog(null,"< NOMBRE >","  º INSERTAR AL INICIO º ",JOptionPane.QUESTION_MESSAGE);
        int codigo= Integer.parseInt(JOptionPane.showInputDialog(null,"< CODIGO >","  º INSERTAR AL INICIO º ",JOptionPane.QUESTION_MESSAGE));
        Nodo n = new Nodo(nombre,codigo,null);
        es.InsertarAlinicio(n);
        es.MostrarTabla();
        total_1.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Insertar_InicioMouseClicked

    private void Insertar_FinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insertar_FinalMouseClicked
        try {
        setOpacity((float)0.8);
        String nombre = JOptionPane.showInputDialog(null,"< NOMBRE >","  º INSERTAR AL FINAL º ",JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"< CODIGO >","  º INSERTAR AL FINAL º ",JOptionPane.QUESTION_MESSAGE));
        Nodo n = new Nodo(nombre,codigo,null);
        es.InsertarAlfinal(n);
        es.MostrarTabla();
        total_1.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Insertar_FinalMouseClicked

    private void Insertar_PosicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insertar_PosicionMouseClicked
        try {
        setOpacity((float)0.8); 
        int pos = Integer.parseInt(JOptionPane.showInputDialog(null,"< POSICION >","  º INSERTAR POR POSICION º ",JOptionPane.QUESTION_MESSAGE));
        String nombre= JOptionPane.showInputDialog(null,"< NOMBRE >","  º INSERTAR POR POSICION º ",JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"< CODIGO >","  º INSERTAR POR POSICION º ",JOptionPane.QUESTION_MESSAGE));
        Nodo n = new Nodo(nombre,codigo,null);
        es.InsertarPosicion(pos, n);
        es.MostrarTabla();
        total_1.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Insertar_PosicionMouseClicked

    private void Eliminar_FinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_FinalMouseClicked
        setOpacity((float)0.8);
        es.EliminarAlfinal();
        es.MostrarTabla();
        total_1.setText(""+es.numElementos());
        setOpacity((float)1.0);
    }//GEN-LAST:event_Eliminar_FinalMouseClicked

    private void Eliminar_InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_InicioMouseClicked
        setOpacity((float)0.8);
        es.EliminarAlincio();
        es.MostrarTabla();
        total_1.setText(""+es.numElementos());
        setOpacity((float)1.0);
    }//GEN-LAST:event_Eliminar_InicioMouseClicked

    private void Eliminar_PosicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_PosicionMouseClicked
        try {
        setOpacity((float)0.8);
        int p = Integer.parseInt(JOptionPane.showInputDialog(null,"< POSICION >","  º ELIMINAR POR POSICION º ",JOptionPane.QUESTION_MESSAGE));
        es.EliminarPosicion(p);
        es.MostrarTabla();
        total_1.setText(""+es.numElementos());
        setOpacity((float)1.0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Eliminar_PosicionMouseClicked

    private void Eliminar_TodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_TodoMouseClicked
        setOpacity((float)0.8);
        es.EliminarTodo();
        es.MostrarTabla();
        total_1.setText(""+es.numElementos());
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

    private void Eliminar_DatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_DatoMouseClicked
        try {
        setOpacity((float)0.8); 
        String nombre= JOptionPane.showInputDialog(null,"< NOMBRE >","  º ELIMINAR POR DATO º ",JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"< CODIGO >","  º ELIMINAR POR DATO º ",JOptionPane.QUESTION_MESSAGE));
        es.EliminarDato(nombre, codigo);
        es.MostrarTabla();
        total_1.setText(""+es.numElementos());
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
                new Interfaz_1().setVisible(true);
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
    private javax.swing.JTabbedPane comandos;
    private javax.swing.JPanel eliminacion;
    private javax.swing.JPanel insercion;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JComboBox opciones_1;
    private javax.swing.JPanel otros;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    public static javax.swing.JTable tabla_1;
    private javax.swing.JLabel total_1;
    public static javax.swing.JTextField txt_1;
    // End of variables declaration//GEN-END:variables
}
