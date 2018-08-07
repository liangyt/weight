package cn.liangyt.base.controller;

import cn.liangyt.base.service.UserService;
import cn.liangyt.common.resultvo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 描述：用户
 * 创建时间 2018-07-18 17:52
 * 作者 liangyongtong
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据openId添加用户
     * @param openId
     * @return
     */
    @RequestMapping(value = "/add")
    public ResultVO addUserWithOpenId(String openId) {
        userService.insertUserIfNotExist(openId);
        return ResultVO.succee();
    }
}
