package com.ecsfin.demo.feignclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecsfin.demo.feignclient.service.GetDataService;

@RestController
@RequestMapping("/v1")
public class DemoController {
	
	@Autowired
	GetDataService getDataService;

	@GetMapping("/getData")
	public String getDatafromProtectedServer() {
		return getDataService.getDataService();
	}
}
