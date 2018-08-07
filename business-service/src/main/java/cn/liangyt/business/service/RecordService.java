package cn.liangyt.business.service;

import cn.liangyt.business.common.BaseService;
import cn.liangyt.business.mapper.RecordMapper;
import cn.liangyt.business.model.Record;
import cn.liangyt.business.webservice.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 描述：记录
 * 创建时间 2018-07-19 09:30
 * 作者 liangyongtong
 */
@Service
public class RecordService extends BaseService<RecordMapper, Record> {
    @Autowired
    private GeneratorService generatorService;

    /**
     * 保存体重记录，如果当天已存在则不记录
     * @param openId
     * @param weight
     */
    public void insertRecord(String openId, BigDecimal weight) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String today = format.format(date.getTime());

        List<Record> list = mapper.selectWithOpenIdAndDate(openId, today);
        // 如果当天已有数据，则不能重复录入
        if (null != list && list.size() > 0) {
            return;
        }

        Record record = new Record();
        record.setId(generatorService.id());
        record.setOpenId(openId);
        record.setWeight(weight);
        record.setDate(date);
        record.setCreateTime(date);
        mapper.insert(record);
    }
}
