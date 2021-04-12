package com.lyl.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;


public class TestDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // test1(); // 6987
        // test2(); // 2003
        // test3(); // 788
        test5(); //
    }

    // 方式一
    public static void test1() {
        Long sum = 0L;
        long start = System.currentTimeMillis();
        for (Long i = 0L; i <= 10_0000_0000; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("sum=" + sum + "时间为：" + (end - start));
    }

    // 方式二
    public static void test2() throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinDemo task = new ForkJoinDemo(0L, 10_0000_0000L);
        ForkJoinTask<Long> submit = forkJoinPool.submit(task);// 提交任务
        Long sum = submit.get();
        long end = System.currentTimeMillis();
        System.out.println("sum=" + sum + "时间为：" + (end - start));
    }

    // 方式三
    public static void test3() {
        long start = System.currentTimeMillis();
        long reduce = LongStream.rangeClosed(0L, 10_0000_0000L).reduce(0, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("sum=" + reduce + "时间为：" + (end - start));
    }

    public static void test4() {
        float a = 0.125f;
        double b = 0.125d;
        System.out.println(a - b == 0.0);
    }

    public static void test5() {

        double c = 5.125f;
        double d = 5.125f;
        double e = 5.125f;

        System.out.println(c - d == d - e);
        System.out.println("c-d:============" + (c - d));
        System.out.println("d-e:============" + (d - e));
    }

    public static void test6() {
        System.out.println(1.0 / 0);
    }

    public static void test7() {
        System.out.println(0.0 / 0.0);
    }

}

