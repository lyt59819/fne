package com.lyl.redis;

import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * @author liyl
 * @date 2020-5-13
 */
public class TXTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.2.231", 6379);
        jedis.flushDB();
        // 开启事务
        Transaction multi = jedis.multi();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello", "hello");
        jsonObject.put("name", 598);
        String string = jsonObject.toJSONString();

        // jedis.watch()  监视某一个key（乐观锁）
        try {
            multi.set("user1", string);
            multi.set("user2", string);
            multi.set("user3", string);
            int i = 1 / 0;
            // 执行事务
            multi.exec();
        } catch (Exception e) {
            // 放弃事务  int i = 1 / 0;
            multi.discard();
            e.printStackTrace();
        } finally {

            System.out.println(jedis.get("user1"));
            System.out.println(jedis.get("user2"));
            System.out.println(jedis.get("user3"));
            // 断开连接
            jedis.close();
        }
    }
}
