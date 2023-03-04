package poo.clases;

public class Vehiculo {

    // ATRIBUTOS
        String fabricante;
        String modelo;
        double cc;
        int year;
        boolean sport;
        double speed;
        double velocidad;


//CONSTRUCTOR
    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport , double speed,double velocidad) {
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.cc=cc;
        this.year= year;
        this.sport=sport;
        this.speed= speed;
        this.velocidad=velocidad;
        }
    public Vehiculo() {
        }
    //METODOS

    public void acelerar (double cantidad) {
    this.velocidad += cantidad;

    }


    }




