import java.util.Scanner;

public class Ejercicio16_Tema4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int contadorVerdadero=0;
        String respuestaString;
        System.out.println("\033[31mTest de infidelidad");
        System.out.println("===================\033[49;39m");
        System.out.println(" 1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. (v/f)");
        respuestaString=s.nextLine();
        if (respuestaString.equals("v")) {
            contadorVerdadero=contadorVerdadero+3;
        }
        System.out.println(" 2. Ha aumentado sus gastos de vestuario. (v/f)");
        respuestaString=s.nextLine();
        if (respuestaString.equals("v")) {
            contadorVerdadero=contadorVerdadero+3;
        }
        System.out.println(" 3. Ha perdido el interés que mostraba anteriormente por ti. (v/f)");
        respuestaString=s.nextLine();
        if (respuestaString.equals("v")) {
            contadorVerdadero=contadorVerdadero+3;
        }
        System.out.println(" 4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer). (v/f)");
        respuestaString=s.nextLine();
        if (respuestaString.equals("v")) {
            contadorVerdadero=contadorVerdadero+3;
        }
        System.out.println(" 5. No te deja que mires la agenda de su teléfono móvil. (v/f)");
        respuestaString=s.nextLine();
        if (respuestaString.equals("v")) {
            contadorVerdadero=contadorVerdadero+3;
        }
        System.out.println("  6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante. (v/f)");
        respuestaString=s.nextLine();
        if (respuestaString.equals("v")) {
            contadorVerdadero=contadorVerdadero+3;
        }
        System.out.println(" 7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a. (v/f)");
        respuestaString=s.nextLine();
        if (respuestaString.equals("v")) {
            contadorVerdadero=contadorVerdadero+3;
        }
        System.out.println(" 8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo. (v/f)");
        respuestaString=s.nextLine();
        if (respuestaString.equals("v")) {
            contadorVerdadero=contadorVerdadero+3;
        }
        System.out.println(" 9. Has notado que últimamente se perfuma más. (v/f)");
        respuestaString=s.nextLine();
        if (respuestaString.equals("v")) {
            contadorVerdadero=contadorVerdadero+3;
        }
        System.out.println("  10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo. (v/f)");
        respuestaString=s.nextLine();
        if (respuestaString.equals("v")) {
            contadorVerdadero=contadorVerdadero+3;
        }
        if (contadorVerdadero<=10) {
            System.out.println(" ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }else if (contadorVerdadero<=22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
            
        }else{
            System.out.println(" Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
        s.close();
    }
}
