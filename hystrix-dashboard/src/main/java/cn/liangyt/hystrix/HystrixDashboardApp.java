package cn.liangyt.hystrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 描述：hystrix 显示器 启动 <br/>
 * 路径： http://localhost:9102/hystrix <br />
 * 监控路径： 如 http://localhost:8801/hystrix.stream 使用hystrix的服务
 * 创建时间 2018-08-10 13:54
 * 作者 liangyongtong
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixDashboardApp.class).run(args);
    }
}
