package clase_5;

import java.util.Scanner;

public class Ejercicio1 {

    private int edad;

    public String CalculaEdadPerro() {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Cual es su edad ? : ");
        edad = entradaDatos.nextInt();
        return "La Edad de " + edad + " años de un humano equivalente en a años de perro es :" + (edad * 7) + " años ";
    }


}
