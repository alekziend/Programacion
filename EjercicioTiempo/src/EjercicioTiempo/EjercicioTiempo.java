package EjercicioTiempo;

import java.util.Scanner;
//Alex Cabo

//Ejercicio a entregar:
//
//Programa que lee una fecha, introduciendo día, mes y año.
//
//Realizar las comprobaciones necesarias para que el día, el mes y el año sean correctos,  en el caso de no ser una fecha correcta debes dar un mensaje de error y terminar.
//Considerar el mes de febrero como que tiene 28 días (no es necesario controlar si el año es bisiesto)
//El programa debe mostrar la fecha pasados 7 días, con respecto a la fecha introducida.

public class EjercicioTiempo {

    public static void main() {
        Scanner entrada = new Scanner(System.in);
        int dia, anyo, mes;
        int diasEnMes = 0;

        System.out.println("Introduce el día: ");
        dia = entrada.nextInt();

        System.out.println("Introduce el mes: ");
        mes = entrada.nextInt();

        System.out.println("Introduce el anyo");
        anyo = entrada.nextInt();

        //Validación del mes. Aquí controlamos que esté del 1 al 12 con un IF. Se utiliza Or para determinar el rango.

        if (mes < 1 || mes > 12) {
            System.out.println("Mes inválido");
        }
        //Determinamos los días del mes con un switch y los agrupamos en 30 y 28. Utilizamos 31 para el resto.

        switch (mes) {
            case 4: //Abril
            case 6: //Junio
            case 9: //Septiembre
            case 11: //Noviembre
                diasEnMes = 30; // Tienen 30 días
                break;
            case 2: //Febrero
                diasEnMes = 28; //Febrero tiene 28 días (no consideramos años bisiestos)
                break;
            default:
                diasEnMes = 31; //Resto de mes tienen 31. Se podría hacer también case, pero se puede acortar así.
                break;
        }

        //Operaciones

        if (dia < 1 || dia > diasEnMes) {
            System.out.println("Día inválido");  //Limitamos los días
        } else {
            if (dia + 7 <= diasEnMes) { //Añadimos 7 días si el día es menor que los días en mes
                dia = dia + 7;
            } else {
                dia = (dia + 7) - diasEnMes; //Por otro lado le restamos los días del mes a esos 7 días para evitar desborde
                mes = mes + 1;
            }
            if (mes > 12) { //Aquí sumamos un anyo y mes al llegar a diciembre.
                anyo = anyo + 1;
                mes = 1;
            }

        }

        System.out.println("La fecha del día siguiente es : " + dia + "/" + mes + "/" + anyo);
    }
}
