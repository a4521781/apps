package com.newer.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newer.pojo.Companyjob;
import com.newer.service.CompanyjobService;


public class CompanyjobTest {
	private CompanyjobService companyjobService;
	
	 @Before
	   public void init(){
		   ApplicationContext  ctx=
				   new ClassPathXmlApplicationContext("applicationContext.xml");
		   companyjobService=ctx.getBean("companyjobService",CompanyjobService.class);
	   }

	   @Test
	   public void add(){
		   Companyjob companyjob= new     Companyjob();
		   companyjob.setCnamejob("张三");
		   companyjob.setPwd("111");
		   companyjob.setCname("佳洁士有限公司");
		   companyjob.setTrade("贸易公司");
		   companyjob.setCtype("民营");
		   companyjob.setFund(5555);
		   companyjob.setCdate(new Date());
		   companyjob.setAddress("长沙");
		   companyjob.setZip("334445");
		   companyjob.setNamec("宇智波");
		   companyjob.setPhone("12322334444");
		   companyjob.setEmail("liuli@qq.com");
		   companyjob.setChttp ("www.baidu.com");
		   companyjob.setSummary("全球五百强");
		   companyjob.setClicks(300);
		   companyjobService.add(companyjob);
	   }
	   
	   @Test
	   public void findeById(){
		   Companyjob companyjob=companyjobService.findById(3);
		   System.out.println(companyjob.getCname());
	   }
	   
	   
	   @Test
	   public void find(){
		   for(Companyjob c : companyjobService.find()){
			   System.out.println(c.getCname());
		   }
	   }
	   
	   
	   @Test
	   public void modify(){
		   Companyjob companyjob=companyjobService.findById(3);
		   companyjob.setPwd("111");
		   System.out.println(companyjob.getPwd());
	   }
	   
	   @Test
	   public void delete(){
		 companyjobService.remove(4);
	   }
	   
	   
}
