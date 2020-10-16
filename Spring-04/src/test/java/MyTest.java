import com.company.pojo.Student;
import com.company.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {



    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student =(Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = context.getBean("user2", User.class);

        System.out.println(user.toString());
    }
}
