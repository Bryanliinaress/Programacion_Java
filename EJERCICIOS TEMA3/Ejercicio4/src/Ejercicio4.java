import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        System.out.print("Dame dos numeros para que te los +,-./ y *");
        double num1= s.nextDouble();
        double num2= s.nextDouble();
        double suma= num1+num2;
        double resta= num1-num2;
        double multiplicacion= num1*num2;
        double division= num1/num2;
        System.out.println("La suma es igual a: "+suma);
        System.out.println("La resta es igual a: "+resta);
        System.out.println("La multiplicacion es igual a: "+multiplicacion);
        System.out.println("La division es igual a: "+division);
        s.close();
    }
}
