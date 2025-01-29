/**
 * Clase abstract Empleado que va a ser Padre
 * 
 * @author Bryan Linares
 * @version 1.0
 */

abstract class Empleado {
    /**
     * Declaro las variables privadas de la clase Empleado
     * 
     * -String nombre, va a guardar el nombre de los empleados
     * -int edad, va a guardar la edad de los empleados
     * -String idEmpleado, va a guardar los id de los empleados
     * -double salarioBase va a guardar los salarios base de los empleados
     * -static int totalEmpleados, es un contador de todos los empleados que creemos
     */
    private String nombre;
    private int edad;
    private String idEmpleado;
    private double salarioBase;
    private int anosDeTrabajo;
    private static int totalEmpleados = 0;

    /**
     * Creo el constructor de Empleado
     * 
     * @param nombre
     * @param edad
     * @param idEmpleado
     * @param salarioBase
     * @param anosDeTrabajo
     */
    public Empleado(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo) {
        this.nombre = nombre;
        this.edad = edad;
        this.idEmpleado = idEmpleado;
        setSalarioBase(salarioBase);
        this.anosDeTrabajo = anosDeTrabajo;
        totalEmpleados++;
    }

    /**
     * Le da valor a la variable anosDeTrabajo de un empleado
     * 
     * @param anosDeTrabajo
     */
    public void setAnosDeTrabajo(int anosDeTrabajo) {
        this.anosDeTrabajo = anosDeTrabajo;
    }

    /**
     * Devuelve los años de trabajo de un empleado
     * 
     * @return los años de trabajo de un empleado
     */
    public int getAnosDeTrabajo() {
        return anosDeTrabajo;
    }

    /**
     * Le da valor a la variable de edad de un empleado
     * 
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve la edad de un empleado
     * 
     * @return la edad de un empleado
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Le da valor al id de un empleado
     * 
     * @param idEmpleado
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * Devuelve el id de un empleado
     * 
     * @return el id de un empleado
     */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Le da valor al nombre de un empleado
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre de un empleado
     * 
     * @return el nombre de un empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Le da valor al salario base de un empleado y ademas comprueba que el salario
     * no sea menor a 0
     * y si es el caso le da un valor a salario base de 0
     * 
     * @param salarioBase
     */
    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            this.salarioBase = 0;
        } else {
            this.salarioBase = salarioBase;
        }
    }

    /**
     * devuelve el salario base de un empleado
     * 
     * @return el salario base de un empleado
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Devuelve el total de empleados que hemos creado
     * 
     * @return el total de empleados que hemos creado
     */
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    /**
     * Muestra la información de los empleados
     */
    public String toString() {
        String frase = "Empleado: " + nombre + ", Edad: " + edad + ", Id: " + idEmpleado + ", Salario base: "
                + salarioBase;
        frase += ", Años de trabajo: " + anosDeTrabajo;
        return frase;
    }
}
