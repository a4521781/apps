package com.newer.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.newer.dao.PfavoriteMapper;
import com.newer.pojo.Pfavorite;
import com.newer.util.Pager;


@Service("pfavoriteService")
public class PfavoriteService {

	
	@Resource(name="pfavoriteMapper")
	private PfavoriteMapper pfavoriteMapper;
	
	
	public Pager<Pfavorite> findPfavorite(Integer pageno,Integer pagesize,String sort,String order){
		Pager<Pfavorite> pager = new Pager<Pfavorite>();
		pager.setRows(pfavoriteMapper.findPfavorite(pageno, pagesize, sort, order));
		pager.setTotal(pfavoriteMapper.findTotalPf());
		return pager;
	}
	
	public int addPfavorite(Pfavorite pfavorite){
		return pfavoriteMapper.addPfavorite(pfavorite);
	}
	
	
	public int modifyPfavorite(Pfavorite pfavorite){
		return pfavoriteMapper.modifyPfavorite(pfavorite);
	}
	
	public int removePfavorite(Integer id){
		return pfavoriteMapper.removePfavorite(id);
	}
	
	public Pfavorite findPfavoriteId(Integer id){
		return pfavoriteMapper.findPfavoriteId(id);
	}
}
