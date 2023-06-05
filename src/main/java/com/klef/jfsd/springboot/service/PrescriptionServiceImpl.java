package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Appointment;
import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.model.Prescription;
import com.klef.jfsd.springboot.repository.AppointmentRepository;
import com.klef.jfsd.springboot.repository.DoctorRepository;
import com.klef.jfsd.springboot.repository.PrescriptionRepository;

@Service
public class PrescriptionServiceImpl implements PrescriptionService
{
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private PrescriptionRepository prescriptionRepository;

	@Override
	public Prescription addpre(Prescription pre)
	{
		return prescriptionRepository.save(pre);
	}

	@Override
	public List<Appointment> viewallappointments() 
	{
		return (List<Appointment>) appointmentRepository.findAll();
	}
	
	
	
}
