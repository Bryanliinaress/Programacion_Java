import java.util.Scanner;//Declaro esto para que java pueda interpretar la clase scanner

public class Ejercicio1_Examen {
    public static void main(String[] args) throws Exception {
        // Primero declaro la clase Scanner para poder leer los datos que introduzca el
        // usuario
        Scanner s = new Scanner(System.in);
        int velocidadLuz = 299792;/* Aqui declaro la velocidad de la luz */
        System.out.println("DISTANCIA QUE RECORRE LA LUZ");
        System.out.println("============================");
        System.out.print("Ingrese el número de años: ");// le pido los numero de años que quiere que calcule el usuario
                                                        // y lo pongo como double por si el usuario pone un año y medio
        double años = s.nextDouble();// y aqui me los guardo en la variable años
        double segundosAño = 60 * 60 * 24 * 365;// aqui calculo los segundos que tiene un año
        double kmRecorridosTotales = velocidadLuz * segundosAño * años;/*
                                                                        * aqui calculo los km recorridos totales
                                                                        * multiplicando la velocidad de
                                                                        * la luz por los segundos que tiene un año por
                                                                        * los años que me a suministrado el usuario
                                                                        */
        System.out.printf("La luz recorre aproximadamente %10.2f kilómetros en " + años + " años.",
                kmRecorridosTotales);
        s.close();
    }
}
