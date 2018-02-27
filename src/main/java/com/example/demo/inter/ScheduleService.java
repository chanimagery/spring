package com.example.demo.inter;

        import com.example.demo.hystric.SchedualServiceHystric;
        import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
        import org.springframework.cloud.netflix.feign.FeignClient;
        import org.springframework.stereotype.Service;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lenovo on 2018/2/26.
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHystric.class)
public interface ScheduleService {
    //@RequestMapping(value = "/hi", method = RequestMethod.GET)
    @GetMapping(value = "/springboot/hi")
     String sayHiFromClientOne() ;
}
