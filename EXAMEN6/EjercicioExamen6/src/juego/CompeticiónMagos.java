package juego;

import utilidades.*;
import java.util.Scanner;

public class CompeticiónMagos {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        double puntuacionAcumuladaMago1 = 0;
        double puntuacionAcumuladaMago2 = 0;
        System.out.println("Bienvenido al mejor juego de cartas entre Magos.");
        System.out.println("1. Comenzar el juego.");
        System.out.println("2. Terminar el juego.");
        System.out.println("Introduzca el numero correspondiente para comenzar el juego o finalizarlo ante de empezar");
        int inicio=s.nextInt();
        switch (inicio) {
            case 1:
            System.out.println("\033[0;91mComienzo del juego\033[0m");
            System.out.println("\033[0;91m__________________\033[0m");
            System.out.println("\033[0;91m__________________\033[0m");
    
            for (int i = 1; i <= 5; i++) {
                s.nextLine();
                int dadoJugador1 = GeneradorAleatorio.generarDado();
                int dadoJugador2 = GeneradorAleatorio.generarDado();
                int cartaJugador1 = GeneradorAleatorio.generarCarta();
                int cartaJugador2 = GeneradorAleatorio.generarCarta();
                double puntuacionMago1 = CalculadorPuntuación.calcularPuntuacion(cartaJugador1, dadoJugador1);
                double puntuacionMago2 = CalculadorPuntuación.calcularPuntuacion(cartaJugador2, dadoJugador2);
                puntuacionAcumuladaMago1 += puntuacionMago1;
                puntuacionAcumuladaMago2 += puntuacionMago2;
                System.out.println("");
                System.out.println("");
                System.out.println("Ronda " + i);
                System.out.println("El Mago 1 ha sacado el numero de dado " + dadoJugador1 + " y el numero de carta "
                        + cartaJugador1 + " y su puntuacion actual es de " + (int) puntuacionAcumuladaMago1 + ".");
                System.out.println("El Mago 2 ha sacado el numero de dado " + dadoJugador2 + " y el numero de carta "
                        + cartaJugador2 + " y su puntuacion actual es de " + (int) puntuacionAcumuladaMago2 + ".");
                System.out.print("Pulsa intro para continuar.");

            }
            System.out.println("");
            System.out.println("");
            System.out.println("\033[0;92m" + utilidades.ImpresoraResultados
                    .imprimirResultados( puntuacionAcumuladaMago1, puntuacionAcumuladaMago2) + "\033[0m");
                break;
            
            default:
                System.out.println("\033[0;91mJuego terminado\033[0m");
                break;
        }
        s.close();
    }
}
