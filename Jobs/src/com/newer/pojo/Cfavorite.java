package com.newer.pojo;




public class Cfavorite implements java.io.Serializable {


	private static final long serialVersionUID = 8016395262362075244L;
	private Integer fid;
	private Person person;
	private Companyjob companyjob;

	public Integer getFid() {
		return this.fid;
	}
     
	public void setFid(Integer fid) {
		this.fid = fid;
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

}