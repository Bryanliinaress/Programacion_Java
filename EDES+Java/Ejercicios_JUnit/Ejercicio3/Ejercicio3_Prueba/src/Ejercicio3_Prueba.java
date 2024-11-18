import org.junit.Assert;
import org.junit.Test;

public class Ejercicio3_Prueba {

    @Test
    public void testContarCaracteres() {
        Ejercicio3 service = new Ejercicio3();
        
        Assert.assertEquals(3, service.contarCaracteres("Caracola", 'a'));
    }
}