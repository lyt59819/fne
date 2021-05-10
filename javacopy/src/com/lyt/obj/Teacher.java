package com.lyt.obj;

/**
 * 对象拷贝 Techer
 *
 * @author liyl
 * @version 1.0
 * @since 2021/5/7
 */
public class Teacher implements Cloneable{

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return clone;
    }
}
