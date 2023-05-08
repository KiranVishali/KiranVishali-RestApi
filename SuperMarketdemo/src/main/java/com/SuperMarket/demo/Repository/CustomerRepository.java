package com.SuperMarket.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SuperMarket.demo.Model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
	@Query(value="select c from Customer c join c.product p")
	List<Customer>getCustomer();

}
