package com.phase.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int tid;
	private String tname;
	private String qualification;
	private int age;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String tname, String qualification, int age) {
		super();
		this.tname = tname;
		this.qualification = qualification;
		this.age = age;
	}
	public Teacher(int tid, String tname, String qualification, int age) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.qualification = qualification;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", qualification=" + qualification + ", age=" + age + "]";
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
