
package proyecto.Paneles;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Crimen01 extends javax.swing.JPanel {
    
    public class Imagen extends javax.swing.JPanel {
        
        public Imagen() {
        this.setSize(1260, 600);
        }
        public void paint(Graphics grafico) {
            Dimension height = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/fondoM1.png"));
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    }
    
    public Crimen01() {
        initComponents();
        Imagen i = new Imagen();
        this.add(i);
        this.repaint();
        Image collar  = new ImageIcon(getClass().getResource("/Imagenes/collar.png")).getImage();
        lbCollar.setIcon(new ImageIcon(collar.getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        Image sangre  = new ImageIcon(getClass().getResource("/Imagenes/sangre.png")).getImage();
        lbSangre.setIcon(new ImageIcon(sangre.getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCollar = new javax.swing.JLabel();
        lbPolvora = new javax.swing.JLabel();
        lbSangre = new javax.swing.JLabel();

        lbCollar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCollar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/collar.png"))); // NOI18N
        lbCollar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCollarMouseClicked(evt);
            }
        });

        lbPolvora.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbPolvora.setForeground(new java.awt.Color(255, 255, 255));
        lbPolvora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPolvora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPolvoraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbPolvoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbPolvoraMouseExited(evt);
            }
        });

        lbSangre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSangre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sangre.png"))); // NOI18N
        lbSangre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSangreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(749, Short.MAX_VALUE)
                .addComponent(lbPolvora, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(379, 379, 379))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(lbCollar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(lbSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lbCollar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(lbSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(lbPolvora, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbPolvoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPolvoraMouseEntered
        lbPolvora.setText("Mm...");
    }//GEN-LAST:event_lbPolvoraMouseEntered

    private void lbPolvoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPolvoraMouseExited
        lbPolvora.setText("");
    }//GEN-LAST:event_lbPolvoraMouseExited

    private void lbPolvoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPolvoraMouseClicked
        JOptionPane.showMessageDialog(null, "Esta parte del cuerpo no coincide y su olor\nes muy fuerte, como Polvora A.");
    }//GEN-LAST:event_lbPolvoraMouseClicked

    private void lbCollarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCollarMouseClicked
        JOptionPane.showMessageDialog(null, "Una joyeria peculiar y es muy buen estado\ndebo preguntar a una experta por esto.");
    }//GEN-LAST:event_lbCollarMouseClicked

    private void lbSangreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSangreMouseClicked
        JOptionPane.showMessageDialog(null, "Es un cuagulo formado e la parte del cuerpo\nmenos afectada,parece que estaba fuera de rango");
    }//GEN-LAST:event_lbSangreMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbCollar;
    private javax.swing.JLabel lbPolvora;
    private javax.swing.JLabel lbSangre;
    // End of variables declaration//GEN-END:variables
}
