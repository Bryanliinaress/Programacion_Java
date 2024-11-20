import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        int numeroIntroducido= 1;
        int contadorPares=0;
        int contadorInpares=0;
        System.out.println("Ve introduciendo numeros y para para de introducir introduce un numero negativo: ");
        while (numeroIntroducido>=0) {
            numeroIntroducido=s.nextInt();
            if (numeroIntroducido>=0) {
                if ((numeroIntroducido%2)==0){
                    contadorPares++;
                }else{
                    contadorInpares++;
                }
            }
        }
        System.out.println("Has introducido "+contadorPares+" pares y "+contadorInpares+" impares.");
        s.close();
    }
}
