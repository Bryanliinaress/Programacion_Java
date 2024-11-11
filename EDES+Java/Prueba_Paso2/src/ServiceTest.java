import org.junit.*;

public class ServiceTest {
    @Test
    public void test() {
        Service service = new Service();
        Assert.assertEquals("Hello", service.says());
    }
}
