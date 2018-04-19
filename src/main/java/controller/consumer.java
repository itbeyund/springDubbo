package controller;

import model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import provider.service.DemoService;
import provider.service.UserService;

import java.io.IOException;
import java.util.List;

/**
 * @program: SpringDubbo
 * @description: 消费者
 * @author: yulongguang
 * @create: 2018-04-19 17:56
 **/
public class consumer {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext1.xml"});
        context.start();

        //获取bean
        DemoService demoService = (DemoService) context.getBean("demoService");

        //获取第二个bean
        UserService userService = (UserService) context.getBean("userService");


        List<User> list = demoService.getUsers();
        String content = demoService.sayHello("Hello");
        System.out.println(content);
        System.out.println(list);
        if (list != null && list.size() > 0) {

            for (int i = 0; i < list.size(); i++) {
                System.out.println("年龄" + list.get(i).getAge() + "姓名" + list.get(i).getName() + "密码" + list.get(i).getPassword());
            }

        }

        User user=new User();
         userService.createUser(user);


        System.in.read();
    }
}
