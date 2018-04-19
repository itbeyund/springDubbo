package provider.serviceImpl;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import provider.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * @program: SpringDubbo
 * @description: user接口实现类
 * @author: yulongguang
 * @create: 2018-04-19 18:26
 **/
public class UserServiceImpl implements UserService {

    @Autowired
    private UserService userService;
    public void createUser(User user) {
        user.setName("yulongguang");
        user.setPassword("123456");
        user.setAge(24);
//        userService.createUser(user);
        System.out.println("user对象："+user +"userName:"+user.getName() +" userPassword:"+user.getPassword() +" age:"+user.getAge());

    }

    public int deleteUser(int id) {
        return 0;
    }

    public int updateUser(int id) {
        return 0;
    }

    public List<User> quaryUserListByParams(Map<String, Object> params) {
        return null;
    }
}
