package cn.liangyt.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述：配置服务启动
 * 创建时间 2018-08-10 15:19
 * 作者 liangyongtong
 */
@EnableEurekaClient
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerApp.class).run(args);
    }
}
