package cn.liangyt.base.controller;

import cn.liangyt.base.system.config.CustomInfo;
import cn.liangyt.common.resultvo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：测试配置动态更新
 * 创建时间 2018-08-12 10:27
 * 作者 liangyongtong
 */
@RestController
public class SpringCloudBusConfigTestController {

    @Autowired
    private CustomInfo customInfo;

    @GetMapping("/testbus/userinfo")
    public ResultVO getCustomInfo() {
        return ResultVO.succeeWithData(customInfo.getIdc());
    }
}
