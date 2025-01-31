import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio04_ArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList<String> misPalabra = new ArrayList<>();

        misPalabra.add("Zangano");
        misPalabra.add("Xaxofon");
        misPalabra.add("Yegua");
        misPalabra.add("Willy");
        misPalabra.add("Manuela");
        misPalabra.add("Jinete");
        misPalabra.add("Avion");
        Collections.sort(misPalabra);
        for(String lasPalabras : misPalabra){
            System.out.println(lasPalabras);
        }
    }
}
