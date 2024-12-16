public class PilotoDeFormula1 {
    String marcaRepresenta, nombre;
    int edad;

    PilotoDeFormula1(String nombrePiloto, int n, String mr) {
        this.nombre = nombrePiloto;
        this.edad = n;
        this.marcaRepresenta = mr;
    }

    String getMarcaReperesenta() {
        return marcaRepresenta;
    }

    void marcaRepresenta() {
        System.out.println(getMarcaReperesenta());
    }

    void nombrePiloto() {
        System.out.println(this.nombre);
    }

    void sonidoCoche() {
        System.out.println("fiuuuuuuuu");
    }

    public static void main(String[] args) {
        PilotoDeFormula1 piloto1 = new PilotoDeFormula1("Manolillo", 28, "ferrari como franccesco");

        System.out.println("Muy buenas, cual es tu nombre?");
        piloto1.nombrePiloto();
        System.out.println("Que sonido hace tu coche mientras corres");
        piloto1.sonidoCoche();
        System.out.println("Y a que marca representas?");
        piloto1.marcaRepresenta();
    }
}