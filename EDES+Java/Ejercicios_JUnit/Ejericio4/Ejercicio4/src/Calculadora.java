public class Calculadora {
    public int sumarNumeros (int a, int b){
        int resultadoSuma = a+b;
        return resultadoSuma;
    }
    public int restarNumeros (int a, int b){
        int resultadoResta = a-b;
        return resultadoResta;
    }
    public int multiplicarNumeros (int a, int b){
        int resultadoMulti = a*b;
        return resultadoMulti;
    }
    public int dividirNumeros (int a, int b) throws ArithmeticException{
        int resultadoDivision= a/b;
        if (b == 0) {
            throw new ArithmeticException ("No se puede dividir por cero");
        }else
        return resultadoDivision;
    }
}

