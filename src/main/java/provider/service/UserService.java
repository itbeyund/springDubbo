package provider.service;

import model.User;

import java.util.List;
import java.util.Map;

/**
 * @program: SpringDubbo
 * @description: user接口
 * @author: yulongguang
 * @create: 2018-04-19 18:22
 **/
public interface UserService {

    void createUser(User user);

    int deleteUser(int id);

    int updateUser(int id);

    List<User> quaryUserListByParams(Map<String, Object> params);
}
