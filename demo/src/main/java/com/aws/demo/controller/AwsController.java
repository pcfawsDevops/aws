package com.aws.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

	
	@RequestMapping(value="/hello")
	public String HelloWorld()
	{
		System.out.println("Hello World");
		
		return "Hello World";
	}

	
}
