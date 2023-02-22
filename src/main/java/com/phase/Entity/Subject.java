package com.phase.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.*;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="subject_id")
	private int suid;
    @Column(name="subject_course")
	private String sucourse;
    @Column(name="subject1")
	private String SuSubject1;
    @Column(name="subject2")
	private String SuSubject2;

  
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int suid, String sucourse, String suSubject1, String suSubject2) {
		super();
		this.suid = suid;
		this.sucourse = sucourse;
		SuSubject1 = suSubject1;
		SuSubject2 = suSubject2;
		
	}
	
	
	public Subject(String sucourse, String suSubject1, String suSubject2) {
		super();
		this.sucourse = sucourse;
		SuSubject1 = suSubject1;
		SuSubject2 = suSubject2;
	}
	
	@Override
	public String toString() {
		return "Subject [suid=" + suid + ", sucourse=" + sucourse + ", SuSubject1=" + SuSubject1 + ", SuSubject2="
				+ SuSubject2 + "]";
	}
	public int getSuid() {
		return suid;
	}
	public void setSuid(int suid) {
		this.suid = suid;
	}
	public String getSucourse() {
		return sucourse;
	}
	public void setSucourse(String sucourse) {
		this.sucourse = sucourse;
	}
	public String getSuSubject1() {
		return SuSubject1;
	}
	public void setSuSubject1(String suSubject1) {
		SuSubject1 = suSubject1;
	}
	public String getSuSubject2() {
		return SuSubject2;
	}
	public void setSuSubject2(String suSubject2) {
		SuSubject2 = suSubject2;
	}

}
