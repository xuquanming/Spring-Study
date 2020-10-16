import com.company.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {



    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("apliction.xml");
        User user = (User) context.getBean("user");
        user.show();
    }
}
