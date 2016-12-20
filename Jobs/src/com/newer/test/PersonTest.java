package com.newer.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newer.pojo.Person;
import com.newer.service.PersonService;


public class PersonTest {

	private PersonService personService;
	
	
	
	
	
	
	@Test
	public void addPerson(){
		Person p =new Person();
		p.setPid(11);
		p.setPnamejper("李四");
		p.setPwd("666");
		int count=personService.addPerson(p);
		System.out.println(count);
	}
	
	@Test
	public void modifyPerson(){
		Person p =new Person();
		p.setPid(6);
		p.setPnamejper("李四");
		p.setSchool("kkjkjljk");
		p.setPwd("888");
		p.setPname("asdasd");
		p.setBirthday(new Date());
		p.setCode("3333");
		p.setComputer("sfsefsd");
		p.setEdu("asdasd");
		p.setEmailp("asdasd");
		p.setExperience("asdasd");
		p.setLanguage("asdasd");
		p.setLanlevel("asdas");
		p.setLocation("aaaaaaaaaa");
		p.setPphone("asdasdasd");
		p.setZchen("asdasd");
		p.setWorkyears(1);
		p.setMajor("asdasd");
		p.setMarry("asddd");
		p.setMandarin("asdasd");
		p.setSpecial("asdasd");
		p.setWorkyears(7);
		p.setQjob("jgjhgh");
		p.setSalary(675675d);
		p.setSpecial("kuhk");
		p.setPaddreess("kjk");
		p.setPclick(5);
		p.setPdate(new Date());
		p.setMzhu("yy");
		p.setMarry("kj");
		p.setPolitics("kjhjk");
		p.setZchen("jjj");
		int count=personService.modifyPerson(p);
		System.out.println(count);
	}
	
	@Test
	public void findId(){
		System.out.println(personService.findByPersonId(6).getPnamejper());
	}
	
	@Test
	public void remove(){
		int count=personService.removePerson(6);
		System.out.println(count);
	}
	
	@SuppressWarnings("resource")
	@Before
	public void init(){
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		personService=ctx.getBean("personService",PersonService.class);
	}
}
