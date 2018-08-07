package cn.liangyt.wx;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 描述：启动
 * 创建时间 2018-07-27 17:27
 * 作者 liangyongtong
 */
@SpringBootApplication
@EnableConfigurationProperties
@EnableEurekaClient
@EnableFeignClients
public class WxService {
    public static void main(String[] args) {
        new SpringApplicationBuilder(WxService.class).run(args);
    }
}
