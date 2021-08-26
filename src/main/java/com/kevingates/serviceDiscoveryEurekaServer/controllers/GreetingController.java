package com.kevingates.serviceDiscoveryEurekaServer.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public interface GreetingController {
    @RequestMapping("/greeting")
    String greeting();
}