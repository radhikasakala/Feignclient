package com.springcloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.annotation.FilteredEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;



@SpringBootApplication		// This annotation boostraps and auto-configure the application.
@EnableDiscoveryClient		// This annotation lists the application on the eureka server.
@EnableFeignClients 		// This annotation enables feign client.
@EnableCircuitBreaker		// This annotation enables the circuit breaker for the microservice.
@RibbonClient(name = "m1-service")
public class Springfeignclient {

	public static void main(String[] args) {
		SpringApplication.run(Springfeignclient.class, args);
	}
}