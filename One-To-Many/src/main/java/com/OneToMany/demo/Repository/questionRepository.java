package com.OneToMany.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToMany.demo.Model.Question;

public interface questionRepository extends JpaRepository<Question,Integer>{

}
