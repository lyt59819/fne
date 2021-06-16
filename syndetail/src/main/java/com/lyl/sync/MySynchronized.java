package com.lyl.sync;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * MySynchronized
 *
 * @author liyl
 * @date 2020-4-19
 */
public class MySynchronized {
    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger();
        integer.incrementAndGet();

        new Thread().start();

    }
}
