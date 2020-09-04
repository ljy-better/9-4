package com.example.bigdata;


import com.example.bigdata.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisService redisService;

    //TODO main函数测试
    @Test
    public void testRedis(){
        redisService.set("dianzi","123456");
        System.out.println("设置的值为----"+redisService.get("dianzi"));
    }

}
