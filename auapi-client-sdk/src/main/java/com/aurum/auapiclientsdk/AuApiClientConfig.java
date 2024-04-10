package com.aurum.auapiclientsdk;

import com.aurum.auapiclientsdk.client.AuApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * +
 * +
 * + @Author Li_Jin_Gang
 * + @Date 2024/4/8 0008 21:01
 */

// 通过 @Configuration 注解,将该类标记为一个配置类,告诉 Spring 这是一个用于配置的类
@Configuration
// 能够读取application.yml的配置,读取到配置之后,把这个读到的配置设置到我们这里的属性中,
// 这里给所有的配置加上前缀为"auapi.client"
@ConfigurationProperties("auapi.client")
// @Data 注解是一个 Lombok 注解,自动生成了类的getter、setter方法
@Data
// @ComponentScan 注解用于自动扫描组件，使得 Spring 能够自动注册相应的 Bean
@ComponentScan
public class AuApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public AuApiClient auApiClient(){
        // 使用 ak 和 sk 创建实例
        return new AuApiClient(accessKey,secretKey);
    }


}