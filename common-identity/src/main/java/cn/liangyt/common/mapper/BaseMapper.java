package cn.liangyt.common.mapper;

import java.util.List;
import java.util.Map;

/**
 * 描述：基本持久层接口
 * 创建时间 2018-07-18 16:08
 * 作者 liangyongtong
 */
public interface BaseMapper<T> {
    int deleteByPrimaryKey(Long id);
    int insert(T t);
    T selectByPrimaryKey(Long id);
    List<T> selectAll();
    int updateByPrimaryKey(T t);
    List<T> fetchForPage(Map<String, Object> params);
}
