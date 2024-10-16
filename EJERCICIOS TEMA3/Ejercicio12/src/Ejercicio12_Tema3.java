import java.util.Scanner;

public class Ejercicio12_Tema3 {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double notaPrimerExamen= s.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double notaTrimestre= s.nextDouble();
        double notaSegundoExamen=(notaTrimestre-(notaPrimerExamen*0.4))/0.6;
        System.out.printf("Para tener un "+ "\033[32m"+ notaTrimestre+ "\033[39;49m en el trimestre necesitas sacar un\033[31m %-2.2f\033[39;49m en el segundo examen",notaSegundoExamen);
        s.close();

    }
}
