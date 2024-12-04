import matematicas.Ejercicio1_14;

public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        for (int i = 1 ; i<=1000;i++){
            if (Ejercicio1_14.EsPrimo(i)) {
                System.out.print(i+",");
            }
        }
    }
}
