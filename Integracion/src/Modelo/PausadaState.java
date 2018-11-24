package modelo;

import java.util.Date;

/**
 * Clase que se identifica con el estado Pausado de una tarea determinada.<br>
 */
public class PausadaState implements State {
    
    private Tarea tarea;
            
    public PausadaState(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void abrir() {
        this.tarea.setEstado(new AbiertaState(this.tarea));
    }

    @Override
    public void pausado() {
        // ERROR, YA ESTA PAUSADA.
    }

    @Override
    public void cerrar() {
        this.tarea.setFechacierre(new Date());
        this.tarea.setEstado(new CerradaState(this.tarea));
    }
    
    @Override
    public String devolverestado() {
        return "pausada";
    }
}
