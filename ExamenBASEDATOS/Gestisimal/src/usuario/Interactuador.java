package usuario;

import java.util.ArrayList;
import java.util.Scanner;

import pool.ConnectionPool;
import productos.Producto;
import productos.GestorInventario;

public interface Interactuador {
    // Configuración de la conexión a la base de datos
    final String URL = "jdbc:mariadb://localhost:3306/gestisimal";
    final String USUARIO = "root";
    final String CLAVE = "";

    ConnectionPool pool = new ConnectionPool(URL, USUARIO, CLAVE);
    GestorInventario miGestor = new GestorInventario(pool.getConnection());
    Scanner sc = new Scanner(System.in);

    // Consulta ordenada de productos
    public static void consultaOrdenada() {
        ArrayList<Producto> misProductos = new ArrayList<Producto>();
        System.out.print("Dime sobre que quieres ordenar tu consulta (Ej: codigo ASC): ");
        String sortedBy = sc.nextLine();

        try {
            misProductos = (miGestor.requestAll(sortedBy));

            for (Producto productoAMostrar : misProductos) {
                System.out.println(productoAMostrar.toString());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Consulta de datos por ID
    public static void consultaPorCódigo() {
        System.out.print("Dime el codigo del producto a buscar: ");
        long códigoProductoAMostrar = (Long) solicitarValorNumérico(Long.class);

        try {
            if (miGestor.requestById(códigoProductoAMostrar).getDescripcion() == null) {
                System.out.println("No se a encontrado ningun producto con ese codigo");
            } else
                System.out.println(miGestor.requestById(códigoProductoAMostrar).toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Alta de nuevo producto
    public static void altaProducto() {
        long codigo;
        String descripcion;
        double precioCompra;
        double precioVenta;
        int stock;
        System.out.print("Dime el codigo del producto: ");
        codigo = (Long) solicitarValorNumérico(Long.class);
        System.out.print("Dime la descripcion del producto: ");
        descripcion = sc.nextLine();
        System.out.print("Dime el precio de compra del producto: ");
        precioCompra = (Double) solicitarValorNumérico(Double.class);
        System.out.print("Dime el precio de venta del producto: ");
        precioVenta = (Double) solicitarValorNumérico(Double.class);
        System.out.print("Dime el stock del producto: ");
        stock = (Integer) solicitarValorNumérico(Integer.class);

        Producto nuevoProducto = new Producto(codigo, descripcion, precioCompra, precioVenta, stock);
        try {
            if (miGestor.create(nuevoProducto)) {
                System.out.println("Producto creado con éxito. ");
            } else {
                System.out.println("Error al crear el usuario. ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Actualización de los datos de un producto
    public static void modificaciónProducto() {
        long codigo;
        String descripcion;
        double precioCompra;
        double precioVenta;
        int stock;
        System.out.print("Dime el codigo del producto a modificar: ");
        codigo = (Long) solicitarValorNumérico(Long.class);
        System.out.print("Dime la nueva descripcion del producto: ");
        descripcion = sc.nextLine();
        System.out.print("Dime el nuevo precio de compra del producto: ");
        precioCompra = (Double) solicitarValorNumérico(Double.class);
        System.out.print("Dime el nuevo precio de venta del producto: ");
        precioVenta = (Double) solicitarValorNumérico(Double.class);
        System.out.print("Dime el nuevo stock del producto: ");
        stock = (Integer) solicitarValorNumérico(Integer.class);

        Producto productoAModificar = new Producto(codigo, descripcion, precioCompra, precioVenta, stock);
        try {
            if (miGestor.update(productoAModificar)) {
                System.out.println("Producto modificado con éxito. ");
            } else {
                System.out.println("Error al modificar el usuario. ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Baja de un producto
    public static void bajaProducto() {

        System.out.print("Dime el codigo a eliminar: ");
        Long codigo = (Long) solicitarValorNumérico(Long.class);

        try {
            if (miGestor.delete(codigo)) {
                System.out.println("Producto eliminado con éxito.");
            } else {
                System.out.println("No se a podido elimnar el producto.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Solicitar opción al usuario
    public static int solicitarElección(int OPCIÓN_MAX) {
        int elección = 0;
        try {
            elección = sc.nextInt();
            if (elección < 1 || elección > OPCIÓN_MAX)
                throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println("Opción inválida.\n");
        } finally {
            sc.nextLine(); // Limpiamos buffer de entrada
        }
        return elección;
    }

    // Solicitar valor numérico al usuario
    // Ejemplo de uso 1: int existencias = (Integer)
    // solicitarValorNumérico(Integer.class);
    // Ejemplo de uso 2: long código = (Long) solicitarValorNumérico(Long.class);
    // Ejemplo de uso 3: double precioCompra = (Double)
    // solicitarValorNumérico(Double.class);
    private static Object solicitarValorNumérico(Class<?> tipo) {
        Object resultado = null;
        while (resultado == null) {
            try {
                if (tipo == Short.class)
                    resultado = sc.nextShort();
                else if (tipo == Integer.class)
                    resultado = sc.nextInt();
                else if (tipo == Long.class)
                    resultado = sc.nextLong();
                else if (tipo == Float.class)
                    resultado = sc.nextFloat();
                else if (tipo == Double.class)
                    resultado = sc.nextDouble();
                else
                    System.out.println("Tipo de dato no soportado.");
            } catch (Exception e) {
                System.out.print("Valor inválido.\nPruebe de nuevo: ");
            } finally {
                sc.nextLine(); // Limpiamos buffer de entrada
            }
        }
        return resultado;
    }

    // Cerrar scanner
    public static void cerrarScanner() {
        sc.close();
    }

}
