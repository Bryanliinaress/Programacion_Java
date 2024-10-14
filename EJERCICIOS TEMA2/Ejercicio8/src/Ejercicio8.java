public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        char letra_c= 'c';
        char letra_l= 'l';
        char letra_a= 'a';
        char letra_s= 's';
        char letra_e= 'e';
        String palabraClase=( Character.toString(letra_c)+letra_l+letra_a+letra_s+letra_e) ;
        System.out.println(palabraClase);
        //De primeras no te deja pero añadiendo el comando character.tostring que convierte a los char a manera que se pueda leer en string
    }
}
