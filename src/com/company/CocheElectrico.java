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

    //CONSTRUCTOR CON METODO SUPER
    public  CocheElectrico(String color, String fabricante,String modelo,  Double peso, Double largo,String motorElectrico){
         //llama a las propiedades que tenía el Coche base
        super(color,fabricante,modelo,peso,largo);
        //le añado el atributo extra que tiene el CocheElectrico
        this.motorElectrico = motorElectrico;



    }

    @Override
    public void acelerar(Integer cantidad) {
         Integer cantidadAjustada= cantidad *2;

        super.acelerar(cantidadAjustada);
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
