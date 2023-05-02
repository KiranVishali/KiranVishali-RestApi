package com.Hotstar.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hotstar {
	@Id
	private int acn;
	private String aname;
	private String adate;
	
	public int getAcn() {
		return acn;
	}
	public void setAcn(int acn) {
		this.acn = acn;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
}
