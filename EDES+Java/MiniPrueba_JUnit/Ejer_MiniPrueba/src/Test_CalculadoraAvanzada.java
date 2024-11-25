import org.junit.Assert;
import org.junit.Test;

public class Test_CalculadoraAvanzada {

    @Test 
    public void Test1_Potencia(){
        CalculadoraAvanzada service = new CalculadoraAvanzada();
        Assert.assertEquals(1, service.Potencia(5,0),0.001);
    }

    @Test 
    public void Test2_Potencia(){
        CalculadoraAvanzada service = new CalculadoraAvanzada();
        Assert.assertEquals(-8, service.Potencia(-2,3),0.001);
    }

    @Test 
    public void Test3_Potencia(){
        CalculadoraAvanzada service = new CalculadoraAvanzada();
        Assert.assertEquals(0.25, service.Potencia(2,-2),0.001);
    }

    @Test 
    public void Test1_RaizCuadrada(){
        CalculadoraAvanzada service = new CalculadoraAvanzada();
        Assert.assertEquals(2,service.raizCuadrada(4),0.001);
    }

    @Test 
    public void Test2_RaizCuadrada(){
        CalculadoraAvanzada service = new CalculadoraAvanzada();
        Assert.assertEquals(0,service.raizCuadrada(0),0.001);
    }

    @Test 
    public void Test3_RaizCuadrada(){
        CalculadoraAvanzada service = new CalculadoraAvanzada();
        Assert.assertThrows(IllegalArgumentException.class,()->service.raizCuadrada(-5));
    }
}
