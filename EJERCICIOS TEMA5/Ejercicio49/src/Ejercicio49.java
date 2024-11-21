import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo.");
        int contadorNumeros=0;
        int noPrimos=0;
        int numMaximo=0;
        int numMinimo=1000000;
        for (int i = 0; i < 50; i++) {
            int num = s.nextInt();
            if (primo.EsPrimo(num)==false) {
                contadorNumeros++;
                noPrimos = noPrimos+num;
                if (num>numMaximo) {
                    numMaximo = num;
                }
                if (num<numMinimo) {
                    numMinimo = num;
                }
            }else{
                i=50;
            }
        }
        System.out.println("Ha introducido "+contadorNumeros+" números no primos");
        System.out.println("Máximo: "+numMaximo);
        System.out.println("Mínimo: "+numMinimo);
        System.out.println("Media: "+(double)noPrimos/contadorNumeros);
        s.close();
    }
}
