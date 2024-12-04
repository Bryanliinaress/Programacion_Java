package org.alangturing.texto;


public class CadenasTexto {
    /*
     * @author Bryanliinaress
     * 
     * @param frase la cual contendra unas vocales .
     * 
     * @return el numero de vocales que tiene.
     */
    public static int contadorVocales(String frase) {
        String vocales = "aeiou";
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (vocales.indexOf(Character.toLowerCase(frase.charAt(i))) != -1) {
                contador += 1;
            }
        }
        return contador;
    }


    /**
     * 
     * @param frase se le va a quitar los espacios
     * @return la frase sin espacios
     */
    public static String sinEspacios (String frase){
        String nuevaFrase="";
        String espacioEnBlanco=" ";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != espacioEnBlanco.charAt(0)) {
                nuevaFrase += frase.charAt(i);
            }
        }
        return nuevaFrase;
    }
    /**
     * 
     * @param frase la cual se le va a dar la vuelta
     * 
     * @return devuelve la frase dada la vuelta
     */
    public static String invertirPalabra(String frase) {
        String nuevaFrase= CadenasTexto.sinEspacios(frase);
        int longitudFrase = nuevaFrase.length()-1;
        String nuevaFraseInversa="";
        for (int i = longitudFrase; i>= 0; i--){
            nuevaFraseInversa+= nuevaFrase.charAt(i);
        }
        return nuevaFraseInversa;
    }
    /**
     * 
     * @param frase1 la vamos a usar para comparar con frase2
     * @param frase2 la comparamos con frase1 
     * @return esperamos que frase1 y frase2 sean iguales estando una invertida respecto a la otra
     */
    public static boolean esPalindromas (String frase1, String frase2){
        String fraseInvertida = CadenasTexto.invertirPalabra(frase2);
        String fraseNormal= CadenasTexto.sinEspacios(frase1);
        if (fraseNormal.equals(fraseInvertida)) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String pruebaFrase = "Amor a Roma";
        String fraseInvertida= CadenasTexto.invertirPalabra(pruebaFrase);
        String pruebaFraseMinuscula= "";
        String fraseInvertidaMinuscula="";
        if (CadenasTexto.contadorVocales(pruebaFrase)== CadenasTexto.contadorVocales(fraseInvertida)) {
            System.out.println("Contiene las mismas vocales.");
            for (int i = 0; i<pruebaFrase.length() ; i++){
                pruebaFraseMinuscula += Character.toLowerCase(pruebaFrase.charAt(i));
            }
            for (int i = 0; i<fraseInvertida.length(); i++){
                fraseInvertidaMinuscula += Character.toLowerCase(fraseInvertida.charAt(i));
            }
            if (esPalindromas(pruebaFraseMinuscula, fraseInvertidaMinuscula)) {
                System.out.println("Y si es Palindroma");
            
            }else
            System.out.println("Pero no es palindroma");
        }else 
            System.out.println("no contiene los mismos caracteres por lo tanto no pueden ser palindromas");
        
    }
}
