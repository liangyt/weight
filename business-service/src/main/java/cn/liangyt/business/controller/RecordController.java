package cn.liangyt.business.controller;

import cn.liangyt.business.model.Record;
import cn.liangyt.business.service.RecordService;
import cn.liangyt.common.resultvo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述：记录
 * 创建时间 2018-07-20 16:06
 * 作者 liangyongtong
 */
@RestController
public class RecordController {
    @Autowired
    private RecordService recordService;

    /**
     * 保存记录
     * @param openId openId
     * @param weight 重量
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/record/save")
    public ResultVO insertRecord(String openId, BigDecimal weight) {
        recordService.insertRecord(openId, weight);
        return ResultVO.succee();
    }

    /**
     * 查询列表
     * @param openId
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/record/list")
    public ResultVO queryForPage(String openId, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        Map<String, Object> params = new HashMap();
        params.put("openId", openId);
        PageInfo<Record> pageInfo = recordService.findByCondfigWithPage(params, pageNum, pageSize);
        return ResultVO.succeeWithData(pageInfo);
    }
}
