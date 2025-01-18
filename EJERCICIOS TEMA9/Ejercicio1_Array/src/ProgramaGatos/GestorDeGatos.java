package ProgramaGatos;
import java.util.Scanner;

public class GestorDeGatos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Gato [] ArrayGato  = new Gato[4];

        for (int i =0 ; i < 4;i++){
            ArrayGato[i]= new Gato();
            System.out.print("Nombre del gato "+i+": ");
            ArrayGato[i].setNombre(s.nextLine());
            System.out.print("Dime su raza: ");
            ArrayGato[i].setRaza(s.nextLine());
            System.out.print("Dime su color: ");
            ArrayGato[i].setColor(s.nextLine());
            System.out.println();
        }
        for(int i=0 ; i<4; i++){
            System.out.println("Gato "+i);
            System.out.println("=======");
            System.out.println(ArrayGato[i]);
            System.out.println();
        }
        s.close();
    }
}
