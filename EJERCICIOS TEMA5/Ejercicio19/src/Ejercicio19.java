import java.util.Scanner;


public class Ejercicio19 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la altura de tu piramide: ");
        int alturaPiramide = s.nextInt();
        System.out.print("Introduce la base de tu piramide: ");
        s.nextLine();
        String simboloPiramide = s.nextLine();
        int espacioPintado=1;
        int espacios= alturaPiramide-1;
        for (int base = 1; base<= alturaPiramide; base++){
            for (int i =1 ; i<= espacios; i++){
                System.out.print(" ");
            }
            for (int i= 1; i <= espacioPintado; i++) {
                System.out.print(simboloPiramide);
            }
            System.out.println();
            espacios--;
            espacioPintado+=2;
        }
        s.close();
    }
}
