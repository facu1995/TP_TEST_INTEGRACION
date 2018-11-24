package modelo;

import java.util.Date;
/**
 * Clase que representa las tareas que pueden crear los colaboradores y sobre las cuales trabajaran.<br>
 */
public class Tarea {
    
    //Estado puede ser Abierta/Pausa/Cerrada
    public void setFechacierre(Date fechacierre) {
        this.fechacierre = fechacierre;
    }
    //Fecha inicio y fecha cierre automaticos al abrir/cerrar la tarea
    
    private Cliente cliente;
    private Colaborador colaborador;
    private Servicio servicio;
    private State estado;
    private Date fechainicio,fechacierre=null;
    private double costototal;
    
    public Tarea(Servicio servicio,Cliente cliente,Colaborador colaborador) {
        this.servicio = servicio;
        this.cliente = cliente;
        this.colaborador = colaborador;
        this.fechainicio = new Date();
        this.estado = new AbiertaState(this);
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public State getEstado() {
        return estado;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public Date getFechacierre() {
        return fechacierre;
    }

    public void setCostototal(double costototal) {
        this.costototal = costototal;
    }


    public Servicio getServicio() {
        return servicio;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public double getCostototal() {
        return costototal;
    }
}
