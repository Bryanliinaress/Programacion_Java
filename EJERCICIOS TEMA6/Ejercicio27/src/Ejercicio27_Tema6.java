import java.util.Scanner;

public class Ejercicio27_Tema6 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String respuestaJugador = s.nextLine();
        String respuestaOrdenador = "";
        int manoOrdenador = (int) (Math.random() * 3) + 1;
        switch (manoOrdenador) {
            case 1:
                respuestaOrdenador = "tijera";
                break;
            case 2:
                respuestaOrdenador = "papel";
                break;
            case 3:
                respuestaOrdenador = "piedra";
            default:
        }
        System.out.println("Turno del ordenador: " + respuestaOrdenador);
        if (respuestaJugador.equals(respuestaOrdenador)) {
            System.out.println("Empate");
        } else{
            int ganador=0;
            switch (respuestaJugador) {
                case "piedra":
                    if (respuestaOrdenador.equals("tijera")) {
                        ganador=1;
                    }
                    break;
                case "papel":
                    if (respuestaOrdenador.equals("piedra")) {
                        ganador=1;                        
                    }
                case "tijera":
                    if (respuestaOrdenador.equals("papel")) {
                        ganador=1;
                    }
                default:
            }
            if ( ganador==1){
                System.out.println("El ganador es el Humano");
            }else{
                System.out.println("El ganador es el ordenador.");
            }
        } 
        
        s.close();
    }
}
