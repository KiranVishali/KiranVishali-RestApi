package com.Hotstar.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotstar.demo.Model.Hotstar;

@Repository
public interface HotstarRepository extends JpaRepository<Hotstar,Integer> {

}
