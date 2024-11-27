import java.util.Scanner;

public class Ejercicio32_Tema6 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la longitud del sendero en metros: ");
        int longitudSendero = s.nextInt();
        for (int i = 1; i <= longitudSendero; i++) {
            int giro = (int) (Math.random() * 3) + 1;
            System.out.print("         ");
            for (int a = 1; a <= giro; a++) {
                System.out.print(" ");
            }
            System.out.print("|");
            int tipoObstaculo = (int) (Math.random() * 2) + 1;
            String formaObstaculo = "ERROR";
            if (tipoObstaculo == 1) {   
                formaObstaculo = "*";
            } else if (tipoObstaculo == 2) {  
                formaObstaculo = "O";
            }
            int obstaculo = (int) (Math.random() * 2) + 1;
            switch (obstaculo) {
                case 1:
                    System.out.println("    |");
                    break;
                case 2:
                    int posicionObstaculo = (int) (Math.random() * 4) + 1;
                    for (int b = 1; b < posicionObstaculo; b++) {
                        System.out.print(" ");
                    }
                    System.out.print(formaObstaculo);
                    switch (posicionObstaculo) {
                        case 1:
                            System.out.println("   |");
                            break;
                        case 2:
                            System.out.println("  |");
                            break;
                        case 3:
                            System.out.println(" |");
                            break;
                        case 4:
                            System.out.println("|");
                            break;
                        default:
                            break;
                    }
                default:
                    break;
            }
        }
        s.close();
    }
}
