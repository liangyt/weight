package cn.liangyt.base.service;

import cn.liangyt.base.common.BaseService;
import cn.liangyt.base.mapper.UserMapper;
import cn.liangyt.base.model.User;
import cn.liangyt.base.webservice.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 描述：用户服务
 * 创建时间 2018-07-18 16:13
 * 作者 liangyongtong
 */
@Service
public class UserService extends BaseService<UserMapper, User> {
    @Autowired
    private GeneratorService generatorService;

    /**
     * 根据openId查询返回用户
     * @param openId openId
     * @return 用户信息
     */
    public User selectByOpenId(String openId) {
        List<User> list = this.mapper.selectByOpenId(openId);
        return list == null || list.size() == 0 ? null : list.get(0);
    }

    /**
     * 不存在则插入openId
     * @param openId
     */
    public void insertUserIfNotExist(String openId) {
        User u = this.selectByOpenId(openId);
        if (null != u) {
            return;
        }

        User user = new User();
        user.setId(generatorService.id());
        user.setOpenId(openId);
        user.setCreateTime(new Date());
        this.mapper.insert(user);
    }
}
