import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("Dime de que altura quiere que sea tu piramide hueca: ");
        int alturaPiramide = s.nextInt();
        System.out.print("Dime de que caracter quieres que este formada tu piramide: ");
        s.nextLine();
        String simboloPiramide = s.nextLine();
        int base=1;
        int espacioPordelante= alturaPiramide-1;
        int espacioInterior=0;
        for ( base=1;  base<= alturaPiramide; base++){
            for (int i = 0 ; i<= espacioPordelante; i++){
                System.out.print(" ");
            }
            System.out.print(simboloPiramide);
            for(int i=1 ; i<= espacioInterior; i++){
                System.out.print(" ");
            }
            if(base>1){
                System.out.print(simboloPiramide);
            }
            System.out.println();
            espacioInterior+=2;
            espacioPordelante--;
        }
        for (int i =1 ; i <=base*2; i++)
        System.out.print(simboloPiramide);
        s.close();
    }
}
