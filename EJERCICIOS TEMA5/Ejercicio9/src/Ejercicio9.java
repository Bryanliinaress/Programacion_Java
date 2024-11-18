import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Escribe un numero y te digo cuantas cifras tiene: ");
        long numero = s.nextInt();
        int contadorCifras=0;
        int a =10;
        for (long i=1; i<=numero; i++){
            if (i==10) {
                a=a*10;
            }
            if (i<10) {
                contadorCifras= contadorCifras+ contadorCifras;
            }else if (i<100) {
                contadorCifras= contadorCifras+contadorCifras;
            }
        }
    }
}
