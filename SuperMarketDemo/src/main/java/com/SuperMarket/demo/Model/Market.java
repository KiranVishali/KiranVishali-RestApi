package com.SuperMarket.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Market {
	@Id
	private int billid;
	private String productname;
	private int productamount;
	private String custname;
	
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public String getPrname() {
		return productname;
	}
	public void setPrname(String prname) {
		this.productname = prname;
	}
	public int getPramt() {
		return productamount;
	}
	public void setPramt(int pramt) {
		this.productamount = pramt;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	

}
