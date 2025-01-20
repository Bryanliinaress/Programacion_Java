public class GestorEstudiante {
    private Estudiante[] estudiantes = new Estudiante[20];
    private int cantidadEstudiantes;

    public GestorEstudiante() {
        for (int i = 0; i < 20; i++) {
            estudiantes[i]= new Estudiante(null);
        }
        cantidadEstudiantes = -1;
    }

    public void agregarEstudiante(String nombre) {
        cantidadEstudiantes++;
        if (cantidadEstudiantes < 20) {
            estudiantes[cantidadEstudiantes].setNombre(nombre);
            System.out.println("Estudiante agregado con éxito.");
        }else{
            System.out.println("Tiene la base de datos de estudiante completa, lo siento.");
        }
    }

    public void buscarEstudiante (String nombre){
        int i= -1;
        boolean estudianteEncontrado=false;
        while (!estudianteEncontrado) {
            i++;
            String nombresEstudiantes= estudiantes[i].getNombre();
            if (nombresEstudiantes.equals(nombre)) {
                System.out.println(estudiantes[i].toString());
                estudianteEncontrado=true;
            }else if (i<20){
                System.out.println("Lo siento no e encontrado ningun estudiante con ese nombre.");
                estudianteEncontrado=true;
            }
        }
    }

    public void agregarNotasEstudiante(String nombre, double nota){
        int i= -1;
        boolean estudianteEncontrado=false;
        while (!estudianteEncontrado) {
            i++;
            String nombresEstudiantes= estudiantes[i].getNombre();
            if (nombresEstudiantes.equals(nombre)) {
                estudiantes[i].agregarNota(nota);
                estudianteEncontrado=true;
            }else if (i<20){
                System.out.println("Lo siento no e encontrado ningun estudiante con ese nombre.");
                estudianteEncontrado=true;
            }
        }
    }

    public void mostrarEstudiante(){
        boolean existeEstudiante=false;
        for(int i =0;i<20;i++){
            if (!((estudiantes[i].getNombre()).equals(null))) {
                System.out.println(estudiantes[i].toString());
                existeEstudiante=true;
            }
        }
        if (!existeEstudiante) {
            existeEstudiante=true;
            System.out.println("Lo siento no hay ningun estudiante en la base de datos.");
        }
    }

    public void mostrarEstudiantesConPromedioMayorA(double promedio){
        boolean mayorPromedio= false;
        int i = -1;
        double comprobadorPromedios;
        for(i=0;i<20;i++){
            comprobadorPromedios=estudiantes[i].calcularPromedio();
            if (comprobadorPromedios>promedio) {
                System.out.println(estudiantes[i].toString());
                mayorPromedio=true;
            }else if (i==19) {
                System.out.println("no se a encontrado ningun estudiante con mayor promedio");;
            }
        }
        /*while (!mayorPromedio) {
            i++;
            comprobadorPromedios=estudiantes[i].calcularPromedio();
            if (comprobadorPromedios>promedio) {
                System.out.println(estudiantes[i].toString());
                mayorPromedio=true;
            }
            if (i<19) {
                mayorPromedio=false;
            }
            if (!(comprobadorPromedios>promedio) && i==19) {
                mayorPromedio=true;
            }
        }*/
    }
}
