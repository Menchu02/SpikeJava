package com.company;

public class CocheElectrico extends Coche {
    //queremos que este coche eléctrico,
    // herede de la clase Coche, que reciba todas sus propiedades o atributos


    //ATRIBUTOS
     String motorElectrico;


     //CONSTRUCTOR VACÍO
     public CocheElectrico(){


         //CONSTRUCTOR CON ATRIBUTO MOTOR ELECTRICO
     }
    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
