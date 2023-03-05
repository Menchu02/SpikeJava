package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Camion  extends Vehiculo {

    //ATRIBUTOS ESPECIFICOS DE CLASE CAMION
      double capacidadCarga;


    public Camion(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Camion(String fabricante, String modelo, double cc, int year, boolean sport, double speed, double velocidad, Motor motor, double capacidadCarga) {
        super(fabricante, modelo, cc, year, sport, speed, velocidad, motor);
        this.capacidadCarga = capacidadCarga;
    }
}
