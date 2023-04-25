package com.example.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.entity.EmployeeEntity;
import com.example.springdemo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository obj1;
	public EmployeeEntity SaveInfo( EmployeeEntity obj5)
	{
		return obj1.save(obj5);
	}
	public List<EmployeeEntity>getAllEmployeeEntity()
	{
		List<EmployeeEntity>listobj1=obj1.findAll();
		return listobj1;
	}
	public EmployeeEntity updateInfo(EmployeeEntity data)
	{
		return obj1.saveAndFlush(data);
	}
	public void deleteInfo(int empid)
	{
		obj1.deleteById(empid);
	}

}
