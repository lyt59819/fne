package com.lyt.shallow;

/**
 * 浅拷贝 student
 *
 * @author liyl
 * @version 1.0
 * @since 2021/5/8
 */
public class Student implements Cloneable{

    private String name;

    private int age;

    private Teacher teacher;

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      Object object = super.clone();
        return object;
    }
}
