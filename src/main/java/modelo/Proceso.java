
package modelo;


/**
 * @author camilotr
 */
public class Proceso {
    
    private String nombreProceso;
    private int rafagaCPU;
    private int quantum;
    
    
    // constructor 
    public Proceso(){}

    
    // gets and sets

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
    
    
    
}
