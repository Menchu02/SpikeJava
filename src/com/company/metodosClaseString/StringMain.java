package com.company.metodosClaseString;

public class StringMain {
    public static void main(String[] args) {

        String mensaje= "     Hola amigos";
        System.out.println(mensaje.length());
        String nebsajeMayusculas = mensaje.toUpperCase();
        System.out.println(nebsajeMayusculas);
        System.out.println(mensaje.trim());

        String otro = "HOLA MUNDO";
        if(nebsajeMayusculas.equals(otro)){
            System.out.println("verdadero");
        }

    }
}
