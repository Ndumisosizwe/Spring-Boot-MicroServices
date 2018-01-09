import com.spring.microservices.boot.MicroServicesBootApplication;
import com.spring.microservices.controller.impl.MvcController;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Ndumiso on 1/8/2018.
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MicroServicesBootApplication.class)
public class MvcControllerTest extends TestCase {

    @Autowired
    private MvcController mvcController;

    @Test
    public void testShouldPassIfMvcControllerNotNull() {
        assertNotNull(this.mvcController);
    }

    @Test
    public void testMvcControllerShouldReturnHelloWorldMessage() {
    }
}
