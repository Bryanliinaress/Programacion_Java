import java.util.Scanner;

public class Estudiante {
    static Scanner s = new Scanner(System.in);

    private static String matricula = "";
    private static String nombre = "";
    private static int edad = 0;
    private static double promedio = 0;

    public Estudiante(String matricula, String nombre, int edad, double promedio) {
        Estudiante.matricula = matricula;
        Estudiante.nombre = nombre;
        Estudiante.edad = edad;
        Estudiante.promedio = promedio;
    }

    public static String getMatricula() {
        return matricula;
    }

    public static String getNombre() {
        return nombre;
    }

    public static int getEdad() {
        return edad;
    }

    public static double getPromedio() {
        return promedio;
    }

    public static void setMatricula(String matricula) {
        Estudiante.matricula = matricula;
    }

    public static void setNombre(String nombre) {
        Estudiante.nombre = nombre;
    }

    public static void setEdad(int edad) {
        if (edad < 0 || edad > 120) {
            Estudiante.edad = 0;
        } else
            Estudiante.edad = edad;
    }

    public static void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 10) {
            Estudiante.promedio = 0;
        } else
            Estudiante.promedio = promedio;
    }

    public String toString() {
        return "Estudiante[matrícula= " + matricula + ", nombre=" + nombre + ", edad= " + edad + ", promedio="
                + promedio + "]";
    }
}
