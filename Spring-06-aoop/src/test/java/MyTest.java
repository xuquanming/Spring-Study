import com.company.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {



    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }

    @Test
    public void test1(){
        String[] s = {"1233","rr"};
        for (String s1 : s) {
            System.out.println(s1);
        }
        String join = String.join("#", s);
        System.out.println(join);
    }
}
