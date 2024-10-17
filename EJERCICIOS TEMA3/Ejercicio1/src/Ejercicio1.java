import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);

        System.out.print("Dame dos numeros y te los multiplico (Pueden tener decimales): ");
        double num1= s.nextDouble();
        double num2= s.nextDouble();
        double resultado= num1*num2;
        System.out.printf("Tus numeros multiplicados son igual a= %-6.2f", resultado);
        s.close();
    }
}
