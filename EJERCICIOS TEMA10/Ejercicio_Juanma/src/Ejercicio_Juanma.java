import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio_Juanma {
    public static void main(String[] args) throws Exception {
        HashMap<String, ArrayList<Integer>> ciudadesCodPostales = new HashMap<String, ArrayList<Integer>>();
        ArrayList<Integer> codPostGranada = new ArrayList<>();
        codPostGranada.add(18008);

        ArrayList<Integer> codPostSevilla = new ArrayList<>();
        codPostSevilla.add(41300);

        ArrayList<Integer> codPostCadiz = new ArrayList<>();
        codPostCadiz.add(21800);

        ArrayList<Integer> codPostMalaga = new ArrayList<>();
        codPostMalaga.add(29580);
        codPostMalaga.add(29007);
        codPostMalaga.add(29100);

        ArrayList<Integer> codPostAlmeria = new ArrayList<>();
        codPostAlmeria.add(4500);
        codPostAlmeria.add(4750);

        ciudadesCodPostales.put("Málaga", codPostMalaga);
        ciudadesCodPostales.put("Almería", codPostAlmeria);
        ciudadesCodPostales.put("Granada", codPostGranada);
        ciudadesCodPostales.put("Sevilla", codPostSevilla);
        ciudadesCodPostales.put("Cadiz", codPostCadiz);

        System.out.println("Todos las ciudades con sus codigos postales");
        System.out.println("===========================================");
        for (Map.Entry ciudades: ciudadesCodPostales.entrySet()) {
            System.out.print(ciudades.getKey());
            System.out.print(ciudades.getValue());
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("La ciudad de Almería con su codigo Postal");
        System.out.println("=========================================");
        System.out.println("Almeria"+ ciudadesCodPostales.get("Almería"));

        ciudadesCodPostales.remove("Sevilla");
        System.out.println("");
        System.out.println("");
        System.out.println("Todos las ciudades con sus codigos postales con sevilla borrada");
        System.out.println("==============================================================");
        for (Map.Entry ciudades: ciudadesCodPostales.entrySet()) {
            System.out.print(ciudades.getKey());
            System.out.print(ciudades.getValue());
            System.out.println("");
        }
        
        codPostMalaga.removeIf(numero -> numero == 29580);
        
        System.out.println("");
        System.out.println("");
        System.out.println("Todos las ciudades con sus codigos postales con codigo postal de malaga 29580 borrada");
        System.out.println("=====================================================================================");
        for (Map.Entry ciudades: ciudadesCodPostales.entrySet()) {
            System.out.print(ciudades.getKey());
            System.out.print(ciudades.getValue());
            System.out.println("");
        }





    }
}
