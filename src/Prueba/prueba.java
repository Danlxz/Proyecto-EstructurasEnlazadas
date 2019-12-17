
package Prueba;

import Ejercicio_1.Interfaz_1;
import Ejercicio_2.Interfaz_2;
import Ejercicio_3.Interfaz_3;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;

public class prueba extends javax.swing.JFrame {
    
    public prueba() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        ej1 = new javax.swing.JLabel();
        ej2 = new javax.swing.JLabel();
        ej3 = new javax.swing.JLabel();
        s = new javax.swing.JSeparator();
        ss = new javax.swing.JSeparator();

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

        p1.setBackground(new java.awt.Color(51, 51, 51));

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Ejercicios - Primer Corte.");
        Titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Titulo2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(255, 255, 255));
        Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo2.setText("Autor: Daniel Alejandro Luna Ortiz");
        Titulo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Titulo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cerrar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setText("X");
        cerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });

        p2.setBackground(new java.awt.Color(51, 51, 51));

        ej1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        ej1.setForeground(new java.awt.Color(255, 255, 255));
        ej1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ej1.setText("Ejercicio #1");
        ej1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ej1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ej1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ej1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ej1MouseExited(evt);
            }
        });

        ej2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        ej2.setForeground(new java.awt.Color(255, 255, 255));
        ej2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ej2.setText("Ejercicio #2");
        ej2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ej2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ej2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ej2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ej2MouseExited(evt);
            }
        });

        ej3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        ej3.setForeground(new java.awt.Color(255, 255, 255));
        ej3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ej3.setText("Ejercicio #3");
        ej3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ej3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ej3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ej3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ej3MouseExited(evt);
            }
        });

        s.setOrientation(javax.swing.SwingConstants.VERTICAL);

        ss.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(ej1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ej2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ej3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(s)
            .addComponent(ss)
            .addGroup(p2Layout.createSequentialGroup()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ej2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(ej3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(ej1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p= MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x-x, p.y-y);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
       setOpacity((float)1.0);
    }//GEN-LAST:event_formMouseReleased

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x= evt.getX();   y= evt.getY();
        setOpacity((float)0.8);
    }//GEN-LAST:event_formMousePressed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void ej1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ej1MouseEntered
        ej1.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_ej1MouseEntered

    private void ej1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ej1MouseExited
        ej1.setForeground(Color.WHITE);
    }//GEN-LAST:event_ej1MouseExited

    private void ej1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ej1MouseClicked
        Interfaz_1 i = new Interfaz_1();
        i.setVisible(true);
        setOpacity((float)0.5);
    }//GEN-LAST:event_ej1MouseClicked

    private void ej2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ej2MouseClicked
        Interfaz_2 ii = new Interfaz_2();
        ii.setVisible(true);
        setOpacity((float)0.5);
    }//GEN-LAST:event_ej2MouseClicked

    private void ej3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ej3MouseClicked
        Interfaz_3 iii = new Interfaz_3();
        iii.setVisible(true);
        setOpacity((float)0.5);
    }//GEN-LAST:event_ej3MouseClicked

    private void ej2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ej2MouseEntered
       ej2.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_ej2MouseEntered

    private void ej3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ej3MouseEntered
       ej3.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_ej3MouseEntered

    private void ej2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ej2MouseExited
       ej2.setForeground(Color.WHITE);
    }//GEN-LAST:event_ej2MouseExited

    private void ej3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ej3MouseExited
       ej3.setForeground(Color.WHITE);
    }//GEN-LAST:event_ej3MouseExited

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
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel ej1;
    private javax.swing.JLabel ej2;
    private javax.swing.JLabel ej3;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JSeparator s;
    private javax.swing.JSeparator ss;
    // End of variables declaration//GEN-END:variables
}
