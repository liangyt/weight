package cn.liangyt.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 描述：网关
 * 创建时间 2018-07-09 13:31
 * 作者 liangyongtong
 */
@SpringBootApplication
@EnableZuulProxy
public class GatewayApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayApp.class).run(args);
    }
}
