package ProgramaGatos;
public class Gato {
    private String nombre;
    private String color;
    private String raza;

    public Gato(){

    }

    public Gato(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    public String getColor (){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nColor: " + this.color + "\nRaza: " + this.raza;
    }

    public int compareTo(Gato g) {
        return (this.nombre).compareTo(g.getNombre());
    }

    public boolean equals(Gato g) {
        return (this.nombre).equals(g.getNombre());
    }

}
