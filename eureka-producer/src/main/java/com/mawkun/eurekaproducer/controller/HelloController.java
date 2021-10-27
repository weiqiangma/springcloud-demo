package com.mawkun.eurekaproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2021/10/27 16:45
 * @Author mawkun
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/do")
    public String hello(String userName) {
        return "hello, " + userName;
    }
}
