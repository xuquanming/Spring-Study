import com.company.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("all")
public class Mytest {





    @Test
    public void test(){

        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中的管理了，我们要使用，直接去里面取出来就可以
        Hello hello =(Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
