import java.util.Scanner;

public class Ejercicio2_Tema4 {
    /*
     * Realiza un programa que pida una hora por teclado y que muestre luego buenos
     * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos
     * de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente. Sólo se tienen en cuenta
     * las
     * horas, los minutos no se deben introducir por teclado.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dame una hora leon (formato 24h):");
        double hora = s.nextDouble();
        if ((hora > 6) && (hora < 12)) {
            System.out.println("Buenos dias guapeton.");
        } else if ((hora > 12) && (hora < 20)) {
            System.out.println("Buenas tardes, tomamos cafe?");
        } else {
            System.out.println("Buenas noches que descanses, princesa.");
        }
        s.close();
    }
}
