import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio03_ArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList <Integer> miArray = new ArrayList<Integer>();

        miArray.add(28);
        miArray.add(12);
        miArray.add(7);
        miArray.add(9);
        miArray.add(89);
        miArray.add(2);
        miArray.add(15);
        miArray.add(25);
        miArray.add(1);
        miArray.add(11);
        Collections.sort(miArray);
        for(int a: miArray){
        System.out.println(a);
        }

    }
}
