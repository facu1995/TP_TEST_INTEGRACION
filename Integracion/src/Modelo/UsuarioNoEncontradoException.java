package modelo;
/**
 * Excepcion lanzada cuando no se encuentra un usuario ingreado para iniciar sesion.<br>
 */
public class UsuarioNoEncontradoException extends Exception {
    public UsuarioNoEncontradoException(String string, Throwable throwable, boolean b, boolean b1) {
        super(string, throwable, b, b1);
    }

    public UsuarioNoEncontradoException(Throwable throwable) {
        super(throwable);
    }

    public UsuarioNoEncontradoException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public UsuarioNoEncontradoException(String string) {
        super(string);
    }

    public UsuarioNoEncontradoException() {
        super();
    }
}
