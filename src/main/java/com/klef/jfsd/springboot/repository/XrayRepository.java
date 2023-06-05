package com.klef.jfsd.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.model.Xray;

@Repository
public interface XrayRepository extends CrudRepository<Xray, Integer>
{

}
