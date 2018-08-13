package cn.liangyt.zkserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import zipkin.server.EnableZipkinServer;

/**
 * 描述：zipkin 服务
 * 创建时间 2018-08-13 15:48
 * 作者 liangyongtong
 */
@SpringBootApplication
@EnableZipkinServer
public class ZinkinServerApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ZinkinServerApp.class).run(args);
    }
}
