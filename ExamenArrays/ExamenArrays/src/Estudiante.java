/*
 * Aqui creo la clase estudiante con sus variables privadas 
 * variables como su nombre sus notas y su cantidadNotas
 */

public class Estudiante {
    private String nombre;
    private double[] notas = new double[10];
    private int cantidadNotas;

    /*
     * Aqui creo su constructor el cual pide un nombre.
     */
    public Estudiante(String nombre) {
        this.nombre = nombre;
        for (int i = 0; i < 10; i++) {
            notas = new double[10];
        }
        cantidadNotas = -1;
    }

    /*
     * Aqui hago un llamamiento al nombre
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Aqui hago un metodo para agregar un nombre nuevo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
     * Aqui hago un metodo para agregar una nota nueva
     */
    public void agregarNota(double nota) {
        cantidadNotas++;
        if (cantidadNotas < 10) {
            notas[cantidadNotas] = nota;
        }
    }
    /*
     * Aqui hago un metodo para calcular la media de las notas.
     */
    public double calcularPromedio() {
        boolean notasValidas = false;
        int i = -1;
        double acomuladorNotas = 0;
        while (!notasValidas) {
            i++;
            double comprobadorNotas = notas[i];
            if (comprobadorNotas != 0 && i < 10) {
                acomuladorNotas += comprobadorNotas;
                notasValidas = true;
            }
        }
        return acomuladorNotas / cantidadNotas;
    }
    /*
     * Aqui hago el metodo tu string para mostrar la informacion del estudiante.
     */
    public String toString() {
        String frase="";
        for (double d : notas) {
            frase = "Estudiante[nombre=" + nombre + "; notas=" +d+ "; promedio=" + calcularPromedio() + "]";   
        }
        return frase;
    }
}
