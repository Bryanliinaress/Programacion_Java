package crud;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CRUD <T>{
    ArrayList<T> query(String col, String val) throws SQLException;
    ArrayList<T> query(String col, int val) throws SQLException;
    ArrayList<T> requestAll(String sortedBy);
    T requestById(int id);
    boolean create(T model)throws SQLException;
    boolean update(T model)throws SQLException;
    boolean delete(T model)throws SQLException;
}