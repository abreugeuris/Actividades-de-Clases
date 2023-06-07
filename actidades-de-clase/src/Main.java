import clase_5.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Ejercicio1 ejercicio1 = new Ejercicio1();
        System.out.println("---Ejercicio-1 Calculadora de edad de perros.---");
        System.out.println(ejercicio1.CalculaEdadPerro());

        System.out.println("---Ejercicio-2 Conversor de millas a kilómetros---");
        Ejercicio2 ejercicio2 = new Ejercicio2();
        System.out.println(ejercicio2.conversorMillasKilometros());

        System.out.println("--- Ejercicio-3  Calculadora de descuento---");
        Ejercicio3 ejecicio3 = new Ejercicio3();
        System.out.println( ejecicio3.CalculadoraDescuento());

        System.out.println("--- Ejercicio-4  Calculadora de Propinas---");
        Ejercicio4 ejecicio4 = new Ejercicio4();
        System.out.println( ejecicio4.CalculadoraPropinas());

        System.out.println("--- Ejercicio-5 Juego de adivinar el número ---");
        Ejercicio5 ejecicio5 = new Ejercicio5();

        int numeroAleatorio = ejecicio5.generaNumeroAleatorio();
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Introduzca un numero en el rango 0-100 : ");
        int numero = entradaDatos.nextInt();

        if (numero == numeroAleatorio) {
            System.out.println("haz adivinado el nuemro, Felicitaciones!!!!");
        } else {
            System.out.println("Lo siento, Intentalo nuevamente!");
        }


    }
}