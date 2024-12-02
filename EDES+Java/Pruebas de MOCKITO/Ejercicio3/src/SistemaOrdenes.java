public class SistemaOrdenes {
    private ProveedorDescuentos descuentos;

    public SistemaOrdenes (ProveedorDescuentos elDescuento){
        descuentos=elDescuento;
    }

    public boolean preciofinal (int precio){
        return descuentos.calcularTotal(precio);
    }
}
