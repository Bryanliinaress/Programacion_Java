

public class Ejercicio2_Tema6 {
    public static void main(String[] args) throws Exception {
        String palo="";
        String carta= "";
        int numeroPalo= (int)(Math.random()*4)+1;
        switch (numeroPalo) {
            case 1:
                    palo= "Corazones";
                break;
            case 2: 
                palo= "Picas";
            break;
            case 3:
                palo="Diamantes";
            break;
            case 4:
                palo = "Tréboles";
            break;
            default:
        }
            int numeroCarta= (int)(Math.random()*13)+1;
            switch (numeroCarta) {
                case 1:
                    carta="As";
                    break;
                case 11:
                    carta ="J";
                    break;
                case 12:
                    carta= "Q";
                break;
                case 13:
                    carta = "K";
                    break;
                default:
                    carta= String.valueOf(numeroCarta);
                    break;
            }
            System.out.println(carta+" de " +palo);
    
    }
}
