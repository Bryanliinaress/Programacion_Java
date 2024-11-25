public class Ejercicio25_Tema6 {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 100; i++) {
            int numeroAleatorio = (int) ((Math.random() * 190+1) + 10);
            if (primo.EsPrimo(numeroAleatorio)) {
                System.out.print("#" + numeroAleatorio + "# ");
            } else if ((numeroAleatorio % 5) == 0) {
                System.out.print("[" + numeroAleatorio + "] ");
            } else {
                System.out.print(numeroAleatorio + " ");
            }
        }
    }
}
