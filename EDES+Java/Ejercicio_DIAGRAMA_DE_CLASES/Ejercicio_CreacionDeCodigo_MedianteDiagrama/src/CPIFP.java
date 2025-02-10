import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CPIFP implements Serializable<Estudiante> {

    private String nombre;
    private String direccion;
    private int telefono;
    private String nombreDeFichero;

    public CPIFP(String nombre, String direccion, int telefono, String nombreFichero) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombreDeFichero = nombreFichero;
    }

    public boolean añadir(int id, String nombre) {

        if (!obtenerEstudiante(id).equals("No hay ningun estudiante con ese id")) {
            return false;
        } else {
            Estudiante nuevoEstudiante = new Estudiante(id, nombre);
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(nombreDeFichero, true));
                bw.write(serializar(nuevoEstudiante) + "\n");
                bw.close();
                return true;
            } catch (IOException ioe) {
                System.out.println("Error.");
                return false;
            }
        }
    }

    public boolean quitar(int id) {
        if (obtenerEstudiante(id).equals("No hay ningun estudiante con ese id")) {
            return false;
        } else {
            try {
                File ficheroOriginal = new File(nombreDeFichero);
                File ficheroModificado = new File(nombreDeFichero + ".tmp");
                if (!ficheroOriginal.renameTo(ficheroModificado)) {
                    System.out.println("Error al renombrar el fichero original");
                    return false;
                }

                ficheroOriginal = new File(nombreDeFichero);
                if (!ficheroOriginal.exists()) {
                    try {
                        ficheroOriginal.createNewFile();
                    } catch (Exception e) {
                        System.out.println("No se pudo crear el fichero");
                        return false;
                    }
                }

                BufferedReader br = new BufferedReader(new FileReader(ficheroModificado));
                BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroOriginal));
                String linea = "";
                while ((linea = br.readLine()) != null) {
                    if (id != (deserializar(linea).getId())) {
                        bw.write(linea + "\n");
                    }
                }
                br.close();
                bw.close();
                ficheroModificado.delete();
                return true;
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }

        }
    }

    public boolean modificar(int id, String nombre) {
        if (obtenerEstudiante(id).equals("No hay ningun estudiante con ese id")) {
            return false;
        } else {
            try {
                File ficheroOriginal = new File(nombreDeFichero);
                File ficheroModificado = new File(nombreDeFichero + ".tmp");
                if (!ficheroOriginal.renameTo(ficheroModificado)) {
                    System.out.println("Error al renombrar el fichero original");
                    return false;
                }

                ficheroOriginal = new File(nombreDeFichero);
                if (!ficheroOriginal.exists()) {
                    try {
                        ficheroOriginal.createNewFile();
                    } catch (Exception e) {
                        System.out.println("No se pudo crear el fichero");
                        return false;
                    }
                }

                BufferedReader br = new BufferedReader(new FileReader(ficheroModificado));
                BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroOriginal));
                String linea = "";
                Estudiante estudianteModificado = new Estudiante(id, nombre);
                while ((linea = br.readLine()) != null) {
                    if (id != (deserializar(linea).getId())) {
                        bw.write(linea + "\n");
                    } else {
                        bw.write(serializar(estudianteModificado) + "\n");
                    }
                }
                br.close();
                bw.close();
                ficheroModificado.delete();
                return true;
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }

        }
    }

    public String obtenerEstudiante(int id) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreDeFichero));
            Estudiante estudiante = new Estudiante(0, "");
            String linea = "";
            while ((linea = br.readLine()) != null) {
                estudiante = deserializar(linea);
                if (estudiante.getId() == id) {
                    br.close();
                    return estudiante.toString();
                }
            }
            br.close();

        } catch (IOException ioe) {
            System.out.println("Error.");
        }
        return "No hay ningun estudiante con ese id";
    }

    public String listarEstudiantes() {
        String frase = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreDeFichero));
            String linea = "";
            while ((linea = br.readLine()) != null) {

                frase += (deserializar(linea)).toString() + "\n";
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        frase += "\nHasta aqui todos tus estudiantes.";
        return frase;
    }

    @Override
    public String serializar(Estudiante estudiante) {
        return estudiante.getNombre() + ";" + estudiante.getId();
    }

    @Override
    public Estudiante deserializar(String datos) {
        String[] datosEstudiante = datos.split(";");
        String nombreEstudiante = datosEstudiante[0];
        int idEstudiante = Integer.parseInt(datosEstudiante[1]);
        Estudiante estudianteNuevo = new Estudiante(idEstudiante, nombreEstudiante);
        return estudianteNuevo;
    }

    @Override
    public String toString() {
        return "Nombre del Instituto: " + this.nombre + ", direccion: " + direccion + ", numero de telefono: "
                + telefono;
    }
}
