
package Setting;

import javax.swing.JList;
import javax.swing.JPanel;

public class MetodosEscenas {
    
    public void setPanelDeLugar(JPanel mision, JPanel lugar){
        lugar.setLocation(0,0);
        mision.removeAll();
        mision.add(lugar);
        lugar.setSize(mision.getWidth(), mision.getHeight());
        mision.repaint();
        mision.revalidate();
    }
    
    public void listaArmas(JList listCompradores){
        if(listCompradores.getSelectedIndex()==0 || listCompradores.getSelectedIndex()==1){
            System.out.println(listCompradores.getSelectedValue().toString());
        }
        if(listCompradores.getSelectedIndex()==3){
            System.out.println(listCompradores.getSelectedValue().toString());
        }
        if(listCompradores.getSelectedIndex()==5 || listCompradores.getSelectedIndex()==6){
            
        }
        if(listCompradores.getSelectedIndex()==8 || listCompradores.getSelectedIndex()==9){
            
        }
        if(listCompradores.getSelectedIndex()==11 || listCompradores.getSelectedIndex()==12){
            
        }
        if(listCompradores.getSelectedIndex()==14){
            
        }
        if(listCompradores.getSelectedIndex()==16 || listCompradores.getSelectedIndex()==17){
            
        }
        if(listCompradores.getSelectedIndex()==19 || listCompradores.getSelectedIndex()==20 || listCompradores.getSelectedIndex()==21){
            
        }
        if(listCompradores.getSelectedIndex()==23){
            
        }
        if(listCompradores.getSelectedIndex()==25){
            
        }
        if(listCompradores.getSelectedIndex()==27 || listCompradores.getSelectedIndex()==28){
            
        }
        if(listCompradores.getSelectedIndex()==30){
            
        }
        if(listCompradores.getSelectedIndex()==32 || listCompradores.getSelectedIndex()==33){
            
        }
        if(listCompradores.getSelectedIndex()==35){
            
        }
        if(listCompradores.getSelectedIndex()==37 || listCompradores.getSelectedIndex()==38){
            System.out.println(listCompradores.getSelectedValue().toString());
        }
        if(listCompradores.getSelectedIndex()==40){
            System.out.println(listCompradores.getSelectedValue().toString());
        }
    }
    
}
