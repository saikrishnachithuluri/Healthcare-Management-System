package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Appointment;
import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.model.Patient;
import com.klef.jfsd.springboot.repository.AppointmentRepository;
import com.klef.jfsd.springboot.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService
{
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private AppointmentRepository appointmentRepository;

	@Override
	public Doctor adddoctor(Doctor doctor)
	{
		return doctorRepository.save(doctor);
	}

	@Override
	public Doctor checkdoclogin(String uname, String pwd)
	{
		return doctorRepository.checkdoclogin(uname, pwd);
	}

	@Override
	public Doctor viewdoctor(String uname) {
		
		return doctorRepository.viewdoctor(uname);
	}

	

	@Override
	public List<Appointment> viewappointment(String euname)
	{
		return  (List<Appointment>) appointmentRepository.findAll();
	}

	@Override
	public void deleteappointment(int id) {
		appointmentRepository.deleteById(id);
		
	}
	
	@Override
	  public int changedoctorpassword(String docoldpwd, String docnewpwd, String duname) {
	    return doctorRepository.updatedocpassword(docnewpwd, docoldpwd, duname);
	  }

	@Override
	public Doctor viewdoctorbyid(int did)
	{
		
		return doctorRepository.findById(did).get();
	}

	
	
}
