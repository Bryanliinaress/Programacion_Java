package matematicas;

public class Ejercicio1_14 {
    public static int voltearNumeros(int numero) {
        int numeroReverso = 0;
        while (numero != 0) {
            int digito = numero % 10;
            numeroReverso = (numeroReverso * 10) + digito;
            numero = numero / 10;
        }
        return numeroReverso;        
    }

    public static boolean esCapicua(int numero) {
        int numeroVolteado = voltearNumeros(numero);
        if (numero == numeroVolteado) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean EsPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if ((numero % i) == 0) {
                return false;      
            }
        }
        return true;
    }

    public static int siguientePrimo(int numero) {
        int siguienteNumeroPrimo = 0;
        for (int i = 1; i < 1000; i++) {
            if (EsPrimo(numero)) {
                i = 2000;
                siguienteNumeroPrimo = numero;
                return siguienteNumeroPrimo;
            } else
                numero++;
        }
        return siguienteNumeroPrimo;
    }

    public static double potencia(int base, int potencia) {
        double numeroFinal = Math.pow(base, potencia);
        return numeroFinal;
    }

    public static int digitos(int numero) {
        int contadorNumeros = 0;
        while (numero != 0) {
            contadorNumeros += 1;
            numero = numero / 10;
        }
        return contadorNumeros;
    }

    public static int digitoN(int numero, int posicion) {
        int numeroPosicion = 0;
        int numvolteado = voltearNumeros(numero);
        for (int i = 0; i < posicion; i++) {
            numeroPosicion = numvolteado % 10;
            numvolteado = numvolteado / 10;
        }
        return numeroPosicion;
    }

    public static int posicionDeDigito(int numero, int digito) {
        String numeroString = String.valueOf(numero);
        String digitoString = String.valueOf(digito);
        int posicion = numeroString.indexOf(digitoString);
        return posicion;
    }

    public static int quitaPorDetras(int numero, int cantidadEliminar){
        for(int i =1; i<=cantidadEliminar;i++){
            numero=numero/10;
        }
        return numero;
    }

    public static int quitaPorDelante (int numero, int cantidadEliminar){
        numero=voltearNumeros(numero);
        for(int i =1; i<=cantidadEliminar;i++){
            numero=numero/10;
        }
        numero=voltearNumeros(numero);
        return numero;
    }

    public static int pegaPorDetras (int numero, int numeroAPegar){
        numero=(numero*10)+numeroAPegar;
        return numero;
    }

    public static int pegaPorDelante (int numero, int numeroAPegar){
        numero=voltearNumeros(numero);
        numero=(numero*10)+numeroAPegar;
        numero=voltearNumeros(numero);
        return numero;
    }
}
