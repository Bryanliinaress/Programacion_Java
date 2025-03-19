package socios;

public class Socio {
    int socioID;
    String nombre;
    int estatura;
    int edad;
    String localidad;
 
    public Socio() {
        this(0,"", 0, 0, "");
    }

    public Socio(int socioID, String nombre, int estatura, int edad, String localidad) {
        this.socioID = socioID;
        this.nombre = nombre;
        this.estatura = estatura;
        this.edad = edad;
        this.localidad = localidad;
    }
    
    public Socio(Socio socio) {
        this.socioID = socio.socioID;
        this.nombre = socio.nombre;
        this.estatura = socio.estatura;
        this.edad = socio.edad;
        this.localidad = socio.localidad;
    }

    public int getId() {
        return socioID;
    }

    public void setId(int socioID) {
        this.socioID = socioID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nombre: %s, Estatura: %d, Edad: %d, Localidad: %s", 
        this.socioID, this.nombre, this.estatura, this.edad, this.localidad);
    }
}