public class ServicioNotificacion {
    
    private ProveedorNotificaciones proveedor;

    public ServicioNotificacion(ProveedorNotificaciones miproveedor) {
        proveedor = miproveedor;
    }

    public boolean notificar(String mensaje) {
        proveedor.enviarNotificacion(mensaje);
        return true;
    }
}