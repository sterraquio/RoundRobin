package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Proceso;
import vista.ProcesarGUI;

public class Gestion {

    private List<Proceso> listaProcesos;

    public Gestion() {
        listaProcesos = new ArrayList<>();
    }

    public void agregarProceso(Proceso procesito) {
        procesito.setNumeroProceso(listaProcesos.size());
        listaProcesos.add(procesito);
    }

    
    //Esté método posiblemente vaya en el controlador
    public void iniciarEjecucion() {
        // Aquí implementa la lógica para ejecutar los procesos
        // Puedes utilizar el algoritmo de Round Robin aquí


    }
    
public void agregarProcesoATabla(DefaultTableModel modeloTabla, Proceso proceso) {
    Object[] fila = new Object[6];
    fila[0] = proceso.getNumeroProceso(); // Ajusta el número de proceso según tu implementación
    fila[1] = proceso.getNombreProceso();
    fila[2] = proceso.getRafagaCPU();
    fila[3] = proceso.getQuantum(); // Ajusta según corresponda
    fila[4] = proceso.getResiduoRafaga(); // Ajusta según corresponda
    fila[5] = proceso.getEstado(); // Ajusta según corresponda
    modeloTabla.addRow(fila);
}





    public int calcularCantidadProcesosEjecutados() {
        int cantidadEjecutados = 0;
        for (Proceso procesito : listaProcesos) {
            if (procesito.getEstado().equals("Ejecutado")) {
                cantidadEjecutados++;
            }
        }
        return cantidadEjecutados;
    }

    public double calcularTiempoPromedioTerminacion() {
        double sumaTiemposTerminacion = 0;
        for (Proceso procesito : listaProcesos) {
            sumaTiemposTerminacion += procesito.getTiempoTerminacion();
        }
        return sumaTiemposTerminacion / listaProcesos.size();
        
    }

    public double calcularTiempoPromedioEspera() {
        double sumaTiemposEspera = 0;
        for (Proceso procesito : listaProcesos) {
            sumaTiemposEspera += procesito.getTiempoEspera();
        }
        return sumaTiemposEspera / listaProcesos.size();
    }
    
    public int actualizarRafaga(int rafaga,int quantum){
        rafaga -= quantum;
        return rafaga;
        
    }


    //Getters y setters de lista
    public List<Proceso> getListaProcesos() {
        return listaProcesos;
    }

    public void setListaProcesos(List<Proceso> listaProcesos) {
        this.listaProcesos = listaProcesos;
    }

    

    
}


