package com.mawkun.eurekafeign.hystrix;

import com.mawkun.eurekafeign.remote.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Date 2021/10/28 10:00
 * @Author mawkun
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "userName")String userName) {
        return "hello, world";
    }
}
