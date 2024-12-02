import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Assert;
import org.junit.Test;


public class InventarioTest {
    @Test
    public void TestBorrarProducto(){
        RepositorioInventario repoInven = mock(RepositorioInventario.class);

        Inventario service = new Inventario(repoInven);
        
        int codigoProducto= 12520;
        service.estadoArticulo(codigoProducto);

        verify(repoInven).eliminaProducto(codigoProducto);
        Assert.assertFalse(service.estadoArticulo(codigoProducto));
    }
}
