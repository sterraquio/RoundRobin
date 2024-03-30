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
    private ControladorProcesarGUI ctrlGUI;

    // Constructor
    public ControladorProcesarGUI() {
        this.procesitoModelo = new Proceso();
        this.procesitoGUI = new ProcesarGUI();
        this.procesitoGUI.setVisible(true);
        this.procesitoGUI.jbt_agregar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.procesitoGUI.jbt_agregar) {

            procesitoModelo = new Proceso();
            procesitoModelo.setNombreProceso(this.procesitoGUI.jtf_nombreP.getText());
//            procesitoModelo.setQuantum((int) this.procesitoGUI.jSQuantum.getValue());
            procesitoModelo.setRafagaCPU((int) this.procesitoGUI.jSRafaCPU.getValue());

            this.procesitoGestion.getListaProcesos().add(procesitoModelo);

            this.procesitoGUI.dispose();
            javax.swing.JOptionPane.showMessageDialog(null, "Proceso agregado con éxito: " + this.procesitoGUI.jtf_nombreP.getText());

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

    public ControladorProcesarGUI getCtrlGUI() {
        return ctrlGUI;
    }

    public void setCtrlGUI(ControladorProcesarGUI ctrlGUI) {
        this.ctrlGUI = ctrlGUI;
    }

    public Gestion getProcesitoGestion() {
        return procesitoGestion;
    }

    public void setProcesitoGestion(Gestion procesitoGestion) {
        this.procesitoGestion = procesitoGestion;
    }

}
