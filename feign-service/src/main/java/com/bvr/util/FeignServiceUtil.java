package com.bvr.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feigndemo",url="http://localhost:8081/user")
public interface FeignServiceUtil {

	@GetMapping("/servicename")
	String getServiceName();
	
	@GetMapping("/serviceaddress")
	String getServiceAddress();
	
	@GetMapping("/servicedetails")
	String getServiceDetails();
	
	
	
}
