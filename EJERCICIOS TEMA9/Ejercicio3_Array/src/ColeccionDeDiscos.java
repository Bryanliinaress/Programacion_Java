import java.util.Scanner;

public class ColeccionDeDiscos {

    static int N = 5;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion = 0;
        String codigoIntroducido;
        int eleccionListado;
        int minimoDuracion;
        int maximoDuracion;
        String comprobadorAutor = "";
        String comprobadorGenero = "";
        int comprobadorDuracion;
        disco[] ArrayDiscos = new disco[N];
        for (int a = 0; a < N; a++) {
            ArrayDiscos[a] = new disco();
        }
        do {
            System.out.println();
            System.out.println("Introduzca la accion que desea realizar.");
            System.out.println("========================================");
            System.out.println("1. Nuevo disco.");
            System.out.println("2. Borrar disco.");
            System.out.println("3. Listado.");
            System.out.println("4. Salir.");
            System.out.println("Introduzca su opcion: ");
            opcion = s.nextInt();
            s.nextLine();
            switch (opcion) {
                case 1:
                    int i = -1;
                    boolean estaCompleto = false;
                    while (!estaCompleto) {
                        i++;
                        String codigo = ArrayDiscos[i].getCodigo();
                        if (codigo.equals("LIBRE")) {
                            estaCompleto = true;
                            System.out.println("Introduzca el codigo del disco: ");
                            codigoIntroducido = s.nextLine();
                            boolean existecodigo = false;
                            int a = -1;
                            while (!existecodigo) {
                                a++;
                                String codigoRepe = ArrayDiscos[a].getCodigo();
                                if (codigoRepe.equals(codigoIntroducido)) {
                                    System.out.println("Esta repetido");
                                    existecodigo = true;
                                    estaCompleto = false;
                                }
                                if (a == 4) {
                                    ArrayDiscos[i].setCodigo(codigoIntroducido);
                                    System.out.println("Introduzca el nombre del disco: ");
                                    ArrayDiscos[i].setNombre(s.nextLine());
                                    System.out.println("Introduzca el genero musical del disco: ");
                                    ArrayDiscos[i].setGeneroMusical(s.nextLine());
                                    System.out.println("Introduzca la duracion del disco en segundos: ");
                                    ArrayDiscos[i].setDuracion(s.nextInt());
                                    System.out.println("Introduzca el autor del disco: ");
                                    s.nextLine();
                                    ArrayDiscos[i].setAutor(s.nextLine());
                                    existecodigo = true;
                                }
                            }
                        }
                        if (i == 4) {
                            System.out.println(
                                    " Usted tiene la base de datos llena antes de introducir otro disco mas debe eliminar uno, gracias.");
                            estaCompleto = true;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Dime el codigo de la cancion que desa eliminar: ");
                    codigoIntroducido = s.nextLine();
                    boolean existecodigo = false;
                    i = -1;
                    while (!existecodigo) {
                        i++;
                        String codigo = ArrayDiscos[i].getCodigo();
                        if (codigo.equals(codigoIntroducido)) {
                            ArrayDiscos[i].eliminarDisco(ArrayDiscos[i]);
                            System.out.println("El disco a sido eliminado correctamente.");
                            existecodigo = true;
                        }
                        if ((i == 4) && (!codigo.equals(codigoIntroducido))) {
                            System.out.println("El codigo introducido no existe.");
                            existecodigo = true;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Dime que tipo de listado deseas: ");
                    System.out.println("=================================");
                    System.out.println("1. Listado completo.");
                    System.out.println("2. Listado por autor.");
                    System.out.println("3. Listado por género.");
                    System.out.println("4. Listado por duracion.");
                    System.out.print("Elige una opcion:");
                    eleccionListado = s.nextInt();
                    s.nextLine();
                    switch (eleccionListado) {
                        case 1:
                            for (i = 0; i < N; i++) {
                                System.out.println(ArrayDiscos[i]);
                            }
                            break;
                        case 2:
                            System.out.println("De que autor desea la lista: ");
                            String nombreAutor = s.nextLine();
                            for (i = 0; i < N; i++) {
                                comprobadorAutor = ArrayDiscos[i].getAutor();
                                if (nombreAutor.equals(comprobadorAutor)) {
                                    System.out.println(ArrayDiscos[i]);
                                }else if (i == 4 && (!nombreAutor.equals(comprobadorAutor))) {
                                    System.out
                                            .println("Eso es todo lo que tengo sobre ese autor");
                                }
                            }
                            break;

                        case 3:
                            System.out.println("De que genero desea la lista: ");
                            String genero=s.nextLine();
                            for (i=0; i<N ; i++){
                                comprobadorGenero= ArrayDiscos[i].getGeneroMusical();
                                if (genero.equals(comprobadorGenero)) {
                                    System.out.println(ArrayDiscos[i]);
                                    
                                }else if (i== 4 && (!genero.equals(comprobadorGenero))) {
                                    System.out.println("Eso es todo lo que tengo sobre ese genero");
                                }
                            }
                        break;

                        case 4:
                            System.out.println("Introduzca de que rango de duracion minima desea que sea la lista (introduzca la cantidad en segundos): ");
                            minimoDuracion= s.nextInt();
                            System.out.println("Introduzca de que rango de duracion maxima desea que sea la lista (introduzca la cantidad en segundos):");
                            maximoDuracion= s.nextInt();
                            for (i = 0 ; i<N ; i++){
                                comprobadorDuracion=ArrayDiscos[i].getDuracion();
                                if (comprobadorDuracion<maximoDuracion && comprobadorDuracion>minimoDuracion) {
                                    System.out.println(ArrayDiscos[i]);
                                } else if (i==4 && ((comprobadorDuracion>maximoDuracion && comprobadorDuracion>minimoDuracion)||( comprobadorDuracion<maximoDuracion && comprobadorDuracion<minimoDuracion))) {
                                    System.out.println("Eso es todo lo que tengo en la base de datos.");
                                }
                            }

                        break; 
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        } while (opcion != 4);
        s.close();
    }

}
