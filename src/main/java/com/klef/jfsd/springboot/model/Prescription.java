package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prescription_table")
public class Prescription
{
	@Id
	@GeneratedValue
	private int prid;
	@Column(nullable = false,length = 20)
	private String pname;
	@Column(nullable = false,length = 20)
	private String dname;
	@Column(nullable = false,length = 500)
	private String Description;
	public int getPrid() {
		return prid;
	}
	public void setPrid(int prid) {
		this.prid = prid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "Prescription [prid=" + prid + ", pname=" + pname + ", dname=" + dname + ", Description=" + Description
				+ "]";
	}
	
}
