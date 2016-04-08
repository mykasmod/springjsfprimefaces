package org.asmod.springjsfprimefaces.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.asmod.springjsfprimefaces.service.HelloSpringService;

@ManagedBean
public class HelloController {
	
	@ManagedProperty("#{helloSpringService}") //spring bean name
	private HelloSpringService helloSpringService; 
	
	public String showHello(){
		return helloSpringService.sayHello();
	}

	public void setHelloSpringService(HelloSpringService helloSpringService) {
		this.helloSpringService = helloSpringService;
	}
	
}
