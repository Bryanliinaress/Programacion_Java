package productos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

import crud.CRUD;

public class GestorInventario implements CRUD<Producto> {
    Connection conn;

    public GestorInventario(Connection conn) {
        this.conn = conn;
    }

    @Override
    public ArrayList<Producto> requestAll(String sortedBy) throws SQLException {
        ArrayList<Producto> result = new ArrayList<>();
        String sqlQuery = "SELECT * FROM productos ORDER BY ";
        try (Statement stmt = this.conn.createStatement()) {
            sqlQuery += sortedBy;
            ResultSet querySet = stmt.executeQuery(sqlQuery);

            while (querySet.next()) {
                long codigo = querySet.getLong("codigo");
                String descripcion = querySet.getString("descripcion");
                double precioCompra = querySet.getDouble("preciocompra");
                double precioVenta = querySet.getDouble("precioventa");
                int stock = querySet.getInt("stock");
                result.add(new Producto(codigo, descripcion, precioCompra, precioVenta, stock));
            }

            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public Producto requestById(long códigoProducto) throws SQLException {
        String sqlQuery = "SELECT * FROM productos WHERE codigo = " + códigoProducto;
        Producto productoAMostrar = new Producto();

        try (Statement stmt = this.conn.createStatement()) {

            ResultSet querySet = stmt.executeQuery(sqlQuery);

            while (querySet.next()) {
                long codigo = querySet.getLong("codigo");
                String descripcion = querySet.getString("descripcion");
                double precioCompra = querySet.getDouble("preciocompra");
                double precioVenta = querySet.getDouble("precioventa");
                int stock = querySet.getInt("stock");
                productoAMostrar.setCodigo(codigo);
                productoAMostrar.setDescripcion(descripcion);
                productoAMostrar.setPrecioCompra(precioCompra);
                productoAMostrar.setPrecioVenta(precioVenta);
                productoAMostrar.setStock(stock);
            }

            return productoAMostrar;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean create(Producto producto) throws SQLException {
        String sqlQuery = "INSERT INTO productos (codigo, descripcion, preciocompra, precioventa, stock)" +
                "VALUES ( ? , ? , ? , ? , ? )";
        long codigo = producto.getCodigo();
        String descripcion = producto.getDescripcion();
        double precioCompra = producto.getPrecioCompra();
        double precioVenta = producto.getPrecioVenta();
        int stock = producto.getStock();

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setLong(1, codigo);
            stmt.setString(2, descripcion);
            stmt.setDouble(3, precioCompra);
            stmt.setDouble(4, precioVenta);
            stmt.setInt(5, stock);

            int affectedRows = stmt.executeUpdate();

            if (affectedRows == 0)
                throw new SQLException("Falló la creación del nuevo producto.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean update(Producto producto) throws SQLException {
        String sqlQuery = "UPDATE productos SET descripcion = ? , preciocompra = ? ,precioventa= ? ,stock = ? WHERE codigo = ?";
        long codigo = producto.getCodigo();
        String descripcion = producto.getDescripcion();
        double precioCompra = producto.getPrecioCompra();
        double precioVenta = producto.getPrecioVenta();
        int stock = producto.getStock();

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setString(1, descripcion);
            stmt.setDouble(2, precioCompra);
            stmt.setDouble(3, precioVenta);
            stmt.setInt(4, stock);
            stmt.setLong(5, codigo);

            int affectedRows = stmt.executeUpdate();

            if (affectedRows == 0)
                throw new SQLException("Falló la actualización de los datos del producto.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean delete(long códigoProcucto) throws SQLException {
        String sqlQuery = "DELETE FROM productos WHERE codigo = ?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setLong(1, códigoProcucto);

            int affectedRows = stmt.executeUpdate();

            if (affectedRows == 0)
                throw new SQLException("Falló el borrado de los datos del producto.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }

}