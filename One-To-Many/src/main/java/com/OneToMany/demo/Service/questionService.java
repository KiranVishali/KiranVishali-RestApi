package com.OneToMany.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OneToMany.demo.Model.Question;
import com.OneToMany.demo.Repository.questionRepository;

@Service
public class questionService {
	@Autowired
	public questionRepository obj;
	public Question addStudent(Question smodel)
	{
		return obj.save(smodel);
	}
	public List<Question> getStudent()
	{
		return obj.findAll();
	}
	public Question putData(Question smodel)
	{
		return obj.saveAndFlush(smodel);
	}
	public void deletedata(int studentid)
	{
		obj.deleteById(studentid);
	}

}
