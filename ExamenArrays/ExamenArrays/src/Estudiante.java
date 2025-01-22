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
            notas[i] = 0.0;
        }
        cantidadNotas = -1;
    }

    /*
     * Aqui hago un llamamiento al nombre
     */
    public String getNombre() {
        return nombre;
    }

    public double[] getNotas() {
        return notas;
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
            System.out.println("Nota agregada con éxito. ");
        } else {
            System.out.println("No se puede agregar  mas notas. ");
        }
    }

    /*
     * Aqui hago un metodo para calcular la media de las notas.
     */
    public double calcularPromedio() {
        double calculo = 0;
        int contadorNotas = 0;
        double acomuladorNotas = 0;
        for (double d : notas) {
            acomuladorNotas += d;
            if (d != 0) {
                contadorNotas++;
            }
        }
        calculo = acomuladorNotas / contadorNotas;
        /*
         * while (!notasValidas) {
         * i++;
         * double comprobadorNotas = notas[i];
         * if (comprobadorNotas != 0.0) {
         * acomuladorNotas += comprobadorNotas;
         * }
         * if (i==9 ) {
         * calculo=acomuladorNotas / cantidadNotas;
         * notasValidas=true;
         * }
         * }
         */
        if (acomuladorNotas == 0) {
            calculo = 0;
        }

        return calculo;
    }

    /*
     * Aqui hago el metodo tu string para mostrar la informacion del estudiante.
     */
    public String toString() {
        String frase = "";
        System.out.print("Estudiante[nombre=" + nombre + "; notas=") ;
        for (double d : notas) {
            if (d !=0) {
                System.out.print( d+", " );
            }
        }
        System.out.println("; promedio=" + calcularPromedio() + "]");
        return frase;
    }
}
