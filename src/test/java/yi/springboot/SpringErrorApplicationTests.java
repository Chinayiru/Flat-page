package yi.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import yi.springboot.mapper.UserMapper;
import yi.springboot.pojo.User;

import javax.annotation.Resource;

@SpringBootTest
class SpringErrorApplicationTests {

    @Resource
    private UserMapper userMapper;
    @Test
    public void add(){
        User user = new User();
        user.setId(5);
        user.setUsername("aa");
        user.setPassword("213123");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

}
