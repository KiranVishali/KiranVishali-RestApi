package com.SuperMarket.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Market {
	@Id
	private int billid;
	private String productname;
	private String productamount;
	private String customername;
	
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductamount() {
		return productamount;
	}
	public void setProductamount(String productamount) {
		this.productamount = productamount;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	

}
