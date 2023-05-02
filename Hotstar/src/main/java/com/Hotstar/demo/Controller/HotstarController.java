package com.Hotstar.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hotstar.demo.Model.Hotstar;
import com.Hotstar.demo.Service.HotstarService;

@RestController
public class HotstarController {
	@Autowired
	public HotstarService serobj;
	
	@PostMapping("/post")
	public Hotstar addDetails(@RequestBody Hotstar obj)
	{
		return serobj.saveInfo(obj);
	}
	@GetMapping("/get")
	public List<Hotstar> getAllHotstar()
	{
		List<Hotstar>Hotstarlist=serobj.getAllHotstar();
		return Hotstarlist;
	}
	@PutMapping("/put")
	public Hotstar updateDetails(@RequestBody Hotstar hts)
	{
		return serobj.updateInfo(hts);
	}
	@DeleteMapping("/delete/{acn}")
	public String deleteDetails(@PathVariable ("acn") int acno)
	{
		serobj.deleteInfo(acno);
		return "Account Number" + acno + " is deleted";
	}

}
