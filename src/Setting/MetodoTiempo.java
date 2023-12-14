
package Setting;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MetodoTiempo {
    
    public void Tiempo10Min(JLabel label){
        (new Thread(){
            public void run(){
                for(int i=0; i<10; i ++){
                    for(int j=00; j<61; j+=10){
                        try {
                            Thread.sleep(7000);
                            label.setText(i+":"+j);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(MetodoTiempo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Tu tiempo acabo...");
            }
        }).start();
    }
    
    
}
