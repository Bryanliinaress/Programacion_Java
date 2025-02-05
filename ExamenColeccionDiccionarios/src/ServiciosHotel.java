import java.util.ArrayList;
import java.util.HashMap;
/**
 * En esta clase vamos a crear las funciones para poder llevar un control de un hotel y sus servicios
 * 
 * @author Bryan Linares Gonzalez
 * @version 1.0
 */
public class ServiciosHotel {

    HashMap<String, ArrayList<String>> miHashMap = new HashMap<>();

    /**
     * Funcion para añadir un servicio a un hotel 0 crear ese hotel y darle un servicio dandole la ubicacion
     * como "key" a mi hashmap y el servicio añadiendosela al arrayList de mi hashmap.
     * 
     * @param ubicacion Sitio donde se encuentra el hotel
     * @param servicio Servicio que vamos a añadir a ese hotel
     */
    public void anadirServicio(String ubicacion, String servicio) {
        if (!miHashMap.containsKey(ubicacion)) {
            ArrayList<String> misServicios = new ArrayList<>();
            misServicios.add(servicio);
            miHashMap.put(ubicacion, misServicios);
        } else {
            ArrayList<String> misServicios = miHashMap.get(ubicacion);
            if (!misServicios.contains(servicio)) {
                misServicios.add(servicio);
            }
        }
    }
    /**
     * Funcion para eliminar un servicio de un hotel atraves de su ubicación
     * en el caso que existiese ese hotel o ese servicio, notificaria con un mensaje de advertencia 
     * 
     * @param ubicacion Sitio donde se encuentra el hotel
     * @param servicioAEliminar Servicio que vamos a eliminar
     */
    public void borrarServicios(String ubicacion, String servicioAEliminar) {
        if (!miHashMap.containsKey(ubicacion)) {
            System.out.println("Lo siento, no hay ninguna hotel en la ubicación, " + ubicacion);
        } else {
            ArrayList<String> misServicios = miHashMap.get(ubicacion);
            if (misServicios.contains(servicioAEliminar)) {
                misServicios.remove(servicioAEliminar);
                System.out.println("Se ha eliminado el servicio con éxito.");
            } else {
                System.out.println("Lo siento no e encontrado el servicio de " + servicioAEliminar + " en el hotel de "
                        + ubicacion);
            }
        }
    }
    /**
     * Funcion para eliminar un hotel, en el caso de que no existiese, notificara con una advertencia 
     * 
     * @param ubicacion  Sitio donde se encuentra el hotel
     */
    public void borrarHotel(String ubicacion) {
        if (!miHashMap.containsKey(ubicacion)) {
            System.out.println("Lo siento no hay nada sobre un hotel en la ubicadion indicada.");
        } else {
            miHashMap.remove(ubicacion);
            System.out.println("Hotel eliminado con éxito.");
        }
    }

    /**
     * Metodo para mostrar los servicios de un hotel atraves de su ubicacion.
     * 
     * @param ubicacion Sitio donde se encuentra el hotel
     */
    public void mostrarServicios(String ubicacion) {
        if (!miHashMap.containsKey(ubicacion)) {
            System.out.println("Lo siento, no hay ninguna hotel en la ubicación, " + ubicacion);
        } else {
            if (miHashMap.get(ubicacion).size() == 0) {
                System.out.println("Lo siento no hay ningun servicio sobre el hotel de " + ubicacion);
            } else {
                System.out.print(ubicacion + ": ");
                for (int i = 0; i < miHashMap.get(ubicacion).size(); i++) {
                    System.out.print(miHashMap.get(ubicacion).get(i));
                    if (i < miHashMap.get(ubicacion).size() - 1) {
                        System.out.print(", ");
                    } else {
                        System.out.println(".");
                    }
                }
            }
        }
    }
}
