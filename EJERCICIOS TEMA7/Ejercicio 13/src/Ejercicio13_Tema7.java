import java.util.Scanner;

public class Ejercicio13_Tema7 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int maximo = 0;
        int minimo = 100;
        int comprobador1 = 0;
        int comprobador2 = 0;
        int[] arr = new int[100];
        int eleccionPersona = 0;
        for (int i = 0; i < 100; i++) {
            arr[i] = (int) (Math.random() * 501);

            if (arr[i] < minimo) {
                minimo = arr[i];
                comprobador1 = i;
            }
            
            if (arr[i] > maximo) {
                maximo = arr[i];
                comprobador2 = i;
            }
        }

        for (int a: arr) {
            System.out.print(a + "  ");
        }
        System.out.println();
        System.out.print("¿Qué quieres destacar? (1-mínimo, 2-máximo)");
        eleccionPersona = s.nextInt();
        System.out.println();
        switch (eleccionPersona) {
            case 1:
                for (int i = 0; i < 100; i++) {
                    if (i != comprobador1) {
                        System.out.print(arr[i] + "  ");
                    } else {
                        System.out.print("**" + arr[i] + "**  ");
                    }
                }
                break;

            case 2:
                for (int i = 0; i < 100; i++) {
                    if (i != comprobador2) {
                        System.out.print(arr[i] + "  ");
                    } else {
                        System.out.print("**" + arr[i] + "**  ");
                    }
                }
                break;

            default:
                System.out.println("ERROR");
                break;

        }
        s.close();
    }
}
