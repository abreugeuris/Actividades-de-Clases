package clase_5;

import java.util.Scanner;

public class Ejercicio4 {

    public String CalculadoraPropinas() {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Ingrese el Total de la cuenta en un restaurante : ");
        double totalCuenta = entradaDatos.nextDouble();
        System.out.println("ingrese el porcentaje  de propina que desea dejar : ");
        double porcentajePropina = entradaDatos.nextDouble();

        double propina = totalCuenta * (porcentajePropina / 100);
        double totalFinal = totalCuenta + propina;


        return "Total de la cuenta : " + totalCuenta + "\n" +
                "Porcentaje de propina : " + porcentajePropina + "%" + "\n" +
                "Propina : " + propina + "\n" +
                "Total Final (total de la cuenta + propina) :  " + totalFinal;
    }
}
