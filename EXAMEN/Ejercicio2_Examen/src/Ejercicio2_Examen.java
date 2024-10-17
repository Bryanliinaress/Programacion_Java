import java.util.Scanner;//Declaro esto para que java pueda interpretar la clase scanner

public class Ejercicio2_Examen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);// Primero declaro la clase Scanner para poder leer los datos que introduzca
                                           // el usuario
        System.out.println("\033[1;30mÁREA DE UN CIRCULO \033[0m");// Ponemos el titulo y le añadimos la negrita
        System.out.println("==================");
        System.out.print("Introduzva el radio (cm): ");// Le pedimos el radio del circulo en cm al usuario
        int radio = s.nextInt();// Lo leemos como numero entero
        double area = Math.PI * Math.pow(radio, 2);// Calculamos el area del circulo
        System.out.printf("El área del círculo es:\033[1;31m %3.6f \033[0m cm\u00B2", area);
        s.close();
    }
}
