package clase_7;

import java.util.Scanner;

public class ActividadesClase7 {

    public void promedioDeNumeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantida de numeros a la que desea sacar el promedio :");
        int cantida =teclado.nextInt();
        int[] numeros = new int[cantida];
        int contador=0;
        double suma =0;
        while (contador < numeros.length){

            System.out.println("Digite el numero "+(contador + 1)+" : ");
            numeros[contador] = teclado.nextInt();
            suma +=numeros[contador];
            contador++;

        }
        Double promedio = suma/cantida;
        System.out.println("El promedio es = " + promedio);
    }
}
