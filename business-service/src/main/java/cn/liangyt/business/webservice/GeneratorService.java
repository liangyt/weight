package cn.liangyt.business.webservice;

import cn.liangyt.business.system.config.CustomInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：本地序列号服务
 * 创建时间 2018-07-19 09:54
 * 作者 liangyongtong
 */
@Service
public class GeneratorService {
    @Autowired
    private CustomInfo customInfo;

    @Autowired
    private GeneratorInterfaceService generatorInterfaceService;

    /**
     * 返回ID号
     * @return
     */
    public Long id() {
        return generatorInterfaceService.id(customInfo.getIdc(), customInfo.getMachineId());
    }
}
