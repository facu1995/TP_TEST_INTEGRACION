package modelo;

/**
 * Clase que representa al cliente del sistema.<br>
 */
public class Cliente {
    
    private String nombre,email,telefono,cuit,razonsocial,grupo;

    public String getNombre() {
        return nombre;
    }

    public Cliente() {
        super();
    }

    public Cliente(String nombre, String email, String telefono, String cuit, String razonsocial, String grupo) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.cuit = cuit;
        this.razonsocial = razonsocial;
        this.grupo = grupo;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCuit() {
        return cuit;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
