package com.klef.jfsd.springboot.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_table")
public class Patient 
{
  @Id
  @GeneratedValue
   private int id;
  @Column(nullable = false,length = 200)
   private String fullname;
  @Column(nullable = false,length = 10)
   private String gender;
  @Column(nullable = false,length = 10)
  private String age;
  @Column(nullable = false,length = 200)
  private String bloodgroup;
  @Column(nullable = false,length = 200)
  private String contactno;
  @Column(nullable = false,length = 200)
   private String location;
  @Column(nullable = false,unique = true,length = 200)
  private String registerdate;
  @Column(nullable = false,unique = true,length = 200)
   private String username;
  @Column(nullable = false,length = 200)
   private String password;
  @Column(nullable = false)
	private Blob patpic; // blob - binary large object
@Override
public String toString() {
	return "Patient [id=" + id + ", fullname=" + fullname + ", gender=" + gender + ", age=" + age + ", bloodgroup="
			+ bloodgroup + ", contactno=" + contactno + ", location=" + location + ", registerdate=" + registerdate
			+ ", username=" + username + ", password=" + password + ", patpic=" + patpic + "]";
}
public Blob getPatpic() {
	return patpic;
}
public void setPatpic(Blob patpic) {
	this.patpic = patpic;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
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
public String getBloodgroup() {
	return bloodgroup;
}
public void setBloodgroup(String bloodgroup) {
	this.bloodgroup = bloodgroup;
}
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getRegisterdate() {
	return registerdate;
}
public void setRegisterdate(String registerdate) {
	this.registerdate = registerdate;
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
}
