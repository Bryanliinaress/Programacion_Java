import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("añade una frase");
        String frase= s.nextLine();
        System.out.println(frase);
        //De primeras no te deja pero añadiendo el comando character.tostring que convierte a los char a manera que se pueda leer en string
    }
}
