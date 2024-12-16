public abstract class Vehiculo {

    private static int kilometrosTotales=0; 
    private static int vehiculosCreados=0;

    private int kilometrosRecorridos=0;

    public Vehiculo(){
        this.kilometrosRecorridos=0;
    }

    public int getKilometrosRecorridos(){
        return this.kilometrosRecorridos;
    }

    public static int getKilometrosTotales(){
        return Vehiculo.kilometrosTotales;
    }

    public void recorre(int km){
        this.kilometrosRecorridos+=km;
        Vehiculo.kilometrosTotales +=km;
    }
}
