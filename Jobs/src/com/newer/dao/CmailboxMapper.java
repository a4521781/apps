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

import com.newer.pojo.Cmailbox;


@Repository("cmailboxMapper")
public interface CmailboxMapper {
	  /**
	   * ��ҳ��ѯ
	   * @param pageno �ڼ�ҳ
	   * @param pagesize һҳ��ʾ��¼��
	   * @param sort �����ֶ�
	   * @param order ��������(����/����)
	   * @param ename
	   * @param beginDate
	   * @param endDate
	   * @return
	   */
	  public List<Cmailbox> findPager(
	      @Param("pageno")Integer pageno,
	      @Param("pagesize")Integer pagesize,
	      @Param("sort")String sort,
	      @Param("order")String order,
	      @Param("sendname")String sendname,
	      @Param("beginDate")Date beginDate,
	      @Param("endDate")Date endDate);
	  
	  /**
	   * ��ѯ��¼����
	   * @param ename
	   * @param beginDate
	   * @param endDate
	   * @return
	   */
	  public int findTotal(
	      @Param("sendname")String sendname,
	      @Param("beginDate")Date beginDate,
	      @Param("endDate")Date endDate);
	  
	  // ** �����Ƿ�ҳ **********************************************
	
	@Insert( "insert into CMAILBOX(MID,CID,PID,SENDNAME,TITLE,MAILTEXT,SDATE,NEWMAIL)"
			+  " values(#{mid},#{companyjob.cid},#{person.pid},#{sendname},#{title},#{mailtext},#{sdate},#{newmail})" )

	
	@SelectKey(statement = "select cmailbox_mid.Nextval  from DUAL", keyProperty = "mid",
	 resultType = int.class, before = true)
     int add(Cmailbox cmailbox);
	
	@Update( "update CMAILBOX set CID=#{companyjob.cid,jdbcType=INTEGER},PID=#{person.pid,jdbcType=INTEGER},SENDNAME=#{sendname,jdbcType=VARCHAR},TITLE=#{title,jdbcType=VARCHAR},MAILTEXT=#{mailtext,jdbcType=VARCHAR}"
	+",SDATE=#{sdate,jdbcType=DATE},NEWMAIL=#{newmail,jdbcType=INTEGER}  where MID=#{mid}")
    int modify(Cmailbox cmailbox);
	
	@Delete("delete from CMAILBOX where MID=#{mid}")
	int remove(Integer mid);
	
	@Select(" select * from CMAILBOX "
    +" where MID=#{mid}")
	Cmailbox findById(Integer mid);
}
