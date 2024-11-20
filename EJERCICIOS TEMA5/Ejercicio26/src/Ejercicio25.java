import java.util.Scanner;
/*Realiza un programa que pida un número por teclado y que luego muestre ese
 número al revés. */
public class Ejercicio25 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dame un numero de minimo 10 digitos: ");
        int numero = s.nextInt();
        if (numero < 10) {
            System.out.println("El numero ingresado no tiene 10 digitos");
        }else{
            int numeroReverso = 0;
            while (numero != 0 ) {
                int digito = numero % 10;
                numeroReverso = (numeroReverso * 10) + digito;
                numero = numero / 10;
            }
            System.out.println("El numero ingresado al reves es: " + numeroReverso);
        }    
        s.close();
    }
}
