import com.company.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Mytest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
    }

    @Test
    public void test1(){
        String str = "hello   xiao ming";
        String[] s = str.split(" ");
        List a = new ArrayList<>();
        a.add("1");
        a.add("2");
        a.forEach(System.out::println);
        StringBuilder ss = new StringBuilder();
        for (int i = s.length-1; i>=0; i--){
            ss.append(s[i]);
        }
        System.out.println(ss);
    }
}
