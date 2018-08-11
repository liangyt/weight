package cn.liangyt.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 描述：网关 <br />
 * 查看routes信息: http://localhost:9101/routes  <br />
 * 查看健康状态: http://localhost:9101/health <br />
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
