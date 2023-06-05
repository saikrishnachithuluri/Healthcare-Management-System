package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Appointment;
import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.repository.AppointmentRepository;
import com.klef.jfsd.springboot.repository.DoctorRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService
{
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public Appointment addapp(Appointment app)
	{
		return appointmentRepository.save(app);
	}

	@Override
	public List<Doctor> viewalldoctors()
	{
		return (List<Doctor>) doctorRepository.findAll();
	}
	
}
