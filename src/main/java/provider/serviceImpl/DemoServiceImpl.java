package provider.serviceImpl;

import model.User;
import provider.service.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: SpringDubbo
 * @description: 实现类
 * @author: yulongguang
 * @create: 2018-04-19 13:06
 **/
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello "+ name;
    }

    public List getUsers() {

        List<User> list=new ArrayList();

        User u1=new User();
        u1.setName("yulongguang");
        u1.setPassword("123456");
        u1.setAge(24);

        User u2=new User();
        u2.setName("yulongguang1");
        u2.setPassword("123456");
        u2.setAge(24);

        User u3=new User();
        u3.setName("yulongguang2");
        u3.setPassword("123456");
        u3.setAge(24);

        list.add(u1);
        list.add(u2);
        list.add(u3);
       return list;
    }
}
