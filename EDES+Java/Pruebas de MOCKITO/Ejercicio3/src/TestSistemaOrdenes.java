import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Assert;
import org.junit.Test;

public class TestSistemaOrdenes {
    
    @Test
    public void PruebaSistemaOrdenes() {
        ProveedorDescuentos provDescuen = mock(ProveedorDescuentos.class);
    
        SistemaOrdenes servicio = new SistemaOrdenes(provDescuen);
        
        int preciofinal= 10;

        servicio.preciofinal(preciofinal);

        verify(provDescuen).calcularTotal(preciofinal);
        Assert.assertEquals(provDescuen.calcularTotal(preciofinal),servicio.preciofinal(preciofinal));
    }
}
