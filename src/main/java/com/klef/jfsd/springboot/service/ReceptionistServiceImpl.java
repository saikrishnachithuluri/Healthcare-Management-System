package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Receptionist;
import com.klef.jfsd.springboot.model.Xray;
import com.klef.jfsd.springboot.repository.ReceptionistRepository;
import com.klef.jfsd.springboot.repository.XrayRepository;

@Service
public class ReceptionistServiceImpl implements ReceptionistService
{

	@Autowired
	private ReceptionistRepository receptionistRepository;
	
	@Autowired
	  private XrayRepository xrayRepository;
	
	@Override
	public Receptionist addreceptionist(Receptionist receptionist) 
	{
		return receptionistRepository.save(receptionist);
	}

	@Override
	public Receptionist checkreceptlogin(String uname, String pwd)
	{
		
		return receptionistRepository.checkreplogin(uname, pwd);
	}

	@Override
	public Receptionist viewreceptionist(String uname) {
		return receptionistRepository.viewreceptionist(uname);
	}

	
	
	@Override
	  public int changereceptionistpassword(String repoldpwd, String repnewpwd, String runame) {
	    return receptionistRepository.updaterecppassword(repnewpwd, repoldpwd, runame);
	  }
	
	@Override
	  public Xray addxray(Xray xray) {
	    return xrayRepository.save(xray);
	  }

}
