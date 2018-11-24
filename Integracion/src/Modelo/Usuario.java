package modelo;


/**
 * Clase que representa a los usuarios del sistema(Administrador y Colaboradores), juntando sus atributos en comun.<br>
 */
public class Usuario{

    private String nombre,email,telefono,id,contrasena,perfil;


    public Usuario(String nombre, String email, String telefono, String id, String contrasena,String perfil) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.id = id;
        this.contrasena = contrasena;
        this.perfil=perfil;
    }

    
    public Usuario() {
        super();
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getId() {
        return id;
    }

    public String getContrasena() {
        return contrasena;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
