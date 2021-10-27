package com.mawkun.eurekafeign.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Date 2021/10/27 17:43
 * @Author mawkun
 */
@Component
@FeignClient(name = "eureka-producer")
public interface HelloRemote {

    @RequestMapping("/hello/do")
    String hello(@RequestParam(value = "userName") String userName);
}
