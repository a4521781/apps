package com.newer.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.newer.dao.JobsMapper;
import com.newer.pojo.Jobs;
import com.newer.util.Pager;

@Repository("jobsService")
public class JobsService {
	@Resource(name="jobsMapper")
	private  JobsMapper  jobsMapper;
	
	
	
	public Pager<Jobs> findJobs(
			Integer pageno,
			Integer pagesize,
			String sort,
			String order,
			String name,
			Date beginDate,
			Date endDate
			){
		
		Pager<Jobs> pager = new Pager<Jobs>();
		pager.setRows(jobsMapper.findJobs(pageno, pagesize, sort, order, name, beginDate, endDate));
		pager.setTotal(jobsMapper.TotalJobs(name, beginDate, endDate));
		return pager;
	}
	
	public  int add(Jobs  jobs){
		return jobsMapper.add(jobs);
	}
		
	
	public    int modify(Jobs  jobs){
		return jobsMapper.modify(jobs);
	}
		
		
	public 	int remove(Integer jid){
		return jobsMapper.remove(jid);
	}
		
	
	public 	Jobs findById(Integer jid){
		return jobsMapper.findById(jid);
	}
}
