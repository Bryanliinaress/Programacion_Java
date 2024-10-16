import java.util.Scanner;

public class Ejercicio12_Tema3 {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double notaPrimerExamen= s.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double notaTrimestre= s.nextDouble();
        double notaSegundoExamen=(notaTrimestre-(notaPrimerExamen*0.4))/0.6;
        System.out.printf("Para tener un "+ notaTrimestre+" en el trimestre necesitas sacar un "+ notaSegundoExamen +" en el segundo examen");
        s.close();

    }
}
