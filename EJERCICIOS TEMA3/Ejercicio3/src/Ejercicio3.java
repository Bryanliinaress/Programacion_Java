import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        double euros;
        System.out.println("Dime cuantas pesetas quieres que te convierta a Euros: ");
        double pesetas= s.nextDouble();
        euros= pesetas / 166.386;
        System.out.printf(+ pesetas + " Pesetas equivalan a %4.2f euros",euros);
        s.close();
    }
}
