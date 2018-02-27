package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/2/22.
 */
@EnableEurekaClient
@RestController     //等同于同时加上了@Controller和@ResponseBody
public class HelloController {

   @Value("${server.port}")
   private String port;
    @Value("${girl.name}")
    private String name;
    //访问/hello或者/hi任何一个地址，都会返回一样的结果
    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        return "hi you!rfrfrfrfrfr!!"+port;
    }
}
