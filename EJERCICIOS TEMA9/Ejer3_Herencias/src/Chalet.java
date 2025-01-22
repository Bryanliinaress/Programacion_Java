public class Chalet extends Vivienda {
    private int numeroPuerta;
    

    public Chalet (int numeroPuerta, String direccion,String codigoPostal,String Pais,String estadoVivienda){
        this.numeroPuerta=numeroPuerta;
        setCodigoPostal(codigoPostal);
        setDireccionVivienda(direccion);
        setEstadoVivienda(estadoVivienda);
        setPais(Pais);
        setEstadoVivienda(estadoVivienda);
    }

    public void setNumeroPuerta(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }
    public int getNumeroPuerta() {
        return numeroPuerta;
    }


}
