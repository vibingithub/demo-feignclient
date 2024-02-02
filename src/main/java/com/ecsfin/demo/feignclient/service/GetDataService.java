package com.ecsfin.demo.feignclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecsfin.demo.feignclient.clients.GetDataFromKeycloakProtectedApp;

@Service
public class GetDataService {
	
	@Autowired
	GetDataFromKeycloakProtectedApp getDataFromKeycloakProtectedApp;
	
	public String getDataService() {
		return getDataFromKeycloakProtectedApp.getProtectedData();
	}
	
}
