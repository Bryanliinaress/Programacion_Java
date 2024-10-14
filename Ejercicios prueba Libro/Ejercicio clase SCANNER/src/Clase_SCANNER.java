import java.util.Scanner;

public class Clase_SCANNER {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("Escribeme tu nombre y tu edad: ");
        String Nombre= s.next();
        int Edad= s.nextInt();
        System.out.println("Tu nombre es " +Nombre +" y tu edad es "+ Edad+ " años");
        s.close();
    }
}
