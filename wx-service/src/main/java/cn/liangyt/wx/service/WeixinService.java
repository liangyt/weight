package cn.liangyt.wx.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述：微信服务
 * 创建时间 2018-07-30 10:10
 * 作者 liangyongtong
 */
@FeignClient(name = "wx", url = "${wx.baseurl}")
public interface WeixinService {

    // https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code
    @GetMapping(value = "/sns/jscode2session")
    public String login(@RequestParam("appid") String appid,
                        @RequestParam("secret") String secret,
                        @RequestParam("js_code") String code,
                        @RequestParam("grant_type") String authorization_code);
}
