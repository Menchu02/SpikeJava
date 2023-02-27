package com.company;

import org.w3c.dom.ls.LSOutput;

public class WhileLoop {
    public static void main(String[] args) {


        int count = 0;

        while ( count<10){
            count++;
            if(count==6){
                break; // rompe el flujo
                //continue; salta el valor
            }

            System.out.println("Hola " + count );
        }
        System.out.println("fin");
    }

}
