public class primo {
    public static boolean EsPrimo(int numero){
        for (int i =2; i < numero; i++) {
            if ((numero %i)==0) {
                return false;                
            }
        }
        return true;
    }
}
