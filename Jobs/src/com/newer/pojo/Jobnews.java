package com.newer.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;



public class Jobnews implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -4597211990552806245L;
	private Integer nid;
	private String title;
	private String text;
	private Integer click;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date ndate;
	public Integer getNid() {
		return nid;
	}
	public void setNid(Integer nid) {
		this.nid = nid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getClick() {
		return click;
	}
	public void setClick(Integer click) {
		this.click = click;
	}
	public Date getNdate() {
		return ndate;
	}
	public void setNdate(Date ndate) {
		this.ndate = ndate;
	}


}