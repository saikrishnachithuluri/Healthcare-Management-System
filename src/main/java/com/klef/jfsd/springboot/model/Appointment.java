package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment_table")
public class Appointment
{
	@Id
	@GeneratedValue
	private int aid;
	@Column(nullable = false,length = 20)
	private String pname;
	@Column(nullable = false,length = 20)
	private String dname;
	@Column(nullable = false,length = 200)
	private String problem;
	@Column(nullable = false,length = 200)
	private String symptoms;
	@Column(nullable = false,length = 20)
	private String appdate;
	@Column(nullable = false,length = 20)
	private String apptime;
	@Override
	public String toString() {
		return "Appointment [aid=" + aid + ", pname=" + pname + ", dname=" + dname + ", problem=" + problem
				+ ", symptoms=" + symptoms + ", appdate=" + appdate + ", apptime=" + apptime + "]";
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getAppdate() {
		return appdate;
	}
	public void setAppdate(String appdate) {
		this.appdate = appdate;
	}
	public String getApptime() {
		return apptime;
	}
	public void setApptime(String apptime) {
		this.apptime = apptime;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
}
