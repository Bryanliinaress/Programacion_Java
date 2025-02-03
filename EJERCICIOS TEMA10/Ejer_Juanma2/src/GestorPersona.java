import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestorPersona {
    HashMap<String, ArrayList<Persona>> miMap = new HashMap<>();

    public void anadirPersona(String colorPelo, Persona persona) {
        if (colorPelo.equals("Moreno") || colorPelo.equals("moreno")) {
            if (!miMap.containsKey(colorPelo)) {
                ArrayList<Persona> miArrayList = new ArrayList<>();
                miArrayList.add(persona);
                miMap.put(colorPelo, miArrayList);
            } else {
                ArrayList<Persona> miArrayList = miMap.get(colorPelo);
                if (!miArrayList.contains(persona)) {
                    miArrayList.add(persona);
                }
            }
        }
        if (colorPelo.equals("Rubio") || colorPelo.equals("rubio")) {
            ArrayList<Persona> miArrayList = new ArrayList<>();
            miArrayList.add(persona);
            miMap.put(colorPelo, miArrayList);
        }
        if (colorPelo.equals("Pelirrojo") || colorPelo.equals("Pelirrojo")) {
            ArrayList<Persona> miArrayList = new ArrayList<>();
            miArrayList.add(persona);
            miMap.put(colorPelo, miArrayList);
        }
    }

    public boolean borrarPersona(String colorPelo, String nombrePersona) {
        if (miMap.containsKey(colorPelo)) {
            ArrayList<Persona> miArrayList = miMap.get(colorPelo);
            for (Persona persona : miArrayList) {
                if (persona.getNombrePersona().equals(nombrePersona)) {
                    miArrayList.remove(persona);
                }
            }
            System.out.println(
                    "Eliminado a " + nombrePersona + " de color de pelo " + colorPelo + " con exito.");
            return true;
        } else {
            System.out.println("No se a encontrado a nadie con ese color de pelo.");
            return false;
        }
    }

    public void mostrarAPersonaPorPelo(String colorPelo, String nombrePersona) {
        if (miMap.containsKey(colorPelo)) {
            ArrayList<Persona> miArrayList = miMap.get(colorPelo);
            for (Persona personas : miArrayList) {
                if (personas.getNombrePersona().equals(nombrePersona)) {
                    System.out.println(personas.toString());
                }
            }
        } else {
            System.out.println("No hay ninguna persona con ese color de pelo.");
        }
    }

    public void mostrarTodasPersonas() {
        for (Map.Entry<String, ArrayList<Persona>> colorPersona : miMap.entrySet()) {
            System.out.println("Personas con el pelo: " + colorPersona.getKey() + " tienes a: ");
            for (int i = 0; i < colorPersona.getValue().size(); i++) {
                System.out.println((colorPersona.getValue()).toString());
                if (i < colorPersona.getValue().size() - 1) {

                }
            }
        }
    }
}
