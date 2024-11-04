import java.util.Scanner;

public class Ejercicio20_Tema4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un numero y te digo si es capicua: ");
        int numCapicua = s.nextInt();
        int primerNumero = 0;
        int ultimoNumero = 0;
        if (numCapicua < 100) {
            primerNumero = numCapicua / 10;
            ultimoNumero = numCapicua % 10;
        } else if ((numCapicua > 100) && (numCapicua < 1000)) {
            primerNumero = numCapicua / 100;
            ultimoNumero = numCapicua % 10;
        } else if (numCapicua > 1000 && numCapicua < 10000) {
            primerNumero = numCapicua / 1000;
            ultimoNumero = numCapicua % 10;
        }
        if (primerNumero == ultimoNumero) {
            System.out.println("El " + numCapicua + " si es capicua");

        } else {
            System.out.println("No es capicua");
        }
        s.close();
    }
}
