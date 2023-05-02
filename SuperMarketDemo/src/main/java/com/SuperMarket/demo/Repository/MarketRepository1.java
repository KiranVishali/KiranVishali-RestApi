package com.SuperMarket.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.SuperMarket.demo.Model.Market;
@RestController
@Repository
public interface MarketRepository1 extends JpaRepository<Market,Integer> {

}
