import java.util.Scanner;

public class GestionEstudiantes {
    private static Scanner s = new Scanner(System.in);
    private static String numeroMatricula = "";
    private static String nombreUsuario = "";
    private static int edadUsuario = 0;
    private static double notaPromedio = 0;

    public static void registrarEstudiante(String estudiante) {

        System.out.print("Dime la matricula de su estudiante: ");
        s.nextLine();
        numeroMatricula=s.nextLine();
        Estudiante.setMatricula(numeroMatricula);

        System.out.print("Dime el nombre de su estudiante: ");
        nombreUsuario=s.nextLine();
        Estudiante.setNombre(nombreUsuario);

        System.out.print("Dime la edad de su estudiante: ");
        edadUsuario=s.nextInt();
        Estudiante.setEdad(edadUsuario);

        System.out.print("Dime la nota promedio de su estudiante: ");
        notaPromedio=s.nextDouble();
        Estudiante.setPromedio(notaPromedio);
    }
    static Estudiante estudiante = new Estudiante(Estudiante.getMatricula(), Estudiante.getNombre(), Estudiante.getEdad(), Estudiante.getPromedio());
    public static void mostrarEstudiante() {
        System.out.println(estudiante);
    }
}
