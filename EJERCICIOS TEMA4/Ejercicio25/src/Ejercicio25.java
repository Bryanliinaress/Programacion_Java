import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduza la altura de la bandera en cm: ");
        int alturaBandera = s.nextInt();
        System.out.print("Ahora introduzca la anchura: ");
        int anchuraBandera = s.nextInt();
        double precioBandera = (float)alturaBandera * anchuraBandera / 100;
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        s.nextLine();
        String escudoString = s.next();
        if (escudoString.equals("s")) {
            System.out.println("Gracias. Aquí tiene el desglose de su compra.");
            System.out.printf("Bandera de %5d cm2: %5.2f €", alturaBandera * anchuraBandera, precioBandera);
            System.out.println("");
            System.out.printf("Con escudo: %15.2f €", 2.50);
            System.out.println("");
            System.out.printf("Gastos de envío: %10.2f €", 3.25);
            System.out.println("");
            System.out.printf("Total: %20.2f €",precioBandera+2.50+3.25);
        }else{
            System.out.println("Gracias. Aquí tiene el desglose de su compra.");
            System.out.printf("Bandera de %5d cm2: %5.2f €", alturaBandera * anchuraBandera, precioBandera);
            System.out.println("");
            System.out.printf("Sin escudo: %15.2f €", 0.00);
            System.out.println("");
            System.out.printf("Gastos de envío: %10.2f €", 3.25);
            System.out.println("");
            System.out.printf("Total: %20.2f €",(precioBandera+3.25));
        }
        s.close();
    }
}
