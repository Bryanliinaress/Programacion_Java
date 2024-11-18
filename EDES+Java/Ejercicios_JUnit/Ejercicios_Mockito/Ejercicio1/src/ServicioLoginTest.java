import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;

public class ServicioLoginTest {

    @Test
    public void testLogin() {
        RepositorioUsuarios service = mock(RepositorioUsuarios.class);
        when(service.usuarioExistente()).thenReturn("Existe");
        when(service.usuarioNoExistente()).thenReturn("No Existe");
        Assert.assertEquals("Existe", service.usuarioExistente());
        Assert.assertEquals("No Existe", service.usuarioNoExistente());
    }
}
