package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Patient;
import com.klef.jfsd.springboot.model.Prescription;
import com.klef.jfsd.springboot.model.Xray;
import com.klef.jfsd.springboot.repository.PatientRepository;
import com.klef.jfsd.springboot.repository.PrescriptionRepository;
import com.klef.jfsd.springboot.repository.XrayRepository;

@Service
public class PatientServiceImpl implements PatientService
{
	@Autowired
	private PatientRepository employeeRepository;
	
	@Autowired
	private PrescriptionRepository prescriptionRepository;
	
	@Autowired
	  private XrayRepository xrayRepository;

	@Override
	public Patient addemployee(Patient employee)
	{
		return employeeRepository.save(employee);
	}
	@Override
	public Patient checkemplogin(String uname, String pwd) 
	{
		return employeeRepository.checkemplogin(uname, pwd);
	}
	@Override
	public Patient viewemployee(String uname) 
	{
		
		return employeeRepository.viewemployee(uname);
	}
	
	@Override
    public int changeemployeepassword(String empoldpwd, String empnewpwd, String euname)
    {
      return employeeRepository.updateemppassword(empnewpwd, empoldpwd, euname);
    }
	@Override
	public List<Prescription> viewprescription(String euname)
	{
		return  (List<Prescription>) prescriptionRepository.findAll();
	}
	@Override
	public Patient viewpatient(int id) {
		
		return employeeRepository.findById(id).get();
	}
	@Override
	  public List<Xray> viewscans(String pname)
	  {
	    
	    return  (List<Xray>) xrayRepository.findAll();
	  }
	
}
