package com.kevingates.serviceDiscoveryEurekaServer.controllers;


//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantCustomerInstancesController {

    @Autowired
    private DiscoveryClient eurekaConsumer;

    @RequestMapping("/")
    public List<String>  index() {
        return eurekaConsumer.getServices();
    }

    @RequestMapping("/instance")
    public String  instance() {
        return eurekaConsumer.getInstances(null).toString();
    }
}
