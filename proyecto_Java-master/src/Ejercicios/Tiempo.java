//Escribe un programa que solicite al usuario una cantidad en segundos y la convierta en a días, horas, minutos y segundos.
package Ejercicios;

import java.util.Scanner;

public class Tiempo {
    public static void main () {
        int segundos, minutos, horas, dias;
        Scanner entrada = new Scanner(System.in);
//Entrada de datos
        System.out.println("Escribe una cantidad de segundos");
       segundos = entrada.nextInt();

//Cálculos

        dias = segundos / 86400;   //1 día son 86400 segundos
        segundos %= 86400;

        horas = segundos/ 3600; //1 hora son 3600 segundos
        segundos %= 3600;

        minutos = segundos / 60; //1 minuto son 60 segundos
        segundos %= 60;

        System.out.println("Equivale a " + dias + " días, " + horas + " horas " + minutos + " minutos y " + segundos + " segundos.");










    }
}
