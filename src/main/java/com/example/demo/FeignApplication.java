package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix  //熔断
@EnableHystrixDashboard
@EnableCircuitBreaker

class FeignApplication {

	public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
	}
}
