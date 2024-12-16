package utilidades;

public class ImpresoraResultados {
    /**
     * 
     * @param puntuacionMago1 se va a usar para ser comparada con la otra puntuacion
     * @param puntuacionMago2 se usa para se comparada con otra puntuacion
     * @return la frase que mostraremos segun las puntuaciones de los magos para
     *         mostrar el ganador o el empate
     */
    public static String imprimirResultados(double puntuacionMago1, double puntuacionMago2) {
        String fraseGanador1 = "El ganador es el Mago 1.";
        String fraseGanador2 = "El ganador es el Mago 2 .";
        String empatePartida = "Empate";
        if ((double) puntuacionMago1 > (double) puntuacionMago2) {
            return fraseGanador1;
        } else if ((double) puntuacionMago1 < (double) puntuacionMago2) {
            return fraseGanador2;
        } else if ((double) puntuacionMago1 == (double) puntuacionMago2) {
            return empatePartida;
        }
        return empatePartida;
    }
}
