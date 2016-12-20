package com.newer.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.newer.dao.PersonMapper;
import com.newer.pojo.Person;

@Service("personService")
public class PersonService {

	
	@Resource(name="personMapper")
	private PersonMapper personMapper;
	
	
	public int addPerson(Person person){
		return personMapper.addPerson(person);
	}
	
	public int modifyPerson(Person person){
		return personMapper.modifyPerson(person);
	}
	
	public int removePerson(Integer id){
		return personMapper.removePerson(id);
	}
	
	 public Person findByPersonId(Integer id){
		 return personMapper.findByPersonId(id);
	 }
	
	 public List<Person> findPerson(){
		 return personMapper.findPerson();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
