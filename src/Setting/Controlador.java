
package Setting;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyecto.*;

public class Controlador implements ActionListener{
    //Vista Principal de JFrames
    private Menu menuview = new Menu();
    private Niveles nivelesview = new Niveles();
    
    public Controlador(Menu menuview, Niveles nivelesview){
        //Inicializacion de objetos principales
        this.menuview = menuview;
        this.nivelesview = nivelesview;
        
        //Acciones de objetos de MenuView
        this.menuview.btnContinuar.addActionListener(this);
        this.menuview.btnNuevaPartida.addActionListener(this);
        this.menuview.btnOpciones.addActionListener(this);
        this.menuview.btnSalir.addActionListener(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Accion de comenzar una nueva partidad desde cero
        if(e.getSource() == menuview.btnNuevaPartida){
            nivelesview.setVisible(true);
            menuview.dispose();
        }
        //Accion de continuar la partida actual 
        if(e.getSource() == menuview.btnContinuar){
            nivelesview.setVisible(true);
            menuview.dispose();
        }
        //Accion de opciones de el juego desde el menu principal
        if(e.getSource() == menuview.btnOpciones){
            JOptionPane.showMessageDialog(null, "Menu aun no disponible", "Espera", JOptionPane.INFORMATION_MESSAGE);
        }
        //Accion de salir del juego desde el menu
        if(e.getSource() == menuview.btnSalir){
            int i = JOptionPane.showConfirmDialog(null, "Salir\nSeguro que quieres salir?",
                    "Cerrar Juego", JOptionPane.INFORMATION_MESSAGE);
            if(i==1){
                menuview.setVisible(false);
            }else{
                
            }
        }
        
        
        
        
        
        
        
        
        
    }
    
}
