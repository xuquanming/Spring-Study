import com.company.dao.UserDaoMysqlImpl;
import com.company.service.UserService;
import com.company.service.UserServiceImpl;
import org.junit.Test;

public class MyTest {


    @Test
    public void test1(){
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
