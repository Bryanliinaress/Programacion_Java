import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.Assert;

public class ServicioNotificacionTest {

    @Test
    public void testEnviarNotificacion() {

        ProveedorNotificaciones proveedorMock = mock(ProveedorNotificaciones.class);

        ServicioNotificacion servicio = new ServicioNotificacion(proveedorMock);

        String mensaje = "Hola, esta es una notificación de prueba.";
        servicio.notificar(mensaje);

        verify(proveedorMock).enviarNotificacion(mensaje);
        Assert.assertTrue(servicio.notificar(""));
    }
}
