import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);

        System.out.print("Dame dos numeros y te los multiplico (Pueden tener decimales): ");
        int num1= s.nextInt();
        double resultado= num1;
        System.out.printf("Tus numeros multiplicados son igual a= %-6.2f", resultado);
        s.close();
        System.out.println("");
        if (primo.EsPrimo(num1)) {
            System.out.println("El numero es primo");
        }else
        System.out.println("El numero no es primo");
    }
}
