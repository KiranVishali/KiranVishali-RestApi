package com.SuperMarket.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	public Market getMarket(int billid)
	{
		Market m=repobj.findById(billid).get();
		return m;
	}
	public List<Market> sortMarket(String field) 
	{
	    return repobj.findAll(Sort.by(field));
		
	}
	public List<Market> descsortMarket(String field) 
	{
	    return repobj.findAll(Sort.by(Direction.DESC,field));
		
	}
	public Page<Market>pagingMarket(int offset,int pagesize)
	{
		Pageable paging=PageRequest.of(offset, pagesize);
		Page<Market>MarData=repobj.findAll(paging);
		return MarData;
	}
	public List<Market>pagingAndSorting(int offset,int pagesize,String field)
	{
		Pageable paging=PageRequest.of(offset, pagesize).withSort(Sort.by(field));
		Page<Market>Mar=repobj.findAll(paging);
		return Mar.getContent();
	}

}
