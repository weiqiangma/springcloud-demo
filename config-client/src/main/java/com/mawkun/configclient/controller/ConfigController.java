package com.mawkun.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Date 2021/10/29 11:26
 * @Author mawkun
 */
@RefreshScope
@RestController
public class ConfigController {
    @Value("${userName:error}")
    private String profile;

    @RequestMapping("/info")
    public Mono<String> info() {
        System.out.println("");
        return Mono.justOrEmpty(profile);
    }
}
