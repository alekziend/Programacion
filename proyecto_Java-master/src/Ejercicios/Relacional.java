
//Programa que muestra el resultado de comparar dos números (enteros o reales), si son iguales, distintos, mayor, menor,...
package Ejercicios;
import java.util.Scanner;

public class Relacional {
    public static void main (){
        Scanner entrada = new Scanner(System.in);
        int numero_1, numero_2;

System.out.println ("Introduce número 1");
numero_1 = entrada.nextInt();

System.out.println ("Introduce número 2");
numero_2 = entrada.nextInt();

//¿Son iguales?

System.out.println("Los números son iguales: " + (numero_1==numero_2));


//¿Son distintos?

System.out.println ("Los números son distintos: " + (numero_1!=numero_2));

//Mayor

System.out.println ("Numero 1 es mayor que numero 2 " + (numero_1>numero_2));

//Menor

System.out.println ("Numero 1 es menor que numero 2 " + (numero_1<numero_2));

    }
}
