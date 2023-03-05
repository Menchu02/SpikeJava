package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Coche  extends Vehiculo {

    //ATRIBUTOS ESPECIFICOS DE COCHE

    int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Coche(String fabricante, String modelo, double cc, int year, boolean sport, double speed, double velocidad, Motor motor, int numPuertas) {
        super(fabricante, modelo, cc, year, sport, speed, velocidad, motor);
        this.numPuertas = numPuertas;
    }
}
