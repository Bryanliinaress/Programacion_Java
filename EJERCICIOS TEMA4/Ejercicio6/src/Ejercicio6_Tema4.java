import java.util.Scanner;

public class Ejercicio6_Tema4 {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.println("Te voy a calcular lo que tarda en caer un objeto desde una altura determinada.");
        System.out.print("Introduce la altura en metros: ");
        double altura=s.nextDouble();
        double gravedad= 9.81;
        double tiempo= Math.sqrt(2*altura/gravedad);//Math.sqrt es igual a raiz cuadrada de base 2.
        System.out.printf("Su objeto desde una altura de "+altura+" metros tardaría %2.2f segundos.",tiempo);
        s.close();
    }
}
