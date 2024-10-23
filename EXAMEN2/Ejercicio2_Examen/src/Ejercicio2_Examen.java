import java.util.Scanner;//Declaro esto para que java pueda interpretar la clase scanner

public class Ejercicio2_Examen {
    public static final String CYAN_BACKGROUND = "\033[46m"; // CYAN
    public static final String RESET = "\033[0m"; // Text Reset

    public static void main(String[] args) throws Exception {
        // Primero declaro la clase Scanner para poder leer los datos que introduzca el
        // usuario
        Scanner s = new Scanner(System.in);
        System.out.println("LIBRERÍA DE SUEÑOS");
        System.out.println("==================");
        System.out.print("Introduce código de libro: ");// Aqui le pido el cod del libro al usuario y me lo guardo en la
                                                        // variable codigoLibro
        int codigoLibro = s.nextInt();
        System.out.print("Introduce precio: ");// Aqui hago lo mismo pero con el precio y lo guardo en la variable
                                               // precioLibro
        s.nextLine();// Esto lo pongo para que pueda leer el siguiente double y no lie
        double precioLibro = s.nextDouble();
        System.out.print("Introduce unidades vendidas: ");// Hago lo mismo con las unidades vendidas
        s.nextLine();
        int unidadesVendidas = s.nextInt();
        System.out.print("Introduce descuento (%): ");// y aqui igual con el descuento
        s.nextLine();
        int descuento = s.nextInt();
        double precioCantidad = precioLibro * unidadesVendidas;// Aqui calculo precio de la cantidad de libro comprados
                                                               // y lo guardo en la variable precioCantidad
        double descuentoLibro = precioCantidad * descuento / 100;// Aqui calculo el descuento de la cantidad de
                                                                 // precioCantidad y lo guardo en descuentoLibro
        double precioCantidadDescontada = precioCantidad - descuentoLibro;// Aqui calculo el precio de los libros con el
                                                                          // descuento
        double precioIva = precioCantidadDescontada * 0.16;// y aqui calculo el precio del iva
        double Total = precioCantidadDescontada + precioIva;// y aqui el total
        System.out.println("");// Apartir de aqui voy creando la facturilla con paciencia y rellenando cada
                               // apartado con su valor y con el %x.xd,f o s para guardar espacios a ese numero
        System.out.println("Su ticket: ");
        System.out.printf(
                "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510");
        System.out.println("");
        System.out.print("\u2502 LIBRERÍA DE SUEÑOS         \u2502");
        System.out.println("");
        System.out.printf(
                "\u251C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2524");
        System.out.println("");
        System.out.printf("\u2502 Cód. %-5d           %3.2f\u20AC\u2502", codigoLibro, precioLibro);
        System.out.println("");
        System.out.printf("\u2502 %-2d uds.              %3.2f\u20AC\u2502", unidadesVendidas, precioCantidad);
        System.out.println("");
        System.out.printf("\u2502 -%-2d%% IVA.            -%3.2f\u20AC\u2502", descuento, descuentoLibro);
        System.out.println("");
        System.out.printf("\u2502 16%% IVA.             +%3.2f\u20AC\u2502", precioIva);
        System.out.println("");
        System.out.printf("\u2502 " + CYAN_BACKGROUND + "TOTAL                %3.2f\u20AC" + RESET + "\u2502", Total);
        System.out.println("");
        System.out.printf(
                "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518");
        s.close();
        // \u2510=┐
        // \u250C=┌
        // \u251C=├
        // \u2524=┤
        // \u2502=│
        // \u2500=─
        // \u2514=└
        // \u2518=┘
    }
}
