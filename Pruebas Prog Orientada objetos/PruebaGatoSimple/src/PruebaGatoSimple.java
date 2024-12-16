public class PruebaGatoSimple {
    public static void main(String[] args) throws Exception {
        GAtoSimple garfield = new GAtoSimple("macho");

        System.out.println("Hola gatito");
        garfield.maulla();
        System.out.println("toma tarta");
        garfield.come("tarta selva negra");
        System.out.println("toma pescado, a ver si esto te gusta");
        garfield.come("pescado");

        GAtoSimple tom = new GAtoSimple("macho");
        
        System.out.println("Tom, toma sopita de verduras");
        tom.come("sopita de verduras");

        GAtoSimple lisa = new GAtoSimple("hembra");

        System.out.println("gatitos, a ver como maullais");
        garfield.maulla();
        tom.maulla();
        lisa.maulla();

        garfield.peleaCon(lisa);
        lisa.peleaCon(tom);
        tom.peleaCon(garfield);
    }
}
