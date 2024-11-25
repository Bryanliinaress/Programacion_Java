public class Ejercicio1_Tema6 {
    public static void main(String[] args) throws Exception {
        int resultadoSuma=0;
        System.out.println("Voy a lanzar tres dados y voy a sumar sus resultados: ");
        for (int i = 1; i<4;i++){
            int tirada= (int)(Math.random() * 6)+1;
            resultadoSuma= resultadoSuma+tirada;
            System.out.println(tirada);
        }
        System.out.println("La suma de todos los resultados es igual a "+resultadoSuma);
    }
}
