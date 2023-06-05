package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "xray_table")
public class Xray
{
	@Id
	@GeneratedValue
	private int Id;
	@Column(nullable = false,length = 200)
	private String pname;
	@Column(nullable = false,length = 200)
	private String time;
	@Column(nullable = false,length = 200)
	private String scantype;
	@Column(nullable = false,length = 200)
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Xray [Id=" + Id + ", pname=" + pname + ", time=" + time + ", scantype=" + scantype + ", description="
				+ description + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getScantype() {
		return scantype;
	}
	public void setScantype(String scantype) {
		this.scantype = scantype;
	}
}
