package usuario;


import java.util.ArrayList;
import java.util.Scanner;

import pool.ConectionPool;
import socios.GestorSocios;
import socios.Socio;


public interface Interaccionador {
    final String URL = "jdbc:mariadb://localhost:3306/baloncesto";
    final String USER = "root";
    final String CLAVE = "";

    ConectionPool pool = new ConectionPool(URL, USER, CLAVE);
    GestorSocios miGestor = new GestorSocios(pool.getConnection());
    Scanner s = new Scanner(System.in);


    public static void consultaFiltrada(){
        ArrayList<Socio> lista = null;
        System.out.println("Opciones: (nombre, localidad, edad, estatura)");
        System.out.print("Escriba la columna por la que desea filtrar:");
        String columna = s.nextLine().toLowerCase();
        try{
            switch (columna) {
                case ("nombre"):
                case ("localidad"):
                    if(columna.equals("nombre")){
                        System.out.print("Escriba el nombre del socio: ");
                    }else{
                        System.out.print("Escriba la localidad del socio: ");
                    }
                    String linea = s.nextLine();
                    lista = miGestor.query(columna, linea);
                    break;
                
                case  ("edad"):
                case ("estatura"):
                    if( columna.equals("edad")){
                        System.out.print("Escriba la edad del socio: ");
                    }else{
                        System.out.print("Escriba la estatura del socio: ");
                    }
                    int valor = pedirEntero();
                    lista = miGestor.query(columna, valor);
                    break;
            }
            if(lista.isEmpty()) System.out.println("No se encuentran socios con esos criterios");
            for(Socio socio : lista){
                System.out.println(socio);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void consultaPorId(){
        System.out.print("\nEscriba el ID del socio:");
        int id = pedirEntero();
        try{
            Socio socio = miGestor.requestById(id);
            if(socio != null){
                System.out.println(socio);
            }else{
                System.out.println("No se encuentra un socio con ese ID");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void consultaOrdenada(){
        System.out.print("\nEscriba la columna por la que desea ordenar:");
        String columna = s.nextLine().toLowerCase();
        System.out.println("Indique el orden (ASC o DESC)");
        columna += " " + s.nextLine().toUpperCase();
        ArrayList<Socio> lista = null;
        try{
            lista = miGestor.requestAll(columna);
            if(lista.isEmpty()) System.out.println("No se encuentran socios");
            for(Socio socio : lista){
                System.out.println(socio);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void añadirSocio(){
        System.out.print("\nEscriba el ID del socio:");
        int id = pedirEntero();
        System.out.print("\nEscriba el nombre del socio:");
        String nombre = s.nextLine();
        System.out.print("\nEscriba la altura del socio:");
        int altura = pedirEntero();
        System.out.print("\nEscriba la edad del socio:");
        int edad = pedirEntero();
        System.out.println("\nEscriba la localidad del socio:");
        String localidad = s.nextLine();
        Socio socio = new Socio(id, nombre, altura, edad, localidad);
        try{
            if(miGestor.create(socio)){
                System.out.println("Socio añadido con éxito");
            }else{
                System.out.println("Error al añadir el socio");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void quitarSocio(){
        System.out.println("\nEscriba el ID del socio:");
        int id = pedirEntero();
        try{
            Socio socio = miGestor.requestById(id);
            if(miGestor.delete(socio) && socio != null){
                System.out.println("Socio eliminado con éxito");
            }else{
                System.out.println("Error al eliminar el socio");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void actualizarSocio(){
        System.out.println("\nEscriba el ID del socio que desea actualizar:");
        int id = pedirEntero();
        System.out.println("\nEscriba el nuevo nombre del socio:");
        String nombre = s.nextLine();
        System.out.println("\nEscriba la nueva altura del socio:");
        int altura = pedirEntero();
        System.out.println("\nEscriba la nueva edad del socio:");
        int edad = pedirEntero();
        System.out.println("\nEscriba la nueva localidad del socio:");
        String localidad = s.nextLine();
        try{
            Socio socio = miGestor.requestById(id);
            socio.setLocalidad(localidad);
            socio.setNombre(nombre);
            socio.setEdad(edad);
            socio.setAltura(altura);
            if(miGestor.update(socio) && socio != null){
                System.out.println("Socio actualizado con éxito");
            }else{
                System.out.println("Error al actualizar el socio");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static int pedirEntero(){
        int valor = 0;
        while (true) {
            try {
                valor = s.nextInt();
                return valor;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                s.nextLine();
            }
        }
    }

    public static int solicitarElección(int MAX){
        int eleccion = 0;
        try{
            eleccion = s.nextInt();
            if(eleccion < 1 || eleccion > MAX)throw new IllegalArgumentException();
        }catch (Exception e){
            System.out.println("Opción inválida.\n");
        }finally{
            s.nextLine();
        }
        return eleccion;
    }

    public static void cerrarScanner(){
        s.close();
    }
}
