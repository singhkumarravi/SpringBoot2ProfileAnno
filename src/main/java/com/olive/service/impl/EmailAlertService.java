package com.olive.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.olive.service.AlertService;
@Component
@Profile("prod")
public class EmailAlertService implements AlertService {
 @Value("${my.app.data}")	
private String data;
	
	@Override
	public void save() {
	System.out.println("Email Alert Service ... data " + data);

	}

}
