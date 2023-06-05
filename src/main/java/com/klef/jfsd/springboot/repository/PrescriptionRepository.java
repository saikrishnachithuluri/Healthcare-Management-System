package com.klef.jfsd.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Appointment;
import com.klef.jfsd.springboot.model.Prescription;

@Repository
public interface PrescriptionRepository extends CrudRepository<Prescription, Integer>
{
	@Query("select p from Prescription p where p.pname=?1")
	public List<Prescription> viewprescription(String euname);
}
