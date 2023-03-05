package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Motocicleta  extends Vehiculo {


    //ATRIBUTOS ESPECIFICOS DE CLASE MOTOCICLETA
    boolean baul;

    public Motocicleta() {

    }

    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, double speed, double velocidad, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, year, sport, speed, velocidad, motor);
        this.baul = baul;
    }
}
