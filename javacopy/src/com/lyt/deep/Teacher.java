package com.lyt.deep;

/**
 * 深拷贝 Teacher
 *
 * @author liyl
 * @version 1.0
 * @since 2021/5/8
 */
public class Teacher implements Cloneable{

    private String name;
    private int age;

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;
    }
}
