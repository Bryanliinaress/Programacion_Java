import java.util.ArrayList;

public class Ejercicio2_ArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList <Integer> miArraylist = new ArrayList<>();
        for(int i = 0; i<= (int)((Math.random()*10)+10);i++){
            miArraylist.add((int)((Math.random()*101)));
        }
        int a =0;
        for(int numerosAleatorios : miArraylist){
            
            a++;
            System.out.println(a+" "+numerosAleatorios);
        }
    }
}
