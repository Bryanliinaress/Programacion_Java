public class Tecnico extends Empleado implements CalculosLaborales {

    private String especialidad;

    public Tecnico(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo,
            String especialidad) {
        super(nombre, edad, idEmpleado, salarioBase, anosDeTrabajo);
        this.especialidad = especialidad;
    }
    
    @Override
    public double calcularBonificacion() {
        double bonificación = 0;
        if (especialidad.equals("redes") || especialidad.equals("Redes")) {
            bonificación = 1000;
        } else if (especialidad.equals("seguridad") || especialidad.equals("Seguridad")) {
            bonificación = 1200;
        } else {
            bonificación = 800;
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
            diasDeVacaciones = diasDeVacaciones + 20;
        }
        System.out.println("Despues de " + getAnosDeTrabajo() + " años de trabajo tiene " + diasDeVacaciones
                + " días de vacaciones");
        return diasDeVacaciones;
    }

    @Override
    public String toString() {
        String frase = "Técnico: " + getNombre() + ", Edad: " + getEdad() + ", ID: " + getIdEmpleado()
                + ", Salario base: " + getSalarioBase();
        frase += "€, Años de trabajo:" + getAnosDeTrabajo() + ", Especialidad: " + especialidad;
        return frase;
    }
}
