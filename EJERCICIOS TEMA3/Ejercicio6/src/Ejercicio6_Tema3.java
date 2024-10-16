import java.util.Scanner;

public class Ejercicio6_Tema3 {
    public static void main(String[] args) throws Exception {
        Scanner s =new Scanner(System.in);

        System.out.print("Escribeme la altura de tu triangulo y su base (en cm): ");
        double alturaTriangulo= s.nextDouble();
        double baseTriangulo= s.nextDouble();
        double areaTriangulo= (baseTriangulo*alturaTriangulo)/2;
        System.out.printf("La area de tu triangulo es de %-4.2f cm^2", areaTriangulo);
        s.close();
    }
}
