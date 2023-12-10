
package proyecto.Paneles;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Armas extends javax.swing.JPanel {
    
    public class Imagen extends javax.swing.JPanel {
        
        public Imagen() {
        this.setSize(1260, 600);
        }
        public void paint(Graphics grafico) {
            Dimension height = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/armasM.png"));
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    }
    
    public Armas() {
        initComponents();
        Imagen i = new Imagen();
        this.add(i);
        this.repaint();
        jScrollPane1.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listCompradores = new javax.swing.JList<>();

        jScrollPane1.setBackground(new java.awt.Color(207, 222, 167));

        listCompradores.setBackground(new java.awt.Color(207, 222, 167));
        listCompradores.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        listCompradores.setForeground(new java.awt.Color(0, 0, 0));
        listCompradores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Marisol M. : 2x Granadas", "Marisol M. : 1x Municion ligera", "----------------------------------------------------------", "Gabriel Cars : 5x Cuchillas", "----------------------------------------------------------", "Max Petherson : 1x Pistola", "Max Petherson : 2x Cartuchos vacios", "----------------------------------------------------------", "Angel R. : 3x Paquetes G.", "Angel R. : 4x Polvora A.", "----------------------------------------------------------", "Richar Macton : 8x Polvora A.", "Richar Macton : 1x Pistola Fugas", "----------------------------------------------------------", "Ruth Rabioli : 3x Baterias BB", "----------------------------------------------------------", "Cristian Cars : 1x Pistola", "Cristian Cars : 3x Polvora A.", "----------------------------------------------------------", "Desconocido : 4x Paquetes G.", "Desconocido : 12x Polvora G.", "Desconocido : 4x Baterias BBB", "----------------------------------------------------------", "Peter Rod : 7x Baterias BB", "----------------------------------------------------------", "Max Petherson : 2x Municion ligera", "----------------------------------------------------------", "Marian R. : 2x Escopeta Fugas", "Marian R. : 1x Cartucho Vigas.", "----------------------------------------------------------", "Richar Macton : 1x Mejora Pulso", "----------------------------------------------------------", "Marcos M. : 3x Liquido Arquino", "Marcos M. : 2x Baterias B", "----------------------------------------------------------", "Johan R. : 1x Liquido Arquino", "----------------------------------------------------------", "Gorion Hanibal : 2x Mejora Ocular", "Gorion Hanibal : 1x Paquete Update", "----------------------------------------------------------", "Feliz Tither : 1x Pistola Fugas" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listCompradores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(944, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listCompradores;
    // End of variables declaration//GEN-END:variables
}
