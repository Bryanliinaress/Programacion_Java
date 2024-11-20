import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la altura de tu piramide: ");
        int numero = s.nextInt();
        int espacioPintado=1;
        int espacios= numero-1;
        for (int base = 1; base<= numero; base++){
            for (int i =1 ; i<= espacios; i++){
                System.out.print(" ");
            }
            for ( int i= 1; i-1 <= espacioPintado/2; i++) {
                System.out.print(i);
            }
            for ( int j= base-1; j>= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            espacios--;
            espacioPintado+=2;
        }
        s.close();
    }
}
