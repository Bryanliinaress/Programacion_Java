public class Administrativo extends Empleado implements CalculosLaborales {
    private String area;

    public Administrativo(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo,
            String area) {
        super(nombre, edad, idEmpleado, salarioBase, anosDeTrabajo);
        this.area = area;
    }

    @Override
    public double calcularBonificacion() {
        double bonificación = 0;
        if (area.equals("Recursos humanos") || area.equals("recursos humanos")) {
            bonificación = 30 * 20;
        } else {
            bonificación = 30 * 10;
        }
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
            diasDeVacaciones = diasDeVacaciones + 15;
        }
        System.out.println("Despues de " + getAnosDeTrabajo() + " años de trabajo tiene " + diasDeVacaciones
                + " días de vacaciones");
        return diasDeVacaciones;
    }

    @Override
    public String toString() {
        String frase = "Administrativo: " + getNombre() + ", Edad: " + getEdad() + ", ID: " + getIdEmpleado()
                + ", Salario base: " + getSalarioBase();
        frase += "€, Años de trabajo:" + getAnosDeTrabajo() + ", Area: " + area;
        return frase;
    }
}
