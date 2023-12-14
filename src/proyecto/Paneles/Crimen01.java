
package proyecto.Paneles;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

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
        lbCollar.setIcon(new ImageIcon(collar.getScaledInstance(lbCollar.getWidth(), lbCollar.getHeight(), Image.SCALE_SMOOTH)));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCollar = new javax.swing.JLabel();

        lbCollar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCollar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/collar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lbCollar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbCollar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(495, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbCollar;
    // End of variables declaration//GEN-END:variables
}
