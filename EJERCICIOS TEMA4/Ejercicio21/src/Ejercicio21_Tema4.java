import java.util.Scanner;

public class Ejercicio21_Tema4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("\033[31mNota trimestre de Programación.");
        System.out.println("===================================\033[49;39m");
        System.out.print("Introduce tu nota del primer examen: ");
        double notaExamen1= s.nextDouble();
        System.out.print("Introduce tu nota del segundo examen: ");
        double notaExamen2= s.nextDouble();
        double notaMedia= (notaExamen1+notaExamen2)/2;
        if (notaMedia>=5) {
            System.out.println("Tu nota en programación es \033[33m"+notaMedia+"\033[49;39m");
        }else {
            System.out.println("¿Cual ha sido tu resultado en la recuperación (apto/no apto)?");
            s.nextLine();
            String respuestaRecuperacion= s.nextLine();
            if (respuestaRecuperacion.equals("apto")) {
                System.out.println("Tu nota en programación es\033[31m 5\033[49;39m");
            }else{
                System.out.println("Tu nota en programación es \033[31m"+notaMedia+"\033[49;39m");
            }
        }
        s.close();
    }
}