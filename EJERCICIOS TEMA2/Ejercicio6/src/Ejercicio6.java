public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        double precioNoIva= 200.38 ;
        double PrecioConIva;
        double iva=0.21; 
        PrecioConIva=precioNoIva+(precioNoIva*iva);
        System.out.println("El precio de la luz es igual "+precioNoIva + " sin iva. Y con iva seria igual a "+PrecioConIva+"Teniendo en cuenta que el iva es del 21%" );
    }
}
