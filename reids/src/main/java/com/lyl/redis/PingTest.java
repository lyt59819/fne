package com.lyl.redis;

import redis.clients.jedis.Jedis;

/**
 * @author liyl
 * @date 2020-5-13
 */
public class PingTest {
    public static void main(String[] args) {

        // 1、new Jedis对象即可
        Jedis jedis = new Jedis("192.168.2.231", 6379);
        // jedis所有的命令就是之前的Redis指令
        System.out.println(jedis.ping());
    }
}
