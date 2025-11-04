//Programa que lee dos números enteros de tipo int y muestra la suma, resta, multiplicación,
// división, resto de la división, incremento y decremento unario
package Ejercicios;

import java.util.Scanner;


public class Opera {
    public static void main (){
    Scanner entrada = new Scanner (System.in);
    int numero_1, numero_2; // declaramos variables

    System.out.println("Introduce número 1"); // y después añadimos el scanner
    numero_1 = entrada.nextInt();

    System.out.println("Introduce número 2");
    numero_2 = entrada.nextInt();


//Suma, resta, multipliación, división y resto
    System.out.println(numero_1 + numero_2);
    System.out.println(numero_1 - numero_2);
    System.out.println(numero_1 * numero_2);
    System.out.println(numero_1 / numero_2);
    System.out.println(numero_1 % numero_2);

//Incremento unario
    numero_1++;
    numero_2++;
    System.out.println(numero_1);
    System.out.println(numero_2);
//Decremento unario
    numero_1--;
    numero_2--;

    System.out.println(numero_1);
    System.out.println(numero_2);




    }
}
