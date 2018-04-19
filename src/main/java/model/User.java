package model;

import java.io.Serializable;

/**
 * @program: SpringDubbo
 * @description: 实体类
 * @author: yulongguang
 * @create: 2018-04-19 13:07
 **/
public class User implements Serializable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;

    private String password;

    private int age;
}
