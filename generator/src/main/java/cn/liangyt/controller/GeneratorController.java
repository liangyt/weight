package cn.liangyt.controller;

import cn.liangyt.common.service.SnowFlakeGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：生成器控制器
 * 创建时间 2018-07-09 09:54
 * 作者 liangyongtong
 */
@RestController
public class GeneratorController {

    /**
     * 返回ID
     * @param idc idc编号
     * @param machineId 机器编号
     * @return
     */
    @GetMapping("/id/{idc}/{machineId}")
    public Long IdGenrator(@PathVariable int idc, @PathVariable int machineId) {
        return new SnowFlakeGenerator.Factory().create(idc, machineId).nextId();
    }
}
