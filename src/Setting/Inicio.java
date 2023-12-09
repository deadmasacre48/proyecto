
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
        Controlador c = new Controlador(m,n);
        m.setVisible(true);
        
    }
    
}
