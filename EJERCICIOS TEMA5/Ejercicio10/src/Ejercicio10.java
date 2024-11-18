import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe de que numero te calcule la media (Para terminar de introducir numeros introduce un numero negativo): ");
        double numeroTotales=0;
        double numeroIntroducido=0;
        double sumaIntroducidos=0;
        while (numeroIntroducido>=0) {
            numeroIntroducido= s.nextDouble();
            sumaIntroducidos += numeroIntroducido;
            numeroTotales=numeroTotales+1;
        }
        System.out.println("La media es "+ (sumaIntroducidos-numeroIntroducido)/(numeroTotales-1));
        s.close();
    }
}

