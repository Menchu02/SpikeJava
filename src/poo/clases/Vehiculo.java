package poo.clases;

public class Vehiculo {

    // ATRIBUTOS
        protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected double speed;
    protected double velocidad;
    protected Motor motor;


//CONSTRUCTOR
    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport , double speed,double velocidad, Motor motor) {
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.cc=cc;
        this.year= year;
        this.sport=sport;
        this.speed= speed;
        this.velocidad=velocidad;
        this.motor=motor;
        }
    public Vehiculo() {
        }
    //METODOS

    public void acelerar (double cantidad) {
    this.velocidad += cantidad;

    }


    }




