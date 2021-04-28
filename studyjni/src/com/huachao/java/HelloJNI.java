package com.huachao.java;

/**
 * HelloJNI
 *
 * @author liyl
 * @date 2020-7-21
 */
public class HelloJNI {

    static {
        // hello.dll (Windows) or libhello.so (Unixes)
       System.loadLibrary("hello");

    }

    private native void sayHello();

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.library.path"));
        // invoke the native method
        new HelloJNI().sayHello();
    }
}
