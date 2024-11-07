import java.util.Scanner;//Declaro esto para que java pueda interpretar la clase scanner

public class Ejercicio1_Final {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in); // Primero declaro la clase Scanner para poder leer los datos que
                                            // introduzca el
                                            // usuario
        System.out.println("\033[42m ¡Bienvenido/a a la plataforma digital!\033[49;39m");
        System.out.println("");
        System.out.print("Por favor, dinos tu nombre: ");
        String nombreUsuario = s.nextLine();
        System.out.print("Por favor, dinos tu edad: ");
        int edadUsuario = s.nextInt();
        System.out.println("");
        int descuento; // Declaro la variable descuento como entero que usaremos mas adelante
        double precioSuscripcion = 0; /*
                                       * Declaro la variable precioSuscripcion como double
                                       * (para que al hacer la cuenta de precioFinal salgan
                                       * bien los decimales) que usaremos mas adelante
                                       */
        double precioFinal = 0;// Declaro la variable precioFinal como double que usaremos mas adelante
        String fraseFinal = ""; // Declaro la variable fraseFinal como string que usaremos mas adelante
        if (edadUsuario >= 18 && edadUsuario <= 25) { /*
                                                       * Aqui a partir de la edad calculamos el descuento que
                                                       * se le hace
                                                       */
            descuento = 20;
        } else if (edadUsuario > 25 && edadUsuario <= 40) {
            descuento = 10;
        } else {
            descuento = 0;
        }
        if (edadUsuario >= 18) { // Con este if hacemos que si el usuario es mayor de edad pueda seguir con
                                 // su registro y si no es mayor de edad le salga un mensaje de que necesita
                                 // tener al menos 18 años
            System.out.println("¡Gracias por registrate, " + nombreUsuario + "!"); /*
                                                                                    * Aqui le hacemos un "formulario"
                                                                                    * para
                                                                                    * saber el tipo de suscripcion que
                                                                                    * quiere
                                                                                    */
            System.out.println("Selecciona el tipo de suscripción que deseas: ");
            System.out.println("1. Basica - 10\u20ac");
            System.out.println("2. Estandar - 15\u20ac");
            System.out.println("3. Premium - 20\u20ac");
            int tipoSuscripcion = s.nextInt();
            System.out.println("");
            String fraseSuscripcion = "";
            switch (tipoSuscripcion) {/*
                                       * Creo un switch con diferentes casos para cada respuesta a su suscripcion
                                       * donde en cada caso guarda datos diferentes que seran mostrados al final
                                       */
                case 1:
                    precioSuscripcion = 10;
                    precioFinal = precioSuscripcion - (precioSuscripcion * descuento / 100);
                    fraseSuscripcion = "Basica";
                    if (edadUsuario >= 41) {
                        fraseFinal = "¡Gracias por unirte! Esperamos que disfrutes del contenido básico.";
                    } else {
                        fraseFinal = "Graciaspor registrarte en nuestra plataforma.";
                    }
                    break;
                case 2:
                    precioSuscripcion = 15;
                    precioFinal = precioSuscripcion - (precioSuscripcion * descuento / 100);
                    fraseSuscripcion = "Estandar";
                    if (edadUsuario >= 26 && edadUsuario <= 40) {
                        fraseFinal = "Buena elección para disfrutar de contenido de calidad a un buen precio.";
                    } else {
                        fraseFinal = "Graciaspor registrarte en nuestra plataforma.";
                    }
                    break;
                case 3:
                    precioSuscripcion = 20;
                    precioFinal = precioSuscripcion - (precioSuscripcion * descuento / 100);
                    fraseSuscripcion = "Premium";
                    if (edadUsuario < 26) {
                        fraseFinal = "¡Felicidades, estás aprovechando al máximo nuestra plataforma!";
                    } else {
                        fraseFinal = "Graciaspor registrarte en nuestra plataforma.";
                    }
                    break;

                default:
                    System.out.println("Lo siento, a ingresado una suscripción incorrecta.");
                    break;
            }
            if (tipoSuscripcion >= 1 && tipoSuscripcion <= 3) {/*
                                                                * este if sirve para que si el usuario no pone un numero
                                                                * que valido para el switch que no le salte el
                                                                * formulario despues del mensaje de "error"
                                                                */
                System.out.println("Resumen de tu registro ");
                System.out.println("Nombre: " + nombreUsuario);
                System.out.println("Tipo de suscripción: " + fraseSuscripcion);
                System.out.println("Precio original: " + precioSuscripcion + "\u20ac ");
                System.out.println("Descuento aplicado: " + descuento + "%");
                System.out.println("Precio final: \033[31m" + precioFinal + "\033[49;39m");
                System.out.println("");
                System.out.println("\033[43m" + fraseFinal + "\033[0m");
            }
        } else {
            System.out.println("Lo siento, debes de ser mayor de edad para poder registrate");// Esta es la frase en
                                                                                              // caso de que sea menor
        }
        s.close();
    }
}