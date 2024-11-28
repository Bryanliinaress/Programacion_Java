import java.util.Scanner;

public class Ejercicio_Examen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("\033[0;93mCHICAGO\033[0m");
        // Declaro las variables que me van a hacer falta
        int puntuacionObjetivo = 2;
        String fraseJugador1 = "Tirada del jugador 1: ";
        String fraseJugador2 = "Tirada del jugador 2: ";
        String fraseJugador3 = "Tirada del jugador 3: ";
        String fraseConseguidoPuntos = "";
        String frasePuntosTotalesJugador1 = "";
        String frasePuntosTotalesJugador2 = "";
        String frasePuntosTotalesJugador3 = "";
        int dado1Jugador1 = 0;
        int dado2Jugador1 = 0;
        int dado1Jugador2 = 0;
        int dado2Jugador2 = 0;
        int dado1Jugador3 = 0;
        int dado2Jugador3 = 0;
        int puntosTotalesJugador1 = 0;
        int puntosTotalesJugador2 = 0;
        int puntosTotalesJugador3 = 0;
        int puntos = 0;
        // Empiezo con el bucle de las tiradas de los jugadores y sus puntuaciones
        for (int i = 1; i <= 11; i++) {
            System.out.println("\033[0;91mRonda " + i + "; Puntuación objetivo: " + puntuacionObjetivo + "\033[0m");
            // tirada jugador 1
            dado1Jugador1 = tiradaDado1(dado1Jugador1);
            dado2Jugador1 = tiradaDado2(dado2Jugador1);
            // Esto es para que salga 1 punto o 0 puntos cuando consigue punto
            if (dado1Jugador1 + dado2Jugador1 == puntuacionObjetivo) {
                puntos = 1;
                puntosTotalesJugador1 += 1;
                fraseConseguidoPuntos = " punto";
            } else {
                puntos = 0;
                fraseConseguidoPuntos = " puntos";
            }
            System.out.println(
                    fraseJugador1 + dado1Jugador1 + "-" + dado2Jugador1 + " ; " + puntos + fraseConseguidoPuntos);
            // tirada jugador 2
            dado1Jugador2 = tiradaDado1(dado1Jugador2);
            dado2Jugador2 = tiradaDado2(dado2Jugador2);
            // Esto es para que salga 1 punto o 0 puntos cuando consigue punto
            if (dado1Jugador2 + dado2Jugador2 == puntuacionObjetivo) {
                puntos = 1;
                puntosTotalesJugador2 += 1;
                fraseConseguidoPuntos = " punto";
            } else {
                puntos = 0;
                fraseConseguidoPuntos = " puntos";
            }
            System.out.println(
                    fraseJugador2 + dado1Jugador2 + "-" + dado2Jugador2 + " ; " + puntos + fraseConseguidoPuntos);
            // tirada jugador 3
            dado1Jugador3 = tiradaDado1(dado1Jugador3);
            dado2Jugador3 = tiradaDado2(dado2Jugador3);
            // Esto es para que salga 1 punto o 0 puntos cuando consigue punto
            if (dado1Jugador3 + dado2Jugador3 == puntuacionObjetivo) {
                puntos = 1;
                puntosTotalesJugador3 += 1;
                fraseConseguidoPuntos = " punto";
            } else {
                puntos = 0;
                fraseConseguidoPuntos = " puntos";
            }
            System.out.println(
                    fraseJugador3 + dado1Jugador3 + "-" + dado2Jugador3 + " ; " + puntos + fraseConseguidoPuntos);
            puntuacionObjetivo++;
            // Esto es para que salga 1 punto o X puntos cuando tenga mas de 1 punto o 0
            // puntos
            if (puntosTotalesJugador1 == 1) {
                frasePuntosTotalesJugador1 = " punto";
            } else {
                frasePuntosTotalesJugador1 = " puntos";
            }
            if (puntosTotalesJugador2 == 1) {
                frasePuntosTotalesJugador2 = " punto";
            } else {
                frasePuntosTotalesJugador2 = " puntos";
            }
            if (puntosTotalesJugador3 == 1) {
                frasePuntosTotalesJugador3 = " punto";
            } else {
                frasePuntosTotalesJugador3 = " puntos";
            }
            System.out
                    .println("Puntuaciones generales: Jugador 1 - " + puntosTotalesJugador1 + frasePuntosTotalesJugador1
                            + " ; Jugador 2 - "
                            + puntosTotalesJugador2 + frasePuntosTotalesJugador2 + " ; Jugador 3 - "
                            + puntosTotalesJugador3 + frasePuntosTotalesJugador3);
            if (i < 11) {
                System.out.println("Pulse INTRO para la siguiente ronda");
                s.nextLine();
            }
        }
        System.out.println("");
        System.out.println("Fin de la partida.");
        s.close();
    }

    // Hago esta funcion para cada vez que haga falta tirar el dado1
    public static int tiradaDado1(int dado1) {
        dado1 = (int) (Math.random() * 6) + 1;
        return dado1;
    }

    // y esta funcion para cada vez que haga falta tirar el dado2
    public static int tiradaDado2(int dado2) {
        dado2 = (int) (Math.random() * 6) + 1;
        return dado2;
    }

}
