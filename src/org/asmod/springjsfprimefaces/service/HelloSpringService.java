package org.asmod.springjsfprimefaces.service;

import org.springframework.stereotype.Service;

@Service
public class HelloSpringService {
	public String sayHello(){
		return "Hello from Spring Service!";
	}
}
