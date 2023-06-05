package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.model.Patient;
import com.klef.jfsd.springboot.model.Receptionist;

public interface AdminService
{
	public Admin checkadminlogin(String uname,String pwd);
	public List<Patient> viewallpatients();
	public List<Doctor> viewalldoctors();
	public List<Receptionist> viewallreceptionists();
	public void deletepatient(int id);
	public void deletedoctor(int id);
	public void deletereceptionist(int id);
	public Patient viewemployeebyid(int id);
	public Receptionist viewreceptionistbyid(int id);
	public long countdoctors();
	public long countpatients();
	public long countreceptionists();
}
