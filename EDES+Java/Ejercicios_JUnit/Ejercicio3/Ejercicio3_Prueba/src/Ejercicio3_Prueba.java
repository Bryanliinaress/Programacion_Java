import org.junit.Assert;
import org.junit.Test;

public class Ejercicio3_Prueba {

    @Test
    public void testContarCaracteres() {
        Ejercicio3 service = new Ejercicio3();
        
        Assert.assertEquals(1, service.contarCaracteres("Hola", 'a'));
    }
}