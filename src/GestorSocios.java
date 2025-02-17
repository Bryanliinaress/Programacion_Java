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
        String sqlQquerry = "DELETE FROM socio WHERE socioID = ?";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQquerry)) {
            stmt.setInt(1, id);
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("No se pudo eliminar el socio");
            }
            return affectedRows == 1;
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
        String sqlQquerry = "SELECT * FROM socio  WHERE socioID = ?";
        Socio socioAMostrar = new Socio(id, sqlQquerry, id, id, sqlQquerry);
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQquerry)) {
            stmt.setInt(1, id);
            ResultSet querySet = stmt.executeQuery();
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                socioAMostrar = new Socio(socioID, nombre, estatura, edad, localidad);
            }
            return socioAMostrar;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean update(Socio socio) throws SQLException {
        int socioID = socio.getId();
        int estatura = socio.getEstatura();
        int edad = socio.getEdad();
        String nombre = socio.getNombre();
        String localidad = socio.getLocalidad();

        String querryAEjecutar = "UPDATE socio SET nombre =?, estatura=?, edad=?, localidad=? WHERE socioID=?";
        try (PreparedStatement stmt = this.conn.prepareStatement(querryAEjecutar)) {
            stmt.setString(1, nombre);
            stmt.setInt(2, estatura);
            stmt.setInt(3, edad);
            stmt.setString(4, localidad);
            stmt.setInt(5, socioID);

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0)
                throw new SQLException("Error al hacer el update.");

            return affectedRows == 1;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ArrayList<Socio> requestAll(String sortedBy) throws SQLException {
        ArrayList<Socio> resultado = new ArrayList<Socio>();
        String sqlQuerry = "SELECT * FROM socio ";
        if (!sortedBy.isEmpty())
            sqlQuerry += "ORDER BY " + sortedBy;

        try (Statement stmt = this.conn.createStatement()) {
            ResultSet querySet = stmt.executeQuery(sqlQuerry);

            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
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
