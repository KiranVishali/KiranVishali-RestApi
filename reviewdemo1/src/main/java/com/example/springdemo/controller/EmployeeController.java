package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.entity.EmployeeEntity;
import com.example.springdemo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService obj;
	@PostMapping("/save")
	public EmployeeEntity addDetails(@RequestBody EmployeeEntity obj5)
	{
		return obj.SaveInfo(obj5);
	}
	@GetMapping(value="/fetch")
	public List<EmployeeEntity>getAllEmployeeEntity()
	{
		List<EmployeeEntity>listobj=obj.getAllEmployeeEntity();
		return listobj;
	}
	@PutMapping("/pk")
	public EmployeeEntity updateDetails(@RequestBody EmployeeEntity ee)
	{
		return obj.updateInfo(ee);
	}
	@DeleteMapping("/delete/{empid}")
	public String deleteDetails(@PathVariable("empid") int eid)
	{
		obj.deleteInfo(eid);
		return " Employee Id " + eid + " is deleted ";
	}

}
