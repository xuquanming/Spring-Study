import com.company.config.MingConfig;
import com.company.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {




    @Test
    public void test(){

        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(MingConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
