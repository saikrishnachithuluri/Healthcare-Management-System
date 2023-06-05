package com.klef.jfsd.springboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Patient;


@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer>
{
	@Query("select p from Patient p where username=?1 and password=?2")
	public Patient checkemplogin(String uname,String pwd);
	
	@Query("select p from Patient p where username=?1")
	public Patient viewemployee(String uname);
	
	@Transactional
    @Modifying
    @Query("update Patient p set p.password=?1 where p.password=?2 and p.username=?3")
    public int updateemppassword(String empnewpwd,String empoldpwd,String empuname);
}
