public class CuentaBancaria {
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo=0;

    public CuentaBancaria(double cantidad, double tipoInteres, String numeroCuenta){
        this.tipoInteres=tipoInteres;
        this.saldo=cantidad;
        this.numeroCuenta=numeroCuenta;
    }

    public void Depositar(double cantidad){
        this.saldo=saldo+cantidad;
    }

    public void Retirar(double cantidadARetirar){
        this.saldo= saldo-cantidadARetirar;
    }

    public String devolverNumeroCuenta(){
        return numeroCuenta;
    }

    public String obtenerSaldo(){
        return "En tu cuenta "+numeroCuenta+" tu  saldo actual es de "+saldo+" y tiene un interes del "+tipoInteres+"%.";
    }
}
