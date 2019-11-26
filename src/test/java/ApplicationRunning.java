
import java.util.Date;

import com.zhou.ssm.Application;
import com.zhou.ssm.user.entity.User;
import com.zhou.ssm.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * XXX 类描述信息
 *
 * @author zhou
 * @version v1.0.0
 * @project
 * @date 2019-11-26 17:46
 * @copyright Copyright (c) 2019, www.javakc.com All Rights Reserved.
 */
@SpringBootTest(classes = Application.class)
public class ApplicationRunning {

    @Autowired
    private UserService userService;

    @Test
    public void insert()
    {
        User user = new User();
        user.setId("id1");
        user.setName("name1");
        user.setAge(23);
        user.setGender(1);
        user.setPhone("13888888881");
        user.setBirthday(new Date());
        user.setAddress("北京市海淀区");

        userService.insert(user);
    }

}
