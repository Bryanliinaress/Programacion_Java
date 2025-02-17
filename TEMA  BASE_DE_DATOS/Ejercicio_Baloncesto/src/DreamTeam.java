import java.sql.SQLException;
import java.util.Scanner;
import pool.ConnectionPool;

public class DreamTeam {

    static String url = "jdbc:mariadb://localhost:3306/baloncesto";
    static String usuario = "root";
    static String contraseña ="";
    static ConnectionPool newConnectionPool = new ConnectionPool(url, usuario, contraseña);
    static GestorSocios miGestor = new GestorSocios(newConnectionPool.getConnection());
    static Scanner SC = new Scanner(System.in);


    public static int leerOpcion (){
        boolean opcionLeida= false;
        int opcion=0;
        while (!opcionLeida) {
            try {
                opcion= SC.nextInt();
                opcionLeida=true;
            } catch (Exception e) {
                SC.next();
                System.out.println("Opcion introducida incorrecta.");
                System.out.print("Introduce una opcion: ");
            }
        }
        return opcion;
    }


    public static void anadirSocio() throws SQLException{
        int socioID;
        int estatura;
        int edad;
        String nombre;
        String localidad;
        System.out.print("Dime el ID: ");
        socioID= SC.nextInt();
        System.out.println();
        SC.nextLine();
        System.out.print("Dime el nombre del socio: ");
        nombre= SC.nextLine();
        System.out.println();
        System.out.print("Dime la estatura del socio: ");
        estatura = SC.nextInt();
        System.out.println();
        System.out.print("Dime la edad del socio: ");
        edad= SC.nextInt();
        SC.nextLine();
        System.out.println();
        System.out.print("Dime la localidad del socio: ");
        localidad= SC.nextLine();
        Socio socioAAñadir= new Socio(socioID, nombre, estatura, edad, localidad);
        miGestor.create(socioAAñadir);
    }
    

    public static void bajaSocio() throws SQLException{
        int socioID;
        System.out.print("Dime el ID del socio a dar de baja: ");
        socioID= SC.nextInt();
        if (miGestor.delete(socioID)) {
            System.out.println("bien");
        }else{
            System.out.println("mal");
        }
    }


    public static void modificarSocio() throws SQLException{
        int socioID;
        int estatura;
        int edad;
        String nombre;
        String localidad;
        System.out.print("Dime el ID del socio a modificar: ");
        socioID= SC.nextInt();
        System.out.println();
        System.out.print("Dime el nuevo nombre del socio: ");
        nombre= SC.nextLine();
        System.out.println();
        System.out.print("Dime la nueva estatura del socio: ");
        estatura = SC.nextInt();
        SC.nextLine();
        System.out.println();
        System.out.print("Dime la nueva edad del socio: ");
        edad= SC.nextInt();
        SC.nextLine();
        System.out.println();
        System.out.print("Dime la nueva localidad del socio: ");
        localidad= SC.nextLine();
        Socio socioAAñadir= new Socio(socioID, nombre, estatura, edad, localidad);
        miGestor.update(socioAAñadir);
    }


    public static void listarTodos() throws SQLException{
        String formaOrdenar ;
        System.out.print("Dime como quieres ordenar la lista: ");
        formaOrdenar = SC.nextLine();
        miGestor.requestAll(formaOrdenar);
    }


    public static void consultaFiltrada() throws SQLException{
        System.out.println("Dime a traves de que columna quieres filtar: ");
        String columna = SC.nextLine();
        System.out.println("Ahora dime sobre que valor quieres filtrar: ");
        if (columna.equals("nombre") || columna.equals("localidad")) {
            String valor =SC.nextLine();
            miGestor.query(columna,valor);
        }else{
            int valor = SC.nextInt();
            miGestor.query(columna, valor);
        }
        
    }

    public static void main(String[] args) throws Exception {
        
        //anadirSocio();
        bajaSocio();
        //modificarSocio();
        //listarTodos();
        //consultaFiltrada();
    }
}
