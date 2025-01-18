import java.util.Scanner;

public class ColeccionDeDiscos {

    static int N = 20;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion = 0;
        String codigoIntroducido;
        disco[] ArrayDiscos = new disco[N];
        do {
            System.out.println("Introduzca la accion que desea realizar.");
            System.out.println("========================================");
            System.out.println("1. Nuevo disco.");
            System.out.println("2. Borrar disco.");
            System.out.println("3. Listado.");
            System.out.println("4. Salir.");
            System.out.println("Introduzca su opcion: ");
            opcion = s.nextInt();

            for (int a = 0; a < N; a++) {
                ArrayDiscos[a] = new disco();
            }
            System.out.println(ArrayDiscos[0]);

            switch (opcion) {
                case 1:
                    int i = -1;
                    boolean estaCompleto = false;
                    while (!estaCompleto) {
                        i++;
                        ArrayDiscos[i] = new disco();
                        String codigo = ArrayDiscos[i].getCodigo();
                        if (codigo.equals("LIBRE")) {
                            estaCompleto = true;
                            System.out.println("Introduzca el codigo del disco: ");
                            ArrayDiscos[i].setCodigo(s.nextLine());
                            ArrayDiscos[i].setCodigo(s.nextLine());
                            System.out.println("Introduzca el nombre del disco: ");
                            ArrayDiscos[i].setNombre(s.nextLine());
                            System.out.println("Introduzca el genero musical del disco: ");
                            ArrayDiscos[i].setGeneroMusical(s.nextLine());
                            System.out.println("Introduzca la duracion del disco en segundos: ");
                            ArrayDiscos[i].setDuracion(s.nextInt());

                            System.out.println("Introduzca el autor del disco: ");
                            ArrayDiscos[i].setAutor(s.nextLine());
                            s.next();
                        }
                        if (i == 19) {
                            System.out.println(
                                    "Lo siento, la base de datos esta lleno primero debe elimanar un disco antes de continuar. ");
                            estaCompleto = true;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Dime el codigo de la cancion que desa eliminar: ");
                    s.nextLine();
                    codigoIntroducido = s.nextLine();
                    boolean existecodigo = false;
                    i = -1;
                    while (!existecodigo) {
                        i++;
                        String codigo = ArrayDiscos[0].getCodigo();
                        System.out.println(codigo);
                        if (codigo.equals(codigoIntroducido)) {
                            ArrayDiscos[i].eliminarDisco(ArrayDiscos[i]);
                            System.out.println("El disco a sido eliminado correctamente.");
                            existecodigo = true;
                        }
                        if (i == 19) {
                            System.out.println("El codigo introducido no existe.");
                            existecodigo = true;
                        }
                    }

                    break;
                default:
                    break;
            }
        } while (opcion != 4);
    }

}
