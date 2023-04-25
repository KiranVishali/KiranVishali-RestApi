package com.SuperMarket.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Market {
	@Id
	private int billid;
	private String prname;
	private int pramt;
	private String custname;
	
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public String getPrname() {
		return prname;
	}
	public void setPrname(String prname) {
		this.prname = prname;
	}
	public int getPramt() {
		return pramt;
	}
	public void setPramt(int pramt) {
		this.pramt = pramt;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	

}
