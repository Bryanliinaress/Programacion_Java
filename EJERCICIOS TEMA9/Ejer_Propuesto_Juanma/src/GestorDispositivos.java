public class GestorDispositivos {
    public static void main(String[] args) {
        Dispositivo[] misDisp= new Dispositivo[10];

        misDisp[0]= new Computadora("16 Gb", "1 Tb", "muy bueno", "logitech");
        misDisp[1]= new Televisor(18, "Oled", "LG");

        System.out.println(misDisp[0].toString());
        System.out.println("");
        System.out.println(misDisp[1].toString());

        ((Encendible)misDisp[0]).encender();
        
        System.out.println("");
        System.out.println(misDisp[0].toString());
        System.out.println("");
    }
}
