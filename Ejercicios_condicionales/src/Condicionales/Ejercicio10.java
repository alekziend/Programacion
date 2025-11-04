package Condicionales;
//Programa de un programa que pide la edad y nos muestra el mensaje “ERES MAYOR DE EDAD” y muestra "ERES MENOR DE EDAD".

import java.util.Scanner;

public class Ejercicio10 {
    public static void main() {
        Scanner entrada = new Scanner(System.in);
        int edad;

        System.out.println("Introduce la edad");
        edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
