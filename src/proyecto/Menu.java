
package proyecto;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {
    
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        Image icon = new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage();
        this.setIconImage(icon);
        lvFondo.setIcon(new ImageIcon(icon.getScaledInstance(lvFondo.getWidth(), lvFondo.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        btnNuevaPartida = new javax.swing.JButton();
        lvtitulo = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        btnOpciones = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lvPropietario = new javax.swing.JLabel();
        lvFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNuevaPartida.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnNuevaPartida.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaPartida.setText("Nueva Partida");

        lvtitulo.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        lvtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lvtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvtitulo.setText("Proyecto - 0");

        btnContinuar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");

        btnOpciones.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnOpciones.setForeground(new java.awt.Color(255, 255, 255));
        btnOpciones.setText("Opciones");

        btnSalir.setBackground(new java.awt.Color(51, 0, 0));
        btnSalir.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");

        lvPropietario.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lvPropietario.setForeground(new java.awt.Color(255, 255, 255));
        lvPropietario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvPropietario.setText("BY @DeadpoolMasacre");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lvtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lvPropietario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lvtitulo)
                .addGap(36, 36, 36)
                .addComponent(btnNuevaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lvPropietario)
                .addGap(9, 9, 9))
        );

        lvFondo.setBackground(new java.awt.Color(51, 51, 51));
        lvFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvFondo.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lvFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lvFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnContinuar;
    public javax.swing.JButton btnNuevaPartida;
    public javax.swing.JButton btnOpciones;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel lvFondo;
    private javax.swing.JLabel lvPropietario;
    private javax.swing.JLabel lvtitulo;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
