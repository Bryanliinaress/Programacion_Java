import java.util.Scanner;

public class Ejercicio9_Tema4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("\033[31mEste programa resuelve ecuaciones de segundo grado tipo (ax²+bx+c=0)\033[39;49m");
        System.out.println("\033[31m====================================================================\033[39;49m");
        System.out.print("Introduce el valor de a: ");
        double a = s.nextDouble();
        System.out.print("Introduce el valor de b: ");
        double b = s.nextDouble();
        System.out.print("Introduce el valor de c: ");
        double c = s.nextDouble();
        double raizCuadrada = Math.pow(b, 2) - 4 * c * a;
        double x1 = (-b + raizCuadrada) / 2 * a;
        double x2 = (-b - raizCuadrada) / 2 * a;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("La ecuación tiene infinitas soluciones.");
                } else {
                    System.out.println("La ecuación no tiene solución.");
                }
            } else if (c != 0) {
                System.out.println("x1 = " + (-c / b));
            }
        } else if (b != 0) {
            if (c == 0) {
                System.out.println("x1 = 0");
                System.out.println("x2 = " + (-b / a));
            } 
            if (c != 0) {
                if (raizCuadrada < 0) {
                    System.out.println("Esta ecuacion no tiene solucion.");
                } else {
                    System.out.println("x1=" + x1);
                    System.out.println("x2=" + x2);
                }
            }
        }else if ((b == 0)  && ((c != 0) || (c == 0))) {
                if (raizCuadrada < 0) {
                    System.out.println("Esta ecuacion no tiene solucion.");
                } else {
                    System.out.println("x1=" + x1);
                    System.out.println("x2=" + x2);
                }
        }
        s.close();
        // x=(-b±√(b^2 - 4*c*a))/2*a
    }
}
