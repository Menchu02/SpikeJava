package com.company.estructurascontrol.condiciolnales;

public class IfElseIf {
    public static void main(String[] args) {
        String dia = "Lunes";

        //EJEMPLOS COMPARAR
        boolean resultadoNum = 5 == 5;
        System.out.println(resultadoNum);
        boolean resultado = dia.equals("Martes");
        System.out.println(resultado);

        //IF ELSE
        if (dia.equals("Lunes")) {
            System.out.println("Ánimo con la semana");
        } else if (dia.equals("Martes")) {
            System.out.println("Hoy es martes");


        } else if (dia.equals("Miercoles")) {
            System.out.println("Hoy es miercoles");

        } else if (dia.equals("Jueves")) {
            System.out.println("Hoy es jueves");

        }
    }
}
