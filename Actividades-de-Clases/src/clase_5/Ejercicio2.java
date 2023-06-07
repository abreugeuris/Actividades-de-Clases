package clase_5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ejercicio2 {
    double millas=0;

    public String  conversorMillasKilometros(){
        Scanner entradaDatos = new Scanner(System.in);

        System.out.println("Digite las Milla que desea Convertir en Kilometros :");
        millas = entradaDatos.nextDouble();
        double kilometros = millas * 1.60934;
        return millas + " Millas es igual a "+ kilometros + " Kilometros" ;


    }

}
