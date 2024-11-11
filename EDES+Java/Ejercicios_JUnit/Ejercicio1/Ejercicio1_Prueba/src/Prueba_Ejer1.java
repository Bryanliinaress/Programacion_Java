import org.junit.Test;

import org.junit.Assert;

public class Prueba_Ejer1 {
    @Test
    public void test(){
        Ejercicio1 service = new Ejercicio1();
        Assert.assertTrue(service.esPositivo(8));
    }
}