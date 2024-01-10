
package proyecto.Paneles;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Policia extends javax.swing.JPanel {
    
    public class Imagen extends javax.swing.JPanel {
        
        public Imagen() {
        this.setSize(1260, 600);
        }
        public void paint(Graphics grafico) {
            Dimension height = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/reportesM.png"));
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    }
    
    public Policia() {
        initComponents();
        Imagen i = new Imagen();
        this.add(i);
        this.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
