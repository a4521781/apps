package com.newer.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newer.pojo.Companyjob;
import com.newer.pojo.Person;
import com.newer.pojo.Pfavorite;
import com.newer.service.CompanyjobService;
import com.newer.service.PersonService;
import com.newer.service.PfavoriteService;
import com.newer.util.Pager;


public class PfavoriteTest {
private PfavoriteService pfavoriteService;


@Test
public void addPfavorite(){

	Companyjob companyjob=new Companyjob();
	companyjob.setCid(2);
	Person person=new Person();
	person.setPid(3);
	Pfavorite pf=new Pfavorite();
	pf.setRid(1);
	pf.setCompanyjob(companyjob);
	pf.setPerson(person);
	int count=pfavoriteService.addPfavorite(pf);
	System.out.println(count);
}

@Test
public void modify(){
	Companyjob companyjob=new Companyjob();
	companyjob.setCid(3);
	Person person=new Person();
	person.setPid(3);
	Pfavorite pf=new Pfavorite();
	pf.setRid(4);
	pf.setCompanyjob(companyjob);
	pf.setPerson(person);
	int count=pfavoriteService.modifyPfavorite(pf);
	System.out.println(count);
}


@Test
public void find(){
	Pfavorite p=pfavoriteService.findPfavoriteId(2);	 
	System.out.println(p.getRid()+","+p.getCompanyjob().getCid()+","+p.getPerson().getPid());
}

@Test
public void find1(){
	Integer page = 1;
	Integer rows=2;
	String sort="rid";
	String order= "asc";
	
	Integer pageno=(page-1)*rows;
	Integer pagesize=page*rows;

	Pager<Pfavorite> pager=pfavoriteService.findPfavorite(pageno, pagesize, sort, order);
	System.out.println(pager.getTotal());
	for(Pfavorite f : pager.getRows()){
		System.out.println(f.getRid()+""+f.getCompanyjob()+""+f.getPerson());
	}
}
@SuppressWarnings("resource")
@Before
public void init(){
	ApplicationContext ctx=
			new ClassPathXmlApplicationContext("applicationContext.xml");
	pfavoriteService=ctx.getBean("pfavoriteService",PfavoriteService.class);
}
}
