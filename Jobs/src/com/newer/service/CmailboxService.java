package com.newer.service;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.newer.dao.CmailboxMapper;
import com.newer.pojo.Cmailbox;
import com.newer.pojo.Companyjob;
import com.newer.util.Pager;


@Repository("cmailboxService")
public class CmailboxService {
 @Resource(name="cmailboxMapper")
 private  CmailboxMapper  cmailboxMapper;
 
  public   int add(Cmailbox cmailbox){
	  return  cmailboxMapper.add(cmailbox);
  }
	

  public  int modify(Cmailbox cmailbox){
	  return  cmailboxMapper.modify(cmailbox);
  }
	
	
  public	int remove(Integer mid){
     return  cmailboxMapper.remove(mid);
  }
	
	
  public	Cmailbox findById(Integer mid){
	  return  cmailboxMapper.findById(mid);
  }
   
  public Pager<Cmailbox> list(Integer pageno, Integer pagesize, String sort, String order, String sendname, Date beginDate,
	      Date endDate) {
	    Pager<Cmailbox> pager = new Pager<Cmailbox>();
	    pager.setRows(cmailboxMapper.findPager(pageno, pagesize, sort, order, sendname, beginDate, endDate));
	    pager.setTotal(cmailboxMapper.findTotal(sendname, beginDate, endDate));
	    return pager;
	  }
}
