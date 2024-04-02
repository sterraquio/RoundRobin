package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Gestion;
import modelo.Proceso;
import vista.ProcesarGUI;

public class ControladorProcesarGUI implements ActionListener {

    private ProcesarGUI procesitoGUI;
    private Gestion procesitoGestion;
    private Proceso procesitoModelo;
    private DefaultTableModel modeloTabla;

    // Constructor
    public ControladorProcesarGUI() {
        this.procesitoModelo = new Proceso();
        this.procesitoGestion = new Gestion();
        this.procesitoGUI = new ProcesarGUI();
        this.procesitoGUI.setVisible(true);
        this.procesitoGUI.jbt_agregar.addActionListener(this);
        this.procesitoGUI.jbt_iniciar.addActionListener(this);
        this.modeloTabla = (DefaultTableModel) this.procesitoGUI.jtb_lisProcesos.getModel();
    }

    // Eventos de los botones 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.procesitoGUI.jbt_agregar) {
            Proceso nuevoProceso = new Proceso();
            nuevoProceso.setNombreProceso(this.procesitoGUI.jtf_nombreP.getText());
            this.procesitoGestion.agregarProceso(nuevoProceso);
            javax.swing.JOptionPane.showMessageDialog(this.procesitoGUI, "Proceso agregado con éxito: " + nuevoProceso.getNombreProceso());
            this.procesitoGUI.jtf_nombreP.setText("");
            this.procesitoGestion.agregarProcesoATabla(modeloTabla, nuevoProceso);

        }
        
        if (e.getSource() == this.procesitoGUI.jbt_iniciar) {
            System.out.println("Ejecutando...");
            int quantum = this.procesitoModelo.getQuantum();
            this.procesitoGestion.iniciarEjecucion(quantum);
            System.out.println("Ejecución iniciada");
            // Actualizar la tabla después de iniciar la ejecución
            actualizarTabla();
        }
    }

    // Método para actualizar la tabla después de iniciar la ejecución
    public void actualizarTabla() {
        modeloTabla.setRowCount(0); // Limpiar la tabla
        for (Proceso proceso : procesitoGestion.getListaProcesos()) {
            procesitoGestion.agregarProcesoATabla(modeloTabla, proceso);
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
