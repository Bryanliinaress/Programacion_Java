public abstract class Dispositivo {
    
    private static int contadorDispositivos=0 ;
    protected     String marca;
    
    public Dispositivo(String marca){
        this.marca=marca;
        contadorDispositivos++;
    }

    public static int getContadorDispositivos() {
        return contadorDispositivos;
    }
    public static void setContadorDispositivos() {
        Dispositivo.contadorDispositivos++;
    }

    public String getMarca() {
        return marca;
    }

    public String toString(){ 
        return "Tienes "+Dispositivo.contadorDispositivos+" dispositivos guadados de diferente marcas esta es "+marca;
    }
}
