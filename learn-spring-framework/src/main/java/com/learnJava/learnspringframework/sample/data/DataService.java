package com.learnJava.learnspringframework.sample.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService{
	
	public List<Integer> retriveData(){
		return Arrays.asList(1,3,44,65,666);
	}
	
}