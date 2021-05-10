package com.lyt;

public class QuoteCopy {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("riemann", 20);
        Teacher newTeacher = teacher;
        System.out.println("teacher:====" + teacher.hashCode());
        System.out.println("newTeacher:----" + newTeacher.hashCode());
    }
}
