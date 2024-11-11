import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime el numero del que quieres que te muestre la tabla de multiplicar: ");
        int numeroMultiplicador= s.nextInt();
        for(int i= 1; i<11; i++){
            int resultado= numeroMultiplicador*i;
            System.out.println(numeroMultiplicador+"x"+i+" = "+resultado);
        }
        s.close();
    }
}
