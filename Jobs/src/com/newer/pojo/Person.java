package com.newer.pojo;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Person implements java.io.Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 3035792502653393707L;
	private Integer pid;
	private String pnamejper;
	private String pwd;
	private String pname;
	private String code;
	private String mzhu;
	private String marry;
	private String politics;
	private String zchen;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	private String edu;
	private String school;
	private String major;
	private String language;
	private String lanlevel;
	private String mandarin;
	private String computer;
	private Integer workyears;
	private String experience;
	private String qjob;
	private String location;
	private Double salary;
	private String special;
	private String pphone;
	private String emailp;
	private String paddreess;
	private Integer pclick;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date pdate;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPnamejper() {
		return pnamejper;
	}
	public void setPnamejper(String pnamejper) {
		this.pnamejper = pnamejper;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMzhu() {
		return mzhu;
	}
	public void setMzhu(String mzhu) {
		this.mzhu = mzhu;
	}
	public String getMarry() {
		return marry;
	}
	public void setMarry(String marry) {
		this.marry = marry;
	}
	public String getPolitics() {
		return politics;
	}
	public void setPolitics(String politics) {
		this.politics = politics;
	}
	public String getZchen() {
		return zchen;
	}
	public void setZchen(String zchen) {
		this.zchen = zchen;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLanlevel() {
		return lanlevel;
	}
	public void setLanlevel(String lanlevel) {
		this.lanlevel = lanlevel;
	}
	public String getMandarin() {
		return mandarin;
	}
	public void setMandarin(String mandarin) {
		this.mandarin = mandarin;
	}
	public String getComputer() {
		return computer;
	}
	public void setComputer(String computer) {
		this.computer = computer;
	}
	public Integer getWorkyears() {
		return workyears;
	}
	public void setWorkyears(Integer workyears) {
		this.workyears = workyears;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getQjob() {
		return qjob;
	}
	public void setQjob(String qjob) {
		this.qjob = qjob;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public String getPphone() {
		return pphone;
	}
	public void setPphone(String pphone) {
		this.pphone = pphone;
	}
	public String getEmailp() {
		return emailp;
	}
	public void setEmailp(String emailp) {
		this.emailp = emailp;
	}
	public String getPaddreess() {
		return paddreess;
	}
	public void setPaddreess(String paddreess) {
		this.paddreess = paddreess;
	}
	public Integer getPclick() {
		return pclick;
	}
	public void setPclick(Integer pclick) {
		this.pclick = pclick;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	

}