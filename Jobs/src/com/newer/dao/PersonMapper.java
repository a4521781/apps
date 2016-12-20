package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.newer.pojo.Person;


@Repository("personMapper")
public interface PersonMapper {

	@Insert("insert into PERSON (PID,PNAMEJPER,PWD,PNAME,CODE,MZHU,MARRY,POLITICS,ZCHEN,BIRTHDAY,EDU,SCHOOL,MAJOR,LANGUAGE,LANLEVEL,MANDARIN,COMPUTER,WORKYEARS,EXPERIENCE,QJOB,LOCATION,SALARY,SPECIAL,PPHONE,EMAILP,PADDREESS,PCLICK,PDATE)"+
			" values(#{pid},#{pnamejper,jdbcType=VARCHAR},#{pwd,jdbcType=VARCHAR},#{pname,jdbcType=VARCHAR},#{code,jdbcType=VARCHAR},#{mzhu,jdbcType=VARCHAR},#{marry,jdbcType=VARCHAR},#{politics,jdbcType=VARCHAR},#{zchen,jdbcType=VARCHAR},#{birthday,jdbcType=DATE},#{edu,jdbcType=VARCHAR},#{school,jdbcType=VARCHAR},#{major,jdbcType=VARCHAR},#{language,jdbcType=VARCHAR},#{lanlevel,jdbcType=VARCHAR},#{mandarin,jdbcType=VARCHAR},#{computer,jdbcType=VARCHAR},#{workyears,jdbcType=INTEGER},#{experience,jdbcType=VARCHAR},#{qjob,jdbcType=VARCHAR},#{location,jdbcType=VARCHAR},#{salary,jdbcType=FLOAT},#{special,jdbcType=VARCHAR},#{pphone,jdbcType=VARCHAR},#{emailp,jdbcType=VARCHAR},#{paddreess,jdbcType=VARCHAR},#{pclick,jdbcType=INTEGER},#{pdate,jdbcType=DATE})")
	@SelectKey(statement="select person_pid.nextval from DUAL",keyProperty="pid",resultType=int.class,before=true)
	int addPerson(Person person);
	
	@Update("update PERSON set PNAMEJPER=#{pnamejper,jdbcType=VARCHAR},PWD=#{pwd,jdbcType=VARCHAR},PNAME=#{pname,jdbcType=VARCHAR},CODE=#{code,jdbcType=VARCHAR},MZHU=#{mzhu,jdbcType=VARCHAR},MARRY=#{marry,jdbcType=VARCHAR},POLITICS=#{politics,jdbcType=VARCHAR},ZCHEN=#{zchen,jdbcType=VARCHAR},BIRTHDAY=#{birthday,jdbcType=DATE},EDU=#{edu,jdbcType=VARCHAR},SCHOOL=#{school,jdbcType=VARCHAR},MAJOR=#{major,jdbcType=VARCHAR},LANGUAGE=#{language,jdbcType=VARCHAR},LANLEVEL=#{lanlevel,jdbcType=VARCHAR},MANDARIN=#{mandarin,jdbcType=VARCHAR},COMPUTER=#{computer,jdbcType=VARCHAR},WORKYEARS=#{workyears,jdbcType=INTEGER},EXPERIENCE=#{experience,jdbcType=VARCHAR},QJOB=#{qjob,jdbcType=VARCHAR},LOCATION=#{location,jdbcType=VARCHAR},SALARY=#{salary,jdbcType=FLOAT},SPECIAL=#{special,jdbcType=VARCHAR},PPHONE=#{pphone,jdbcType=VARCHAR},EMAILP=#{emailp,jdbcType=VARCHAR},PADDREESS=#{paddreess,jdbcType=VARCHAR},PCLICK=#{pclick,jdbcType=INTEGER},PDATE=#{pdate,jdbcType=DATE} where PID=#{pid}")
	int modifyPerson(Person person);
	
	@Delete("delete from PERSON where PID=#{pid}")
	int removePerson(Integer id);
	
	@Select("select PID,PNAMEJPER,PWD,PNAME,CODE,MZHU,MARRY,POLITICS,ZCHEN,BIRTHDAY,EDU,SCHOOL,MAJOR,LANGUAGE,LANLEVEL,MANDARIN,COMPUTER,WORKYEARS,EXPERIENCE,QJOB,LOCATION,SALARY,SPECIAL,PPHONE,EMAILP,PADDREESS,PCLICK,PDATE from PERSON where PID=#{pid}")
    public Person findByPersonId(Integer id);

    @Select("select PID,PNAMEJPER,PWD,PNAME,CODE,MZHU,MARRY,POLITICS,ZCHEN,BIRTHDAY,EDU,SCHOOL,MAJOR,LANGUAGE,LANLEVEL,MANDARIN,COMPUTER,WORKYEARS,EXPERIENCE,QJOB,LOCATION,SALARY,SPECIAL,PPHONE,EMAILP,PADDREESS,PCLICK,PDATE from PERSON")
    public List<Person> findPerson();
}
