package cn.liangyt.wx.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 描述：用户信息
 * 创建时间 2018-07-27 17:35
 * 作者 liangyongtong
 */
@Setter
@Getter
public class WxUserInfo implements Serializable {
    private String openid;
    private String session_key;
    private String expires_in;
    private String unionid;
}
