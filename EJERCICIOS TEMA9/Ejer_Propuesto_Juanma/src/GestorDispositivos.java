public class GestorDispositivos {
    public static void main(String[] args) {
        Dispositivo[] misDisp= new Dispositivo[10];

        misDisp[0]= new Computadora("16 Gb", "1 Tb", "muy bueno", "logitech");
        misDisp[1]= new Televisor(18, "Oled", "LG");
        
        System.out.println(misDisp[0].toString());
        System.out.println("");
        System.out.println(misDisp[1].toString());

        
        System.out.println("");
        System.out.println(misDisp[0].toString());
        System.out.println("");

        ((Encendible)misDisp[0]).apagar();

        System.out.println("");
        System.out.println(misDisp[0].toString());
        System.out.println("");

        misDisp[2]= new Televisor(15, "muy mala", "razer");

        System.out.println("");
        System.out.println(misDisp[2].toString());
        System.out.println("");
        System.out.println(Dispositivo.getContadorDispositivos());
        

        for(int i =0; i<Dispositivo.getContadorDispositivos(); i++){
            System.out.println("");
            System.out.println(misDisp[i]);
            
        }
    }
}
