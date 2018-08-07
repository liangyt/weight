package cn.liangyt.business;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 描述：启动
 * 创建时间 2018-07-18 17:47
 * 作者 liangyongtong
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties
@EnableFeignClients
public class BusinessApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(BusinessApp.class).run(args);
    }
}
