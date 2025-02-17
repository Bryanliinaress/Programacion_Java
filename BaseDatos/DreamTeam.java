import usuario.Interaccionador;

public class DreamTeam {
    public static void main(String[] args) {
        final int MAX = 7;
        int eleccion;

        do{
            System.out.println("\n Bienvenido a Dream Team!");
            System.out.println("(1) Consulta de socios filtrada");
            System.out.println("(2) Consulta ordenada de socios");
            System.out.println("(3) Consulta de socios por ID");
            System.out.println("(4) Añadir un socio");
            System.out.println("(5) Eliminar un socio");
            System.out.println("(6) Actualizar un socio");
            System.out.println("(7) Salir");
            System.out.print("\nPor favor, escoja una opción: ");
            eleccion = Interaccionador.solicitarElección(MAX);

            switch (eleccion) {
                case 1:
                    Interaccionador.consultaFiltrada();
                    break;
                case 2:
                    Interaccionador.consultaOrdenada();
                    break;
                case 3:
                    Interaccionador.consultaPorId();;
                    break;
                case 4:
                    Interaccionador.añadirSocio();
                    break;
                case 5:
                    Interaccionador.quitarSocio();
                    break;
                case 6:
                    Interaccionador.actualizarSocio();
                    break;
            }
        }while(eleccion != MAX);
        Interaccionador.cerrarScanner();
    }
}
