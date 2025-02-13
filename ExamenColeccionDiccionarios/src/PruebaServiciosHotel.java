import java.util.Scanner;

/**
 * main donde se va a llevar a prueba la funcionalidad de la clase
 * ServiciosHotel.java
 * 
 * @author Bryan Linares Gonzalez
 * @version 1.0
 */
public class PruebaServiciosHotel {
    static Scanner s = new Scanner(System.in);
    /**
     * Esta funcion lee la opcion para el menu y contiene un try catch para
     * comprobar que es un entero lo introducido
     * 
     * 
     * @return numero entero
     */
    public static int leerOpcion() {
        int opcion = 0;
        boolean datoValido = false;
        while (!datoValido) {
            try {
                opcion = s.nextInt();
                datoValido = true;

            } catch (Exception e) {
                s.next();
                System.out.println();
                System.out.println("Valor introducido no valido.");
                System.out.println();
                System.out.print("Por favor, introduzca el numero de la opcion: ");
            }
        }
        return opcion;

    }

    /**
     * Esta funcion sirve para leer la palabra y poner todas las letras en
     * mayusculas
     * para facilitar la comprobacion de palabras en la clase ServiciosHotel.java,
     * además de que a mi gusto
     * es mas bonito, visualmente, verlas en mayusculas.
     * 
     * 
     * @return palabra con todas las letras en mayusculas
     */
    public static String funcionLeerString() {
        String palabra = "";
        palabra = s.nextLine();
        palabra = palabra.toUpperCase();

        return palabra;
    }

    public static void main(String[] args) {
        int opcion = 0;
        String ubicacion = "";
        String servicio = "";
        ServiciosHotel misServicios = new ServiciosHotel();
        /**
         * Muestro un menu donde el usuario pueda elegir que desea hacer
         */
        do {
            System.out.println();
            System.out.println();
            System.out.println("Servicios de hoteles");
            System.out.println("====================");
            System.out.println("1. Consultar los servicios de un hotel");
            System.out.println("2. Añadir un nuevo servicio");
            System.out.println("3. Borrar un hotel");
            System.out.println("4. Borrar un servicio de un hotel");
            System.out.println("5. Salir");
            System.out.print("Dime que opcion desea hacer: ");
            opcion = leerOpcion();
            s.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.print("Dime la ubicación del hotel que quieres que te muestre: ");
                    ubicacion = funcionLeerString();
                    misServicios.mostrarServicios(ubicacion);
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.print("Dime la ubicación del hotel que quieres añadir un servicio: ");
                    ubicacion = funcionLeerString();
                    System.out.print("Dime el servicio que quieres añadir: ");
                    servicio = funcionLeerString();
                    misServicios.anadirServicio(ubicacion, servicio);
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.print("Dime la ubicación del hotel que deseas borrar: ");
                    ubicacion = funcionLeerString();
                    misServicios.borrarHotel(ubicacion);
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Dime la ubicación del hotel el cual quieres eliminar un servicio: ");
                    ubicacion = funcionLeerString();
                    System.out.println("Dime el servicio que desea eliminar: ");
                    servicio = funcionLeerString();
                    misServicios.borrarServicios(ubicacion, servicio);
                    System.out.println();
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Gracias por usar este programa, hasta la próxima.");
                    break;

                default:
                    System.out.println();
                    System.out.println("Lo siento la opción elegida no es correcta. ");
                    break;
            }
        } while (opcion != 5);
    }
    
}
