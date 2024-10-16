import java.util.Scanner;

public class Ejercicio5_Tema3 {  
    public static void main(String[] args) throws Exception {
        Scanner s =new Scanner(System.in);
    
        System.out.print("Escribeme la altura de tu rectangulo y su base (en cm): ");
        int alturaRectangulo= s.nextInt();
        int baseRectangulo= s.nextInt();
        int areaRectangulo= baseRectangulo*alturaRectangulo;
        System.out.printf("La area de tu triangulo es de %-3d cm^2", areaRectangulo);
        s.close();
    }
}
