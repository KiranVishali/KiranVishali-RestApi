package com.SuperMarket.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SuperMarket.demo.Model.MarketLogin;
import com.SuperMarket.demo.Service.MarketLoginser;

@RestController
@RequestMapping("/customer")
public class MarketLogincon {
	@Autowired
	private MarketLoginser lser;
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String productname=loginData.get("productname");
		String productdetails=loginData.get("productdetails");
		String result=lser.checkLogin(productname, productdetails);
		return result;
	}
	@PutMapping("/put")
	public MarketLogin putUser(@RequestBody MarketLogin cl)
	{
		return lser.putUser(cl);
	}
	@PostMapping("/add")
	public MarketLogin AddUser(@RequestBody MarketLogin cl)
	{
		return lser.addUser(cl);
	}
	@GetMapping
	public List<MarketLogin> listAll()
	{
		return lser.getUser();
	}

}
