package com.SuperMarket.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SuperMarket.demo.Model.Market;
import com.SuperMarket.demo.Service.MarketService;

@RestController
public class MarketController {
	@Autowired
	private MarketService serobj;
	@PostMapping("/pk")
	public Market addDetails(@RequestBody Market obj)
	{
		return serobj.SaveInfo(obj);
	}
	@GetMapping(value="/SM")
	public List<Market>getAllMarket()
	{
		List<Market>Marketlist=serobj.getAllMarket();
		return Marketlist;
	}
	@PutMapping("/put")
		public Market updateDetails(@RequestBody Market idno)
		{
			return serobj.updateInfo(idno);

		}
	@DeleteMapping("/delete/{billid}")
	public String deleteDetails(@PathVariable ("billid") int bino)
	{
		serobj.deleteInfo(bino);
		return " Bill Id " + bino + " is deleted ";
	}

}