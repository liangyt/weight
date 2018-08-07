package cn.liangyt.wx.system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：feignLog
 * 创建时间 2018-07-30 13:15
 * 作者 liangyongtong
 */
@Configuration
public class FeignLog {

    @Bean
    public feign.Logger.Level feignLoggerLevel() {
        return feign.Logger.Level.FULL;
    }
}
