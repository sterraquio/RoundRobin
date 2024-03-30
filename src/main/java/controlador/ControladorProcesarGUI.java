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

    // Constructor
    public ControladorProcesarGUI() {
        this.procesitoModelo = new Proceso(); //instancia de modelo.proceso
        this.procesitoGestion = new Gestion(); // instancia de modelo.gestion
        this.procesitoGUI = new ProcesarGUI();//instancia de vista.procesarGUI
        this.procesitoGUI.setVisible(true);//hacer visible la intefaz
        this.procesitoGUI.jbt_agregar.addActionListener(this);//el escucha del boton agregar

    }
// eventpos de los botones 

    @Override
    // evento del boton agregar
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.procesitoGUI.jbt_agregar) {

            procesitoModelo.setNombreProceso(this.procesitoGUI.jtf_nombreP.getText());//obtener la info nombre proceso
            procesitoModelo.setRafagaCPU((int) this.procesitoGUI.jSRafaCPU.getValue());//info rafaga cpu
            this.procesitoGestion.getListaProcesos().add(procesitoModelo);//agregar a la lista de procesos

            // Mostrar mensaje sin cerrar la ventana principal
            javax.swing.JOptionPane.showMessageDialog(this.procesitoGUI, "Proceso agregado con éxito: " + this.procesitoGUI.jtf_nombreP.getText());

            // Limpiar campos después de agregar el proceso
            this.procesitoGUI.jtf_nombreP.setText("");
            this.procesitoGUI.jSRafaCPU.setValue(0);

            this.procesitoGestion.agregarProceso(procesitoModelo);
            this.procesitoGestion.agregarProcesoATabla(procesitoModelo);
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
