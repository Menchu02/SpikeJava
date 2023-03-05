package poo.ejercicioOpendBootcamp;

public class Main {
    public static void main(String[] args) {


        SmartDevice padre = new SmartDevice("Padre",true,200);
        SmartPhone hijoMv = new SmartPhone("HijoMv",true,10,"HijoName",false);
        SmartWatch hijoWatch = new SmartWatch("HijoWatch", false,200,"HijoName",300);
        System.out.println(padre);
        System.out.println(hijoMv);
        System.out.println(hijoWatch);


    }
}
