public class Ejercicio1_ArrayBi {
    public static void main(String[] args) throws Exception {
        int [][] num= new int[3][6];
        num[0][0]=0;
        num[0][1]=30;
        num[0][2]=2;
        num[0][5]=5;
        num[1][0]=75;
        num[1][4]=0;
        num[2][2]=-2;
        num[2][3]=9;
        num[2][5]=11;
        System.out.println("Array num   Columna0   Columna1   Columna2   Columna3   Columna4   Columna5");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Fila1       |"+num[0][0]+"        |"+num[0][1]+"        |"+num[0][2]+"        |          |          |"+num[0][5]+"        |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Fila2       |"+num[1][0]+"       |          |         |          |"+num[1][4]+"         |         |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Fila3       |         |          |"+num[2][2]+"       |"+num[2][3]+"         |          |"+num[2][5]+"       |");
        System.out.println("---------------------------------------------------------------------------");

    }
}
