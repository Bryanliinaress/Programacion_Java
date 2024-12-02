public class Inventario {
    private RepositorioInventario codInventario;

    public Inventario(RepositorioInventario elcodInventario){
        codInventario=elcodInventario;
    }

    public boolean estadoArticulo (int codigoProducto){
        return codInventario.eliminaProducto(codigoProducto);
    }
}
