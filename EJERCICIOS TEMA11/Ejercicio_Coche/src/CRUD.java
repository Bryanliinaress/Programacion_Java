import java.util.ArrayList;
public interface CRUD<T> {

    public ArrayList<T> recuperarTodos();

    public T recuperarUno(String id);



}
