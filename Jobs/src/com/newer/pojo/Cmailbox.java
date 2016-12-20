package com.newer.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Cmailbox implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 839337929556654829L;
	private Integer mid;
	private Companyjob companyjob;
	private Person person;
	private String sendname;
	private String title;
	private String mailtext;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date sdate;
	private Integer newmail;

	
	public Integer getMid() {
		return this.mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Companyjob getCompanyjob() {
		return this.companyjob;
	}

	public void setCompanyjob(Companyjob companyjob) {
		this.companyjob = companyjob;
	}

	public String getSendname() {
		return this.sendname;
	}

	public void setSendname(String sendname) {
		this.sendname = sendname;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMailtext() {
		return this.mailtext;
	}

	public void setMailtext(String mailtext) {
		this.mailtext = mailtext;
	}

	public Date getSdate() {
		return this.sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

	public Integer getNewmail() {
		return this.newmail;
	}

	public void setNewmail(Integer newmail) {
		this.newmail = newmail;
	}

}