package cn.liangyt.common.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述：ID
 * 创建时间 2018-07-12 15:57
 * 作者 liangyongtong
 */
@Getter
@Setter
@Accessors(chain = true)
public class Id implements Serializable {
    /** ID */
    private Long id;
    /** 创建时间 */
    private Date createTime;
}
