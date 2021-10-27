package com.mawkun.eurekafeign.controller;

import com.mawkun.eurekafeign.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2021/10/27 17:44
 * @Author mawkun
 */
@RestController
public class HelloController {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/doHello")
    public String doHello(String userName) {
        return helloRemote.hello(userName);
    }
}
