package poo.clases;

public class Main {
    public static void main(String[] args) {

        //cracion de objetos
        //Clase identificador = new Clase();
        //este es n obj vacío, sin parametros
        Vehiculo toyota = new Vehiculo();

        //crear un obj utilizando el constructor con parámetros
        Vehiculo ford = new Vehiculo("ford","mondeo",2.2,2012,true,20,0);
        System.out.println(ford.year);
        ford.acelerar(50);
        System.out.println(ford.velocidad);

    }
}
