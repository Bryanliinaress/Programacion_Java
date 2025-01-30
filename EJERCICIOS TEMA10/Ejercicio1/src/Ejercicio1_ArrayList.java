import java.util.ArrayList;

public class Ejercicio1_ArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList<String> miArraylist = new ArrayList<String>();
        miArraylist.add("Pablo");
        miArraylist.add("Juanillo");
        miArraylist.add("Edu");
        miArraylist.add("Salvador");
        miArraylist.add("Daniel Arias");
        miArraylist.add("Paquillo");

        for(String nombresCompi : miArraylist){
            System.out.println(nombresCompi);
        }
    }
}
