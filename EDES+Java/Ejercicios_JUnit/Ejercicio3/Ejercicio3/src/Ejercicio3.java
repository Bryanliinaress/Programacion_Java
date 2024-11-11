public class Ejercicio3 {
    public int contarCaracteres (String texto, char caracter) {
        int contCaracteres=0;
        for(int i=0; i<texto.length(); i++){
            if (texto.charAt(i)== caracter) {
                contCaracteres++;
            }
        }
        return contCaracteres;
    }
}
