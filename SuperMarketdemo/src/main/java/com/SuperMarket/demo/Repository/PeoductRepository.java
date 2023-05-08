package com.SuperMarket.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperMarket.demo.Model.Product;

@Repository
public interface PeoductRepository extends JpaRepository<Product,Long>{

}
