import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        double pesetas;
        System.out.print("Dime cuantos euros quieres que te pase a pesetas: ");
        double euros= s.nextDouble();
        pesetas= euros * 166.386;
        System.out.printf(+ euros + " Euros equivalan a %8.2f pesetas",pesetas);
        s.close();
    }
}
