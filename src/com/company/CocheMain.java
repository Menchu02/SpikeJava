package com.company;

public class CocheMain {
    //desde aquí vamos a poder crear objetos
    public static void main(String[] args) {
        //CRE0 UN OBJ cocheObj de tipo Coche
        Coche cocheObj= new Coche();
        //CREO UN OBJ cocheObj2 de tipo coche
        Coche cocheObj2= new Coche("rojo","honda","civid", 123.33, 5.4);
                //ACCEDO A SU PROPIEDAD ACELERAR
                cocheObj2.acelerar(50);

        cocheObj2.peso=1300.23;
        System.out.println(cocheObj2);

        //CREO UN ONJ cocheElectrico DE TIPO CocheElectrico
        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico="Ejemplo de motor";
        cocheElectrico.color="Rosa";
        cocheElectrico.fabricante="Mercedes";

        System.out.println(cocheElectrico);


        //CREO UN OBJ cocheHibriso de TIPO CocheHibrido
        CocheHibrido cocheHibrido = new CocheHibrido();
        cocheHibrido.color="Amarillo";

        System.out.println(cocheHibrido);

    }
}
