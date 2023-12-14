
package Setting;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import proyecto.*;
import proyecto.Paneles.*;

public class Controlador implements ActionListener, MouseListener{
    //Vista Principal de JFrames
    private Menu menuview = new Menu();
    private Niveles nivelesview = new Niveles();
    private Mision01 mision1 = new Mision01();
    
    //Metodos que se usan
    private MetodosEscenas me = new MetodosEscenas();
    private MetodoTiempo mt = new MetodoTiempo();
    
    //Paneles que se usan
    private Villa villa = new Villa();
    private Armas arma = new Armas();
    private Bar2Copas bar = new Bar2Copas();
    private Ropa ropa = new Ropa();
    private Joyas joyas = new Joyas();
    private Papeleria papeles = new Papeleria();
    private Ricashio ricashio = new Ricashio();
    private Martines martine = new Martines();
    private Crimen01 crimen01 = new Crimen01();
    
    public Controlador(Menu menuview, Niveles nivelesview, Mision01 mision1){
        //Inicializacion de objetos principales
        this.menuview = menuview;
        this.nivelesview = nivelesview;
        this.mision1 = mision1;
        
        //Acciones de objetos de MenuView
        this.menuview.btnContinuar.addActionListener(this);
        this.menuview.btnNuevaPartida.addActionListener(this);
        this.menuview.btnOpciones.addActionListener(this);
        this.menuview.btnSalir.addActionListener(this);
        
        //Acciones de Objetos de niveles
        this.nivelesview.btnMision01.addActionListener(this);
        this.nivelesview.btnMision02.addActionListener(this);
        this.nivelesview.btnMision03.addActionListener(this);
        
        //Acciones de mision 1
        this.mision1.btnMenu.addActionListener(this);
        this.mision1.btnAtentado.addActionListener(this);
        this.mision1.btnHomicidio.addActionListener(this);
        this.mision1.btnSuicidio.addActionListener(this);
        this.mision1.btnInfo.addActionListener(this);
        this.mision1.btnPista.addActionListener(this);
        this.mision1.btnSalir.addActionListener(this);
        
        //Acciones dentro de el panel villa
        this.villa.lbArmas.addMouseListener(this);
        this.villa.lbBar.addMouseListener(this);
        this.villa.lbMartines.addMouseListener(this);
        this.villa.lbRicashio.addMouseListener(this);
        this.villa.lbTienda.addMouseListener(this);
        
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
        
        
        
        
        
        //Accion de ir a la mision 1
        if(e.getSource() == nivelesview.btnMision01){
            mision1.setVisible(true);
            mt.Tiempo10Min(mision1.lbTiempo);
            me.setPanelDeLugar(mision1.panelMision, crimen01);
            nivelesview.dispose();
        }
        //Accion de ir a la mision 2
        if(e.getSource() == nivelesview.btnMision02){
            System.out.println("Mision en progreso");
            nivelesview.dispose();
        }
        //Accion de ir a la mision 3
        if(e.getSource() == nivelesview.btnMision03){
            System.out.println("Mision en progreso");
            nivelesview.dispose();
        }
        
        
        
        
        
        //Accion de abrir el menu dentro de la mision 1
        if(e.getSource() == mision1.btnMenu){
            mision1.menu.show(mision1.btnMenu,-200,-200);
        }
        //Accion de informacion de la mision actual
        if(e.getSource() == mision1.btnInfo){
            JOptionPane.showMessageDialog(mision1, "Este cadaber quedo rostisado, olor mugriento y sangre dispersada,\n"
                                                            + "nadie pudo reconocerde esto y mas importante, saber que paso aqui\n"
                                                            + " y para ello estoy aqui, para provarme, no tienen fe pero se que\n"
                                                            + "soy capas de hacerlo.",
                    "Informacion de mision", JOptionPane.INFORMATION_MESSAGE);
        }
        //Accion de Obtener una pista de la escena
        if(e.getSource() == mision1.btnPista){
            
        }
        //Accion de Salir de la mision
        if(e.getSource() == mision1.btnSalir){
            int i = JOptionPane.showConfirmDialog(mision1, "Perderas el progreso obtenido en esta mision hasta ahora.\nEstas seguro?",
                    "Salir",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
            if(i == 0){
                nivelesview.setVisible(true);
                mision1.dispose();
            }else{
                
            }
        }
        //Accion de Culpar a alguien y dar este caso como atentado
        if(e.getSource() == mision1.btnAtentado){
            
        }
        //Accion de Culpar a alguien y dar este caso como homicidio
        if(e.getSource() == mision1.btnHomicidio){
            
        }
        //Accion de dar este caso como suicidio
        if(e.getSource() == mision1.btnSuicidio){
            
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Accion de ir a panel armas
        if(e.getSource() == villa.lbArmas){
            me.setPanelDeLugar(mision1.panelMision, arma);
        }
        //Accion de ir a panel Martines
        if(e.getSource() == villa.lbMartines){
            me.setPanelDeLugar(mision1.panelMision, martine);
        }
        //Accion de ir a panel Bar2Copas
        if(e.getSource() == villa.lbBar){
            me.setPanelDeLugar(mision1.panelMision, bar);
        }
        //Accion de ir a panel Ricashio
        if(e.getSource() == villa.lbRicashio){
            me.setPanelDeLugar(mision1.panelMision, ricashio);
        }
        //Accion de ir a panel Ropa
        if(e.getSource() == villa.lbTienda){
            me.setPanelDeLugar(mision1.panelMision, ropa);
        }
        
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
