
package Setting;

import javax.swing.JPanel;

public class MetodosEscenas {
    
    public void setVilla(JPanel mision, JPanel villa){
        villa.setLocation(0,0);
        mision.removeAll();
        mision.add(villa);
        villa.setSize(mision.getWidth(), mision.getHeight());
        mision.repaint();
        mision.revalidate();
    }
    
}
