import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int contadorNegativos=0;
        int contadorPositivos=0;
        for(int i =0 ; i<10; i++){
            System.out.print("Introduzca numeros y te dire cuantos son positivo y cuantos negativo: ");
            int numero = s.nextInt();
            if (numero<0) {
                contadorNegativos++;
            }else
                contadorPositivos ++;
        }
        System.out.println("Has introducido "+contadorNegativos+" negativos y "+ contadorPositivos+" positivos.");
    }
}
