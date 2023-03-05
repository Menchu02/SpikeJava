package poo.ejercicioOpendBootcamp;
import poo.ejercicioOpendBootcamp.SmartDevice;

public class SmartPhone  extends SmartDevice{
    //Atributos especificos

    String name;
    boolean camara;

    //CONSTRUCTOR


    public SmartPhone() {
    }

    public SmartPhone(String name, Boolean wifi, double capacidad, String name1, boolean camara) {
        super(name, wifi, capacidad);
        this.name = name1;
        this.camara = camara;
    }
}
