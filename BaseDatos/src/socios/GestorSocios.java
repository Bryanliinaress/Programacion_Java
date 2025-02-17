package socios;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import crud.CRUD;

public class GestorSocios implements CRUD<Socio>{
    private Connection con;

    public GestorSocios(Connection con) {
        this.con = con;
    }

    @Override
    public ArrayList<Socio> query(String col, String val)throws SQLException {
        List<String> validos = Arrays.asList("nombre", "localidad");
        if(!validos.contains(col))throw new SQLException("Columna no válida");

        ArrayList<Socio> resultado = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + col + " = ?";

        try(PreparedStatement state = this.con.prepareStatement(sqlQuery)) {
            state.setString(1, val);

            ResultSet querySet = state.executeQuery();
            while (querySet.next()) {
                int id = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int altura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                resultado.add(new Socio(id, nombre, altura, edad, localidad));
            }
            return resultado;
        }catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public ArrayList<Socio> query(String col, int val) throws SQLException{
        List<String> validos = Arrays.asList( "altura", "edad");
        if(!validos.contains(col))throw new SQLException("Columna no válida");
        ArrayList<Socio> resultado = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + col + " = ?";

        try(PreparedStatement state = this.con.prepareStatement(sqlQuery)){
            state.setInt(1, val);

            ResultSet querySet = state.executeQuery();
            while (querySet.next()) {
                int id = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int altura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                resultado.add(new Socio(id, nombre, altura, edad, localidad));
            }
            return resultado;
        }catch (SQLException e){
            throw e;
        }
    }

    @Override
    public ArrayList<Socio> requestAll(String sortedBy) {
        ArrayList<Socio> resultado = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio";
        if(!sortedBy.isEmpty()) sqlQuery += " ORDER BY " + sortedBy;

        try(Statement state = this.con.createStatement()){
            ResultSet querySet = state.executeQuery(sqlQuery);
            while(querySet.next()){
                int id = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int altura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                resultado.add(new Socio(id, nombre, altura, edad, localidad));
            }
            return resultado;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    @Override
    public Socio requestById(int id) {
        Socio socio = null;
        String sqlQuery = "SELECT * FROM socio WHERE socioID = ?";
        try(PreparedStatement state = this.con.prepareStatement(sqlQuery)){
            state.setInt(1, id);
            ResultSet querySet = state.executeQuery();
            while(querySet.next()){
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int altura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                socio = new Socio(socioID, nombre, altura, edad, localidad);
            }
            return socio;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return socio;
        
    }

    @Override
    public boolean create(Socio socio) throws SQLException {
        int socioID = socio.getId();
        String nombre = socio.getNombre();
        int altura = socio.getAltura();
        int edad = socio.getEdad();
        String localidad = socio.getLocalidad();

        String sqlQuery = "INSERT INTO socio (socioID, nombre, estatura, edad, localidad) VALUES (?, ?, ?, ?, ?)";
        try(PreparedStatement state = this.con.prepareStatement(sqlQuery)){
            state.setInt(1, socioID);
            state.setString(2, nombre);
            state.setInt(3, altura);
            state.setInt(4, edad);
            state.setString(5, localidad);

            int affectedRows = state.executeUpdate();
            if(affectedRows == 0) throw new SQLException("No se pudo insertar el socio");
            return affectedRows == 1;
        }catch (SQLException e){
            throw e;
        }
    }

    @Override
    public boolean update(Socio socio) throws SQLException {
        int socioID = socio.getId();
        String nombre = socio.getNombre();
        int altura = socio.getAltura();
        int edad = socio.getEdad();
        String localidad = socio.getLocalidad();

        String sqlQuery = "UPDATE socio SET nombre = ?, estatura = ?, edad = ?, localidad = ? WHERE socioID = ?";
        try(PreparedStatement state = this.con.prepareStatement(sqlQuery)){
            state.setString(1, nombre);
            state.setInt(2, altura);
            state.setInt(3, edad);
            state.setString(4, localidad);
            state.setInt(5, socioID);
            int affectedRows = state.executeUpdate();
            if(affectedRows == 0) throw new SQLException("No se pudo actualizar el socio");
            return affectedRows == 1;
        }catch (SQLException e){
            throw e;
        }
    }

    @Override
    public boolean delete(Socio socio) throws SQLException {
        int socioID = socio.getId();
        String sqlQuery = "DELETE FROM socio WHERE socioID = ?";
        try(PreparedStatement state = this.con.prepareStatement(sqlQuery)){
            state.setInt(1, socioID);
            int affectedRows = state.executeUpdate();
            if(affectedRows == 0) throw new SQLException("No se pudo eliminar el socio");
            return affectedRows == 1;
        }catch (SQLException e){
            throw e;
        }
    }
}
