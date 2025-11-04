//Programa que dado un valor en millas nos lo traduce a metros
package Ejercicios;
import java.util.Scanner;

public class Millas {

    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);
    //Declaramos x como millas;
    float x;

//A continuación multiplicamos x * 1609,34, que equivale a 1 milla. Luego escribimos (float) para una conversión explicita.
    System.out.println("Introduce las millas");
    x = entrada.nextFloat();
    x = (float) (x*1609.34);
    System.out.println("La conversión a metros es: "+ x);






    }

}
