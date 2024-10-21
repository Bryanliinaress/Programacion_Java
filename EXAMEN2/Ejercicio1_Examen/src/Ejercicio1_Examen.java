import java.util.Scanner;//Declaro esto para que java pueda interpretar la clase scanner

public class Ejercicio1_Examen {
    public static final String BLACK_BACKGROUND = "\033[40m"; // BLACK
    public static final String RED_BACKGROUND = "\033[41m"; // RED
    public static final String GREEN_BACKGROUND = "\033[42m"; // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m"; // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m"; // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m"; // WHITE
    public static final String RESET = "\033[0m"; // Text Reset

    public static void main(String[] args) throws Exception {
        // Primero declaro la clase Scanner para poder leer los datos que introduzca el
        // usuario
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de kilómetros ");// le pido la cantidad de km al usuario
        int numKilometros = s.nextInt();// y con esto lo leo y lo guardo en la variable numkilometros
        System.out.println("------------------------------------------");
        System.out.println("Cantidad de kilómetros: " + numKilometros);
        double numMillas = numKilometros * 0.621371;// Aqui calculo la cantidad de millas que son x km
        System.out.println("Equivalente an millas: " + YELLOW_BACKGROUND + numMillas + RESET);// Aqui se las muestro al
                                                                                              // usuario con el fondo
                                                                                              // amarillo
        System.out.println("------------------------------------------");
        System.out.println("La conversión se realizó utilizando la fórmula: ");
        System.out.println(RED_BACKGROUND + "1km" + RESET + " =" + GREEN_BACKGROUND + " 0.621371" + RESET);// Y aqui le
                                                                                                           // muestro al
                                                                                                           // usuario la
                                                                                                           // conversión
                                                                                                           // realizada
                                                                                                           // para que
                                                                                                           // la
                                                                                                           // entienda
        s.close();
    }
}
