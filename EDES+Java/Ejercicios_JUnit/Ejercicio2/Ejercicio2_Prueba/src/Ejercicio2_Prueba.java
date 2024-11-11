
import org.junit.Assert;
import org.junit.Test;

public class Ejercicio2_Prueba {
    @Test
    public void test(){
        Ejercicio2 service = new Ejercicio2();
        Assert.assertTrue(service.esPar(10));
    }
}
