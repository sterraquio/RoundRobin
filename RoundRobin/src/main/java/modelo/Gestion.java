package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Proceso;
import vista.ProcesarGUI;

public class Gestion {

    private List<Proceso> listaProcesos;
    private DefaultTableModel modeloTabla;

    //Constructor
    public Gestion() {
        listaProcesos = new ArrayList<>();
    }

    public void agregarProceso(Proceso procesito) {
        procesito.setNumeroProceso(listaProcesos.size());
        listaProcesos.add(procesito);
    }

    //Esté método posiblemente vaya en el controlador
    public void iniciarEjecucion(int quantum) {
        int tiempoActual = 0;

        while (hayProcesosPendientes()) {
            for (Proceso proceso : listaProcesos) {
                if (proceso.getEstado().equals("Listo")) {
                    // Ejecutar una parte de la ráfaga según el quantum
                    int tiempoEjecutado = Math.min(quantum, proceso.getResiduoRafaga());
                    proceso.setResiduoRafaga(proceso.getResiduoRafaga() - tiempoEjecutado);

                    actualizarResiduoRafagaEnTabla(proceso, tiempoEjecutado);

                    // Actualizar tiempo de ejecución total del proceso
                    proceso.setTiempoejecucion(proceso.getTiempoejecucion() + tiempoEjecutado);

                    // Si el proceso ha terminado su ráfaga
                    if (proceso.getResiduoRafaga() == 0) {
                        proceso.setEstado("Terminado");
                        proceso.setTiempoTerminacion(tiempoActual + tiempoEjecutado);
                    } else {
                        proceso.setEstado("Listo");
                    }

                    // Actualizar tiempo de espera de otros procesos
                    for (Proceso otroProceso : listaProcesos) {
                        if (otroProceso != proceso && otroProceso.getEstado().equals("Listo")) {
                            otroProceso.setEstado("En espera");
                            otroProceso.setTiempoEspera(otroProceso.getTiempoEspera() + tiempoEjecutado);
                        }
                    }

                    // Actualizar tiempo actual
                    tiempoActual += tiempoEjecutado;
                }
            }
        }
    }

    public void actualizarResiduoRafagaEnTabla(Proceso proceso, int tiempoEjecutado) {
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            if (modeloTabla.getValueAt(i, 0).equals(proceso.getNumeroProceso())) {
                int residuoActual = (int) modeloTabla.getValueAt(i, 4); // Obtener el residuo actual
                int nuevoResiduo = residuoActual - tiempoEjecutado; // Calcular el nuevo residuo
                modeloTabla.setValueAt(nuevoResiduo, i, 4); // Actualizar el valor en la tabla
                modeloTabla.fireTableDataChanged(); // Notificar cambio en los datos
                break;
            }
        }
    }

    public boolean hayProcesosPendientes() {
        for (Proceso proceso : listaProcesos) {
            if (proceso.getEstado().equals("Listo") || proceso.getEstado().equals("En espera")) {
                return true;
            }
        }
        return false;
    }

    public void agregarProcesoATabla(DefaultTableModel modeloTabla, Proceso proceso) {
        Object[] fila = new Object[6];
        fila[0] = proceso.getNumeroProceso(); // Ajusta el número de proceso según tu implementación
        fila[1] = proceso.getNombreProceso(); // Asigna el nombre del proceso a la segunda columna
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

    public int actualizarRafaga(int rafaga, int quantum) {
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

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

}
