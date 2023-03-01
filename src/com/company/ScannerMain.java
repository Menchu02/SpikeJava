package com.company;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        //CREAR OBJETO SCANNER

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = scanner.nextLine();
        System.out.println("El nombre intoriducido es " + nombre);

    }
}
