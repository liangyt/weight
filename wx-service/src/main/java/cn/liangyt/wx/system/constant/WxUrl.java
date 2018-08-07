package cn.liangyt.wx.system.constant;

/**
 * 描述：微信相关url
 * 创建时间 2018-07-27 17:45
 * 作者 liangyongtong
 */
public class WxUrl {
    // 根据临时Code获取用户openId
    public final static String FETCH_OPENID_USER = "https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code";
}
