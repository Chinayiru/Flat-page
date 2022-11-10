package yi.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import yi.springboot.pojo.User;
import yi.springboot.service.UserService;
import yi.springboot.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author YiRu
* @description 针对表【tb_user】的数据库操作Service实现
* @createDate 2022-11-10 15:48:28
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}
