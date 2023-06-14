package clase_6;

import java.util.Scanner;

public class ActividadesClase6 {

    private  String url;

    public void  buscarGoolgeMap(){

        this.url ="https://www.google.com/maps/search/";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite la ubicacion que desea buscar : ");
        String pais = teclado.nextLine();
        System.out.println(url + pais);

    }
    public void buscardorTweets(){
        this.url ="https://twitter.com/search?q=";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el nomnre de la celebridad que desea buscar : ");
        String palabra = teclado.nextLine();
        System.out.println(url + palabra);

    }
    public void llamadaWhatsapp(){
        this.url ="https://api.whatsapp.com/send?phone=1";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el numero al que desea llamar : ");
        String numero = teclado.nextLine();
        System.out.println(url + numero);

    }

}
