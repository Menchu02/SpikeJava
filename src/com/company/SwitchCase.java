package com.company;

public class SwitchCase {
    public static void main(String[] args) {

        String weather = "sunny";
        switch (weather){

            case "sunny":
                System.out.println("El tiempo es soleado");
                break;
            case "cloudy":
                System.out.println("nublado");
                break;
            default:
                System.out.println("no sabemos el clima");
                break;
        }

    }
}
