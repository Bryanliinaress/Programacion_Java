public class Televisor extends Dispositivo implements Encendible {
    private int diagonal;
    private String tecnologia;
    private String estadoTele="Apagado";


    public Televisor (int diagonal, String tecnologia, String marca){
        super(marca);
        this.tecnologia=tecnologia;
        this.diagonal=diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
    public int getDiagonal() {
        return diagonal;
    }

    public void setEstadoTele(String estadoTele) {
        this.estadoTele = estadoTele;
    }
    public String getEstadoTele() {
        return estadoTele;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
    public String getTecnologia() {
        return tecnologia;
    }

    @Override
    public String toString(){
        return "El televisor tiene un tamaño de "+diagonal+" pulgadas con una tecnología "+tecnologia+" y se encuentra "+estadoTele+". "+super.toString();
    }

    @Override
    public void apagar() {
        this.estadoTele="apagado";
    }

    @Override
    public void encender(){
        this.estadoTele="Encendido";
    }
}
