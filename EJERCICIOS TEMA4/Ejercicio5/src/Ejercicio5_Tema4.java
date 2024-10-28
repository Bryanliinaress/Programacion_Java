import java.util.Scanner;

public class Ejercicio5_Tema4 {
    /*
     * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b= 0).
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        double a = s.nextDouble();
        System.out.print("Ahora introduzca el valor de b: ");
        double b = s.nextDouble();
        if ((a != 0 && b != 0) || (a != 0)) {
            double x = (-b) / a;
            System.out.println("x= " + x);

        } else {
            System.out.println("Esa ecuación no tiene solución real.");
        }
        s.close();
    }
}
