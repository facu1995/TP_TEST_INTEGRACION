package modelo;

public class Servicio {
    /**
     * Clase que representa el Servicio solicitado por el cliente en el sistema<br>;
     */
    public static final String porHora="Por Hora";
    public static final String Fijo="Fijo";
    private String descripcion,tipo;
    private int costo;

    public Servicio() {
        super();
    }

    public Servicio(String descripcion, String tipo, int costo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.costo = costo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getTipo() {
        return tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
