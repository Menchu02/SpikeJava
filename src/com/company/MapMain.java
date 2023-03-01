package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String,String>personas = new HashMap<>();
        personas.put("122334H", "Nombre Apellido 1");
        personas.put("122334y", "Nombre Apellido 2");
        personas.put("122334l", "Nombre Apellido 3");
        System.out.println(personas);

        //RECORRER E IMPRIMIR LOS DNI
        for(String key : personas.keySet()){
            System.out.println(key);
        }

        for(String value : personas.values()){
            System.out.println(value);
        }

        for(String value : personas.values()){
            System.out.println(value);
        }

    }
}
