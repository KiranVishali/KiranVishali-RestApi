package com.SuperMarket.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MarketLogin {
	@Id
	private int billid;
	private String customername;
	private String productname;
	private int productprice;
	private String productdiscount;
	private String productdetails;
	private String marketaddress;
	private String billdate;
	private String billday;
	
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	public String getProductdiscount() {
		return productdiscount;
	}
	public void setProductdiscount(String productdiscount) {
		this.productdiscount = productdiscount;
	}
	public String getProductdetails() {
		return productdetails;
	}
	public void setProductdetails(String productdetails) {
		this.productdetails = productdetails;
	}
	public String getMarketaddress() {
		return marketaddress;
	}
	public void setMarketaddress(String marketaddress) {
		this.marketaddress = marketaddress;
	}
	public String getBilldate() {
		return billdate;
	}
	public void setBilldate(String billdate) {
		this.billdate = billdate;
	}
	public String getBillday() {
		return billday;
	}
	public void setBillday(String billday) {
		this.billday = billday;
	}
	

}
