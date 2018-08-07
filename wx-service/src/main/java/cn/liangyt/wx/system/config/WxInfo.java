package cn.liangyt.wx.system.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：自定义信息
 * 创建时间 2018-07-19 09:57
 * 作者 liangyongtong
 */
@Configuration
@ConfigurationProperties(prefix = "wx")
@Setter
@Getter
public class WxInfo {
    private String appid;
    private String secret;
    private String baseurl;
}
