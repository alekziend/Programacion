// Programa que muestra, en varias líneas el siguiente mensaje (esta vez el nombre de la persona debe solicitarse primero).
package Ejercicios;

import java.util.Scanner;

public class Saludo2 {
    public static void main (String []args ){
        Scanner name = new Scanner(System.in); //Creación de objeto scanner
        System.out.println("Introduzca su nombre");

        String User_name = name.nextLine();
        System.out.println ("Sr/a " + User_name);
        System.out.println ("Que tenga un buen día");
    }
}
