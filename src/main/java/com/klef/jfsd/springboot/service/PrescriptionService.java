package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Appointment;
import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.model.Prescription;

public interface PrescriptionService
{
	public Prescription addpre(Prescription pre);
	public List<Appointment> viewallappointments();
}
