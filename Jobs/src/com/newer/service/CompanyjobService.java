package com.newer.service;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Repository;

import com.newer.dao.CompanyjobMapper;
import com.newer.pojo.Companyjob;

@Repository("companyjobService")
public class CompanyjobService {
	@Resource(name="companyjobMapper")
	private CompanyjobMapper  companyjobMapper;
     public  int add(Companyjob companyjob){
		return  companyjobMapper.add(companyjob);
	}
	
	
	 public int modify(Companyjob companyjob){
		 return  companyjobMapper.modify(companyjob);
	 }
	
	
	 public int remove(Integer cid){
		 return  companyjobMapper.remove(cid);
	 }
	
	
	 public Companyjob findById(Integer cid){
		 return  companyjobMapper.findById(cid);
	 }
	 
	 public List<Companyjob> find(){
		 return  companyjobMapper.find();
	 }
}
