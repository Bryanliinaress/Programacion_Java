package socios;

public class Socio {
    private int id, altura, edad;
    private String nombre, localidad;

    public Socio(){        
        this(0, "", 0, 0, "");
    }

    public Socio(int id, String nombre, int altura, int edad, String localidad) {
        this.id = id;
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public Socio(Socio socio){
        this.id = socio.id;
        this.altura = socio.altura;
        this.edad = socio.edad;
        this.nombre = socio.nombre;
        this.localidad = socio.localidad;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String toString() {
        return "Socio [id=" + id + ", altura=" + altura + ", edad=" + edad + ", nombre=" + nombre + ", localidad=" + localidad + "]";
    }
}
