package org.asmod.springjsfprimefaces.service;

import org.springframework.stereotype.Service;

@Service
public class HelloSpringService {
	public String sayHello(){
		return "ello from Spring service";
	}
}
