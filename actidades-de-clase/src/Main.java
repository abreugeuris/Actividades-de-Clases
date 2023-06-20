import clase_6.ActividadesClase6;
import clase_6.NumeroMayorYMenor;
import clase_7.ActividadesClase7;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        /*Ejercicio1 ejercicio1 = new Ejercicio1();
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
        }*/

        System.out.println("---Clase-6 ----");

        ActividadesClase6 actividadesClase6 = new ActividadesClase6();
//        System.out.println("---Ejercici0-1  Buscador de Google Maps--");
//
//        actividadesClase6 .buscarGoolgeMap();
//
//        System.out.println("---Ejercicio-2  Buscador de Google Maps--");
//        actividadesClase6.buscardorTweets();
//
//        System.out.println("---Ejercicio-3  Buscador de Google Maps--");
//        actividadesClase6.llamadaWhatsapp();

        NumeroMayorYMenor numeroMayorYMenor = new NumeroMayorYMenor();
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Acontinuacion ingrese 3 numeros para Saber el mayor y El menor");
        System.out.println("Digite el numero #1 : ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite el numero #2 : ");
        int numero2 = entrada.nextInt();
        System.out.println("Digite el numero #3 : ");
        int numero3= entrada.nextInt();

        numeroMayorYMenor.ImprimeNumeroMayorYmenor(numero1,numero2,numero3);

        /*System.out.println("---Clase-7----");
        ActividadesClase7 actividadesClase7 = new ActividadesClase7();
        System.out.println("---Ejercici0-1-------");
        actividadesClase7.promedioDeNumeros();*/

    }
}