import com.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AOPTest {
    @Test
    public void testAOP(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
        IAccountService service= (IAccountService) ac.getBean("accountService");
        service.saveAccount();
    }
}
