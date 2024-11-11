import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numeroSecreto=0;
        while (numeroSecreto>=10000 || numeroSecreto==0) {
            System.out.print("Dime el numero de tu caja fuerte (Max 4 cifras): ");
            numeroSecreto= s.nextInt();
            System.out.println("");
        }
        for (int i=1; i<=4; i++){
            System.out.print("Introduzca la clave secreta: ");
            int claveUsuario= s.nextInt();
            System.out.println("");
            if (numeroSecreto==claveUsuario) {
                System.out.println("\033[0;32mFelicidades, puedes llevarte todo el dinero.\033[49;39m]");
                break;
            }else{
                System.out.println("Error, llevas "+i+"/4 intentos.");
                System.out.println("");
            }if (i==4) {
                System.out.println("\033[31mLo siento te quedas si en el tesoro.\033[0m");
                
            }
        }
        s.close();
    }
}
