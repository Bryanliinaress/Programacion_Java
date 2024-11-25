public class CalculadoraAvanzada {
    public double Potencia(double base, int exponente) {
        return (double) Math.pow( base, exponente );
    }
    public double raizCuadrada (double radicando){
        if(radicando < 0){
            throw new IllegalArgumentException("El radicando no puede ser menor de cero");
        }else
        return Math.sqrt(radicando);
    }
}    

    
