package com.company.estructurascontrol.repeticion;

public class For {
    public static void main(String[] args) {

        for (int i = 0;  i <10; i++ ){
            System.out.println("Hola amigos, soy el  " + i);
        }

        String [] nombres = {"pepe","laura","silvia"};
        for (int i = 0;i < nombres.length; i++){
            System.out.println("Mi nombre es: " + nombres[i]);
        }
    }
}
