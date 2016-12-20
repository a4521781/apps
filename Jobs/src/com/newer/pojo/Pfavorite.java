package com.newer.pojo;





public class Pfavorite implements java.io.Serializable {

	private static final long serialVersionUID = -5558532301158736329L;
	private Integer rid;
	private Person person;
	private Companyjob companyjob;
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
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


}