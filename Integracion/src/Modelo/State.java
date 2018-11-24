package modelo;

/**
 * Esta interfaz se encarga del manejo de estados de las tareas.<br>
 * */
public interface State {

/**
 * Metodo por el cual las tareas ejecutan la opcion de ser abiertas.<br>
 * */
    void abrir();

    /**
     * Metodo por el cual las tareas ejecutan la opcion de ser pausadas.<br>
     * */
    void pausado();
    

    /**
     * Metodo por el cual las tareas ejecutan la opcion de ser cerradas
     * */
    void cerrar();
    String devolverestado();
}
