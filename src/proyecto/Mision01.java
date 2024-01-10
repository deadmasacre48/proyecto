
package proyecto;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Mision01 extends javax.swing.JFrame {
    
    public Mision01() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        Image icon = new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage();
        this.setIconImage(icon);
        menu.add(panelmenu);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPopupMenu();
        panelmenu = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnSuicidio = new javax.swing.JButton();
        btnAtentado = new javax.swing.JButton();
        btnHomicidio = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnPista = new javax.swing.JButton();
        panelInventario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        panelMision = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbTiempo = new javax.swing.JLabel();

        btnSalir.setBackground(new java.awt.Color(51, 0, 0));
        btnSalir.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");

        btnSuicidio.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnSuicidio.setForeground(new java.awt.Color(255, 255, 255));
        btnSuicidio.setText("Suicidio");

        btnAtentado.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnAtentado.setForeground(new java.awt.Color(255, 255, 255));
        btnAtentado.setText("Atentado");

        btnHomicidio.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnHomicidio.setForeground(new java.awt.Color(255, 255, 255));
        btnHomicidio.setText("Homicidio");

        btnInfo.setBackground(new java.awt.Color(0, 0, 51));
        btnInfo.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnInfo.setText("Info.");

        btnPista.setBackground(new java.awt.Color(0, 51, 51));
        btnPista.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnPista.setForeground(new java.awt.Color(255, 255, 255));
        btnPista.setText("Pista");

        panelInventario.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inventario");

        javax.swing.GroupLayout panelInventarioLayout = new javax.swing.GroupLayout(panelInventario);
        panelInventario.setLayout(panelInventarioLayout);
        panelInventarioLayout.setHorizontalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelInventarioLayout.setVerticalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelmenuLayout = new javax.swing.GroupLayout(panelmenu);
        panelmenu.setLayout(panelmenuLayout);
        panelmenuLayout.setHorizontalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelmenuLayout.createSequentialGroup()
                        .addComponent(btnSuicidio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPista, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelmenuLayout.createSequentialGroup()
                        .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHomicidio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtentado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(panelInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelmenuLayout.setVerticalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelmenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuicidio)
                    .addComponent(btnPista))
                .addGap(18, 18, 18)
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHomicidio)
                    .addComponent(btnInfo))
                .addGap(18, 18, 18)
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnAtentado))
                .addContainerGap())
            .addComponent(panelInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMenu.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Menu");

        panelMision.setLayout(new javax.swing.BoxLayout(panelMision, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tiempo para terminar: ");

        lbTiempo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbTiempo.setForeground(new java.awt.Color(255, 255, 255));
        lbTiempo.setText("0:00");
        lbTiempo.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMision, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mision01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAtentado;
    public javax.swing.JButton btnHomicidio;
    public javax.swing.JButton btnInfo;
    public javax.swing.JButton btnMenu;
    public javax.swing.JButton btnPista;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnSuicidio;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel lbTiempo;
    public javax.swing.JPopupMenu menu;
    public javax.swing.JPanel panelInventario;
    public javax.swing.JPanel panelMision;
    public javax.swing.JPanel panelmenu;
    // End of variables declaration//GEN-END:variables
}
