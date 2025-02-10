import java.util.Scanner;

public class GestorCPIFP {
    public static int leerOpcion() {
        Scanner s = new Scanner(System.in);
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

    public static String funcionLeerString() {
        String palabra = "";
        Scanner s = new Scanner(System.in);
        palabra = s.nextLine();
        palabra = palabra.toUpperCase();
        return palabra;
    }

    public static void main(String[] args) {
        if (args.length != 1)
            System.out.println("Número de argumentos incorrecto");
        else {
            CPIFP miCPIFP = new CPIFP("Alang Turing", "Frederick Terman, 1", 652369875, args[0]);
            int opcion = 0;

            String nombreEstudiante = "";
            int idEstudiante = 0;
            do {
                System.out.println();
                System.out.println();
                System.out.println("Gestor insti");
                System.out.println("============");
                System.out.println("1. Añadir estudiante");
                System.out.println("2. Borrar estudiante");
                System.out.println("3. Mostrar lista de estudiantes");
                System.out.println("4. Modificar nombre Estudiante");
                System.out.println("5. Mostrar un estudiante");
                System.out.println("6. Salir");
                System.out.print("Dime que opcion desea hacer: ");
                opcion = leerOpcion();

                switch (opcion) {
                    case 1:
                        System.out.println();
                        System.out.println();
                        System.out.print("Dime el nombre del estudiante: ");
                        nombreEstudiante = funcionLeerString();
                        System.out.println();
                        System.out.print("Dime su id: ");
                        idEstudiante = leerOpcion();

                        if (miCPIFP.añadir(idEstudiante, nombreEstudiante)) {
                            System.out.println("Estudiante añadido con exito.");
                            ;
                        } else
                            System.out.println("Ese estudiante ya estaba creado. ");
                        break;

                    case 2:
                        System.out.println();
                        System.out.println();
                        System.out.print("Dime el id del estudiante que quiere eliminar: ");
                        idEstudiante = leerOpcion();
                        if (miCPIFP.quitar(idEstudiante)) {
                            System.out.println("Estudiante eliminado con exito.");
                        } else {
                            System.out.println("No se a podido elimnar a ese alumno.");
                        }
                        break;

                    case 3:

                        System.out.println(miCPIFP.listarEstudiantes());
                        break;

                    case 4:
                        System.out.println();
                        System.out.println();
                        System.out.print("Dime el id del estudiante que quieres cambiarle el nombre: ");
                        idEstudiante = leerOpcion();
                        System.out.println();
                        System.out.print("Dime el nuevo nombre del estudiante: ");
                        nombreEstudiante = funcionLeerString();

                        if (miCPIFP.modificar(idEstudiante, nombreEstudiante)) {
                            System.out.println("Estudiante modificado con exito.");
                        } else {
                            System.out.println("No se a podido modificar el nombre del usuario.");
                        }
                        break;

                    case 5:
                        System.out.print("Dime cual es id que quieres obtener: ");
                        idEstudiante = leerOpcion();

                        System.out.println(miCPIFP.obtenerEstudiante(idEstudiante));
                        break;

                    case 6:
                        System.out.println();
                        System.out.println("Gracias por usar este programa, hasta la próxima.");
                        break;
                    default:
                        System.out.println();
                        System.out.println("Lo siento la opción elegida no es correcta. ");
                        break;
                }
            } while (opcion != 6);
        }
    }
}
