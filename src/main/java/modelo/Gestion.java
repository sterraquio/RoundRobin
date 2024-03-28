package modelo;

import java.util.ArrayList;
import java.util.List;

public class Gestion {

    private List<Proceso> listaProcesos;

    
    //Métodos
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
    
    // Esté método posiblemente vaya en el controlador
    public void actualizarTabla() {
        // Aquí implementa la lógica para actualizar la tabla de procesos
        // Puedes utilizar un método que actualice los datos en la interfaz gráfica

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


