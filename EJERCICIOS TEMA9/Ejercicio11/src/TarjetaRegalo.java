public class TarjetaRegalo {

    private int numeroTarjeta = 0;
    private double cantidadDinero = 0;

    public TarjetaRegalo(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
        for (int i = 1; i <= 5; i++) {
            int num = (int) (Math.random() * 10);
            numeroTarjeta = (numeroTarjeta * 10) + num;
        }
    }

    public String toString() {
        return "Tarjeta nº " + numeroTarjeta + " - Saldo " + cantidadDinero;
    }
    
    public void gasta(double numeroAGastar) {
        if ((cantidadDinero - numeroAGastar) < 0) {
            System.out.println("No tienes suficiente saldo para gastar " + numeroAGastar + "eur. ");
        } else
            cantidadDinero = cantidadDinero - numeroAGastar;
    }

    TarjetaRegalo fusionaCon(TarjetaRegalo t) {
        double nuevaCantidad = cantidadDinero + t.cantidadDinero;
        setCantidadDinero(0);
        t.setCantidadDinero(0);
        return new TarjetaRegalo(nuevaCantidad);
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }
}