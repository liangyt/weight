package cn.liangyt.base.model;

import cn.liangyt.common.model.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class User extends Id {

    private String openId;

    private String nickName;

    private String gender;

    private String city;

    private String province;

    private String country;

    private String avatarUrl;

    private String unionId;
}