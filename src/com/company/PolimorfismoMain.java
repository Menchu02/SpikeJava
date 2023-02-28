package com.company;

public class PolimorfismoMain {
    public static void main(String[] args) {

        Coche coche1 = new Coche();
        CocheElectrico coche2 = new CocheElectrico();
        CocheHibrido coche3 = new CocheHibrido();

        //POLIMORFISMO

        Coche coche4 = new CocheElectrico();
        Coche coche5 = new CocheHibrido();

        if (coche4 instanceof CocheElectrico ){
            System.out.println("coche electrico");


        }
        if ( coche5 instanceof  CocheHibrido){
            System.out.println("coche híbrido");
        }
        if ( coche4 instanceof  Coche){
            System.out.println("coche");
        }

    }
}
