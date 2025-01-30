/**
 * Clase Empresa la cual contiene el main principal
 * 
 * @author Bryan Linares
 * @version 1.0
 */
public class Empresa {
    /**
     * Creo una variable llamada NUMERO para darle tamaño al array y automatizar los
     * for y todo automaticamente
     */
    public static final int NUMERO = 3;

    /**
     * main principal de la clase
     * 
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Creo el array de Empleado con tamaño igual al de NUMERO
         */
        Empleado[] misEmpleado = new Empleado[NUMERO];
        /**
         * Le meto un objeto hijo de empleado a cada espacio de la array de empleado
         */
        misEmpleado[0] = new Tecnico("Juan Pérez", 38, "T003", 2100, 5, "Redes");
        misEmpleado[1] = new Gestor("Ana González", 43, "G017", 3000, 8, 65000);
        misEmpleado[2] = new Administrativo("Carlos Cieza", 34, "A009", 1500, 2, "Recursos humanos");

        /**
         * hago un for para que me muestre el toString() de cada empleado
         */
        for (int i = 0; i < NUMERO; i++) {
            System.out.println(misEmpleado[i].toString());
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        /**
         * hago un for para calcular los salarios de los empleados
         */
        for (int i = 0; i < NUMERO; i++) {
            ((CalculosLaborales) misEmpleado[i]).calcularSalario();
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        /**
         * hago un for para calcular las vacaciones de los empleados introducidos
         */
        for (int i = 0; i < NUMERO; i++) {
            ((CalculosLaborales) misEmpleado[i]).calcularVacaciones();
            System.out.println("");
        }
        /**
         * hago un println para mostrar el total de empleados introducidos.
         */
        System.out.println("Tienes un total de " + Empleado.getTotalEmpleados() + " empleados.");

    }
}
