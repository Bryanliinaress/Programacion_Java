import java.util.Scanner;

public class GestorViviendas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Vivienda[] misVivienda = new Vivienda[5];
        misVivienda[0]=new Piso(2,5,1,"tortola", "29580","España", "En reformas");
        misVivienda[1]= new Chalet(5, "tortola", "29504", "España", "nueva");

        System.out.println(misVivienda[0]);
        System.out.println(misVivienda[1]);
    }
}
