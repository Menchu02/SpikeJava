package poo.ejercicioOpendBootcamp;
import poo.ejercicioOpendBootcamp.SmartDevice;

public class SmartWatch extends SmartDevice{

    //ATRIBUTOS ESPECIFICOS
     String name;
     double pixeles;

    public SmartWatch() {
    }

    public SmartWatch(String name, Boolean wifi, double capacidad, String name1, double pixeles) {
        super(name, wifi, capacidad);
        this.name = name1;
        this.pixeles = pixeles;
    }
}
