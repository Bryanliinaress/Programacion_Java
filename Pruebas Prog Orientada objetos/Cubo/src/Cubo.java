public class Cubo {

    int capacidad;
    int contenido;

    Cubo(int c) {
        this.capacidad = c;
    }

    int getCapacidad() {
        return this.capacidad;
    }

    int getContenido() {
        return this.contenido;
    }

    void setContenido(int litros) {
        this.contenido = litros;
    }

    void vacia() {
        this.contenido = 0;
    }

    void llena() {
        this.contenido = this.capacidad;
    }

    void pinta() {
        for (int nivel = this.capacidad; nivel > 0; nivel--) {
            if (this.contenido >= nivel) {
                System.out.println("#~~~~#");
            } else {
                System.out.println("#    #");
            }
        }
        System.out.println("######");
    }

    public static void main(String[] args) {
        Cubo cubito = new Cubo(2);
        Cubo cubote = new Cubo(7);
        System.out.println("Cubito: \n");
        cubito.pinta();
        System.out.println("\nCubote: \n");
        cubote.pinta();
        System.out.println("\nLleno el cubito: \n");
        cubito.llena();
        cubito.pinta();
        System.out.println("\nEl cubote sigue vacío: \n");
        cubote.pinta();
        System.out.println("Lleno el cubote");
        cubote.llena();
        cubote.pinta();
    }
}