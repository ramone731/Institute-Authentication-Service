package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.demo.model.Student;
import com.example.demo.model.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentRepository studentrep;
	@GetMapping("/retreive")
	public List<Student> retreiveData()
	{
		return studentrep.findAll();
	}
	@GetMapping("/retreive/{studentid}")
	public Student retreive(@PathVariable("studentid") int id)
	{
		Student sobj=null;
		Optional<Student> studentdata=studentrep.findById(id);
		if(studentdata!=null)
		{
			sobj=studentdata.get();
		}
		return sobj;
	}
	@PostMapping("/insert")
	public Student insertData(@RequestBody Student s)
	{
		return studentrep.save(s);
	}

}
