package com.newer.pojo;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;



public class Pmailbox implements java.io.Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 5297778921025195660L;
	private Integer lid;
	private Person person;
	private Companyjob companyjob;
	private String endname;
	private String title;
	private String mailtext;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date sdate;
	private Integer newmail;
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Companyjob getCompanyjob() {
		return companyjob;
	}
	public void setCompanyjob(Companyjob companyjob) {
		this.companyjob = companyjob;
	}
	public String getEndname() {
		return endname;
	}
	public void setEndname(String endname) {
		this.endname = endname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMailtext() {
		return mailtext;
	}
	public void setMailtext(String mailtext) {
		this.mailtext = mailtext;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public Integer getNewmail() {
		return newmail;
	}
	public void setNewmail(Integer newmail) {
		this.newmail = newmail;
	}
   
	
}