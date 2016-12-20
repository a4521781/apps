package com.newer.pojo;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;



public class Jobs implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -722385671726730627L;
	private Integer jid;
	private Companyjob companyjob;
	private String jname;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date jdate;
	private Integer num;
	private String location;
	private String description;
	private String requirement;
	private double sal;
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public Companyjob getCompanyjob() {
		return companyjob;
	}
	public void setCompanyjob(Companyjob companyjob) {
		this.companyjob = companyjob;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public Date getJdate() {
		return jdate;
	}
	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
   
	
}