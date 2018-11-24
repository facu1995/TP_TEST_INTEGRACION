package modelo;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *  Esta clase es la encargada del almacenamiento de toda la informacion del sitema como asi tambien de la persistencia de la misma.<br>
 */
public class BaseDeDatos {
    private ArrayList<GrupoClientes> grupos = new ArrayList<GrupoClientes>();
    private ArrayList<Servicio> servicios = new ArrayList<Servicio>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Colaborador> colaboradores = new ArrayList<Colaborador>();
    private Administrador admin;
    
    public final static String nombreArchivo = "BaseDeDatos.xml";
    public BaseDeDatos() {
        super();
    }

    public void setGrupos(ArrayList<GrupoClientes> grupos) {
        this.grupos = grupos;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setColaboradores(ArrayList<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }
    public ArrayList<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public BaseDeDatos(Administrador admin) {
        this.admin = admin;
        this.admin.setBdd(this);
    }


    public ArrayList<GrupoClientes> getGrupos() {
        return grupos;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

   
    public Administrador getAdmin() {
        return admin;
    }
    /** Este metodo serializa la Base De Datos.<br>
     * <b>pre:</b> La BDD ya esta incializada en la ejecucion del programa.<br>
     * <b>post:</b> Se creo un archivo XML con la BDD en el.<br>
     */
    public void serializarBDD(){
        XMLEncoder encoder=null;
        try
        {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(BaseDeDatos.nombreArchivo)));
           
            encoder.writeObject(this);
            encoder.close();
            System.out.print("se guardo la bdd\n");
            
        } catch (FileNotFoundException e)
        {
            System.out.print("no se guardo la bdd \n");
        }
    }

    /** Este metodo deserializa la Base De Datos.<br>
     * <b>pre:</b> La BDD ya esta incializada en el archivo XML.<br>
     * <b>post:</b> Se creo un archivo XML con la BDD en el.<br>
     */
    public BaseDeDatos deserializarBDD(){
          BaseDeDatos resp=null;
           XMLDecoder decoder=null;
           try
           {
               decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(BaseDeDatos.nombreArchivo)));
               resp=(BaseDeDatos)decoder.readObject();
               decoder.close();
               System.out.println("Se deserializo");
           } catch (FileNotFoundException e)
               {
                   System.out.println("No se cargo");
             
               }
           return resp;
           }
}
