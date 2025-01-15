import java.util.Scanner;

public class Ejercicio3_Tema7 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int [] numero= new int[10];

        for(int i =0; i<10;i++){
            System.out.print("Introduce un numero: ");
            numero[i]=s.nextInt();
        }
        for(int i=9; i>=0;i--){
            System.out.print(numero[i]+", ");
        }
        s.close();
    }
}
