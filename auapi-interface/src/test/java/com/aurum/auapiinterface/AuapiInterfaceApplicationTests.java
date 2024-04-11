package com.aurum.auapiinterface;

import com.aurum.auapiclientsdk.client.AuApiClient;
import com.aurum.auapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

// 表示这是一个基于Spring Boot的测试类
@SpringBootTest
class AuapiInterfaceApplicationTests {
    // 注入一个名为yuApiClient的Bean
    @Resource
    private AuApiClient auApiClient;
    // 表示这是一个测试方法
    @Test
    void contextLoads() {
        // 调用auApiClient的getNameByGet方法，并传入参数"aurum"，将返回的结果赋值给result变量
        String result = auApiClient.getNameByGet("aurum");
        // 创建一个User对象
        User user = new User();
        // 设置User对象的username属性为"aurum"
        user.setUsername("au");
        // 调用yuApiClient的getUserNameByPost方法，并传入user对象作为参数，将返回的结果赋值给usernameByPost变量
        String usernameByPost = auApiClient.getUserNameByPost(user);
        // 打印result变量的值
        System.out.println(result);
        // 打印usernameByPost变量的值
        System.out.println(usernameByPost);
    }

}