import java.util.Scanner;

public class GestorCuentasBancarias {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        CuentaBancaria[] misCuentas = new CuentaBancaria[10];
        String numeroCuenta;
        int contadorCuentas = -1;
        int tipoCuenta;
        String comprobadorCuentas;
        boolean cuentaEncontrada = false;
        double cantidadDinero;
        int indicadorCuentas = -1;
        int opcion = 0;
        do {
            System.out.println("");
            System.out.println("Gestor de cuentas Bancarias. ");
            System.out.println("===========================");
            System.out.println("1. Crear Cuenta Bancaria ");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Ver datos de la cuenta.");
            System.out.println("5. Salir del gestor de cuentas");
            System.out.print("Dime que desea hacer: ");
            opcion = s.nextInt();
            s.nextLine();
            System.out.println("");
            System.out.println("");

            switch (opcion) {
                case 1:
                    contadorCuentas++;
                    System.out.println("Elección de tipo de cuenta");
                    System.out.println("1. Cuenta Corriente");
                    System.out.println("2. Cuenta de Ahorros");
                    System.out.print("Dime que tipo desea crear: ");
                    tipoCuenta = s.nextInt();
                    s.nextLine();
                    switch (tipoCuenta) {
                        case 1:
                            indicadorCuentas++;
                            System.out.println("");
                            System.out.print("Dime el numero de cuenta bancaria que desea: ");
                            numeroCuenta = s.nextLine();
                            System.out.println("");
                            System.out.print("Dime el saldo inicial de su cuenta: ");
                            cantidadDinero = s.nextDouble();
                            System.out.println("");
                            System.out.print("El tipo de interes para este tipo de cuentas es del 0.5%");
                            System.out.println("");
                            misCuentas[indicadorCuentas] = new Cuenta_Corriente(cantidadDinero, 0.5, numeroCuenta);
                            break;
                        case 2:
                            indicadorCuentas++;
                            System.out.println("");
                            System.out.print("Dime el numero de cuenta bancaria que desea: ");
                            numeroCuenta = s.nextLine();
                            System.out.println("");
                            System.out.print("Dime el saldo inicial de su cuenta: ");
                            cantidadDinero = s.nextDouble();
                            System.out.println("");
                            System.out.print("El tipo de interes para este tipo de cuentas es del 0.5%");
                            System.out.println("");
                            misCuentas[indicadorCuentas] = new Cuenta_Ahorros(cantidadDinero, 0.5, numeroCuenta);
                            break;

                        default:
                            System.out.println("Error, la elccion elegida no corresponde con ninguna opcion. ");
                            break;
                    }
                    break;

                case 2:
                    System.out.print("Dime de que cuenta quiere hacer un ingreso de dinero: ");
                    numeroCuenta = s.nextLine();
                    cuentaEncontrada = false;
                    int i = -1;
                    while (!cuentaEncontrada) {
                        i++;
                        comprobadorCuentas = misCuentas[i].devolverNumeroCuenta();
                        if (comprobadorCuentas.equals(numeroCuenta)) {
                            cuentaEncontrada = true;
                            System.out.println("Cuenta localizada.");
                            System.out.println("");
                            System.out.print("Digame de cuenta va a ser el ingreso: ");
                            cantidadDinero = s.nextDouble();
                            ((Operaciones) misCuentas[i]).realizarOperacion(1, cantidadDinero);
                        } else if (i == contadorCuentas) {
                            cuentaEncontrada = true;
                            System.out.println(
                                    "No e encontrado ninguna Cuenta Bancaria con ese numero de cuenta, lo siento.");
                        }
                    }

                    break;

                case 3:
                    System.out.print("Dime de que cuenta quiere hacer una retirada de dinero: ");
                    numeroCuenta = s.nextLine();
                    cuentaEncontrada = false;
                    int a = -1;
                    while (!cuentaEncontrada) {
                        a++;
                        comprobadorCuentas = misCuentas[a].devolverNumeroCuenta();
                        if (comprobadorCuentas.equals(numeroCuenta)) {
                            cuentaEncontrada = true;
                            System.out.println("Cuenta localizada.");
                            System.out.println("");
                            System.out.print("Digame de cuenta va a ser el retiro: ");
                            cantidadDinero = s.nextDouble();
                            ((Operaciones) misCuentas[a]).realizarOperacion(2, cantidadDinero);
                        } else if (a == contadorCuentas) {
                            cuentaEncontrada = true;
                            System.out.println(
                                    "No e encontrado ninguna Cuenta Bancaria con ese numero de cuenta, lo siento.");
                        }
                    }

                    break;

                case 4:
                    System.out.print("Dime de que cuenta quiere ver su información: ");
                    numeroCuenta = s.nextLine();
                    cuentaEncontrada = false;
                    int c = -1;
                    while (!cuentaEncontrada) {
                        c++;
                        comprobadorCuentas = misCuentas[c].devolverNumeroCuenta();
                        if (comprobadorCuentas.equals(numeroCuenta)) {
                            cuentaEncontrada = true;
                            ((Operaciones) misCuentas[c]).mostrarResultado();
                        } else if (c == contadorCuentas) {
                            cuentaEncontrada = true;
                            System.out.println(
                                    "No e encontrado ninguna Cuenta Bancaria con ese numero de cuenta, lo siento.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Gracias por usar este Gestor de Cuentas, hasta la proxima");
                    break;

                default:
                    System.out.println("Error la opción elegida es errónea. ");
                    break;
            }

        } while (opcion != 5);
        s.close();
    }
}
