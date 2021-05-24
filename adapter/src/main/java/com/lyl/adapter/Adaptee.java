package com.lyl.adapter;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Adaptee
 *
 * @author liyl
 * @date 2020-4-14
 */
public class Adaptee {

    public void request() {

        Hashtable<Object, Object> objectObjectHashtable = new Hashtable<>();
        HashMap<Object, Object> hashMap = new HashMap<>();
        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
        System.out.println("上网");
    }
}
