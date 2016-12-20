package com.newer.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.newer.pojo.Jobs;
import com.newer.pojo.Pmailbox;
 

@Repository("jobsMapper")
public interface JobsMapper {
	
	List<Jobs> findJobs(
			@Param("pageno")Integer pageno,
			@Param("pagesize")Integer pagesize,
			@Param("sort")String sort,
			@Param("order")String order,
			@Param("name")String name,
			@Param("beginDate")Date beginDate,
			@Param("endDate")Date endDate
			);
	
	int TotalJobs(
			@Param("name")String name,
			@Param("beginDate")Date beginDate,
			@Param("endDate")Date endDate
			);

	@Insert( "insert into JOBS(JID,JNAME,JDATE,NUM,LOCATION,DESCRIPTION,REQUIREMENT,CID,SAL)"
			+  " values(#{jid},#{jname},#{jdate},#{num},#{location},#{description},#{requirement},#{companyjob.cid},#{sal})" )
	@SelectKey(statement = "select jobs_jid.Nextval  from DUAL", keyProperty = "jid",
	 resultType = int.class, before = true)
     int add(Jobs  jobs);
	
	@Update( "update JOBS set JNAME=#{jname,jdbcType=VARCHAR},JDATE=#{jdate,jdbcType=DATE},NUM=#{num,jdbcType=INTEGER},LOCATION=#{location,jdbcType=VARCHAR},DESCRIPTION=#{description,jdbcType=VARCHAR}"
	+",REQUIREMENT=#{requirement,jdbcType=VARCHAR},CID=#{companyjob.cid,jdbcType=INTEGER},SAL=#{sal,jdbcType=DOUBLE} where JID=#{jid}")
    int modify(Jobs  jobs);
	
	@Delete("delete from JOBS where JID=#{jid}")
	int remove(Integer jid);
	
//	@Select(" select * from JOBS "
//    +" where JID=#{jid}")
	Jobs findById(Integer jid);
}
