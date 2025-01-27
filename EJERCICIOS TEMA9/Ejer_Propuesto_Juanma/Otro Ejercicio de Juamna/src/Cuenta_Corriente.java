public class Cuenta_Corriente extends CuentaBancaria implements Operaciones {

    public Cuenta_Corriente(double cantidad, double tipoInteres, String numeroCuenta){
        super(cantidad,tipoInteres,numeroCuenta);
    }

    @Override
    public void realizarOperacion(int accionARealizar, double cantidad){
        if (accionARealizar==1) {
            super.Depositar(cantidad);
        }if (accionARealizar==2) {
            super.Retirar(cantidad);
        }
    }
    
    @Override
    public void mostrarResultado(){
        System.out.println("");
        System.out.println("Cuenta Corriente");
        System.out.println("================");
        System.out.println(obtenerSaldo());
        System.out.println("");
        System.out.println("");
    }
}
