package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Student;

@RestController
@RequestMapping("/consumer")
public class StudentConsumerController {
	String baseUrl="http://localhost:9090/students";
	@Autowired
	RestTemplate restTemplate;
	@GetMapping("/retreiveData")
	public List<Student> getData()
	{
	Student arr[]=restTemplate.getForObject(baseUrl+"/retreive", Student[].class);
	return  Arrays.asList(arr);
	}
	

}
