package com.klef.jfsd.springboot.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "receptionist")
public class Receptionist 
{
	@Id
	@GeneratedValue
	private int rid;
	@Column(nullable = false,length = 200)
	private String name;
	@Column(nullable = false,unique = true,length = 200)
	private String username;
	@Column(nullable = false,length = 200)
	private String password;
	@Column(nullable = false,length = 10)
	private String gender;
	@Column(nullable = false)
	private String age;
	@Column(nullable = false,length = 100)
	private String yearofjoin;
	@Column(nullable = false,length = 200)
	private String qualification;
	@Column(nullable = false,length = 200)
	private String contactno;
	@Column(nullable = false,unique = true,length = 200)
	private String emailid;
	@Column(nullable = false)
	private Blob recppic; // blob - binary large object
	@Override
	public String toString() {
		return "Receptionist [rid=" + rid + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", gender=" + gender + ", age=" + age + ", yearofjoin=" + yearofjoin + ", qualification="
				+ qualification + ", contactno=" + contactno + ", emailid=" + emailid + ", recppic=" + recppic + "]";
	}
	public Blob getRecppic() {
		return recppic;
	}
	public void setRecppic(Blob recppic) {
		this.recppic = recppic;
	}
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getYearofjoin() {
		return yearofjoin;
	}
	public void setYearofjoin(String yearofjoin) {
		this.yearofjoin = yearofjoin;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
}
