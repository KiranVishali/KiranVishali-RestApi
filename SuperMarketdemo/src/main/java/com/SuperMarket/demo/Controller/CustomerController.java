package com.SuperMarket.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SuperMarket.demo.Model.Customer;
import com.SuperMarket.demo.Service.CustomerService;


@RestController
public class CustomerController {
	@Autowired
	public CustomerService cser;
	@PostMapping("/postcust")
	public Customer add(@RequestBody Customer customername)
	{
		return cser.addCustomer(customername);
	}
	@GetMapping("/getcust")
	public List<Customer> getCustomer()
	{
		return cser.getCustomer();
	}

}
