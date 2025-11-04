//Escribe un programa que defina dos variables enteras para describir las longitudes de los lados de un rectángulo.
// El programa debe pedir, calcular y escribir en la pantalla las longitudes de los lados, el perímetro y el área del rectángulo
package Ejercicios;
import java.util.Scanner;

public class Rectángulo {
    public static void main (){
        int x, y;
        //Programa pide los números
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce lado 1 rectángulo");
        x = entrada.nextInt();

        System.out.println("Introduce lado 2 rectángulo");
        y = entrada.nextInt();

        //Realizar cáculo y muestra en pantalla:
        System.out.println("El lado 1 es: "+ x );
        System.out.println("El lado 2 es: " + y );
        System.out.println("El perimetro es: " + (2* (x + y)));
        System.out.println("El área es: " + (x * y));


    }
}
