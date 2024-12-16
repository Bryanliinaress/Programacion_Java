package utilidades;

public class GeneradorAleatorio {
    /**
     * 
     * @return nos va a devolver un numero aleatorio entre el 1 y el 40
     */
    public static int generarCarta() {
        int numeroCarta = (int) (Math.random() * 40) + 1;
        return numeroCarta;
    }

    /**
     * 
     * @return nos va a devolver un numero aleatorio entre el 1 y el 6
     */
    public static int generarDado() {
        int numeroDado = (int) (Math.random() * 6) + 1;
        return numeroDado;
    }
}
