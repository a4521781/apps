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

import com.newer.pojo.Pmailbox;

@Repository("pmailboxMapper")
public interface PmailboxMapper {
	
	List<Pmailbox> findPmailbox(
			@Param("pageno")Integer pageno,
			@Param("pagesize")Integer pagesize,
			@Param("sort")String sort,
			@Param("order")String order,
			@Param("name")String name,
			@Param("beginDate")Date beginDate,
			@Param("endDate")Date endDate
			);
	
	int findTotalP(
			@Param("name")String name,
			@Param("beginDate")Date beginDate,
			@Param("endDate")Date endDate
			);
	

	@Insert( "insert into PMAILBOX(LID,CID,PID,ENDNAME,TITLE,MAILTEXT,SDATE,NEWMAIL)"
			+" values(#{lid},#{companyjob.cid},#{person.pid},#{endname},#{title},#{mailtext},#{sdate},#{newmail})" )
	@SelectKey(statement = "select pmailbox_lid.Nextval  from DUAL", keyProperty = "lid",
	 resultType = int.class, before = true)
     int addPmailbox(Pmailbox pmailbox);
	
	@Update( "update PMAILBOX set CID=#{companyjob.cid,jdbcType=INTEGER},PID=#{person.pid,jdbcType=INTEGER},ENDNAME=#{endname,jdbcType=VARCHAR},TITLE=#{title,jdbcType=VARCHAR},MAILTEXT=#{mailtext,jdbcType=VARCHAR}"
	+",SDATE=#{sdate,jdbcType=DATE},NEWMAIL=#{newmail,jdbcType=INTEGER}  where LID=#{lid}")
    int modifyPmailbox(Pmailbox pmailbox);
	
	@Delete("delete from PMAILBOX where LID=#{lid}")
	int removePmailbox(Integer id);
	
//	@Select(" select * from PMAILBOX "
//    +" where LID=#{lid}")
	Pmailbox findPmailboxId(Integer lid);
}
