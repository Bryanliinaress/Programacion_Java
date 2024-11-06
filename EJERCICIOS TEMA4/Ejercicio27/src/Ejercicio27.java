import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("De que sabor quiere la tarta (manzana, fresa o chocolate): ");
        String saborTarta = s.nextLine();
        double precioTarta;
        double precioNata;
        double precioNombre;
        if (saborTarta.equals("chocolate")) {
            System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco):");
            String tipoChocolate= s.nextLine();
            System.out.print("¿Quiere nata? (si o no): ");
            String necesidadNata = s.nextLine();
            System.out.print("¿Quiere ponerle un nombre? (si o no):");
            String necesidadNombre = s.nextLine();
            if (tipoChocolate.equals("negro")) {
                precioTarta=14;
                System.out.println("Tarta de chocolate negro: "+precioTarta+" €");
            }else{
                precioTarta=15;
                System.out.println("Tarta de chocolate blanco: "+precioTarta+" €");
            }
            if (necesidadNata.equals("si")) {
                precioNata=2.50;
                System.out.println("Con nata: "+precioNata+" €");
            }else {
                precioNata=0;
            }
            if (necesidadNombre.equals("si")) {
                precioNombre=2.75;
                System.out.println("Con nombre: "+precioNombre+" €");
            }else{
                precioNombre=0;
            }
            double totalPedido= precioNata+precioNombre+precioTarta;
            System.out.println("Total: "+totalPedido+" €");
        }
        if (saborTarta.equals("manzana")) {
            System.out.print("¿Quiere nata? (si o no): ");
            String necesidadNata = s.nextLine();
            System.out.print("¿Quiere ponerle un nombre? (si o no):");
            String necesidadNombre = s.nextLine();
            precioTarta=18;
            System.out.println("Tarta de manzana: "+precioTarta+" €");
            if (necesidadNata.equals("si")) {
                precioNata=2.50;
                System.out.println("Con nata: "+precioNata+" €");
            }else {
                precioNata=0;
            }
            if (necesidadNombre.equals("si")) {
                precioNombre=2.75;
                System.out.println("Con nombre: "+precioNombre+" €");
            }else{
                precioNombre=0;
            }
            double totalPedido= precioNata+precioNombre+precioTarta;
            System.out.println("Total: "+totalPedido+" €");
        }
        if (saborTarta.equals("fresa")) {
            System.out.print("¿Quiere nata? (si o no): ");
            String necesidadNata = s.nextLine();
            System.out.print("¿Quiere ponerle un nombre? (si o no):");
            String necesidadNombre = s.nextLine();
            precioTarta=16;
            System.out.println("Tarta de fresa: "+precioTarta+" €");
            if (necesidadNata.equals("si")) {
                precioNata=2.50;
                System.out.println("Con nata: "+precioNata+" €");
            }else {
                precioNata=0;
            }
            if (necesidadNombre.equals("si")) {
                precioNombre=2.75;
                System.out.println("Con nombre: "+precioNombre+" €");
            }else{
                precioNombre=0;
            }
            double totalPedido= precioNata+precioNombre+precioTarta;
            System.out.println("Total: "+totalPedido+" €");
        }
        s.close();
    }
}
