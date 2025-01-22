public class Computadora extends Dispositivo implements Encendible {
    private String ram;
    private String disco;
    private String procesador;
    private String estadoCompu="Apagado";

    public Computadora(String ram, String disco, String procesador, String marca){
        super(marca);
        this.ram=ram;
        this.disco=disco;
        this.procesador=procesador;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }
    public String getDisco() {
        return disco;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public String getProcesador() {
        return procesador;
    }

    public void setEstado(String estado) {
        this.estadoCompu = estado;
    }
    public String getEstado() {
        return estadoCompu;
    }
    
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getRam() {
        return ram;
    }

    @Override
    public String toString(){
        return "La computadora de la marca "+super.getMarca()+" se encuentra "+estadoCompu+" y cuenta con una ram de "+ram+", un disco de "+disco+" y un procesador "+procesador+". "+super.toString();
    }

    @Override
    public void apagar() {
        this.estadoCompu="apagado";
    }

    @Override
    public void encender(){
        this.estadoCompu="Encendido";
    }
}
