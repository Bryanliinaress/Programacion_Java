public class Ejercicio5_ArrayBi {
    public static void main(String[] args) throws Exception {
        int[][] array = new int[6][10];
        int maximo = 0;
        int minimo = 500;
        for (int i = 0; i < 6; i++) {
            for (int a = 0; a < 10; a++) {
                array[i][a] = (int) (Math.random() * 1001);

                if (array[i][a] < minimo) {
                    minimo = array[i][a];
                }

                if (array[i][a] > maximo) {
                    maximo = array[i][a];
                }
            }

        }
        for (int i = 0; i < 6; i++) {
            for (int a = 0; a < 10; a++) {
                if (array[i][a] != minimo && array[i][a] != maximo) {
                    System.out.print(array[i][a]+"  ");
                }else{
                    System.out.print("**"+array[i][a]+"**  " );
                }

            }
        }
    }
}
