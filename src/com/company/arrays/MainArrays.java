package com.company.arrays;

public class MainArrays {
    public static void main(String[] args) {
        //array de notas de valores enteros con 10posiciones
        int [] notas = new int[10];
        notas[0]= 8;
        notas[1]= 4;
        System.out.println(notas[0]);

        int []notas2= {2,3,4,5,6,7,9};
        for(int i = 0; i< notas.length; i++){
            System.out.println(notas2[i]);
        }
        for(int item:notas2){
            System.out.println(item);
        }



    }
}
