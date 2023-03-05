package poo.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
     EmpleadoCRUD empleadoCRUD= new EmpleadoCRUD();
     Empleado juanito= new Empleado("Juanito",30,40000,true);
        Empleado maria= new Empleado("Maria",30,40000,true);
        Empleado antonio= new Empleado("Antonio",30,40000,true);

        //guardar empleados
        empleadoCRUD.guardar(juanito);
        empleadoCRUD.guardar(maria);
        empleadoCRUD.guardar(antonio);
        System.out.println(maria);

        //consultar empleados
         List<Empleado> empleados=  empleadoCRUD.findAll();
        System.out.println(empleados);
    }
}
