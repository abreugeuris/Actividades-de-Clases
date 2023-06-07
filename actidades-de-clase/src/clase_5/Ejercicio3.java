package clase_5;

import java.util.Scanner;

public class Ejercicio3 {

    public String CalculadoraDescuento() {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Ingrese el precio original de un producto : ");
        double precio = entradaDatos.nextDouble();
        System.out.println("ingrese el porcentaje de descuento : ");
        double descuento = entradaDatos.nextDouble();

        double precioFinal = precio - (precio * descuento / 100);


        return "Precio Original : " + precio + "\n"+
                "Descuento : " + descuento + "%" + "\n"+
                "Precio final con descuento aplicado :  " + precioFinal;
    }
}
