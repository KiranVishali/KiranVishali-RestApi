package com.Hotstar.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotstar.demo.Model.Hotstar;
import com.Hotstar.demo.Repository.HotstarRepository;

@Service
public class HotstarService {
	@Autowired
	public HotstarRepository repobj;
	
	public Hotstar saveInfo(Hotstar obj) 
	{
		return repobj.save(obj);
	}
	public List<Hotstar> getAllHotstar()
	{
		List<Hotstar>Hotstarlist=repobj.findAll();
		return Hotstarlist;
	}
	public Hotstar updateInfo(Hotstar up)
	{
		return repobj.saveAndFlush(up);
	}
	public void deleteInfo(int acn)
	{
		repobj.deleteById(acn);
	}

}
