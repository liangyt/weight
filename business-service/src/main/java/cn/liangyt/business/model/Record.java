package cn.liangyt.business.model;

import cn.liangyt.common.model.Id;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
public class Record extends Id {
    private String openId;
    private BigDecimal weight;
    @JsonFormat(pattern = "YYYY-MM-DD")
    private Date date;
}