package com.SuperMarket.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperMarket.demo.Model.Market;

@Repository
public interface MarketRepository1 extends JpaRepository<Market,Integer> {

}
