import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dame un numero de minimo 10 digitos: ");
        int numero = s.nextInt();
        System.out.println("Introduce un digito: ");
        int digitoIntroducido = s.nextInt();
        if (numero < 10) {
            System.out.println("El numero ingresado no tiene 10 digitos");
        }else{
            for (int i =1 ; numero != 0; i++ ) {
                int digito = numero % 10;
                if (digito==digitoIntroducido) {
                    System.out.println("El "+digitoIntroducido+" se encuentra en la posicion "+(i+1));
                }
            }
        }    
        s.close();
        if (primo.EsPrimo(numero)) {
            System.out.println("El numero no primo");
        }else
        System.out.println("El numero es primo");
    }
}