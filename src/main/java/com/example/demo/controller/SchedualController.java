package com.example.demo.controller;

import com.example.demo.inter.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/2/26.
 */
@RestController
public class SchedualController {
    @Autowired
    ScheduleService scheduleService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){
        return scheduleService.sayHiFromClientOne();
    }
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return " feign";
    }
}
