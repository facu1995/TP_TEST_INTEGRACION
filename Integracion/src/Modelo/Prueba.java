package modelo;

import java.util.Calendar;
import java.util.Date;

public class Prueba {
    public Prueba() {
        super();
    }

    public static void main(String[] args) {
        
        BaseDeDatos bdd = new BaseDeDatos();
        
        Administrador admin = new Administrador("nombre", "email", "telefono", "id", "contrasena","a");
        admin.setBdd(bdd);
        
        //TAREAS ADMIN
        
        admin.crearColaborador("c1", "email", "telefono", "id", "contrasena","a");
        admin.crearColaborador("c2", "email", "telefono", "id", "contrasena","a");
        admin.crearColaborador("c3", "email", "telefono", "id", "contrasena","a");
        admin.crearColaborador("c4", "email", "telefono", "id", "contrasena","a");
        admin.crearColaborador("c5", "email", "telefono", "id", "contrasena","a");
        
        admin.crearCliente("cl1","email","telefono","cuit","razonsocial","grupo");
        admin.crearCliente("cl2","email","telefono","cuit","razonsocial","grupo");
        admin.crearCliente("cl3","email","telefono","cuit","razonsocial","grupo");
        
        admin.crearServicio("Barrer","Por hora",200);
        admin.crearServicio("Lavar","Por hora",500);
        admin.crearServicio("Cambiar piso","Fijo",1200);
        admin.crearServicio("Mudanza","Fijo",2000);
        
        
        //EL ADMINISTRADOR CREA SUS TAREAS CON DISITINTOS TIEMPOS EN EL MEDIO
        double i=0;
        try{
        admin.getBdd().getColaboradores().get(0).crearTarea(admin.getBdd().getServicios().get(0), admin.getBdd().getClientes().get(0));
        admin.getBdd().getColaboradores().get(1).crearTarea(admin.getBdd().getServicios().get(1), admin.getBdd().getClientes().get(1));
       
        admin.getBdd().getColaboradores().get(2).crearTarea(admin.getBdd().getServicios().get(2), admin.getBdd().getClientes().get(2));
 
        admin.getBdd().getColaboradores().get(3).crearTarea(admin.getBdd().getServicios().get(3), admin.getBdd().getClientes().get(0));
        admin.getBdd().getColaboradores().get(4).crearTarea(admin.getBdd().getServicios().get(1), admin.getBdd().getClientes().get(2));
        }
        catch (HayTareaAbiertaException e) {
        }      
       
        System.out.println("\n 3.2.3  (Arreglado) \n");
        //EL ADMIN SOLICITA LAS TAREAS DE TODOS LOS COLABORADORES 3.2.3
        System.out.println("EL ADMIN SOLICITA LAS TAREAS DE TODOS LOS COLABORADORES \n" + admin.solicitarTareasEnCursoColaboradores());
        //3.2.3 Funciona!
        
        
        //CREO UNA SEGUNDA TAREA
        try {
            admin.getBdd()
                 .getColaboradores()
                 .get(1)
                 .crearTarea(admin.getBdd()
                                  .getServicios()
                                  .get(0), admin.getBdd()
                                                .getClientes()
                                                .get(2));
        } catch (HayTareaAbiertaException e) {
        }

        
        
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,8);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,0);
        cal.set(Calendar.MILLISECOND,0);

        Date x = cal.getTime();
        
        
        //Date x = new Date();
        //x.setTime(15680);
        
        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.HOUR_OF_DAY,15);
        cal2.set(Calendar.MINUTE,30);
        cal2.set(Calendar.SECOND,0);
        cal2.set(Calendar.MILLISECOND,0);

        Date y = cal2.getTime();
        
        System.out.println("CUENTA /n");
        System.out.println((y.getTime()-x.getTime())/3600000);
        
        //Date y = new Date();
        //y.setTime(200000000); ;
        
        System.out.println("\n 3.2.6 (Arreglado)\n");
        //EL COLABORADOR SOLICITA SUS TAREAS EN CURSO 3.2.6
        System.out.println("" + admin.getBdd().getColaboradores().get(0).solicitarITareasEstadoIntervalo("abierta", x, y));
        //3.2.6 Funciona!!
        
        
        System.out.println("\n 3.2.1 (Arreglado) \n");
        //EL ADMIN SOLICITA EL INFORME DE UN CLIENTE EN UN DETERMINADO INTERVALO 3.2.1
        System.out.println("" + admin.solicitarInformeCliente(admin.getBdd().getClientes().get(0), x, y));
        //3.2.1 Funciona!!

        System.out.println("\n 3.2.2 (Arreglado)\n");
        //EL ADMIN SOLICITA EL INFORME DE UN COLABORADOR EN UN DETERMINADO INTERVALO 3.2.2 
        System.out.println(" " + admin.solicitarInformeColaboradorIntervalo(admin.getBdd().getColaboradores().get(0),x, y));
        //3.2.2 Funciona!!
    }
}
