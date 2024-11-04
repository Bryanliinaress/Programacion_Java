import java.util.Scanner;

public class Ejercicio18_Tema4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero de max 5 cifras: ");
        int numero = s.nextInt();
        if (numero > 99999) {
            System.out.println("Numero no valido.");

        } else if (numero < 10) {
            System.out.println("La primera cifra es " + numero);
        } else if ((numero >= 10) && (numero < 100)) {
            System.out.println("La primera cifra es " + numero / 10);
        }else if ((numero >= 100) && (numero < 1000)) {
            System.out.println("La primera cifra es " + numero / 100);
        }else if ((numero >= 1000) && (numero < 10000)) {
            System.out.println("La primera cifra es " + numero / 1000);
        }else if (numero <= 99999) {
            System.out.println("La primera cifra es " + numero / 10000);
        }
        s.close();
    }
}
