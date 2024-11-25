import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora service = new Calculadora();
        Assert.assertEquals(5, service.sumarNumeros(2, 3));
        Assert.assertEquals(-1, service.sumarNumeros(-2, 1));
    }

    @Test
    public void testRestar() {
        Calculadora service = new Calculadora();
        Assert.assertEquals(-1, service.restarNumeros(2, 3));
        Assert.assertEquals(-3, service.restarNumeros(-2, 1));
    }

    @Test
    public void testMultiplicar() {
        Calculadora service = new Calculadora();
        Assert.assertEquals(6, service.multiplicarNumeros(2, 3));
        Assert.assertEquals(-2, service.multiplicarNumeros(-2, 1));
    }

    @Test
    public void testDividir() {
        Calculadora service = new Calculadora();
        Assert.assertEquals(2, service.dividirNumeros(6, 3));
        Assert.assertEquals(-2, service.dividirNumeros(-6, 3));
    }

    @Test 
    public void testDividirPorCero() {
        Calculadora service = new Calculadora();
        Assert.assertThrows(ArithmeticException.class,()->{service.dividirNumeros(1, 0);} ); // Esto debería dar una Excepcion
    }
}  
