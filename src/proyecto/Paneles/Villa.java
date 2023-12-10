
package proyecto.Paneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Villa extends javax.swing.JPanel {
    
    public class Imagen extends javax.swing.JPanel {
        
        public Imagen() {
        this.setSize(1260, 600);
        }
        public void paint(Graphics grafico) {
            Dimension height = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/vesindadM.png"));
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    }
    
    public Villa() {
        initComponents();
        Imagen i = new Imagen();
        this.add(i);
        this.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbArmas = new javax.swing.JLabel();
        lbRicashio = new javax.swing.JLabel();
        lbMartines = new javax.swing.JLabel();
        lbBar = new javax.swing.JLabel();
        lbCar = new javax.swing.JLabel();
        lbTienda = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1260, 600));

        lbArmas.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbArmas.setForeground(new java.awt.Color(255, 255, 255));
        lbArmas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbArmas.setText("Taller de Armas");
        lbArmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbArmasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbArmasMouseExited(evt);
            }
        });

        lbRicashio.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbRicashio.setForeground(new java.awt.Color(255, 255, 255));
        lbRicashio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRicashio.setText("Los Ricashio");
        lbRicashio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbRicashioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbRicashioMouseExited(evt);
            }
        });

        lbMartines.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbMartines.setForeground(new java.awt.Color(255, 255, 255));
        lbMartines.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMartines.setText("Los Martines");
        lbMartines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbMartinesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbMartinesMouseExited(evt);
            }
        });

        lbBar.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbBar.setForeground(new java.awt.Color(255, 255, 255));
        lbBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBar.setText("Bar - 2 Copas");
        lbBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbBarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbBarMouseExited(evt);
            }
        });

        lbCar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCarMouseExited(evt);
            }
        });

        lbTienda.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lbTienda.setForeground(new java.awt.Color(255, 255, 255));
        lbTienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTienda.setText("Tienda Central");
        lbTienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbTiendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbTiendaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lbRicashio, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335)
                .addComponent(lbMartines, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lbArmas, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(lbBar, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(lbCar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(lbTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lbCar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbArmas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(240, 240, 240)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRicashio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lbMartines, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbArmasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbArmasMouseEntered
        lbArmas.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbArmasMouseEntered

    private void lbArmasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbArmasMouseExited
        lbArmas.setForeground(Color.white);
    }//GEN-LAST:event_lbArmasMouseExited

    private void lbRicashioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRicashioMouseEntered
        lbRicashio.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbRicashioMouseEntered

    private void lbRicashioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRicashioMouseExited
        lbRicashio.setForeground(Color.white);
    }//GEN-LAST:event_lbRicashioMouseExited

    private void lbMartinesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMartinesMouseEntered
        lbMartines.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbMartinesMouseEntered

    private void lbMartinesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMartinesMouseExited
        lbMartines.setForeground(Color.white);
    }//GEN-LAST:event_lbMartinesMouseExited

    private void lbBarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBarMouseEntered
        lbBar.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbBarMouseEntered

    private void lbBarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBarMouseExited
        lbBar.setForeground(Color.white);
    }//GEN-LAST:event_lbBarMouseExited

    private void lbCarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCarMouseEntered
        lbCar.setText("Mm...");
    }//GEN-LAST:event_lbCarMouseEntered

    private void lbCarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCarMouseExited
        lbCar.setText("");
    }//GEN-LAST:event_lbCarMouseExited

    private void lbTiendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTiendaMouseEntered
        lbTienda.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbTiendaMouseEntered

    private void lbTiendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTiendaMouseExited
        lbTienda.setForeground(Color.white);
    }//GEN-LAST:event_lbTiendaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lbArmas;
    public javax.swing.JLabel lbBar;
    private javax.swing.JLabel lbCar;
    public javax.swing.JLabel lbMartines;
    public javax.swing.JLabel lbRicashio;
    public javax.swing.JLabel lbTienda;
    // End of variables declaration//GEN-END:variables
}
