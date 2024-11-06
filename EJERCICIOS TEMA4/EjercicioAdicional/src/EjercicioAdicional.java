import java.util.Scanner;

public class EjercicioAdicional {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca el precio de las entradas: ");
        double precioEntrada = s.nextDouble();
        System.out.println("¿Cual es su tipo de entrada?");
        System.out.println("1. Palco (Vip)");
        System.out.println("2. Gallinero ");
        System.out.print("Introduzca el numero que representa el tipo de tu entrada: ");
        int tipoEntrada = s.nextInt();
        System.out.println("¿Que tipo de público eres?");
        System.out.println("1. Público con invitacion.");
        System.out.println("2. Público local.");
        System.out.println("3. Público foráneo.");
        System.out.print("Introduzca el numero que representa el tipo de público: ");
        int tipoPublico = s.nextInt();
        double descuentoPalco = precioEntrada * 0.10;
        double descuentoGallinero = precioEntrada * 0.05;
        double precioTotal;
        if (tipoEntrada == 1) {
            switch (tipoPublico) {
                case 1:
                    precioTotal = precioEntrada - descuentoPalco;
                    System.out.println("El precio final es = " + precioTotal);
                    break;
                case 2:
                    precioTotal = precioEntrada;
                    System.out.println("El precio final es = " + precioTotal);
                    break;
                case 3:
                    precioTotal = precioEntrada + descuentoPalco;
                    System.out.println("El precio final es = " + precioTotal);
                    break;
                default:
                    System.out.println("Introduzca el numero que representa el tipo de público");
                    break;
            }
        } else if (tipoEntrada == 2) {
            switch (tipoPublico) {
                case 1:
                    precioTotal = precioEntrada - descuentoGallinero;
                    System.out.println("El precio final es = " + precioTotal);
                    break;
                case 2:
                    precioTotal = precioEntrada;
                    System.out.println("El precio final es = " + precioTotal);
                    break;
                case 3:
                    precioTotal = precioEntrada + descuentoGallinero;
                    System.out.println("El precio final es = " + precioTotal);
                    break;
                default:
                    System.out.println("Introduzca el numero que representa el tipo de público");
                    break;
            }
        }
        s.close();
    }
}