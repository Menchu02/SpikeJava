package com.company.funcioness;

public class Funcioness {
    public static void main(String[] args) {

      //1 FUNCIÓN SIN PARAMETOS Y SIN TIPO DE RETORNO
        showMenu();

        //2 FUNCIÓN SIN PARÁMETROS Y CON TIPP RETORNO
        String menu = getMenu();
        System.out.println(menu);

        //2 otro ejemplo con números...
         double price = getPrice();
        System.out.println(price);

        //3 FUNCIÓN CON PARAMETROS Y SIN TIPO DE RETORNO
        //paso dentro de los parametros lo que quiero que reciba la función
        imprimirSaludoBuenosDias("OpenBootcamp");

        //4 FUNCION CON PARAMETRO Y CON RETORNO
         String saludo= obtenerSaludo("Carmen", "Blanco");
        System.out.println(saludo);

        int resultadoSuma= suma( 50, 200);

        int resultadoSuma2= suma( 54440, 200);
        System.out.println( "el resultado es " + resultadoSuma);
        System.out.println( "el resultado es " +resultadoSuma2);

        // 5 CREAR UNA FUNCION QUE RECIBA UN PRECIO Y DEVULVA EL PRECIO CON IVA

        double total = getPriceIva( 23.3  );
        System.out.println(total);
    }




    //1 VOID INDICA QUE NO DEVUELVE NADA LA FUNCION
     static void  showMenu(){
        System.out.println("sopa");
         System.out.println("macarrones");
         System.out.println("verduras al horno");

    }

    //2 FUNCIÓN SIN PARAMETROS CON RETORNO
    static String getMenu(){
        return "Menu : \n sopa \n macarrones \n verduras al horno";

    }
    //2 otro ejmplo con números...
    static double getPrice() {
        return 100.99;
    }

    // 3 FUNCIÓN CON PARÁMETROS Y SIN RETORNO
    static void imprimirSaludoBuenosDias(String name) {
        System.out.println("Buenas tardes " + name);
    }

    //4 FUNCIÓN CON PARÁMETROS Y CON RETORNO
     static String obtenerSaludo( String name, String apellido) {
        return "Bienvenida al mundo Java " + name + "  "+ apellido;
    }
     static int suma(int num1, int num2) {
        return   num1 + num2 ;
    }

    // 5 CREAR UNA FUNCION QUE RECIBA UN PRECIO Y DEVULVA EL PRECIO CON IVA
    static double getPriceIva(double precio) {
        return precio + (precio * 21 / 100) ;
    }

}
