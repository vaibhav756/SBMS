package com.feign.inter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="EUREKA-CLIENT-GREET-API")
public interface GreetFeignClient {

	@GetMapping("/getmsg")
	public String invokeGreetApi();
	
}
