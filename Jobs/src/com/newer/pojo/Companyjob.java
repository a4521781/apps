package com.newer.pojo;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Companyjob implements java.io.Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 2156046098011028715L;
	private Integer cid;
	private String cnamejob;
	private String pwd;
	private String cname;
	private String trade;
	private String ctype;
	private Integer fund;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date cdate;
	private String address;
	private String zip;
	private String namec;
	private String phone;
	private String email;
	private String chttp;
	private String summary;
	private Integer clicks;
	private List<Pmailbox> pmailboxes;
	private List<Pfavorite> pfavorites;
	
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCnamejob() {
		return cnamejob;
	}
	public void setCnamejob(String cnamejob) {
		this.cnamejob = cnamejob;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTrade() {
		return trade;
	}
	public void setTrade(String trade) {
		this.trade = trade;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public Integer getFund() {
		return fund;
	}
	public void setFund(Integer fund) {
		this.fund = fund;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getNamec() {
		return namec;
	}
	public void setNamec(String namec) {
		this.namec = namec;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getChttp() {
		return chttp;
	}
	public void setChttp(String chttp) {
		this.chttp = chttp;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Integer getClicks() {
		return clicks;
	}
	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	public List<Pmailbox> getPmailboxes() {
		return pmailboxes;
	}
	public void setPmailboxes(List<Pmailbox> pmailboxes) {
		this.pmailboxes = pmailboxes;
	}
	public List<Pfavorite> getPfavorites() {
		return pfavorites;
	}
	public void setPfavorites(List<Pfavorite> pfavorites) {
		this.pfavorites = pfavorites;
	}
	


	
}