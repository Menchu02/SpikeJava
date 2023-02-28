package com.company;

public class CocheMain {
    //desde aquí vamos a poder crear objetos
    public static void main(String[] args) {
        Coche cocheObj= new Coche();
        Coche cocheObj2= new Coche("rojo","honda","civid", 123.33, 5.4);

                cocheObj2.acelerar(50);

        cocheObj2.peso=1300.23;
        System.out.println(cocheObj2);
    }
}
