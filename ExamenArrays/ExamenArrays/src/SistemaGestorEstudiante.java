import java.util.Scanner;

public class SistemaGestorEstudiante {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Opcion = 0;
        String nombreEstudiante;
        double notaEstudiante;
        GestorEstudiante gestarEstudiantes = new GestorEstudiante();
        SistemaGestorEstudiante sistemaGestorEstudiante = new SistemaGestorEstudiante();
        do {
            System.out.println("");
            System.out.println("Sistema Gestor De Estudiantes");
            System.out.println("============================");
            System.out.println("");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Agregar nota a un estudiante");
            System.out.println("3. Mostrar información de todos los estudiantes");
            System.out.println("4. Mostrar estudiantes con promedio mayor a un valor");
            System.out.println("5. Buscar un estudiante por su nombre");
            System.out.println("6. Salir");
            System.out.print("Dime que desea hacer: ");
            try{
                Opcion = Integer.parseInt(s.nextLine());
            }
            catch(Exception e){

            }            
            s.nextLine();
            System.out.println("");

            switch (Opcion) {
                case 1:
                    System.out.println("Dime el nombre de tu estudiante: ");
                    nombreEstudiante = s.nextLine();
                    gestarEstudiantes.agregarEstudiante(nombreEstudiante);
                    break;

                case 2:

                    System.out.println("Dime el nombre del estudiante : ");
                    nombreEstudiante = s.nextLine();
                    System.out.print("Dime su nota. ");
                    notaEstudiante = sistemaGestorEstudiante.comprobadorNumeroReal();
                    gestarEstudiantes.agregarNotasEstudiante(nombreEstudiante, notaEstudiante);
                    break;

                case 3:
                    gestarEstudiantes.mostrarEstudiante();
                    break;

                case 4:
                    System.out.print("Dime sobre que valor empieze a mostrar los promedios. ");
                    gestarEstudiantes
                            .mostrarEstudiantesConPromedioMayorA(sistemaGestorEstudiante.comprobadorNumeroReal());
                    break;

                case 5:
                    System.out.println("Dime a que estudiante quieres buscar: ");
                    nombreEstudiante = s.nextLine();
                    gestarEstudiantes.buscarEstudiante(nombreEstudiante);
                    break;

                case 6:
                    System.out.println("Gracias por usar este gestor de sistema de estudiantes.");
                    break;
                default:
                    System.out.println("La opción elegida es incorrecta. ");
                    break;
            }
        } while (Opcion != 6);
        s.close();
    }

    /*
     * hago una funcion con un try catch para comprobar que el valor que me da es
     * valido
     * y lo meto en un while para que me lo siga mandando mientras no sea valido
     */
    public double comprobadorNumeroReal() {
        Scanner s = new Scanner(System.in) ;
        boolean numeroValido = false;
        double numeroIntroducido = 0;
        while (!numeroValido) {
            try {
                System.out.println("Introduce un numero real, por favor: ");
                numeroIntroducido = Double.parseDouble(s.nextLine());
                numeroValido = true;
            } catch (Exception e) {
                System.out.println("El valor introducido no es valido.");
                s.next();
            }
        }
        return numeroIntroducido;
    }

}
