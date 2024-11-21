import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Dame un numero de minimo 10 digitos: ");
        long numero = s.nextInt();
        System.out.print("Introduce un digito: ");
        int digitoIntroducido = s.nextInt();
        int i=0;
        if (numero < 10) {
            System.out.println("El numero ingresado no tiene 10 digitos");
        }else{
            long numeroReverso=0;
            for ( i =1 ; numero != 0; i++ ) {
                long digito = numero % 10;
                numeroReverso = (numeroReverso * 10) + digito;
                numero = numero /10;

            }
            for ( i = 1 ; numeroReverso != 0; i++){
                long digitoReverso = numeroReverso % 10;
                if (digitoReverso==digitoIntroducido){
                    System.out.println("Tu digito " + digitoIntroducido+ " se encuentra en la posicion " +i);
                }
                numeroReverso= numeroReverso /10;
            }
        }    
        s.close();
    }
}