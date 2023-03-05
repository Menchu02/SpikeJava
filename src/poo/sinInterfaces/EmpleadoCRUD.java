package poo.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * C CREATE
 * R READ/RETRIEVE
 * U UPDATE
 * D DELETE
 */

public class EmpleadoCRUD {

    //Array list para almacenar todos los empleados de una empresa
    //estructura de datos
    List<Empleado>item = new ArrayList<>();



    //Create-  guardar empleado en el array
    public void guardar(Empleado empleado){
            item.add(empleado);
    }

    //Recuperar empleados:(no recibe parametros, xo si devuelve algo)
    public List<Empleado> findAll(){
        return item;
    }



}
