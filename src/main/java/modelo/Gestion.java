import java.util.ArrayList;
import java.util.List;
import modelo.Proceso;

public class Gestion {

    private List<Proceso> listaProcesos;

    public Gestion() {
        listaProcesos = new ArrayList<>();
    }

    public void agregarProceso(Proceso proceso) {
        listaProcesos.add(proceso);
    }

    public void iniciarEjecucion() {
        // Aquí implementa la lógica para ejecutar los procesos
        // Puedes utilizar el algoritmo de Round Robin aquí
    }

    public void actualizarTabla() {
        // Aquí implementa la lógica para actualizar la tabla de procesos
        // Puedes utilizar un método que actualice los datos en la interfaz gráfica
    }

    public int calcularCantidadProcesosEjecutados() {
        int cantidadEjecutados = 0;
        for (Proceso proceso : listaProcesos) {
            if (proceso.getEstado().equals("Ejecutado")) {
                cantidadEjecutados++;
            }
        }
        return cantidadEjecutados;
    }

    public double calcularTiempoPromedioTerminacion() {
        double sumaTiemposTerminacion = 0;
        for (Proceso proceso : listaProcesos) {
            sumaTiemposTerminacion += proceso.getTiempoTerminacion();
        }
        return sumaTiemposTerminacion / listaProcesos.size();
    }

    public double calcularTiempoPromedioEspera() {
        double sumaTiemposEspera = 0;
        for (Proceso proceso : listaProcesos) {
            sumaTiemposEspera += proceso.getTiempoEspera();
        }
        return sumaTiemposEspera / listaProcesos.size();
    }
}


