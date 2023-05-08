package com.SuperMarket.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.SuperMarket.demo.Model.Market;

public interface MarketRepository extends JpaRepository<Market,Integer>{
	@Query("select s from Market s where s.productamount=?1 and s.productname=?2")
	public List<Market>getMarketByProductamount(String productamount,String productname);
	@Query("select s from Market s where s.productamount=:productamount")
	public List<Market>getMarketByProductamount(String productamount);
	@Modifying
	@Query("delete from Market s where s.productname=?1")
    public int deleteMarketByProductname(String productname);
    @Modifying
    @Query("update Market s set s.productamount=?1 where s.productname=?2 ")
    int updateMarket(String productamount,String productname);

    @Query(value="select*from Market s where s.customername=?1",nativeQuery=true)
	public List<Market>fetchMarketByCustomername(String customername);
	
	List<Market> findByProductnameStartingWith(String prefix);
    List<Market> findByProductnameEndingWith(String suffix);
    List<Market> findByCustomername(String customername);

}
