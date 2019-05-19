//para ingresar datos desde teclado se tiene que usar"Scanner"//
import java.util.Scanner;
//se tiene que importar la sublibreria Scanner de java.util//
public class Suma {
    public static void main (String args[]){
        //para programar nuestra calculadora de sumas se hace la siguiente modificacion//
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int num_1 = 0, num_2 = 0, resul = 0;
        
        System.out.println("Â¿Cual es tu nombre?");
        nombre = in.nextLine();

        System.out.println("ingrese primer valor");
        num_1 = in.nextInt();

        System.out.println("ingrese segundo valor");
        num_2 = in.nextInt();

        resul = num_1 + num_2;

        //recordar que (+) es una concatenacion//
        System.out.println(" Hola " + nombre + " El valor de tu suma es " + resul);
        //y para que no queden todas las palabras pegadas se hace uso de espacio dentro del "": 
        //("(espacio)palabra(espacio)")
        //
    }
}
