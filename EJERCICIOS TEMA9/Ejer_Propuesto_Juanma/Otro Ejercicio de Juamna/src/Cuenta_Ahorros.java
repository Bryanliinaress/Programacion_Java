public class Cuenta_Ahorros extends CuentaBancaria implements Operaciones {
    
    public Cuenta_Ahorros(double saldo, double tipoInteres, String numeroCuenta){
        super(saldo, tipoInteres, numeroCuenta);
    }

    @Override
    public void realizarOperacion(int accionARealizar, double cantidad){
        if (accionARealizar==1) {
            Depositar(cantidad);
        }if (accionARealizar==2) {
            Retirar(cantidad);
        }
    }

    @Override
    public void mostrarResultado(){
        System.out.println("");
        System.out.println("Cuenta Ahorros");
        System.out.println("==============");
        System.out.println(obtenerSaldo());
        System.out.println("");
        System.out.println("");
    }
}
