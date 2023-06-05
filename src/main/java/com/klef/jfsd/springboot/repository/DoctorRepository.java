package com.klef.jfsd.springboot.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Appointment;
import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.model.Patient;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Integer>
{
	@Query("select d from Doctor d where username=?1 and password=?2")
	public Doctor checkdoclogin(String uname,String pwd);
	
	@Query("select d from Doctor d where username=?1")
	public Doctor viewdoctor(String uname);
	
	@Transactional
    @Modifying
    @Query("update Doctor d set d.password=?1 where d.password=?2 and d.username=?3")
    public int updatedocpassword(String empnewpwd,String empoldpwd,String empuname);
}
