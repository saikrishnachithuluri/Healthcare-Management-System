package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Patient;
import com.klef.jfsd.springboot.model.Prescription;
import com.klef.jfsd.springboot.model.Xray;

public interface PatientService
{
	public Patient addemployee(Patient employee);
	public Patient checkemplogin(String uname,String pwd);
	public Patient viewpatient(int id);
	public Patient viewemployee(String uname);
	public int changeemployeepassword(String empoldpwd,String empnewpwd,String euname);
	public List<Prescription> viewprescription(String euname);
	public List<Xray> viewscans(String pname);
}
