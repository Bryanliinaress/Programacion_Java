public class Persona {
    private String nombrePersona;
    private int edad;

    public Persona (String nombre, int edad){
        this.edad=edad;
        this.nombrePersona=nombre;
    }
    
    public String getNombrePersona() {
        return nombrePersona;
    }

    @Override
    public String toString() {
        String frase = "Nombre: "+nombrePersona+", Edad: "+ edad;
        return frase;
    }
}
