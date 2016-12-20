package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.newer.pojo.Companyjob;



@Repository("companyjobMapper")
public interface CompanyjobMapper {
	@Insert( "insert into COMPANYJOB(CID,CNAMEJOB,PWD,CNAME,TRADE,CTYPE,FUND,CDATE,ADDRESS,ZIP,NAMEC,PHONE,EMAIL,CHTTP,SUMMARY,CLICKS) "
			+  " values(#{cid},#{cnamejob},#{pwd},#{cname,jdbcType=VARCHAR},#{trade,jdbcType=VARCHAR},#{ctype,jdbcType=VARCHAR},#{fund,jdbcType=INTEGER},#{cdate,jdbcType=DATE}" +
			",#{address,jdbcType=VARCHAR},#{zip,jdbcType=VARCHAR},#{namec,jdbcType=VARCHAR},#{phone,jdbcType=VARCHAR},#{email,jdbcType=VARCHAR},#{chttp,jdbcType=VARCHAR},#{summary,jdbcType=VARCHAR},#{clicks,jdbcType=INTEGER})")
	
	@SelectKey(statement = "select companyjob_cid.Nextval  from DUAL", keyProperty = "cid",
	    resultType = int.class, before = true)
     int add(Companyjob companyjob);
	
	@Update(  "update COMPANYJOB set PWD=#{pwd},ADDRESS=#{address,jdbcType=VARCHAR},NAMEC=#{namec,jdbcType=VARCHAR},PHONE=#{phone,jdbcType=VARCHAR},EMAIL=#{email,jdbcType=VARCHAR}"
	  + " where CID=#{cid}")
    int modify(Companyjob companyjob);
	
	@Delete("delete from COMPANYJOB where CID=#{cid}")
	int remove(Integer cid);
	
	@Select(" select * from COMPANYJOB "
    +" where CID=#{cid}")
	Companyjob findById(Integer cid);
	
	@Select(" select * from COMPANYJOB ")
	List<Companyjob> find();
	
}
