package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Gestion;
import modelo.Proceso;
import vista.ProcesarGUI;

public class ControladorProcesarGUI implements ActionListener {

    private ProcesarGUI procesitoGUI; //vista de la interzas
    private Gestion procesitoGestion;//modelo.gestion
    private Proceso procesitoModelo;// modelo.proceso
    private DefaultTableModel modeloTabla; // Modelo de la tabla

    // Constructor
    public ControladorProcesarGUI() {
        this.procesitoModelo = new Proceso(); //instancia de modelo.proceso
        this.procesitoGestion = new Gestion(); // instancia de modelo.gestion
        this.procesitoGUI = new ProcesarGUI();//instancia de vista.procesarGUI
        this.procesitoGUI.setVisible(true);//hacer visible la intefaz
        this.procesitoGUI.jbt_agregar.addActionListener(this);//el escucha del boton agregar
        this.modeloTabla = (DefaultTableModel) this.procesitoGUI.jtb_lisProcesos.getModel(); // Obtener el modelo de la tabla

    }
// eventpos de los botones 

   @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == this.procesitoGUI.jbt_agregar) {
        // Crear una nueva instancia de Proceso
        Proceso nuevoProceso = new Proceso();

        // Configurar los valores del nuevo proceso
        nuevoProceso.setNombreProceso(this.procesitoGUI.jtf_nombreP.getText());
        nuevoProceso.setRafagaCPU((int) this.procesitoGUI.jSRafaCPU.getValue());
        // Aquí debes establecer el valor del quantum al proceso
        nuevoProceso.setQuantum(/* Obtiene el valor del quantum */);

        // Agregar el nuevo proceso a la lista de procesos en Gestion
        this.procesitoGestion.agregarProceso(nuevoProceso);

        // Mostrar mensaje sin cerrar la ventana principal
        javax.swing.JOptionPane.showMessageDialog(this.procesitoGUI, "Proceso agregado con éxito: " + this.procesitoGUI.jtf_nombreP.getText());

        // Limpiar campos después de agregar el proceso
        this.procesitoGUI.jtf_nombreP.setText("");
        this.procesitoGUI.jSRafaCPU.setValue(0);

        // Agregar el nuevo proceso a la tabla
        this.procesitoGestion.agregarProcesoATabla(modeloTabla, nuevoProceso);

    }
    if (e.getSource() == this.procesitoGUI.jbt_iniciar) {
        System.out.println("Ejecutando...");
        
        // Obtener el valor del quantum desde la interfaz de usuario o de donde sea necesario
        //cuando hagamos el este de que el usuario dije el quamtum pa todo el proceso asi se puede cambiar
        //pero se debe hacer el getText 
        int quantum = procesitoModelo.getQuantum();
        // Iniciar la ejecución con el quantum adecuado
        this.procesitoGestion.iniciarEjecucion(quantum);
        System.out.println("Ejecución iniciada");
    }
}


//gets y sets 
    public ProcesarGUI getProcesitoGUI() {
        return procesitoGUI;
    }

    public void setProcesitoGUI(ProcesarGUI procesitoGUI) {
        this.procesitoGUI = procesitoGUI;
    }

    public Proceso getProcesitoModelo() {
        return procesitoModelo;
    }

    public void setProcesitoModelo(Proceso procesitoModelo) {
        this.procesitoModelo = procesitoModelo;
    }

    public Gestion getProcesitoGestion() {
        return procesitoGestion;
    }

    public void setProcesitoGestion(Gestion procesitoGestion) {
        this.procesitoGestion = procesitoGestion;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
