package cn.liangyt.business.common;

import cn.liangyt.common.mapper.BaseMapper;
import cn.liangyt.common.model.Id;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 描述：基础服务
 * 创建时间 2018-07-18 16:15
 * 作者 liangyongtong
 */
public class BaseService<M extends BaseMapper<T>, T extends Id> {

    @Autowired
    protected M mapper;

    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }
    public int insert(T t) {
        return mapper.insert(t);
    }

    public T selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    public List<T> selectAll() {
        return mapper.selectAll();
    }

    public int updateByPrimaryKey(T t) {
        return mapper.updateByPrimaryKey(t);
    }

    /**
     * 分页查询
     * @param params map 类型的查询条件
     * @param offset 初始位置
     * @param limit 每页条数
     * @return PageInfo 对象
     */
    public PageInfo<T> findByCondfigWithOffset(Map<String, Object> params, int offset, int limit) {
        PageHelper.offsetPage(offset, limit);
        Page<T> page = (Page<T>)mapper.fetchForPage(params);
        return  new PageInfo<T>(page);
    }

    /**
     * 分页查询
     * @param params map 类型的查询条件
     * @param pageNum 页码
     * @param pageSize 每页条数
     * @return PageInfo 对象
     */
    public PageInfo<T> findByCondfigWithPage(Map<String, Object> params, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<T> page = (Page<T>)mapper.fetchForPage(params);
        return  new PageInfo<T>(page);
    }
}
