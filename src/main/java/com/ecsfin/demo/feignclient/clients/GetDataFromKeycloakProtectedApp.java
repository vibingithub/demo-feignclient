package com.ecsfin.demo.feignclient.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecsfin.demo.feignclient.config.OAuthFeignConfig;

@FeignClient(name = "getDataFromKeycloakProtectedApp", url = "http://localhost:9000", configuration = OAuthFeignConfig.class)
public interface GetDataFromKeycloakProtectedApp{
	
	@GetMapping("/demo/v1")
	public String getProtectedData();

}
