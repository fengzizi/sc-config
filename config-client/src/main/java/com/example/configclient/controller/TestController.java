package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/test")
@RefreshScope
public class TestController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/hi")
    public String home() {
        return foo;
    }
}
