package com.bvr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bvr.util.FeignServiceUtil;

@RestController
@RequestMapping("/feigndemo")
public class FeignController {

	public FeignController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	FeignServiceUtil feignServiceUtil;
	
	@GetMapping("/customer-servicename")
	public String getConstomerServiceName() {
		return feignServiceUtil.getServiceName();
	}

	
	@GetMapping("/customer-serviceaddress")
	public String getConstomerServiceAddress() {
		return feignServiceUtil.getServiceAddress();
	}
	
	@GetMapping("/customer-servicedetails")
	public String getConstomerServiceDetails() {
		return feignServiceUtil.getServiceDetails();
	}
	
}
