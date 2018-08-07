package cn.liangyt.business.mapper;

import cn.liangyt.business.model.Record;
import cn.liangyt.common.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecordMapper extends BaseMapper<Record> {
    List<Record> selectWithOpenIdAndDate(@Param("openId") String openId, @Param("date") String date);
}