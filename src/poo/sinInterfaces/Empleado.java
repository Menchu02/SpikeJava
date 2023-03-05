package poo.sinInterfaces;

public class Empleado {

    //Atriubutos
    String nombre;
    int edad;
    double salario;
    boolean alta;

    //Constructor

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

//Metodos

    //Metodo toString sirve para poder imprimir por consola
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
