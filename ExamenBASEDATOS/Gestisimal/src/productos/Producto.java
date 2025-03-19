package productos;

public class Producto {

    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    private long codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    public Producto(long codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public Producto() {

    }

    @Override
    public String toString() {
        return "Producto [codigo= " + codigo + ", descripcion= " + descripcion + ", precio de compra= " + precioCompra
                + ", precio de venta= " + precioVenta + ", stock= " + stock + "]\n\n";
    }

    public static String getRedBright() {
        return RED_BRIGHT;
    }

    public static String getGreenBright() {
        return GREEN_BRIGHT;
    }

    public static String getYellowBright() {
        return YELLOW_BRIGHT;
    }

    public static String getReset() {
        return RESET;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}