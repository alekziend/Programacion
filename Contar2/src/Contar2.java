//Ahora pediremos dos números y contaremos desde el menor hasta el mayor

import java.util.Scanner;

public class Contar2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Pedimos dos números al usuario
        System.out.println("Introduce número A");
        int x = entrada.nextInt();
        System.out.println("Introduce número B");
        int z = entrada.nextInt();

        //Determinar menor y mayor

        int min, max;

        if (x < z) {
            min = x;
            max = z;
        } else {
            min = z;
            max = x;
        }
        //Contador al mínimo
        int cont = min;


        while (cont <= max) {
            System.out.println(cont);
            cont++;

        }

    }
}





