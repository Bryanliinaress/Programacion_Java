import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;

public class ServiceTest {
        @Test
        public void test() {
            Service service = new Service();
            Assert.assertEquals("Hello", service.says());
        }
        @Test
        public void test2(){
            Service service = mock(Service.class);
            when(service.says()).thenReturn("Hello");
            Assert.assertEquals("Hello", service.says());
    }
}
