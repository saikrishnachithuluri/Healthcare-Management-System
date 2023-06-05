package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Appointment;
import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.model.Patient;
import com.klef.jfsd.springboot.model.Prescription;


public interface DoctorService 
{
	public Doctor adddoctor(Doctor doctor);
	public Doctor checkdoclogin(String uname,String pwd);
	public Doctor viewdoctor(String uname);
	public Doctor viewdoctorbyid(int did);
	public List<Appointment> viewappointment(String euname);
	public void deleteappointment(int id);
	public int changedoctorpassword(String docoldpwd,String docnewpwd,String duname);
}
