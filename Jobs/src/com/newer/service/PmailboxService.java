package com.newer.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.newer.dao.PmailboxMapper;
import com.newer.pojo.Pfavorite;
import com.newer.pojo.Pmailbox;
import com.newer.util.Pager;

@Service("pmailboxService")
public class PmailboxService {

	
	@Resource(name="pmailboxMapper")
	private PmailboxMapper pmailboxMapper;
	

	
	public Pager<Pmailbox> findPmailbox(
			Integer pageno,
			Integer pagesize,
			String sort,
			String order,
			String name,
			Date beginDate,
			Date endDate
			){
		Pager<Pmailbox> page=new Pager<Pmailbox>();
		page.setRows(pmailboxMapper.findPmailbox(pageno, pagesize, sort, order, name, beginDate, endDate));
		page.setTotal(pmailboxMapper.findTotalP(name, beginDate, endDate));
		return page;
	}
	
	public int addPmailbox(Pmailbox pmailbox){
		 return pmailboxMapper.addPmailbox(pmailbox);
	 }
	
	public  int modifyPmailbox(Pmailbox pmailbox){
		 return pmailboxMapper.modifyPmailbox(pmailbox);
	 }
	 
	
	public  int removePmailbox(Integer id){
		 return pmailboxMapper.removePmailbox(id);
	 }
	
	
	public  Pmailbox findPmailboxId(Integer id){
		 return pmailboxMapper.findPmailboxId(id);
	 }
	
	
}
