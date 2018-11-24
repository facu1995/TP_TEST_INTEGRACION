package modelo;

public class HayTareaAbiertaException extends Exception {
    public HayTareaAbiertaException(String string, Throwable throwable, boolean b, boolean b1) {
        super(string, throwable, b, b1);
    }

    public HayTareaAbiertaException(Throwable throwable) {
        super(throwable);
    }

    public HayTareaAbiertaException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public HayTareaAbiertaException(String string) {
        super(string);
    }

    public HayTareaAbiertaException() {
        super();
    }
}
