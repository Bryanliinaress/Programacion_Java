import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class GestorCoches implements CRUD<Coche> {
    private File fichero;
    private ArrayList<Coche> misCoches = new ArrayList<>();

    public GestorCoches(File fichero) {
        this.fichero = fichero;
        this.recuperarTodos();

    }

    @Override
    public ArrayList<Coche> recuperarTodos() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.fichero));
            String datosCoche = "";
            while (datosCoche != null) {
                datosCoche = br.readLine();
                Coche nuevoCoche = new Coche(datosCoche);
                misCoches.add(nuevoCoche);
                br.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return misCoches;
    }

    @Override
    public Coche recuperarUno(String id) {
        
        String datosCocheACrear="";
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.fichero));
            String datosCoche = "";
            while (datosCoche != null) {
                datosCoche = br.readLine();
                String[] misDatos = datosCoche.split(":");
                if (misDatos[1].equals(id)) {
                    datosCocheACrear= datosCoche;
                }
                br.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        Coche nuevoCoche = new Coche(datosCocheACrear);
        return nuevoCoche;
    }

    @Override
    public Coche eliminaruno(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminaruno'");
    }

    @Override
    public Coche añadir(Coche T) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'añadir'");
    }

    @Override
    public Coche modificar(Coche T) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

}
