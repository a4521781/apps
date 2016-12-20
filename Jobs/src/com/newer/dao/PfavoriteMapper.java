package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.newer.pojo.Pfavorite;



@Repository("pfavoriteMapper")
public interface PfavoriteMapper {
	
	List<Pfavorite> findPfavorite(
			@Param("pageno")Integer pageno,
			@Param("pagesize")Integer pagesize,
			@Param("sort")String sort,
			@Param("order")String order			
			);
	
	int findTotalPf();

	@Insert("insert into PFAVORITE(RID,CID,PID)"+
	" values(#{rid},#{companyjob.cid},#{person.pid})")
	@SelectKey(statement="select PFAVORITE_RID.nextval from DUAL",keyProperty="rid",resultType=int.class,before=true)
	int addPfavorite(Pfavorite pfavorite);
	
	@Update("update PFAVORITE set CID=#{companyjob.cid},PID=#{person.pid} where RID=#{rid}")
	int modifyPfavorite(Pfavorite pfavorite);
	
	@Delete("delete from PFAVORITE where RID=#{rid}")
	int removePfavorite(Integer id);
	
//	@Select("select RID,c.CNAME,c.CID,p.PNAME,p.PID from PFAVORITE f,COMPANYJOB c,PERSON p"
//			+ " where f.cid=c.cid and f.pid=p.pid and RID=#{rid}")
    public Pfavorite findPfavoriteId(Integer id);

	
}
