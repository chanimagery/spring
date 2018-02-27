package com.example.demo.hystric;

import com.example.demo.inter.ScheduleService;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2018/2/26.
 */
@Component
public class SchedualServiceHystric implements ScheduleService {

    @Override
    public String sayHiFromClientOne() {
        return "sorry ";
    }
}
