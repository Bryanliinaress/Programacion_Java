public class Gestor extends Empleado implements CalculosLaborales {
    private double presupuesto;

    public Gestor(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo,
            double presupuesto) {
        super(nombre, edad, idEmpleado, salarioBase, anosDeTrabajo);
        this.presupuesto = presupuesto;
    }

    @Override
    public double calcularBonificacion() {
        double bonificación = presupuesto * 0.05;
        System.out.println("La bonificación es de " + bonificación + "€");
        return bonificación;
    }

    @Override
    public double calcularSalario() {
        double calculoSalario = getSalarioBase() + calcularBonificacion();
        System.out.println("El salario de su empleado es de " + calculoSalario + "€");
        return calculoSalario;
    }

    @Override
    public int calcularVacaciones() {
        int diasDeVacaciones = 0;
        for (int i = 0; i <= getAnosDeTrabajo(); i++) {
            diasDeVacaciones = diasDeVacaciones + 30;
        }
        System.out.println("Despues de " + getAnosDeTrabajo() + " años de trabajo tiene " + diasDeVacaciones
                + " días de vacaciones");
        return diasDeVacaciones;
    }

    @Override
    public String toString() {
        String frase = "Gestor: " + getNombre() + ", Edad: " + getEdad() + ", ID: " + getIdEmpleado()
                + ", Salario base: " + getSalarioBase();
        frase += "€, Años de trabajo:" + getAnosDeTrabajo() + ", Presupuesto: " + presupuesto;
        return frase;
    }
}
