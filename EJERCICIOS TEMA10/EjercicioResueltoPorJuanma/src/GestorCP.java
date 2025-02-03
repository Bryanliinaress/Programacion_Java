import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestorCP {

    HashMap<String, ArrayList<Integer>> miHashMap = new HashMap<>();

    public void añadir(String provincia, Integer cp) {
        if (!miHashMap.containsKey(provincia)) {
            ArrayList<Integer> miArrayList = new ArrayList<>();
            miArrayList.add(cp);
            miHashMap.put(provincia, miArrayList);
        } else {
            ArrayList<Integer> miArrayList = miHashMap.get(provincia);
            if (!miArrayList.contains(cp)) {
                miArrayList.add(cp);
            }
        }
    }

    public void borrarCP(String provincia, Integer codPos) {
        if (!miHashMap.containsKey(provincia)) {
            System.out.println("Lo siento no tengo nada sobre esa provincia");
        } else {
            ArrayList<Integer> miArrayList = miHashMap.get(provincia);
            miArrayList.remove(codPos);
            System.out.println("Codigo postal elimnada con exito.");
        }
    }

    public boolean borrarProvincia(String provincia) {
        if (miHashMap.containsKey(provincia)) {
            miHashMap.remove(provincia);
            return true;
        } else {
            return false;
        }
    }

    public void mostrarInformacionProvincia(String provincia) {
        if (!miHashMap.containsKey(provincia)) {
            System.out.println("No tengo actualmente nada sobre " + provincia + ", lo siento.");
        } else {
            ArrayList<Integer> miArrayList = miHashMap.get(provincia);
            System.out.print("La provincia de " + provincia + " contiene los siguientes codigos Postales: ");
            for (Integer micp : miArrayList) {
                System.out.print(micp + " ");
            }
            System.out.println();
        }
    }

    public void mostrarInformacionDeTodo() {
        if (miHashMap.size() == 0) {
            System.out.println("No tengo actualmente nada, lo siento.");
        } else {
            for (Map.Entry<String, ArrayList<Integer>> listar : miHashMap.entrySet()) {
                System.out.print("La provincia de " + listar.getKey() + " contine los siguientes cp: ");
                for (int i = 0; i < listar.getValue().size(); i++) {
                    System.out.print(listar.getValue().get(i)); // Manera mas liosa pero tiene mas nota.
                    if (i < listar.getValue().size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
    }
}
