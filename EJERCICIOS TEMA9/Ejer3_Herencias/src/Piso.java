public class Piso extends Vivienda {
    
    private int numeroPiso;
    private int numeroPortal;
    private int numeroEscalera;

    
    public Piso (int numeroPiso, int numeroportal, int numeroEscalera, String direccion,String codigoPostal,String Pais,String estadoVivienda){
        this.numeroEscalera=numeroEscalera;
        this.numeroPiso=numeroPiso;
        this.numeroPortal=numeroportal;
        setCodigoPostal(codigoPostal);
        setDireccionVivienda(direccion);
        setEstadoVivienda(estadoVivienda);
        setEstadoVivienda(estadoVivienda);
        setPais(Pais);
    }

    public void setNumeroEscalera(int numeroEscalera) {
        this.numeroEscalera = numeroEscalera;
    }
    public int getNumeroEscalera() {
        return numeroEscalera;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }
    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPortal(int numeroPortal) {
        this.numeroPortal = numeroPortal;
    }
    public int getNumeroPortal() {
        return numeroPortal;
    }


}
