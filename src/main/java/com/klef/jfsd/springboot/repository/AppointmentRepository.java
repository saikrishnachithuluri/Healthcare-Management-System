package com.klef.jfsd.springboot.repository;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.klef.jfsd.springboot.model.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Integer>
{
	@Query("select a from Appointment a where a.dname=?1")
	public List<Appointment> viewappointment(String euname);
}
