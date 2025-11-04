//Programa que lee dos números reales de tipo float y muestra la suma, resta, multiplicación, división,
// resto de la división, incremento y decremento unario.

package Ejercicios;
import java.util.Scanner;

public class Opera2 {
    public static void main (){
        Scanner entrante = new Scanner(System.in);
        float numero_1, numero_2;

        System.out.println("Introduce número flotante 1");
        numero_1 = entrante.nextFloat();


        System.out.println("Introduce número flotante 2");
        numero_2 = entrante.nextFloat();


        // Suma, resta, multiplicación, división, resto de la división

        System.out.println("La suma es: " + (numero_1 + numero_2));
        System.out.println("La resta es: " + (numero_1 - numero_2));
        System.out.println("La multiplicación es: " + (numero_1 * numero_2));
        System.out.println("La división es: " + (numero_1 / numero_2));
        System.out.println("El resto de la división es " + (numero_1 % numero_2));

        //Incremento

        ++numero_1;
        ++numero_2;

        System.out.println("El incremento de numero 1 es: " + numero_1);
        System.out.println("El incremento de numero 2 es: " + numero_2);

        //Decremento

        --numero_1;
        --numero_2;

        System.out.println("El decremento de numero 1 es: " + numero_1);
        System.out.println("El decremento de número 2 es: " + numero_2);
    }
}
