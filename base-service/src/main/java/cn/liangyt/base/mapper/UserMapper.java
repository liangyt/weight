package cn.liangyt.base.mapper;

import cn.liangyt.base.model.User;
import cn.liangyt.common.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> selectByOpenId(String openId);
}