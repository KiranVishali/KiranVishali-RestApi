package com.SuperMarket.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SuperMarket.demo.Model.MarketLogin;

public interface MarketLoginrep extends JpaRepository<MarketLogin,Integer> {
	MarketLogin findByproductname(String productname);

}
