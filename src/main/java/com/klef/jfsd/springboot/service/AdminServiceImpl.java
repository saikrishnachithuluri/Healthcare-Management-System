package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.model.Patient;
import com.klef.jfsd.springboot.model.Receptionist;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.DoctorRepository;
import com.klef.jfsd.springboot.repository.PatientRepository;
import com.klef.jfsd.springboot.repository.ReceptionistRepository;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private PatientRepository employeeRepository;
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private ReceptionistRepository receptionistRepository;
	
	@Override
	public Admin checkadminlogin(String uname, String pwd) 
	{
		return adminRepository.checkadnminlogin(uname, pwd);
	}
	
	@Override
	public List<Patient> viewallpatients() 
	{
		return (List<Patient>) employeeRepository.findAll();
	}
	
	@Override
	public List<Doctor> viewalldoctors() 
	{
		return (List<Doctor>) doctorRepository.findAll();
	}
	
	@Override
	public List<Receptionist> viewallreceptionists() 
	{
		return (List<Receptionist>) receptionistRepository.findAll();
	}
	
	@Override
	  public void deletepatient(int id)
	  {
	    employeeRepository.deleteById(id);
	    
	  }
	
	@Override
	  public void deletedoctor(int id)
	  {
	    doctorRepository.deleteById(id);
	    
	  }
	
	@Override
	  public void deletereceptionist(int id)
	  {
	    receptionistRepository.deleteById(id);
	    
	  }
	@Override
	  public Patient viewemployeebyid(int id)
	  {
	    return employeeRepository.findById(id).get();
	  }

	@Override
	public long countdoctors()
	{
		return doctorRepository.count();
	}

	@Override
	public long countpatients()
	{
		return employeeRepository.count();
	}

	@Override
	public long countreceptionists()
	{
		return receptionistRepository.count();
	}

	@Override
	public Receptionist viewreceptionistbyid(int id) {
		
		return receptionistRepository.findById(id).get();
	}
}
