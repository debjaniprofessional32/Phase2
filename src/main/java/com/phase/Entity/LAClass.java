package com.phase.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LAClass {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String cName;
	private String bName;
	private String period_No;
	private String cteacher;
	private String csubject;
	private String date;

	public LAClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getPeriod_No() {
		return period_No;
	}

	public void setPeriod_No(String period_No) {
		this.period_No = period_No;
	}

	public String getCteacher() {
		return cteacher;
	}

	public void setCteacher(String cteacher) {
		this.cteacher = cteacher;
	}

	public String getCsubject() {
		return csubject;
	}

	public void setCsubject(String csubject) {
		this.csubject = csubject;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public LAClass(int cid, String cName, String bName, String period_No, String cteacher, String csubject,
			String date) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.bName = bName;
		this.period_No = period_No;
		this.cteacher = cteacher;
		this.csubject = csubject;
		this.date = date;
	}

	public LAClass(String cName, String bName, String period_No, String cteacher, String csubject, String date) {
		super();
		this.cName = cName;
		this.bName = bName;
		this.period_No = period_No;
		this.cteacher = cteacher;
		this.csubject = csubject;
		this.date = date;
	}
	

	
	
	
}