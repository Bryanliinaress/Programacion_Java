import java.util.Scanner;

public class Ejercicio_Examen4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int intentosContraseña = 3;
        String contraseñaUsuario;
        int contraseñaValida = 1;
        while (contraseñaValida <= intentosContraseña) {
            System.out.print("Por favor, introduzca una contraseña segura: ");
            contraseñaUsuario = s.nextLine();
            if (caracteresMinimos(contraseñaUsuario)) {
                if (Mayuscula(contraseñaUsuario)) {
                    if (Minuscula(contraseñaUsuario)) {
                        if (contieneNumero(contraseñaUsuario)) {
                            if (caracterEspecial(contraseñaUsuario)) {
                                System.out.println("\033[0;92mContraseña segura.\033[0m");
                                contraseñaValida = 5;
                            } else {
                                System.out.println(
                                        "\033[0;91mError: La contraseña debe contener al menos un caracter especial.\033[0m");
                            }
                        } else {
                            System.out
                                    .println("\033[0;91mError: La contraseña debe contener al menos un dígito.\033[0m");
                        }
                    } else {
                        System.out.println(
                                "\033[0;91mError: La contraseña debe contener al menos un carácter minuscula.\033[0m");
                    }
                } else {
                    System.out.println(
                            "\033[0;91mError: La contraseña debe contener al menos un carácter en mayuscula.\033[0m");
                }
            } else {
                System.out.println("\033[0;91mError: La contraseña debe contener al menos 8 caracteres\033[0m");
            }
            contraseñaValida++;
        }
        if (contraseñaValida > 3) {
            System.out.println("\033[0;93mNúmero máximo de intentos alcanzado.\033[0m");
        }
        s.close();
    }

    public static boolean caracteresMinimos(String contraseñaMin) {
        char letrasMini = 1;
        for (int i = 0; i < contraseñaMin.length(); i++) {
            letrasMini++;
        }
        if (letrasMini >= 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Mayuscula(String contraseñaMayuscula) {
        char letraMayuscula = 0;
        char letra;
        for (int i = 0; i < contraseñaMayuscula.length(); i++) {
            letra = contraseñaMayuscula.charAt(i);
            if (Character.isUpperCase(letra)) {
                letraMayuscula = letra;
            }
        }
        if (letraMayuscula != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Minuscula(String contraseñaMinuscula) {
        char letraMinuscula = 0;
        char letra;
        for (int i = 0; i < contraseñaMinuscula.length(); i++) {
            letra = contraseñaMinuscula.charAt(i);
            if (Character.isLowerCase(letra)) {
                letraMinuscula = letra;
            }
        }
        if (letraMinuscula != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean contieneNumero(String contraseñaNumero) {
        char letraMinuscula = 0;
        char letra;
        for (int i = 0; i < contraseñaNumero.length(); i++) {
            letra = contraseñaNumero.charAt(i);
            if (letra == 0 || letra ==1 || letra ==2 || letra ==3 || letra == 4 || letra == 5 || letra==6 || letra==7 || letra ==8 || letra ==9) {
                letraMinuscula=1;
            }
        }
        if (letraMinuscula != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean caracterEspecial(String contraseñaCaracterEspecial) {
        String caracteresEspeciales = "!@#$%^&*()-_+=<>?/.,;:";
        int letra = 0;
        for (int i = 0; i < caracteresEspeciales.length(); i++) {
            if (caracteresEspeciales.indexOf(contraseñaCaracterEspecial.charAt(i)) != -1) {
                letra = 1;
            }
        }
        if (letra != 0) {
            return true;
        } else {
            return false;
        }
    }
}
