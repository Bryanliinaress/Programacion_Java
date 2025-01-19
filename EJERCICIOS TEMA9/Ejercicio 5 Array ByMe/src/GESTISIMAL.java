import java.util.Scanner;

public class GESTISIMAL {
    static int N = 5;

    public static void main(String[] args) {
        int Opcion = 0;
        String comprobadorEspacio;
        String comprobadorCodigo;
        String codigo;
        int productoAModificar = 0;
        Scanner s = new Scanner(System.in);
        Articulo_byMe[] articulo = new Articulo_byMe[N];

        for (int i = 0; i < N; i++) {
            articulo[i] = new Articulo_byMe();
        }

        do {
            System.out.println("");
            System.out.println("GESTISIMAL");
            System.out.println("==========");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.print("Dime que desea hacer: ");
            Opcion = s.nextInt();
            s.nextLine();
            System.out.println("");
            switch (Opcion) {
                case 1:
                    System.out.println("LISTADO");
                    System.out.println("=======");
                    for (int i = 0; i < N; i++) {
                        System.out.println(articulo[i].toString(i));
                    }
                    break;

                case 2:
                    System.out.println("Alta de producto");
                    System.out.println("================");
                    System.out.println("");
                    int i = -1;
                    boolean hayEspacio = false;
                    while (!hayEspacio) {
                        i++;
                        comprobadorEspacio = articulo[i].getCodigo();
                        if (comprobadorEspacio.equals("LIBRE")) {
                            hayEspacio = true;
                            int primeraLibre = i;
                            System.out.print("Dime el codigo del producto: ");
                            codigo = s.nextLine();
                            int a = -1;
                            boolean codigoRepe = false;
                            while (!codigoRepe) {
                                a++;
                                comprobadorCodigo = articulo[a].getCodigo();
                                if (comprobadorCodigo.equals(codigo)) {
                                    codigoRepe = true;
                                    hayEspacio = false;
                                    System.out.println("El codigo introducido ya existe.");
                                } else if (a == (N - 1)) {
                                    articulo[primeraLibre].setCodigo(codigo);
                                    System.out.print("Dame su descripcion: ");
                                    articulo[primeraLibre].setDescripcion(s.nextLine());
                                    System.out.print("Dime su precio de compra: ");
                                    articulo[primeraLibre].setPrecioCompra(s.nextDouble());
                                    System.out.print("Dime su precio de venta: ");
                                    articulo[primeraLibre].setPrecioVenta(s.nextDouble());
                                    System.out.print("Dime el stock del producto: ");
                                    articulo[primeraLibre].setStockProducto(s.nextInt());
                                    codigoRepe = true;
                                }
                            }
                        }
                        if (i == (N - 1)) {
                            System.out.println(
                                    "Tiene la base de datos completa elimina un producto antes de añadir otro.");
                            hayEspacio = true;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Baja de producto");
                    System.out.println("================");
                    System.out.println("");
                    System.out.println("Dime el codigo del articulo que desea dar de baja: ");
                    codigo = s.nextLine();
                    boolean darDeBaja = false;
                    i = -1;
                    while (!darDeBaja) {
                        i++;
                        comprobadorCodigo = articulo[i].getCodigo();
                        if (codigo.equals(comprobadorCodigo)) {
                            System.out.println("El articulo se a dado de baja.");
                            articulo[i].darDeBaja();
                            darDeBaja = true;
                        } else if (i == (N - 1)) {
                            System.out.println("No se a encontra ningun articulo con ese codigo.");
                            darDeBaja = true;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Modificación");
                    System.out.println("============");
                    System.out.println("");
                    System.out.println("Dime el codigo del articulo que desea modificar: ");
                    codigo = s.nextLine();
                    boolean Modificacion = false;
                    i = -1;
                    while (!Modificacion) {
                        i++;
                        comprobadorCodigo = articulo[i].getCodigo();
                        if (codigo.equals(comprobadorCodigo)) {
                            articulo[i].darDeBaja();
                            productoAModificar = i;
                            Modificacion = true;
                            System.out.println("Dame el codigo del nuevo articulo: ");
                            codigo = s.nextLine();
                            int a = -1;
                            boolean codigoRepe = false;
                            while (!codigoRepe) {
                                a++;
                                comprobadorCodigo = articulo[a].getCodigo();
                                if (comprobadorCodigo.equals(codigo)) {
                                    codigoRepe = true;
                                    System.out.println("El codigo introducido ya existe.");
                                } else if (a == (N - 1)) {
                                    articulo[productoAModificar].setCodigo(codigo);
                                    System.out.print("Dame su descripcion: ");
                                    articulo[productoAModificar].setDescripcion(s.nextLine());
                                    System.out.print("Dime su precio de compra: ");
                                    articulo[productoAModificar].setPrecioCompra(s.nextDouble());
                                    System.out.print("Dime su precio de venta: ");
                                    articulo[productoAModificar].setPrecioVenta(s.nextDouble());
                                    System.out.print("Dime el stock del producto: ");
                                    articulo[productoAModificar].setStockProducto(s.nextInt());
                                    codigoRepe = true;
                                }
                            }
                        } else if (i == (N - 1)) {
                            System.out.println("No se a encontra ningun articulo con ese codigo.");
                            Modificacion = true;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Entrada de mercancía");
                    System.out.println("====================");
                    System.out.println("");
                    System.out.println("Dime el codigo del articulo que a entrado: ");
                    codigo = s.nextLine();
                    boolean entradaMercancia = false;
                    i = -1;
                    while (!entradaMercancia) {
                        i++;
                        comprobadorCodigo = articulo[i].getCodigo();
                        if (codigo.equals(comprobadorCodigo)) {
                            System.out.println("Dime la cantidad que a entrado: ");
                            int entradaDeMercancía = s.nextInt();
                            int cantidadAntigua = articulo[i].getStockProducto();
                            articulo[i].setStockProducto(entradaDeMercancía + cantidadAntigua);
                            entradaMercancia = true;
                            System.out.println("Stock modificado con exito.");
                        } else if (i == (N - 1)) {
                            System.out.println("No se a encontra ningun articulo con ese codigo.");
                            entradaMercancia = true;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Salida de mercancía");
                    System.out.println("====================");
                    System.out.println("");
                    System.out.println("Dime el codigo del articulo que va a salir: ");
                    codigo = s.nextLine();
                    boolean salidaMercancia = false;
                    i = -1;
                    while (!salidaMercancia) {
                        i++;
                        comprobadorCodigo = articulo[i].getCodigo();
                        if (codigo.equals(comprobadorCodigo)) {
                            System.out.println("Dime la cantidad que va a salir: ");
                            int salidaDeMercancia = s.nextInt();
                            int cantidadAntigua = articulo[i].getStockProducto();
                            if (0 > (cantidadAntigua-salidaDeMercancia)) {
                                System.out.println("Lo siento no se puede sacar tanta cantidad de " + codigo);
                                salidaMercancia=true;
                            } else {
                                articulo[i].setStockProducto(cantidadAntigua - salidaDeMercancia);
                                salidaMercancia = true;
                                System.out.println("Stock modificado con exito.");
                            }
                        } else if (i == (N - 1)) {
                            System.out.println("No se a encontra ningun articulo con ese codigo.");
                            salidaMercancia = true;
                        }
                    }
                    break;
                default:
                    System.out.println("La opcion escogida no corresponde a ninguna de las mostradas.");
                    break;
            }
        } while (Opcion != 7);
        s.close();
    }
}
