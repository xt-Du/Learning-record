package com.jc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author John.Cena
 * @date 2023/3/20 19:52
 * @Description:
 */
//value:指定微服务的名字,这样就可以使Feign客户端直接找到对应的微服务
@FeignClient(value = "SERVER-PROVIDE")
public interface DeptClineService {
    //填写服务提供的地址
    @GetMapping("/ribbon/test")
    String getProvider();
}
