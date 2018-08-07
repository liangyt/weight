package cn.liangyt.base;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 描述：入口
 * 创建时间 2018-07-12 17:02
 * 作者 liangyongtong
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties
@EnableFeignClients
public class BaseApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(BaseApp.class).run(args);
    }
}
