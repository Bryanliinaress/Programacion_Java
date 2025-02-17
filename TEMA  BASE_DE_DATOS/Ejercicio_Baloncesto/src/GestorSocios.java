import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import crud.CRUD;

public class GestorSocios implements CRUD<Socio> {

    private Connection conn;

    public GestorSocios(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean create(Socio socio) throws SQLException {
        int socioID = socio.getId();
        String nombre = socio.getNombre();
        int estatura = socio.getEstatura();
        int edad = socio.getEdad();
        String localidad = socio.getLocalidad();

        String sqlQuery = "INSERT INTO socio (socioID, nombre, estatura, edad, localidad) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, socioID);
            stmt.setString(2, nombre);
            stmt.setInt(3, estatura);
            stmt.setInt(4, edad);
            stmt.setString(5, localidad);

            // Ejecución de la consulta
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0)
                throw new SQLException("Falló la creación del nuevo socio.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean delete(int id) throws SQLException {
        String sqlQquerry = "DELETE FROM socio WHERE socioID = ?" + id;
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQquerry)) {
            stmt.setInt(1, id);
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("No se pudo eliminar el socio");
            }
            return affectedRows==1;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public ArrayList<Socio> query(String column, String value) throws SQLException {
        List<String> validColumns = Arrays.asList("nombre", "localidad");
        if (!validColumns.contains(column))
        
            throw new SQLException("Columna no válida");

        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + column + " = ?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setString(1, value);

            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery();
            // Recorrido del resultado de la consulta
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public Socio requestById(int id) throws SQLException {
        String sqlQquerry = "SELECT * FROM socio  WHERE socioID = " + id;
        Socio resultado = new Socio(id, sqlQquerry, id, id, sqlQquerry);
        try (Statement stmt = this.conn.prepareStatement(sqlQquerry)) {
            ResultSet queryResultSet = stmt.executeQuery(sqlQquerry);
            if (queryResultSet.getInt("socioID") == id) {
                int socioID = queryResultSet.getInt("socioID");
                String nombre = queryResultSet.getString("nombre");
                int estatura = queryResultSet.getInt("estatura");
                int edad = queryResultSet.getInt("edad");
                String localidad = queryResultSet.getString("localidad");
                Socio socioAMostrar = new Socio(socioID, nombre, estatura, edad, localidad);
                resultado = socioAMostrar;
            }
            return resultado;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean update(Socio socio) throws SQLException {
        int socioID = socio.getId();
        int estatura = socio.getEstatura();
        int edad = socio.getEdad();
        String nombre = socio.getNombre();
        String localidad = socio.getLocalidad();

        String querryAEjecutar = "UPDATE socio SET nombre =" + nombre + ", estatura=" + estatura + ", edad=" + edad
                + ", localidad=" + localidad + " WHERE socioID= " + socioID;
        try (Statement stmt = this.conn.prepareStatement(querryAEjecutar)) {
            int affectedRows = stmt.executeUpdate(querryAEjecutar);
            if (affectedRows == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public ArrayList<Socio> requestAll(String sortedBy) throws SQLException {
        ArrayList<Socio> resultado = new ArrayList<Socio>();
        String sqlQuerry = "SELECT * FROM socio";
        if (!sortedBy.isEmpty())
            sqlQuerry += "ORDER BY " + sortedBy;

        try (Statement stmt = this.conn.createStatement()) {
            ResultSet querrySet = stmt.executeQuery(sqlQuerry);

            while (querrySet.next()) {
                int socioID = querrySet.getInt("socioID");
                String nombre = querrySet.getString("nombre");
                int estatura = querrySet.getInt("estatura");
                int edad = querrySet.getInt("edad");
                String localidad = querrySet.getString("localidad");
                resultado.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }
            return resultado;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public ArrayList<Socio> query(String column, int value) throws SQLException {
        List<String> validColumns = Arrays.asList("socioID", "estatura", "edad");
        if (!validColumns.contains(column))
            throw new SQLException("Columna no válida");

        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + column + " = ?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, value);

            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery();
            // Recorrido del resultado de la consulta
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

}
