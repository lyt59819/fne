package com.lyt.shallow;

/**
 * Test shallowCopy
 *
 * @author liyl
 * @version 1.0
 * @since 2021/5/8
 */
public class ShallowCopy {

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher();
        teacher.setName("riemann");
        teacher.setAge(28);

        Student student1 = new Student();
        student1.setName("edgar");
        student1.setAge(18);
        student1.setTeacher(teacher);

        Student student2 = (Student) student1.clone();
        System.out.println("--------拷贝后--------");
        System.out.println("student2Name:---" + student2.getName());
        System.out.println("student2Age :---" + student2.getAge());
        System.out.println("student2TeacherName：" + student2.getTeacher().getName());
        System.out.println("student2TeacherAge： " + student2.getTeacher().getAge());

        System.out.println("======修改老师的信息后======");
        teacher.setName("jack");
        System.out.println("student1的teacher为： " + student1.getTeacher().getName());
        System.out.println("student2的teacher为： " + student2.getTeacher().getName());
    }
}
