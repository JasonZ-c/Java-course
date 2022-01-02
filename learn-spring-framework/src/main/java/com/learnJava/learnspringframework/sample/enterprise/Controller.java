package com.learnJava.learnspringframework.sample.enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnJava.learnspringframework.sample.business.BusinessService;

@RestController
// sending response in the right format
public class Controller {
	//"/sum"=>100
	@Autowired
	private BusinessService businessservice;
	
	@GetMapping("/sum")
	public long displaySum() {
		return businessservice.calcuSum();
	}

}

//business logic



//getting data

