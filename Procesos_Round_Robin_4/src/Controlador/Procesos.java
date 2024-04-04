
package Controlador;

import Vista.VistaProcesosGUI;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Procesos extends javax.swing.JFrame {
    
    private final VistaProcesosGUI procesos;
    int Contador;
    int NProceso;
    int Rafaga = 0;
    int Quantum = 0;
    int ResiduoRafaga = 0;
    int TiempoProceso = 0;
    int ValorBarra;
    int CantidadProcesos;

    public Procesos() {
    this.procesos= new VistaProcesosGUI();
    this.procesos.setVisible(true);
    }

    public void Ingresar() {

        DefaultTableModel modelo = (DefaultTableModel) procesos.jt_procesos.getModel();

        Contador++;
        Object[] miTabla = new Object[5];
        miTabla[0] = Contador;
        miTabla[1] = procesos.jtf_rafaga.getText();
        miTabla[2] = procesos.jtf_quantum.getText();
        miTabla[3] = procesos.jtf_rafaga.getText();
        miTabla[4] = "Listo";
        modelo.addRow(miTabla);
        procesos.jt_procesos.setModel(modelo);
        procesos.jtf_rafaga.setText(null);
        procesos.jtf_rafaga.grabFocus();


    }

    private void jbtn_agregarActionPerformed(java.awt.event.ActionEvent evt) {
        if ((Integer.parseInt(procesos.jtf_rafaga.getText())) <= 100) {
            Ingresar();
            procesos.jtf_quantum.setEditable(false);
        } else {
            JOptionPane.showMessageDialog(null, "Las rafagas no pueden ser mayores de 100 ");
            procesos.jtf_rafaga.setText(null);
            procesos.jtf_rafaga.grabFocus();
        }
    }

    private class Hilo implements Runnable {

        @Override
        public void run() {
           int estado = 1;
        int i = 0;

        while (estado != 0) {
            while (i < Contador) {
                Cargar(i);
                if (ResiduoRafaga != 0 && ResiduoRafaga < Quantum) {
                    for (int c = 1; c <= Quantum; c++) {
                        procesos.jt_procesos.setValueAt(String.valueOf(ResiduoRafaga), i, 3);
                        TiempoProceso++;
                        Dormir();

                    }
                    procesos.jt_procesos.setValueAt("Espera", i, 4);
                    if (ResiduoRafaga == 0) {
                        procesos.jt_procesos.setValueAt("Terminado", i, 4);
                        Pintar();
                        Informe(i);
                        Borrar(i);
                        procesos.jpb_proceso.setValue(0);

                    }

                } else {
                    if (ResiduoRafaga > 0 && Quantum != 0) {
                        while (ResiduoRafaga > 0) {
                            procesos.jt_procesos.setValueAt("Procesando", i, 4);
                            ResiduoRafaga--;
                            Barra(Rafaga, ResiduoRafaga);
                            Pintar();
                            procesos.jt_procesos.setValueAt(String.valueOf(ResiduoRafaga), i, 3);
                            TiempoProceso++;
                            Dormir();

                        }
                        procesos.jt_procesos.setValueAt("Espera", i, 4);
                        if (ResiduoRafaga == 0 && Quantum != 0) {
                            procesos.jt_procesos.setValueAt("Terminado", i, 4);
                            Pintar();
                            Informe(i);
                            Borrar(i);
                            procesos.jpb_proceso.setValue(0);

                        }

                    } else {
                        if (ResiduoRafaga == 0 && Quantum != 0) {
                            procesos.jt_procesos.setValueAt("Terminado", i, 4);
                            Pintar();
                            Informe(i);
                            Borrar(i);
                            procesos.jpb_proceso.setValue(0);

                        }
                    }
                }
                procesos.jtf_numero.setText(String.valueOf(""));
                procesos.jtf_porcentaje.setText(String.valueOf(""));
                i++;
            }
            i = 0;
            procesos.jtf_numero.setText(String.valueOf(""));
            procesos.jtf_porcentaje.setText(String.valueOf(""));
        } 
            
        }
    }
          

    public void Cargar(int i) {

        NProceso = (int) procesos.jt_procesos.getValueAt(i, 0);
        Rafaga = parseInt((String) (procesos.jt_procesos.getValueAt(i, 1)));
        Quantum = parseInt((String) (procesos.jt_procesos.getValueAt(i, 2)));
        ResiduoRafaga = parseInt((String) (procesos.jt_procesos.getValueAt(i, 3)));
        if (NProceso > 0) {
            procesos.jtf_numero.setText(String.valueOf(NProceso));

        }
    }

    public void Barra(int rafaga, int residuo) {
        int Rafaga = rafaga;
        int valor = 100 / rafaga;
        int porcentaje = 100 - (valor * residuo);
        ValorBarra = porcentaje;
        procesos.jtf_porcentaje.setText(String.valueOf(ValorBarra + "%"));

    }

    public void Pintar() {
        procesos.jpb_proceso.setValue(ValorBarra);
        procesos.jpb_proceso.repaint();
    }

    public void Borrar(int c) {
        procesos.jt_procesos.setValueAt(0, c, 0);
        procesos.jt_procesos.setValueAt("0", c, 1);
        procesos.jt_procesos.setValueAt("0", c, 2);
        procesos.jt_procesos.setValueAt("0", c, 3);
        procesos.jt_procesos.setValueAt("*****", c, 4);
    }

    public void Dormir() {
        try {
            Thread.sleep(700);
        } catch (InterruptedException ex) {
            Logger.getLogger(Procesos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Informe(int c) {
        DefaultTableModel modelo2 = (DefaultTableModel) procesos.jt_historial.getModel();

        Object[] miTabla = new Object[5];
        miTabla[0] = c + 1;
        miTabla[1] = Rafaga;
        miTabla[2] = Quantum;
        miTabla[3] = TiempoProceso + " Segundos";
        miTabla[4] = "Terminado";
        modelo2.addRow(miTabla);
        procesos.jt_historial.setModel(modelo2);

        CantidadProcesos++;
        procesos.jtf_cantidad.setText(String.valueOf(CantidadProcesos + " Terminados"));
        procesos.jtf_tiempo.setText(String.valueOf(TiempoProceso + " Segundos"));

    }

    public void Iniciar() {
        procesos.jlb_quantum.setVisible(false);
        procesos.jlb_rafaga.setVisible(false);
        procesos.jtf_quantum.setVisible(false);
        procesos.jtf_rafaga.setVisible(false);
        procesos.jbtn_agregar.setVisible(false);
        procesos.jbtn_iniciar.setVisible(false);

    }

    private void jbtn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {
        new Thread(new Hilo()).start();
        Iniciar();

    }

    
    
}
