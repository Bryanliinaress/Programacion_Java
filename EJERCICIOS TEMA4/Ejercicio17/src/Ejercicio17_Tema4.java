import java.util.Scanner;

public class Ejercicio17_Tema4 {
    public static void main(String[] args) throws Exception {
        Scanner s =new Scanner(System.in);
        System.out.print("Introduce un numero (Entero) y te digo su ultima cifra: ");
        int numero= s.nextInt();
        System.out.println("La ultima cifra de su numero es "+(numero%10));
        /*if (numero>100) {
            System.out.println((((numero%1000)%100)%10));
        }else if (numero>10) {
            System.out.println((numero%100)%10);
        }else{
            System.out.println(numero);
        }*/
    s.close();
    }
}
