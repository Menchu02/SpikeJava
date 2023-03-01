package com.company.funciones;

import com.sun.management.UnixOperatingSystemMXBean;

public class Funciones {
    public static void main(String[] args) {
        //1 FUNCION SIN PARAMETROS
        //showMenu();


        //2 FUNCION SIN PARAMETROS Y CON TIPO RETORNO

        String menu =getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrice();
        System.out.println(price);

        //3 FUNCION sIN PARAMETROS y sin tipo retorno
        imprimirSaludo("OpenBootcamp");





    }
    //3 FUNCION CON PARAMETROS Y CON TIPO DE RETORNO
    String nombre= "Carmen";
    String apellido = "Blanco";
    String saludo = obtenerSaludo(nombre,apellido);




      static String obtenerSaludo( String nombre, String apellido) {
          return "Buenas tardes" + nombre + apellido;

    }


    static void imprimirSaludo(String name) {
         System.out.println("Buentas tardes" + name);
    }

    static double getPrice() {
        return 123.33;
    };


    static void showMenu(){
         System.out.println("Bienvenidos");
         System.out.println("1 ver zapatillas");
         System.out.println("2 comprar zapatillas");
         System.out.println("3 salir");
    }
    static String  getMenu(){
        System.out.println("imprimiendo texto");
        return "Bienvenidos";
    }
}
