public class Socio {
    private int id;
    private String nombre;
    private int estatura;
    private int edad;
    private String localidad;

    public Socio (Socio miSocio){
        
    }
    
    public Socio(int socioID, String nombre2, int estatura2, int edad2, String localidad2) {
        this.edad= edad2;
        this.id= socioID;
        this.nombre= nombre2;
        this.estatura= estatura2;
        this.localidad= localidad2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Socio [id=" + id + ", nombre= " + nombre + ", estatura= " + estatura + ", edad= " + edad + ", localidad= "
                + localidad + "]\n\n\n";
    }

}

