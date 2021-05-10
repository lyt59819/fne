package com.lyt.obj;


/**
 * 对象拷贝
 *
 * @author liyl
 * @version 1.0
 * @since 2021/5/7
 */
public class ObjectCopy {

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher("riemann", 28);
        Teacher otherTeacher = (Teacher) teacher.clone();

        System.out.println("teacher:===== "+teacher);
        System.out.println("otherTeacher: "+otherTeacher);
    }
}
