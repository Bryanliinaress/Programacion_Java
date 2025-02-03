
import java.util.Scanner;

public class SistemaGestorPersona {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GestorPersona miGestorPersona = new GestorPersona();
        int opcion = 0;
        String colorPelo = "";
        String nombrePersona= "";
        int edadPersona= 0;
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("Gestionar provincias y codigos Postales");
            System.out.println("=======================================");
            System.out.println("1. Añadir Persona");
            System.out.println("2. Borrar Persona ");
            System.out.println("3. Mostrar informacion Persona");
            System.out.println("4. Mostrar toda la informacion. ");
            System.out.println("5. Salir");
            System.out.print("Introduzca su opción: ");
            opcion = s.nextInt();
            s.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Dime el color de pelo de tu persona: ");
                    colorPelo = s.nextLine();
                    System.out.println("Dieme el nombre de tu persona: ");
                    nombrePersona= s.nextLine();
                    System.out.println("Ahora dime su edad: ");
                    edadPersona = s.nextInt();
                    Persona persona = new Persona(nombrePersona, edadPersona);
                    
                    miGestorPersona.anadirPersona(colorPelo, persona);
                    break;

                case 2:
                    System.out.println("Dime de que pelo quieres eliminar: ");
                    colorPelo = s.nextLine();
                    System.out.println("Dime el nombre de la persona que quieres eliminar: ");
                    nombrePersona = s.nextLine();
                    if (miGestorPersona.borrarPersona(colorPelo, nombrePersona)) {
                        System.out.println("Persona eliminada con exito");
                    } else
                        System.out.println("No se a encontrado ninguna persona con ese nombre en el color de pelo indicado. ");
                    break;

                case 3:
                    System.out.println("Dime de que pelo quiere la informacion: ");
                    colorPelo = s.nextLine();
                    System.out.println("Y dime su nombre: ");
                    nombrePersona= s.nextLine();
                    miGestorPersona.mostrarAPersonaPorPelo(colorPelo,  nombrePersona);
                    
                    break;
                
                case 4:
                        miGestorPersona.mostrarTodasPersonas();
                    break;

                case 5: 
                    System.out.println("Gracias por usar este gestor, hasta la proxima");
                    break;
                
                default:
                    System.out.println("Error, opcion incorrecta.");
                    break;
            }
        } while (opcion != 5);

        s.close();

    }
}


