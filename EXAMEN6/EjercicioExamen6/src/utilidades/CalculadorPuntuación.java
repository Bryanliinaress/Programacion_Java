package utilidades;

public class CalculadorPuntuación {
    /**
     * 
     * @param carta le ingresamos una carta en base a la cual se le añadira una
     *              bonificacion si es par y una penalización si es impar
     * @param dado  le ingresamos un numero de dado
     * @return la suma del dado y la carta con su bonificacion o penalicación
     */
    public static double calcularPuntuacion(int carta, int dado) {
        double bono = carta * 0.1;
        double penalizacion = carta * 0.05;
        double puntuacion;
        if ((carta % 2) != 0) {
            puntuacion = (double) dado + ((double) carta - penalizacion);
        } else {
            puntuacion = (double) dado + ((double) carta + bono);
        }
        return puntuacion;
    }

}