public class disco {
    String codigo= "LIBRE";
    private String nombre;
    private String autor;
    private String generoMusical;
    private int duracion;

    public disco() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }
    public void eliminarDisco(disco d){
        d.setAutor("");
        d.setCodigo("LIBRE");
        d.setDuracion(0);
        d.setGeneroMusical("");
        d.setNombre("");
    }

    public String toString (){
        return codigo+" "+nombre+" "+ generoMusical+ " " +duracion+" "+autor;
    }
}
