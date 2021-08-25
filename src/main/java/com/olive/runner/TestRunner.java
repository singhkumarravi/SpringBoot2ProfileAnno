package com.olive.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.service.AlertService;
@Component
public class TestRunner implements CommandLineRunner{
	@Autowired()
	private AlertService service;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application started...");
		service.save();
	}

}
