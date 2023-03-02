package com.company.estructurascontrol.repeticion;

public class Ejercicio {
    public static void main(String[] args) {
    //En este ejercicio tenéis que crear un bucle
        // que permita concatenar textos e imprima el resultado final por consola.

        String[] nombres = {"hola", "adios", "hi", "bye"};

        for(int i = 0; i< nombres.length; i++){
            System.out.println(nombres[i]);

        }
        String [] nombres1 = {"pepe","laura","silvia"};
        for (int i = 0;i < nombres1.length; i++){
            System.out.println("Los nombres de mis amigos son : " + nombres1[0] +" " + nombres1[1]+" y " + nombres1[2] );
        }
        }

}
