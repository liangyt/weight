package cn.liangyt.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述：配置服务启动 <br />
 * 刷新路径： http://localhost:7001/bus/refresh?destiantion=base-service <br />
 * 可以指定需要刷新的服务 destiantion=${spring.cloud.client.hostname}:${spring.application.name}:${spring.application.instance_id}:${server:port} <br />
 * 例： 刷新基础服务的全部实例 http://localhost:7001/bus/refresh?destiantion=base-service:**
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
