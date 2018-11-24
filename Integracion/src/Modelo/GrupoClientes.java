package modelo;

import java.util.ArrayList;

public class GrupoClientes {
    
    private String nombre;
    private ArrayList<Cliente> clientes;
    
    public GrupoClientes(){
        super();
    }
    
    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    public void eliminarCliente(Cliente cliente){
        if(this.clientes.contains(cliente))
            this.clientes.remove(cliente);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}

