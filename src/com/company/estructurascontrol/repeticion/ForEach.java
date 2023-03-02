package com.company.estructurascontrol.repeticion;

public class ForEach {
    public static void main(String[] args) {
        String [] nombres = {"pepe","laura","silvia"};

        for (String nombre :  nombres){
            System.out.println(nombre);

            int contador = 0;
         int [] numeros = {2,3,4,5,6};

            for (int numero: numeros) {
                contador += numero;

            }
            System.out.println("La suma es : " + contador);

        }
    }
}
