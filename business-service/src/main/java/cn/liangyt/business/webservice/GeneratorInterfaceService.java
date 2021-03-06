package cn.liangyt.business.webservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：序列号
 * 创建时间 2018-07-19 09:46
 * 作者 liangyongtong
 */
// 这是通过 zuul 访问的
//@FeignClient(name = "generator-service", url = "http://localhost:9101/generator")
// 这是直接访问的
@FeignClient(name = "generator-service", fallback = GeneratorInterfaceService.GeneratorFallback.class)
public interface GeneratorInterfaceService {

    @RequestMapping(value = "/id/{idc}/{machineId}")
    public Long id(@PathVariable("idc") int idc, @PathVariable("machineId") int machineId);

    @Component
    static class GeneratorFallback implements GeneratorInterfaceService {

        // 发号器服务不可用的时候使用该方式生成
        @Override
        public Long id(int idc, int machineId) {
            return System.currentTimeMillis() + idc + machineId;
        }
    }
}
