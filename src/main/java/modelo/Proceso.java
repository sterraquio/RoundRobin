package modelo;

public class Proceso {

    private String nombreProceso;
    private int rafagaCPU;
    private int quantum;
    private int tiempoEspera;
    private int tiempoTerminacion;
    private int tiempoejecucion;
    private String estado;

    // Constructor
    public Proceso() {
    }

    // Métodos getter y setter
    public String getNombreProceso() {
        return nombreProceso;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    public int getRafagaCPU() {
        return rafagaCPU;
    }

    public void setRafagaCPU(int rafagaCPU) {
        this.rafagaCPU = rafagaCPU;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public int getTiempoTerminacion() {
        return tiempoTerminacion;
    }

    public void setTiempoTerminacion(int tiempoTerminacion) {
        this.tiempoTerminacion = tiempoTerminacion;
    }

    public int getTiempoejecucion() {
        return tiempoejecucion;
    }

    public void setTiempoejecucion(int tiempoejecucion) {
        this.tiempoejecucion = tiempoejecucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

