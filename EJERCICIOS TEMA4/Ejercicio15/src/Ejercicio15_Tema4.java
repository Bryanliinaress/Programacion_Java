import java.util.Scanner;

public class Ejercicio15_Tema4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Elige un simbolo para su piramide:");
        String tipoCaracter = s.nextLine();
        System.out.println("Ahora dime hacie donde quieres que apunte tu piramide: ");
        System.out.println("1. Arriba ˄");
        System.out.println("2. Abajo ˅");
        System.out.println("3. Derecha ˃");
        System.out.println("4. Izquierda ˂");
        System.out.print("Elija el numero correspondinte a la direccion: ");
        int forma = s.nextInt();
        switch (forma) {
            case 1:
                System.out.println("  " + tipoCaracter);
                System.out.println(" " + tipoCaracter + tipoCaracter + tipoCaracter);
                System.out.println(tipoCaracter + tipoCaracter + tipoCaracter + tipoCaracter + tipoCaracter);
                break;
            case 2:
                System.out.println(tipoCaracter + tipoCaracter + tipoCaracter + tipoCaracter + tipoCaracter);
                System.out.println(" " + tipoCaracter + tipoCaracter + tipoCaracter);
                System.out.println("  " + tipoCaracter);
                break;
            case 3:
                System.out.println(tipoCaracter);
                System.out.println(tipoCaracter + tipoCaracter);
                System.out.println(tipoCaracter + tipoCaracter + tipoCaracter);
                System.out.println(tipoCaracter + tipoCaracter);
                System.out.println(tipoCaracter);
                break;
            case 4:
                System.out.println("  " + tipoCaracter);
                System.out.println(" " + tipoCaracter + tipoCaracter);
                System.out.println(tipoCaracter + tipoCaracter + tipoCaracter);
                System.out.println(" " + tipoCaracter + tipoCaracter);
                System.out.println("  " + tipoCaracter);
            default:
                System.out.println("Por favor elija el numero correspondiente.");
                break;
        }
        s.close();
    }
}
