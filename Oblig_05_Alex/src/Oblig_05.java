import java.util.Scanner;

public class Oblig_05 {
    public static void main() {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        float peso, altura, indiceCorporal;
        int edad;
        char respuesta;
        String resp;
        do {
            do {
                System.out.println("Indica el peso en KG");
                peso = entrada.nextFloat();
                if (peso <= 0 || peso > 250) {
                    System.out.println("Incorrecto, introduce un peso correcto");
                }
            } while (peso <= 0 || peso > 250);
            do {
                System.out.println("Indica la altura en metros ");
                altura = entrada.nextFloat();
                if (altura <= 0 || altura > 2.50f){
                    System.out.println("Incorrecto, introduce una altura correcta");
                }

            } while (altura <= 0 || altura > 2.50f);
            do {
                System.out.println("Introduce la edad");
                edad = entrada.nextInt();
                if (edad <= 0 || edad > 100) {
                    System.out.println("Introduce una edad correcta");
                }

            } while (edad < 0 || edad > 100);

            indiceCorporal = peso / (altura * altura);

            if (indiceCorporal < 18.5) {
                System.out.println("Bajo peso");
            } else if (indiceCorporal < 25) {
                System.out.println("Peso normal");
            } else if (indiceCorporal < 30) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidad");
            }
            if (edad < 18 && indiceCorporal < 18.5) {
                System.out.println("Atención: Posible bajo en menor edad");
            } else if (edad < 60 && indiceCorporal >= 25) {
                System.out.println("Precaución: Control médico recomendado");
            } else if (edad >= 18 && edad <= 60 && indiceCorporal >= 18.5f && indiceCorporal < 25) {
                System.out.println("Salud dentro de parámetros normales");
            } else {
                System.out.println("Consulta médica aconsejada");
            }

            System.out.println("Para continuar pulse S, para terminar pulse N");
            respuesta = entradaString.nextLine().charAt(0);
            //resp = entradaString.nextLine();

            while (respuesta!= 's' && respuesta != 'n'){
                System.out.println("Valor incorrecto, escribe s o n");
                System.out.println("Para continuar pulse S, para terminar pulse N");
                respuesta = entradaString.nextLine().toLowerCase().charAt(0);
            }



        } while (respuesta == 's' || respuesta == 'S');
        //while (resp.equalsIgnoreCase("si"));

    }
}



