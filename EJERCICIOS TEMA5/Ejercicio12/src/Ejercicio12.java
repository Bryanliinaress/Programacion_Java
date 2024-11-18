import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Voy a hacer la serie de fibonacci desde cero hasta el numero que introduzcas: ");
        int numero = s.nextInt();
        int inicio=0;
        int siguiente=1;
        do {
            System.out.print(inicio+ ", ");
            inicio +=siguiente;
            System.out.print(siguiente+", " );
            siguiente= siguiente+inicio;
        } while ((inicio<=numero) || (siguiente<=numero));
        s.close();
    }
}
