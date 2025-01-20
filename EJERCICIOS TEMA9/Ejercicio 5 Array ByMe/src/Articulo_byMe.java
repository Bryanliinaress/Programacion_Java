public class Articulo_byMe {
    private String codigo= "LIBRE";
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stockProducto;
    
    public Articulo_byMe (){

    }
    
    public Articulo_byMe (String codigo, String descripcion, double precioCompra, double precioVenta, int stockProducto){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precioCompra=precioCompra;
        this.precioVenta=precioVenta;
        this.stockProducto=stockProducto;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }
    

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    public double getPrecioCompra() {
        return precioCompra;
    }


    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }


    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }
    public int getStockProducto() {
        return stockProducto;
    }

    public String  toString(int numeroProducto){
        String listado="\nInformacion de producto "+ numeroProducto; 
        listado +=     "\n=======================";
        listado += "\nCodigo del producto: "+codigo;
        listado += "\nDescripción del producto: "+descripcion;
        listado += "\nPrecio de compra del producto: "+ precioCompra;
        listado += "\nPrecio de venta del producto: "+ precioVenta;
        listado += "\nStock del producto: "+stockProducto;
        return listado;
    }

    public void darDeBaja (){
        setCodigo("LIBRE");
        setDescripcion(null);
        setPrecioCompra(0);
        setPrecioVenta(0);
        setStockProducto(0);
    }

}
