import java.util.Scanner;

public class Ejercicio4_Tema4 {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int sueldo;
        int horasExtras;
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabajadas= s.nextInt();
        if (horasTrabajadas<=40) {
            sueldo=horasTrabajadas*12;
            System.out.println("El sueldo semanal que le corresponde es de "+sueldo+" euros");
            
        }else{
            horasExtras=horasTrabajadas-40;
            sueldo=(horasExtras*16)+(40*12);
            System.out.println("El sueldo semanal que le corresponde es de "+sueldo+" euros");
        }
        s.close();
    }
}