package cn.liangyt.wx.controller;

import cn.liangyt.common.resultvo.ResultVO;
import cn.liangyt.common.util.JacksonUtil;
import cn.liangyt.wx.model.WxUserInfo;
import cn.liangyt.wx.service.WeixinService;
import cn.liangyt.wx.system.config.WxInfo;
import cn.liangyt.wx.system.constant.WxUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：处理用户信息
 * 创建时间 2018-07-27 17:33
 * 作者 liangyongtong
 */
@RestController
public class WxLoginController {

    @Autowired
    private WxInfo wxInfo;

    @Autowired
    private WeixinService weixinService;

    /**
     * 根据登录Code获取openId
     * @param code
     * @return
     */
    @GetMapping("/api/openid")
    public ResultVO getOpenIdByCode(String code) {
        String result = weixinService.login(wxInfo.getAppid(), wxInfo.getSecret(), code, "authorization_code");
        WxUserInfo info = JacksonUtil.jsonToObject(result, WxUserInfo.class);
        return ResultVO.succeeWithData(info.getOpenid());
    }
}
