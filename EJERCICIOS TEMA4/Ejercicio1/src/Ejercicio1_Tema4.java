import java.util.Scanner;

public class Ejercicio1_Tema4 {
    public static void main(String[] args) throws Exception {
        /*
         * Escribe un programa que pida por teclado un día de la semana y que diga qué
         * asignatura toca a primera hora ese día.
         */
        Scanner s = new Scanner(System.in);
        System.out.println("\033[42mPrimera asignatura del día\033[0;49m");
        System.out.println("==========================");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miércoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.print("Elije una opción (1-5): ");
        int dia = s.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Entornos de Desarrollo \033[32m(Edes)\033[0;49m");
                break;
            case 2:
                System.out.println("Digitalización \033[32m(DIG)\033[0;49m");
                break;
            case 3:
                System.out.println("Lenguaje de Marcas \033[32m(LMSGI)\033[0;49m");
                break;
            case 4:
                System.out.println("Lenguaje de Marcas \033[32m(LMSGI)\033[0;49m");
                break;
            case 5:
                System.out.println("Base de Datos \033[32m(BADAT)\033[0;49m");
                break;
            case 6, 7:
                System.out.println("\033[31mLos findes no tenemos clase melon\033[0;49m");
                break;

            default:
                System.out.println("\033[31mHas indicado un dia incorrecto\033[0;49m");
        }
        s.close();
    }
}