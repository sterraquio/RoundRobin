package modelo;

import java.util.ArrayList;
import java.util.List;
import modelo.Proceso;


public class Gestion {

    private List<Proceso> listaProcesos = new ArrayList();
    private Proceso procesito;

    public Gestion() {
        listaProcesos = new ArrayList<>();
        procesito = new Proceso();

    }

    public void ingresarProceso(Proceso procesito) {
        listaProcesos.add(procesito);

    }

    public List<Proceso> getListaProcesos() {
        return listaProcesos;
    }

    public void setListaProcesos(List<Proceso> listaProcesos) {
        this.listaProcesos = listaProcesos;
    }

}
