package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Gestion;
import modelo.Proceso;
import vista.ProcesarGUI;

public class ControladorProcesarGUI implements ActionListener {

    private ProcesarGUI procesitoGUI;
    private Gestion procesitoGestion;
    private Proceso procesitoModelo;

    // Constructor
    public ControladorProcesarGUI() {
        this.procesitoModelo = new Proceso();
        this.procesitoGestion = new Gestion(); // Asegúrate de crear una instancia de Gestion
        this.procesitoGUI = new ProcesarGUI();
        this.procesitoGUI.setVisible(true);
        this.procesitoGUI.jbt_agregar.addActionListener(this);

    }

    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == this.procesitoGUI.jbt_agregar) {
        procesitoModelo = new Proceso();
        procesitoModelo.setNombreProceso(this.procesitoGUI.jtf_nombreP.getText());
        procesitoModelo.setRafagaCPU((int) this.procesitoGUI.jSRafaCPU.getValue());
        this.procesitoGestion.getListaProcesos().add(procesitoModelo);
        
        // Mostrar mensaje sin cerrar la ventana principal
        javax.swing.JOptionPane.showMessageDialog(this.procesitoGUI, "Proceso agregado con éxito: " + this.procesitoGUI.jtf_nombreP.getText());
        
        // Limpiar campos después de agregar el proceso
        this.procesitoGUI.jtf_nombreP.setText("");
        this.procesitoGUI.jSRafaCPU.setValue(0);
    }
}



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
