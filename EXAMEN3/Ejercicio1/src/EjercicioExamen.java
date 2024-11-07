import java.util.Scanner;

public class EjercicioExamen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("\033[42m ¡Bienvenido/a a la plataforma digital!\033[49;39m");
        System.out.println("");
        System.out.print("Por favor, dinos tu nombre: ");
        String nombreUsuario= s.nextLine();
        System.out.print("Por favor, dinos tu edad: ");
        int edadUsuario = s.nextInt();
        System.out.println("");
        int descuento;
        double precioSuscripcion;
        double precioFinal;
        if (edadUsuario>=18 && edadUsuario<=25) {
            descuento= 20;
        }else if (edadUsuario>25 && edadUsuario<=40) {
            descuento= 10;
        }else{
            descuento= 0;
        }
        if (edadUsuario>=18) {
            System.out.println("¡Gracias por registrate, "+nombreUsuario+"!");
            System.out.println("Selecciona el tipo de suscripción que deseas: ");
            System.out.println("1. Basica - 10\u20ac");
            System.out.println("2. Estandar - 15\u20ac");
            System.out.println("3. Premium - 20\u20ac");
            int tipoSuscripcion = s.nextInt();
            switch (tipoSuscripcion) {
                case 1:
                    precioSuscripcion=10;
                    precioFinal=  precioSuscripcion-(precioSuscripcion*descuento/100);
                    System.out.println(descuento);
                    System.out.println("Resumen de tu registro ");
                    System.out.println("Nombre: "+nombreUsuario);
                    System.out.println("Tipo de suscripción: Basica");
                    System.out.println("Precio original: 10\u20ac ");
                    System.out.println("Descuento aplicado: "+descuento+"%");
                    System.out.println("Precio final: \033[31m"+precioFinal+"\033[49;39m");
                    System.out.println("");
                    if (edadUsuario>=41) {
                        System.out.println("\033[43m¡Gracias por unirte! Esperamos que disfrutes del contenido básico.\033[0m");
                    }else{
                        System.out.println("\033[43mGraciaspor registrarte en nuestra plataforma.\033[0m" );
                    }
                    break;
                case 2:
                    precioSuscripcion= 15;
                    precioFinal= precioSuscripcion-(precioSuscripcion*descuento/100);
                    System.out.println("Resumen de tu registro ");
                    System.out.println("Nombre: "+nombreUsuario);
                    System.out.println("Tipo de suscripción: Estandar");
                    System.out.println("Precio original: 15\u20ac ");
                    System.out.println("Descuento aplicado: "+descuento+"%");
                    System.out.println("Precio final: \033[31m"+precioFinal+"\033[49;39m");
                    System.out.println("");
                    if (edadUsuario>=26 && edadUsuario<=40) {
                        System.out.println("\033[43mBuena elección para disfrutar de contenido de calidad a un buen precio.\033[0m");
                    }else{
                        System.out.println("\033[43mGraciaspor registrarte en nuestra plataforma.\033[0m" );
                    }
                    break;
                case 3: 
                    precioSuscripcion=20;
                    precioFinal= precioSuscripcion-(precioSuscripcion*descuento/100);
                    System.out.println("Resumen de tu registro ");
                    System.out.println("Nombre: "+nombreUsuario);
                    System.out.println("Tipo de suscripción: Premium");
                    System.out.println("Precio original: 20\u20ac ");
                    System.out.println("Descuento aplicado: "+descuento+"%");
                    System.out.println("Precio final: \033[31m"+precioFinal+"\033[49;39m");
                    System.out.println("");
                    if (edadUsuario<26) {
                        System.out.println("\033[43m¡Felicidades, estás aprovechando al máximo nuestra plataforma!\033[0m");
                    }else{
                        System.out.println("\033[43mGraciaspor registrarte en nuestra plataforma.\033[0m" );
                    }
                    break;

                default:
                    System.out.println("Lo siento, a ingresado una suscripción incorrecta.");
                    break;
            }
                
        }else{
            System.out.println("Lo siento, debes de ser mayor de edad para poder registrate");
        }
        s.close();
    }
}
