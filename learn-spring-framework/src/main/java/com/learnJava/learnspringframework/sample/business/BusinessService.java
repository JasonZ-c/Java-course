package com.learnJava.learnspringframework.sample.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learnJava.learnspringframework.sample.data.DataService;

@Component
public class BusinessService{
	@Autowired
	private DataService dataService;
	public long calcuSum() {
		List<Integer> data = dataService.retriveData();
		return data.stream().reduce(Integer::sum).get();
	}
	
	//@Autowired
	//public long calcSum() {
	//	List<Integer> data = DataService.retriveData();
	//	return data.stream().reduce(Integer::Sum).get();
	//}
	
}