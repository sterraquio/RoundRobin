
package Main;

import vista.VistaProcesosGUI;

public class Principal {
    public static void main (String [] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProcesosGUI().setVisible(true);

            }
        });
                }                        
    
}
