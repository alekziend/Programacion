//Programa que solicita el radio de una circunferencia y muestra la longitud de la circunferencia,
// el área del círculo que se crea y el volumen de la esfera que forma.
package Ejercicios;
import java.util.Scanner;

public class Circunferencia {
    public static void main(){
        float radio, longitud, area, volumen;
//Solicitamos radio al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el radio de una circurferencia");
        radio = entrada.nextFloat();

        //Mostramos los cálculos

        longitud = (float) (2 * Math.PI * radio);
        System.out.println("La longitud de la circunferencia es: " + longitud);
        area = (float) (Math.PI * Math.pow(radio, 2));
        System.out.println("Área del círculo = " + area);
        volumen = (float) ((4.0/3.0) * Math.PI * Math.pow(radio,3));
        System.out.println("El volumen es: " + volumen);




    }
}
