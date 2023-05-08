package com.SuperMarket.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SuperMarket.demo.Model.Market;
import com.SuperMarket.demo.Service.MarketService;

@RestController
public class MarketController {
	@Autowired
	private MarketService serobj;
	@PostMapping("/post")
	public Market addDetails(@RequestBody Market obj)
	{
		return serobj.SaveInfo(obj);
	}
	@GetMapping("/get")
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
	@DeleteMapping("/del")
	public String deleteByRequest(@RequestParam ("billid") int bino)
	{
		serobj.deleteInfo(bino);
		return " Bill Id " + bino + " is deleted ";
	}
	@GetMapping("/getMarket/{billid}")
	public Market getMarket(@PathVariable("billid") int billid)
	{
		return serobj.getMarket(billid);
	}
	@GetMapping("/sortMarket/{field}")
	public List<Market> sortMarket(@PathVariable String field)
	{
		return serobj.sortMarket(field);
	}
	@GetMapping("/descsortMarket/{field}")
	public List<Market> descsortMarket(@PathVariable String field)
	{
		return serobj.descsortMarket(field);
	}
	@GetMapping("/paging/{offset}/{pagesize}")
	public Page<Market> pagingMarket(@PathVariable ("offset") int offset,@PathVariable("pagesize") int pagesize)
	{
		return serobj.pagingMarket(offset,pagesize);
	}
	@GetMapping("/pagingAndSorting/{offset}/{pagesize}/{field}")
	public List<Market> pagingAndSorting(@PathVariable ("offset") int offset,@PathVariable("pagesize") int pagesize,@PathVariable("field") String field)
	{
		return serobj.pagingAndSorting(offset,pagesize,field);
	}
	@GetMapping("/fetchMarketByProductnamePrefix/{prefix}")
	public List<Market>fetchMarketByProductnamePrefix(@PathVariable String prefix)
	{
		return serobj.fetchMarketByProductnamePrefix(prefix);
	}
	@GetMapping("/fetchMarketByProductnameSuffix/{suffix}")
	public List<Market>fetchMarketByProductnameSuffix(@PathVariable String suffix)
	{
		return serobj.fetchMarketByProductnameSuffix(suffix);
	}
	@GetMapping("/getMarketByProductamount/{productamount}/{productname}")
	public List<Market>fetchMarketByProductamount(@PathVariable String productamount,@PathVariable String productname)
	{
		return serobj.getMarketByProductamount(productamount,productname);
	}
	@DeleteMapping("/deletebyquery/{productname}")
	public String deleteMarketByProductname(@PathVariable("productname") String productname)
	{
		int result=serobj.deleteMarketByProductname(productname);
		if(result>0)
			return "Product record deleted";
		else
			return "Problem occured while deleting";
	}
	@PutMapping("/updatebyquery/{productamount}/{productname}")
	public String updateMarket(@PathVariable ("productamount")String productamount,@PathVariable ("productname")String productname)
	{
		int result= serobj.updateMarket(productamount,productname);
		if(result>0)
			return "Product record updated";
		else
			return "Problem occured while updating";
	}
	@GetMapping("/fetchbycust/{customername}")
	public List<Market> fetchMarketByCustomername(@PathVariable String customername)
	{
		return serobj.fetchMarketByCustomername(customername);
	}







}
