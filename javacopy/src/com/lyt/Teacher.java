package com.lyt;

/**
 * 引用拷贝 Teacher
 *
 * @author liyunlong
 * @version 1.0
 * @since 2021/5/7
 */
public class Teacher {

    private String name;

    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
