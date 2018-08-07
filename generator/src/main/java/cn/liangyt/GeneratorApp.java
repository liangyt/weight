package cn.liangyt;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述：启动
 * 创建时间 2018-07-09 09:44
 * 作者 liangyongtong
 */
@SpringBootApplication
@EnableEurekaClient
public class GeneratorApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(GeneratorApp.class).run(args);
    }
}
