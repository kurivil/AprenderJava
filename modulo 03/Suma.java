//tipos de datos en java
//  Primitivos (se escriben con minusculas)
//      Enteros
//          *byte (-128 hasta 127)
//          *short(-32768 hasta 32767)        
//          *int  (-2147483648 hasta 2147483647)
//          *long (muy grande...)
//      Decimales
//          *float
//          *double
//      Otros
//          *char   (un solo caracter)
//          *boolean (true|false)
//  Tipo objeto (hay que invocarlos, se escriben con mayusculas puesto que son clases)
//          *String (cadenas de texto) :("Hola mundo")
//  Variable
//Espacio en memoria donde se van alojar informacion de tipo numerico o tipo texto
//Consta de dos elementos:
//Tipo:(datos, sea texto o numerico, seĂ±alado en los datos primitivos) 
//Nombre: (nombre de la variable en cuestion, sin espacios y si se le quiere asignar espacio debe llevar un guion "_", o bien escribirlos semejante a esto "VariableCuantito" )
//
public class Suma {
    public static void main (String args[]){

        int num_1 = 9;
        int num_2 = 14;
        int resul = 0;

        resul = num_1 + num_2;
        System.out.println("el valor de tu suma es:" + resul);
    }
}
