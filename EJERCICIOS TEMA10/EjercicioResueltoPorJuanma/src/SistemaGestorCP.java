import java.util.Scanner;

public class SistemaGestorCP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GestorCP miGestorCP = new GestorCP();
        int opcion = 0;
        String provincia = "";
        int codigoPostal = 0;  
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("Gestionar provincias y codigos Postales");
            System.out.println("=======================================");
            System.out.println("1. Añadir Provincia y/o codigo Postal");
            System.out.println("2. Borrar provincia ");
            System.out.println("3. Borrar codigo postal ");
            System.out.println("4. Mostrar informacion de una provincia");
            System.out.println("5. Mostrar toda la informacion. ");
            System.out.println("6. Salir");
            System.out.print("Introduzca su opción: ");
            opcion = s.nextInt();
            s.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Dime que provincia quiere añadir o desea añadir codigo postal: ");
                    provincia = s.nextLine();
                    System.out.println("Dime que codigo postal desea añadir: ");
                    codigoPostal = s.nextInt();
                    miGestorCP.añadir(provincia, codigoPostal);
                    break;

                case 2:
                    System.out.println("Dime que provincia desea eliminar: ");
                    provincia = s.nextLine();
                    if (miGestorCP.borrarProvincia(provincia)) {
                        System.out.println("Provincia eliminada con exito");
                    } else
                        System.out.println("No se a encontrado ninguna provincia con ese nombre. ");
                    break;

                case 3:
                    System.out.println("Dime de que provincia quieres eliminar el codigo postal: ");
                    provincia = s.nextLine();
                    System.out.println("Dime que codigo postal que desea eliminar: ");
                    codigoPostal = s.nextInt();
                    miGestorCP.borrarCP(provincia, codigoPostal);
                    break;

                case 4:
                    System.out.println("Dime de que provincia quiere la informacion: ");
                    provincia = s.nextLine();
                    miGestorCP.mostrarInformacionProvincia(provincia);
                    break;
                
                case 5:
                        miGestorCP.mostrarInformacionDeTodo();
                    break;

                case 6: 
                    System.out.println("Gracias por usar este gestor, hasta la proxima");
                    break;
                
                default:
                    System.out.println("Error, opcion incorrecta.");
                    break;
            }
        } while (opcion != 6);

        s.close();

    }
}
