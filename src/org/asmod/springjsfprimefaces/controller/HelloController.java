package org.asmod.springjsfprimefaces.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.asmod.springjsfprimefaces.service.HelloSpringService;

@ManagedBean //HelloController is created by JSF runtime
public class HelloController {
	
	@ManagedProperty("#{helloSpringService}") //inject a value into helloSpringService property
	private HelloSpringService helloSpringService; 
	
	public String showHello(){
		return helloSpringService.sayHello();
	}

	public void setHelloSpringService(HelloSpringService helloSpringService) {
		this.helloSpringService = helloSpringService;
	}
	
}
