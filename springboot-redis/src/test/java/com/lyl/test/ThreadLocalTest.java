package com.lyl.test;

import org.assertj.core.util.Lists;

import java.util.List;

/**
 * @author liyl
 * @date 2020-7-6
 */
public class ThreadLocalTest {

    private List<String> messages = Lists.newArrayList();

    public static final ThreadLocal<ThreadLocalTest> HOLDER = ThreadLocal.withInitial(ThreadLocalTest::new);

    public static void add(String message) {
        HOLDER.get().messages.add(message);
    }

    public static List<String> clear() {
        List<String> messages = HOLDER.get().messages;
        System.out.println("messages:+++++" + messages);
        HOLDER.remove();

        System.out.println("size: " + HOLDER.get().messages.size());
        return messages;
    }

    public static void main(String[] args) {
        ThreadLocalTest.add("这是什么东西呢！");
        System.out.println(HOLDER.get().messages);
        ThreadLocalTest.clear();
    }
}

