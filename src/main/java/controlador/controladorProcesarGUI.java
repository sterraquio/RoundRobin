package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Gestion;
import modelo.Proceso;
import vista.ProcesarGUI;

// En el botón iniciar debe mostrar un JOPTIon que el usuario ingrese el Quantum deseado para los procesos.
public class controladorProcesarGUI implements ActionListener {

    private ProcesarGUI procesitoGUI;
    private Gestion procesitoGestion;
    private Proceso procesitoModelo;
    private controladorProcesarGUI ctrlGUI;

    public void controladorProcesarGUI() {

        this.procesitoGUI = new ProcesarGUI();
        this.procesitoGUI.setVisible(true);
        this.procesitoGUI.jbt_agregar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.procesitoGUI.jbt_agregar) {

            procesitoModelo = new Proceso();
            procesitoModelo.setNombreProceso(this.procesitoGUI.jtf_nombreP.getText());
            procesitoModelo.setQuantum(this.procesitoGUI.jSQuantum.getComponentCount());
            procesitoModelo.setRafagaCPU(this.procesitoGUI.jSRafaCPU.getComponentCount());

            this.procesitoGestion.getListaProcesos().add(procesitoModelo);

            this.procesitoGUI.dispose();
            javax.swing.JOptionPane.showMessageDialog(null, "Proceso agregado con exito : " + this.procesitoGUI.jtf_nombreP.getText());
        }
        
        if (e.getSource() == this.procesitoGUI.jbt_agregar) {
            controladorProcesarGUI agregarProceso = new controladorProcesarGUI();
            agregarProceso.setCtrlGUI(this);

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

    public controladorProcesarGUI getCtrlGUI() {
        return ctrlGUI;
    }

    public void setCtrlGUI(controladorProcesarGUI ctrlGUI) {
        this.ctrlGUI = ctrlGUI;
    }

}
