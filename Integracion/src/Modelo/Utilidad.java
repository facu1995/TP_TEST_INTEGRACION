package modelo;


import java.util.Iterator;
import java.util.Observable;
/**
 * Clase de modelo que realiza las conexiones con el controlador, es aquella encargada de la relacion entre las otras partes del modelo.<br>
 */
public class Utilidad extends Observable{
    
    private BaseDeDatos bdd;
    private Colaborador colaboradorActual;
    private Administrador administradorActual;
    public final static String esAdministrador = "ADMIN";
    public final static String esColaborador = "COLABORADOR";
    private static Utilidad instance=null;
    
    private Utilidad(){
        BaseDeDatos auxBDD= new BaseDeDatos();
        auxBDD=auxBDD.deserializarBDD();
        if(auxBDD!=null)
            this.bdd=auxBDD;
        else
            this.bdd=new BaseDeDatos(new Administrador("Admin","admin@gmail.com","111","admin","123",Utilidad.esAdministrador));
    }
    
    /**
     *Metodo estatico del patron Singleton.<br>
     * @return una instancia de Utilidad.<br>
     */
    public static Utilidad getUtilidad()
    {
        Utilidad res=null;
        if(Utilidad.instance==null)
        {
            Utilidad.instance=new Utilidad();
            res=Utilidad.instance;
        }
        else 
        {
            res=Utilidad.instance;
        }
        return res;
    }
    /**
     *Metodo que verifica si el usuario ingresado por el inicio de sesion corresponde al administrador, algun colaborador o a ninguno.<br>
     * @param id: id ingresada en el inicio de sesion.<br>
     * @param contrasena: contrasena ingresada en el inicio de sesion.
     * @return Devuelve el tipo de usuario que ingreso sesion, nulo si no encontro a nadie.<br>
     * <b>pre:</b> Ya hay usuarios del sistema creados como tambien un administrador.<br>
     * <b>pos:</b> Se carga en el sistema que tipo de usuario esta activo, o informa si no encontro al usuario solicitado.<br>
     * @throws UsuarioNoEncontradoException
     */
    public String verificarUsuario(String id,String contrasena) throws UsuarioNoEncontradoException {
        boolean encontrado = false;
        String resp=null;
        if(!id.equals("")&& !contrasena.equals("")){
        if(this.bdd.getAdmin().getId().equalsIgnoreCase(id) && this.bdd.getAdmin().getContrasena().equals(contrasena)){
            this.administradorActual=(Administrador)this.bdd.getAdmin();
            encontrado=true;
            resp = Utilidad.esAdministrador;
        }
        else{
            Iterator it = this.bdd.getColaboradores().iterator();
            while(it.hasNext() && !encontrado){
                Colaborador u=(Colaborador) it.next();
                if(u.getId().equalsIgnoreCase(id) && u.getContrasena().equals(contrasena)){
                    encontrado=true;
                    this.colaboradorActual=(Colaborador) u;
                    resp = Utilidad.esColaborador;
                }
       
            }
            }
        }
        if(!encontrado){
            throw new UsuarioNoEncontradoException();
            }
        return resp;
    }

    public BaseDeDatos getBdd() {
        return bdd;
    }

    public Colaborador getColaboradorActual() {
        return colaboradorActual;
    }

    public Administrador getAdministradorActual() {
        return administradorActual;
    }

    public static Utilidad getInstance() {
        return instance;
    }


}
