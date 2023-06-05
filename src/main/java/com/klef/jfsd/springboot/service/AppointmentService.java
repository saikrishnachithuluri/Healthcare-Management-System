package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Appointment;
import com.klef.jfsd.springboot.model.Doctor;

public interface AppointmentService
{
	public Appointment addapp(Appointment app);
	public List<Doctor> viewalldoctors();
}
