package com.company.listas;

import java.util.ArrayList;
import java.util.List;

public class ListasMain {
    public static void main(String[] args) {
        List<String> nombres= new ArrayList<>();
        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        //FOREACH
        for(String item : nombres){
            System.out.println(item);

        }




    }
}
