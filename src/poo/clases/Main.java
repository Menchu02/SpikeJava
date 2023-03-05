package poo.clases;

import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {

        //cracion de objetos
        //Clase identificador = new Clase();
        //este es n obj vacío, sin parametros
        Vehiculo toyota = new Vehiculo();


        Motor motorGti= new Motor("GTI",190,123.3,6);
        //crear un obj utilizando el constructor con parámetros
        Vehiculo ford = new Vehiculo("ford","mondeo",2.2,2012,true,20,0,motorGti);
        System.out.println(ford.motor);
        System.out.println(ford.year);
        ford.acelerar(50);
        System.out.println(ford.velocidad);

        Motocicleta kawasaki= new Motocicleta();
        kawasaki.fabricante="Kawasaki";
        System.out.println("fin programa");
        Vehiculo cochecito = new Vehiculo("Mercedes","Benz",12,2013,true,200,0,motorGti);
        System.out.println(cochecito);
    }
}
