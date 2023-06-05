package com.klef.jfsd.springboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.model.Patient;
import com.klef.jfsd.springboot.model.Receptionist;


@Repository
public interface ReceptionistRepository extends CrudRepository<Receptionist, Integer>
{
	@Query("select r from Receptionist r where username=?1 and password=?2")
	public Receptionist checkreplogin(String uname,String pwd);
	
	@Query("select r from Receptionist r where username=?1")
	public Receptionist viewreceptionist(String uname);
	
	@Transactional
    @Modifying
    @Query("update Receptionist r set r.password=?1 where r.password=?2 and r.username=?3")
    public int updaterecppassword(String repnewpwd,String repoldpwd,String repuname);
}
