package com.klef.jfsd.springboot.service;


import com.klef.jfsd.springboot.model.Receptionist;
import com.klef.jfsd.springboot.model.Xray;

public interface ReceptionistService 
{
	public Receptionist addreceptionist(Receptionist receptionist);
	public Receptionist checkreceptlogin(String uname,String pwd);
	public Receptionist viewreceptionist(String uname);
	public int changereceptionistpassword(String repoldpwd,String repnewpwd,String runame);
	public Xray addxray(Xray xray);
}
