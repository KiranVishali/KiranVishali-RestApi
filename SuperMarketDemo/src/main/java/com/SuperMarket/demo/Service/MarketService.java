package com.SuperMarket.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperMarket.demo.Model.Market;
import com.SuperMarket.demo.Repository.MarketRepository1;

@Service
public class MarketService {
	@Autowired
	public MarketRepository1 repobj;
	
	public Market SaveInfo( Market obj)
	{
		return repobj.save(obj);
	}
	public List<Market> getAllMarket()
	{
		List<Market> marketList=repobj.findAll();
		return marketList;
	}
	public Market updateInfo(Market dataK)
	{
		return repobj.saveAndFlush(dataK);
	}
	public void deleteInfo(int billid)
	{
		repobj.deleteById(billid);
	}

}
