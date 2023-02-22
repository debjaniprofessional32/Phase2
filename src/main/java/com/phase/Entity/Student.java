package com.phase.Entity;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int stid;
	private String Stuname;
	private String batch;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stid, String stuname) {
		super();
		this.stid = stid;
		Stuname = stuname;
	}
	public Student(String stuname, String batch) {
		super();
		Stuname = stuname;
		this.batch = batch;
	}
	public Student(String stuname) {
		super();
		Stuname = stuname;
	}
	
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", Stuname=" + Stuname + ", batch=" + batch + "]";
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStuname() {
		return Stuname;
	}
	public void setStuname(String stuname) {
		Stuname = stuname;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}




}
