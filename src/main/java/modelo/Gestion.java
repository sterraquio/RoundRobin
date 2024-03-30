package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Proceso;

public class Gestion {

    private List<Proceso> listaProcesos;

    public Gestion() {
        listaProcesos = new ArrayList<>();
    }

    public void agregarProceso(Proceso procesito) {
        listaProcesos.add(procesito);
    }

    
    //Esté método posiblemente vaya en el controlador
    public void iniciarEjecucion() {
        // Aquí implementa la lógica para ejecutar los procesos
        // Puedes utilizar el algoritmo de Round Robin aquí


    }
    
    public void agregarProcesoATabla(DefaultTableModel modeloTabla, Proceso procesito) {
        Object[] fila = new Object[6];
        fila[0] = procesito.getNumeroProceso();
        fila[1] = procesito.getNombreProceso();
        fila[2] = procesito.getRafagaCPU();
        fila[3] = procesito.getQuantum();
        fila[4] = procesito.getResiduoRafaga();
        fila[5] = procesito.getEstado();
        modeloTabla.addRow(fila); // Agregar la fila al modelo de tabla
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


