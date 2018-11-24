package modelo;

/**
 * Clase que se identifica con el estado CERRADO de una tarea determinada.<br>
 */
public class CerradaState implements State {
    
    private Tarea tarea;

    public CerradaState(Tarea tarea) {
        this.tarea = tarea;
        if(!this.tarea.getServicio().getTipo().equals("Fijo"))
            this.tarea.setCostototal(this.tarea.getServicio().getCosto()* (int )((this.tarea.getFechacierre().getTime() - this.tarea.getFechainicio().getTime())/3600000));
        else
            this.tarea.setCostototal(this.tarea.getServicio().getCosto());
    }

    @Override
    public void abrir() {
    }

    @Override
    public void pausado() {
    }

    @Override
    public void cerrar() {   
    }


    @Override
    public String devolverestado() {
        return "cerrada";
    }
    
}
