package clase_6;

public class NumeroMayorYMenor {

    public void ImprimeNumeroMayorYmenor(int a, int b, int c){

        if (a > b  && a > c) {
            System.out.println("El numero Mayor es  : " + a);

        }
        else if (b > a && b > c){
            System.out.println("El numero Mayor es  : " + b);
        }
        else {
            System.out.println("El numero Mayor es  : " + c);
        }

        if (a < b  && a <  c) {
            System.out.println("El numero Menor es  : " + a);

        }
        else if (b < a && b < c){
            System.out.println("El numero Menor es  : " + b);
        }
        else {
            System.out.println("El numero Menor es  : " + c);
        }

    }
}
