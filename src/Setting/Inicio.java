
package Setting;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import proyecto.*;

public class Inicio {
    
    public static void main(String args[]) throws UnsupportedLookAndFeelException{
        UIManager.setLookAndFeel(new HiFiLookAndFeel());
        Menu m = new Menu();
        Niveles n = new Niveles();
        Mision01 m1 = new Mision01();
        Controlador c = new Controlador(m,n,m1);
        m.setVisible(true);
        
    }
    
}
