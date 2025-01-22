abstract class Vivienda {
    private  String direccionVivienda;
    private  String codigoPostal;
    private  String Pais;
    private  String estadoVivienda;

    public void setEstadoVivienda(String estadoVivienda) {
        this.estadoVivienda = estadoVivienda;
    }
    public  String getEstadoVivienda() {
        return estadoVivienda;
    }


    public  void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public  String getCodigoPostal() {
        return codigoPostal;
    }


    public  void setDireccionVivienda(String direccionVivienda) {
        this.direccionVivienda = direccionVivienda;
    }

    public  String getDireccionVivienda() {
        return direccionVivienda;
    }


    public  void setPais(String pais) {
        this.Pais = pais;
    }

    public  String getPais() {
        return Pais;
    }

    public String toString(){
        String frase= "La vivienda se encuentra en "+Pais+", en la calle "+direccionVivienda;
        frase += ", cuyo codigo postale es "+codigoPostal+" y la vivienda se encuentra "+estadoVivienda;
        return frase;
    }

}
