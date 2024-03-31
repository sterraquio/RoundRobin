
package controlador;
import modelo.Gestion;
import modelo.Proceso;
import vista.HistorialGUI;
import vista.ProcesarGUI;

public class ControlHistorialGUI {
    //Atributos
    private Gestion objtGestion;
    private Proceso objtProceso;
    private HistorialGUI objtHistorialGUI;
    private ProcesarGUI objtProcesarGUI;
    
    
    
    //método constructor
    public ControlHistorialGUI() {
        this.objtGestion = new Gestion();
        this.objtProceso = new Proceso();
        this.objtHistorialGUI = new HistorialGUI();
        this.objtHistorialGUI.setVisible(true);
        this.objtProcesarGUI = new ProcesarGUI();
    }
}
