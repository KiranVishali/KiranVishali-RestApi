package com.SuperMarket.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperMarket.demo.Model.MarketLogin;
import com.SuperMarket.demo.Repository.MarketLoginrep;

@Service
public class MarketLoginser {
	@Autowired
	private MarketLoginrep lrepo;
	public String checkLogin(String productname,String productdetails)
	{
		MarketLogin user = lrepo.findByproductname(productname);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getProductdetails().equals(productdetails))
			{
				return "LoginSuccessfully";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public MarketLogin addUser(MarketLogin cl)
	{
		return lrepo.save(cl);
	}
	public List<MarketLogin> getUser()
	{
		return lrepo.findAll();
	}
	public MarketLogin putUser(MarketLogin cl)
	{
		return lrepo.save(cl);
	}

}
