package com.klef.jfsd.springboot.controller;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Appointment;
import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.model.Patient;
import com.klef.jfsd.springboot.model.Prescription;
import com.klef.jfsd.springboot.model.Receptionist;
import com.klef.jfsd.springboot.model.Xray;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.AppointmentService;
import com.klef.jfsd.springboot.service.DoctorService;
import com.klef.jfsd.springboot.service.PatientService;
import com.klef.jfsd.springboot.service.PrescriptionService;
import com.klef.jfsd.springboot.service.ReceptionistService;

@Controller
public class ClientController
{
	@Autowired
	private PatientService employeeService;
	
	@Autowired
	private AdminService adminService; 
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private ReceptionistService receptionistService;
	
	@Autowired
	private AppointmentService appointmentService;
	
	@Autowired
	private PrescriptionService prescriptionService;
	
	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
	@GetMapping("/loginpage")
	public String loginhomedemo()
	{
		return "login";
	}
	
	@GetMapping("/employeereg")
	public ModelAndView employeeregdemo()
	{
		ModelAndView mv = new ModelAndView("patientregistration", "pat",new Patient());
		return mv;
	}
	
	@PostMapping("/addpatient")
	public ModelAndView addemployeedemo(HttpServletRequest request,@RequestParam("patpic") MultipartFile file) throws IOException, SerialException, SQLException
	{
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("receptionisthome");
		
		String fullname = request.getParameter("fullname");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String bloodgroup = request.getParameter("bloodgroup");
		String contactno = request.getParameter("contactno");
		String location = request.getParameter("location");
		String registerdate = request.getParameter("registerdate");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		byte[] bytes = file.getBytes();
		  Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
		  
		  Patient p = new Patient();
		  p.setFullname(fullname);
		  p.setGender(gender);
		  p.setAge(age);
		  p.setBloodgroup(bloodgroup);
		  p.setContactno(contactno);
		  p.setLocation(location);
		  p.setRegisterdate(registerdate);
		  p.setUsername(username);
		  p.setPassword(password);
		  p.setPatpic(blob);
		  
		  employeeService.addemployee(p);
		
		
//		mv.addObject("msg", "Employee Registered Successfully");
		return mv;
	}
	
	@GetMapping("/employeelogin")
	public ModelAndView employeeogindemo()
	{
		ModelAndView mv = new ModelAndView("patientlogin");
		
		return mv;
	}
	
	@PostMapping("/checkemplogin")
	public ModelAndView checkemplogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String euname = request.getParameter("euname");
		String epwd = request.getParameter("epwd");
		
		Patient emp = employeeService.checkemplogin(euname, epwd);
		
		if(emp!=null)
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("euname", euname);
			
			mv.setViewName("patienthome");
		}
		else
		{
			mv.setViewName("patientlogin");
//			mv.addObject("msg", "Login Failed");
		}
		return mv;
	}
	
	@GetMapping("/patienthome")
	public ModelAndView patienthomedemo()
	{
		ModelAndView mv = new ModelAndView("patienthome");
		return mv;
	}
	
	@GetMapping("/adminhome")
	public ModelAndView adminhomedemo()
	{
		ModelAndView mv = new ModelAndView("admindashh");
		
		
		long c1 = adminService.countdoctors();
		long c2 = adminService.countpatients();
		long c3 = adminService.countreceptionists();
		long sum = c1+c2+c3;
		mv.addObject("cou1",c1);
		mv.addObject("cou2",c2);
		mv.addObject("cou3",c3);
		mv.addObject("sum",sum);
		return mv;
		
		
	}
	
	@GetMapping("/adminlogin")
	public ModelAndView adminlogindemo()
	{
		ModelAndView mv = new ModelAndView("adminlogin");
		
		return mv;
	}
	
	@PostMapping("/checkadminlogin")
	public ModelAndView checkadminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView("admindashh");
		
		String auname = request.getParameter("auname");
		String apwd = request.getParameter("apwd");
		
		Admin admin = adminService.checkadminlogin(auname, apwd);
		
		if(admin!=null)
		{	
			HttpSession session = request.getSession();
			session.setAttribute("auname", auname);
			long c1 = adminService.countdoctors();
			long c2 = adminService.countpatients();
			long c3 = adminService.countreceptionists();
			long sum = c1+c2+c3;
			mv.addObject("cou1",c1);
			mv.addObject("cou2",c2);
			mv.addObject("cou3",c3);
			mv.addObject("sum",sum);
			return mv;
			
			
		}
		else
		{
			mv.setViewName("adminlogin");
			mv.addObject("msg", "Login Failed");
		}
		return mv;
	}
	
	@PostMapping("/adddoctor")
	  public ModelAndView adddoctordemo(HttpServletRequest request,@RequestParam("docpic") MultipartFile file) throws IOException, SerialException, SQLException
	  {
	    
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("successdoc");
	    
	    String name = request.getParameter("name");
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    String gender = request.getParameter("gender");
	    String age = request.getParameter("age");
	    String qualification = request.getParameter("qualification");
	    String yearofjoin = request.getParameter("yearofjoin");
	    String status = request.getParameter("status");
	    String contactno = request.getParameter("contactno");
	    String emailid = request.getParameter("emailid");
	    
	    byte[] bytes = file.getBytes();
		Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
	    
	    Doctor d = new Doctor();
	    d.setName(name);
	    d.setUsername(username);
	    d.setPassword(password);
	    d.setGender(gender);
	    d.setAge(age);
	    d.setQualification(qualification);
	    d.setYearofjoin(yearofjoin);
	    d.setStatus(status);
	    d.setContactno(contactno);
	    d.setEmailid(emailid);
	    d.setDocpic(blob);
	    
	    doctorService.adddoctor(d);
	    
	   // mv.addObject("msg", "Doctor Registered Successfully");
	    return mv;
	  }
	
	@GetMapping("/doctorreg")
	  public ModelAndView doctorregdemo()
	  {
	    ModelAndView mv = new ModelAndView("doctorregistration", "doc",new Doctor());
	    return mv;
	  }
	@GetMapping("/receptionistreg")
	  public ModelAndView receptionistregdemo()
	  {
	    ModelAndView mv = new ModelAndView("receptionistregistration", "rep",new Receptionist());
	    return mv;
	  }
	@PostMapping("/addreceptionist")
	  public ModelAndView addreceptionistdemo(HttpServletRequest request,@RequestParam("recppic") MultipartFile file) throws IOException, SerialException, SQLException
	  {
	    
	    
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("successrec");
	    
	    String name = request.getParameter("name");
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    String gender = request.getParameter("gender");
	    String age = request.getParameter("age");
	    String qualification = request.getParameter("qualification");
	    String yearofjoin = request.getParameter("yearofjoin");
	    String status = request.getParameter("status");
	    String contactno = request.getParameter("contactno");
	    String emailid = request.getParameter("emailid");
	    
	    byte[] bytes = file.getBytes();
		Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
		
		Receptionist r = new  Receptionist();
		r.setName(name);
	    r.setUsername(username);
	    r.setPassword(password);
	    r.setGender(gender);
	    r.setAge(age);
	    r.setQualification(qualification);
	    r.setYearofjoin(yearofjoin);
	    r.setContactno(contactno);
	    r.setEmailid(emailid);
	    r.setRecppic(blob);
	    
	    receptionistService.addreceptionist(r);
	   // mv.addObject("msg", "Receptionist Registered Successfully");
	    return mv;
	    
	    
	  }
	@GetMapping("/adminpage")
	public ModelAndView adminpagedemo()
	{
		ModelAndView mv = new ModelAndView("adminpage");
		
		return mv;
	}
	
	@GetMapping("/receptionistlogin")
	  public ModelAndView receptionistlogindemo()
	  {
	    ModelAndView mv = new ModelAndView("receptionistlogin");
	    
	    return mv;
	  }
	
	@PostMapping("/checkreplogin")
	  public ModelAndView checkreplogindemo(HttpServletRequest request)
	  {
	    ModelAndView mv =  new ModelAndView();
	    
	    String runame = request.getParameter("runame");
	    String rpwd = request.getParameter("rpwd");
	    
	    Receptionist rep = receptionistService.checkreceptlogin(runame, rpwd);
	    
	    if(rep!=null)
	    {
	      HttpSession session = request.getSession();
	      
	      session.setAttribute("runame", runame);
	      
	      mv.setViewName("receptionisthome");
	    }
	    else
	    {
	      mv.setViewName("receptionistlogin");
	      mv.addObject("msg", "Login Failed");
	    }
	    
	    
	    return mv;
	  }
	
	@GetMapping("/receptionisthome")
	public ModelAndView receptionisthomedemo()
	{
		ModelAndView mv = new ModelAndView("receptionisthome");
		return mv;
	}
	
	@GetMapping("/viewallpats")
	  public ModelAndView viewallpatsdemo()
	  {
	    ModelAndView mv = new ModelAndView("viewallpatients");
	    long c2 = adminService.countpatients();
	    List<Patient> patlist = adminService.viewallpatients();
	    mv.addObject("patlist",patlist);
	    mv.addObject("cou2",c2);
	    return mv;
	  }
	@GetMapping("/viewalldocs")
	  public ModelAndView viewalldocsdemo()
	  {
	    ModelAndView mv = new ModelAndView("viewalldoctors");
	    
	    List<Doctor> doclist = adminService.viewalldoctors();
	    mv.addObject("doclist",doclist);
	    return mv;
	  }
	@GetMapping("/viewallrecs")
	  public ModelAndView viewallrecsdemo()
	  {
	    ModelAndView mv = new ModelAndView("viewallreceptionists");
	    
	    List<Receptionist> reclist = adminService.viewallreceptionists();
	    mv.addObject("reclist",reclist);
	    return mv;
	  }
	
	@GetMapping("/deletepat")
	  public String deletepatdemo(@RequestParam("id") int eid)
	  {
	    adminService.deletepatient(eid);
	    return "redirect:viewallpats";
	  }
	
	@GetMapping("/deletedoc")
	  public String deletedocdemo(@RequestParam("id") int eid)
	  {
	    adminService.deletedoctor(eid);
	    return "redirect:viewalldocs";
	  }
	
	@GetMapping("/deleterec")
	  public String deleterecdemo(@RequestParam("id") int eid)
	  {
	    adminService.deletereceptionist(eid);
	    return "redirect:viewallrecs";
	  }
	
	@GetMapping("/viewempbyid")
	  public ModelAndView viewempbyiddemo(@RequestParam("id") int eid)
	  {
	    Patient emp = adminService.viewemployeebyid(eid);
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("viewpatientbyid");
	    mv.addObject("emp",emp);
	    return mv;
	  }
	
	@GetMapping("/viewdoctorbyid")
	  public ModelAndView viewdoctorbyiddemo(@RequestParam("did") int did)
	  {
	   Doctor doc = doctorService.viewdoctorbyid(did);
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("viewdoctorbyid");
	    mv.addObject("doc",doc);
	    return mv;
	  }
	
	@GetMapping("/viewemp")
	public ModelAndView viewemp(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String euname = (String) session.getAttribute("euname");
		
		Patient emp =  employeeService.viewemployee(euname);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewpatient");
		mv.addObject("emp",emp);
		return mv;
	}
	
	@GetMapping("/viewdoctor")
	public ModelAndView viewdoctordemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String duname = (String) session.getAttribute("duname");
		
		Doctor doc = doctorService.viewdoctor(duname);
		
		ModelAndView mv = new ModelAndView("viewdoctorbyname");
		
		mv.addObject("doc",doc);
		return mv;
		
	}
	
	@GetMapping("/viewreceptionist")
	public ModelAndView viewreceptionistdemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String runame = (String)  session.getAttribute("runame");
		
		Receptionist rec = receptionistService.viewreceptionist(runame);
		
		ModelAndView mv = new ModelAndView("viewreceptionistbyname");
		
		mv.addObject("rec",rec);
		return mv;
	}
	
	@GetMapping("/makeapp")
	  public ModelAndView makeappointment(HttpServletRequest request)
	  {
	    
		ModelAndView mv = new ModelAndView("makeapp");
	    List<Doctor> doclist = adminService.viewalldoctors();
	    mv.addObject("doclist",doclist);
	    return mv;
	  }
	
	@RequestMapping("/addapp")
	  public ModelAndView addappointment(@RequestParam("dname") String dname, HttpServletRequest request)
	  {
	    ModelAndView mv=new ModelAndView("addapp","app",new Appointment());
	    HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("euname");
	    mv.addObject("dname", dname);
	    return mv;
	  }
	
	@PostMapping("/addappointment")
	public ModelAndView addappointmentdemo(@ModelAttribute("app") Appointment appointment,HttpServletRequest request)
	{
		appointmentService.addapp(appointment);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("patienthome");
		HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("euname");
		mv.addObject("pname",euname);
		return mv;
	}
	
	@GetMapping("/doctorlogin")
	public ModelAndView doctorlogindemo()
	{
		ModelAndView mv = new ModelAndView("doctorlogin");
		
		return mv;
	}
	
	@PostMapping("/checkdoclogin")
	public ModelAndView checkdoclogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String duname = request.getParameter("duname");
		String dpwd = request.getParameter("dpwd");
		
		Doctor emp = doctorService.checkdoclogin(duname, dpwd);
		
		if(emp!=null)
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("duname", duname);
			
			mv.setViewName("doctorhome");
		}
		else
		{
			mv.setViewName("doctorlogin");
//			mv.addObject("msg", "Login Failed");
		}
		return mv;
	}
	
	@GetMapping("/doctorhome")
	public ModelAndView doctorhomedemo()
	{
		ModelAndView mv = new ModelAndView("doctorhome");
		return mv;
	}
	
	@GetMapping("/viewapp")
	public ModelAndView viewapp(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String duname = (String) session.getAttribute("duname");
		ModelAndView mv = new ModelAndView("viewapp");
		List<Appointment> applist = doctorService.viewappointment(duname);
		mv.addObject("applist",applist);
		return mv;
	}
	@GetMapping("/deleteapp")
	  public String deleteappdemo(@RequestParam("id") int eid)
	  {
	    doctorService.deleteappointment(eid);
	    return "redirect:viewapp";
	  }
	@RequestMapping("/addpre")
	  public ModelAndView addprescription(@RequestParam("dname") String dname,@RequestParam("pname") String pname, HttpServletRequest request)
	  {
	    ModelAndView mv=new ModelAndView("addpre","pre",new Prescription());
//	    HttpSession session = request.getSession();
//		String euname = (String) session.getAttribute("euname");
	    mv.addObject("dname", dname);
	    mv.addObject("pname", pname);
	    return mv;
	  }
	
	@PostMapping("/addprescription")
	public ModelAndView addprescriptiondemo(@ModelAttribute("pre") Prescription prescription,HttpServletRequest request)
	{
		prescriptionService.addpre(prescription);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("doctorhome");
//		HttpSession session = request.getSession();
//		String euname = (String) session.getAttribute("euname");
		//mv.addObject("pname",pname);
		return mv;
	}
	
	@GetMapping("/viewpre")
	public ModelAndView viewpre(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("euname");
		ModelAndView mv = new ModelAndView("viewpre");
		List<Prescription> prelist = employeeService.viewprescription(euname);
		mv.addObject("prelist",prelist);
		return mv;
	}
	
	@GetMapping("/admindashboard")
	public ModelAndView admindashboarddemo()
	{
		long c1 = adminService.countdoctors();
		long c2 = adminService.countpatients();
		long c3 = adminService.countreceptionists();
		ModelAndView mv = new ModelAndView("admindashh");
		mv.addObject("cou1",c1);
		mv.addObject("cou2",c2);
		mv.addObject("cou3",c3);
		return mv;
	}
	
	@GetMapping("/echangepwd")
    public ModelAndView echangepwd(HttpServletRequest request)
    {
      HttpSession session = request.getSession();
      
      String euname = (String) session.getAttribute("euname");
      
      ModelAndView mv = new ModelAndView();
      mv.setViewName("updatepass");
      mv.addObject("euname",euname);
      
      return mv;
    }
    
    @PostMapping("/updateemppwd")
    public ModelAndView updateemppwddemo(HttpServletRequest request)
    {
      ModelAndView mv = new ModelAndView();
      
      
      HttpSession session = request.getSession();
      
      String euname = (String) session.getAttribute("euname");
      
      String eoldpwd = request.getParameter("eopwd");
      String enewpwd = request.getParameter("enpwd");
      
      int n = employeeService.changeemployeepassword(eoldpwd, enewpwd, euname);
      
      if(n > 0)
      {
        
        mv.setViewName("successpass");
      }
      else
      {
         mv.setViewName("updatepass");
         mv.addObject("msg","Old Password is Incorrect");
      }
      
      return mv;
    }
	
    @GetMapping("/docchangepwd")
    public ModelAndView docchangepwd(HttpServletRequest request)
    {
      HttpSession session = request.getSession();
      
      String duname = (String) session.getAttribute("duname");
      
      ModelAndView mv = new ModelAndView();
      mv.setViewName("docupdatepass");
      mv.addObject("duname",duname);
      
      return mv;
    }
    
    @PostMapping("/updatedocpwd")
    public ModelAndView updatedocpwddemo(HttpServletRequest request)
    {
      ModelAndView mv = new ModelAndView();
      
      
      HttpSession session = request.getSession();
      
      String duname = (String) session.getAttribute("duname");
      
      String doldpwd = request.getParameter("dopwd");
      String dnewpwd = request.getParameter("dnpwd");
      
      int n = doctorService.changedoctorpassword(doldpwd, dnewpwd, duname);
      
      if(n > 0)
      {
        
        mv.setViewName("doctorsuccesspass");
      }
      else
      {
         mv.setViewName("docupdatepass");
         mv.addObject("msg","Old Password is Incorrect");
      }
      
      return mv;
    }
    
    @GetMapping("/recpchangepwd")
    public ModelAndView recpchangepwd(HttpServletRequest request)
    {
      HttpSession session = request.getSession();
      
      String runame = (String) session.getAttribute("runame");
      
      ModelAndView mv = new ModelAndView();
      mv.setViewName("recpupdatepass");
      mv.addObject("runame",runame);
      
      return mv;
    }
    
    @PostMapping("/updaterecppwd")
    public ModelAndView updaterecppwddemo(HttpServletRequest request)
    {
      ModelAndView mv = new ModelAndView();
      
      
      HttpSession session = request.getSession();
      
      String runame = (String) session.getAttribute("runame");
      
      String roldpwd = request.getParameter("ropwd");
      String rnewpwd = request.getParameter("rnpwd");
      
      int n = receptionistService.changereceptionistpassword(roldpwd, rnewpwd, runame);
      
      if(n > 0)
      {
        
        mv.setViewName("receptionistsuccesspass");
      }
      else
      {
         mv.setViewName("recpupdatepass");
         mv.addObject("msg","Old Password is Incorrect");
      }
      
      return mv;
    }
    
    @GetMapping("/displaypatpic")
    public ResponseEntity<byte[]> displaypatpicdemo(@RequestParam("id") int id) throws IOException, SQLException
    {
      Patient patient = adminService.viewemployeebyid(id);
      byte [] imageBytes = null;
      imageBytes = patient.getPatpic().getBytes(1,(int) patient.getPatpic().length());
      
      return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
    }
    
    @GetMapping("/displaydocpic")
    public ResponseEntity<byte[]> displaydocpicdemo(@RequestParam("did") int did) throws IOException, SQLException
    {
      Doctor doctor = doctorService.viewdoctorbyid(did);
      byte [] imageBytes = null;
      imageBytes = doctor.getDocpic().getBytes(1,(int) doctor.getDocpic().length());
      
      return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
    }
    
    @GetMapping("/viewreceptionistbyid")
	  public ModelAndView viewreceptionistbyiddemo(@RequestParam("rid") int rid)
	  {
	   Receptionist rec = adminService.viewreceptionistbyid(rid);
	    
	    ModelAndView mv = new ModelAndView();
	    
	    mv.setViewName("viewreceptbyid");
	    mv.addObject("rec",rec);
	   
	    return mv;
	  }

    @GetMapping("/displayrecppic")
    public ResponseEntity<byte[]> displayrecpdemo(@RequestParam("rid") int rid) throws IOException, SQLException
    {
      Receptionist receptionist = adminService.viewreceptionistbyid(rid);
      byte [] imageBytes = null;
      imageBytes = receptionist.getRecppic().getBytes(1,(int) receptionist.getRecppic().length());
      
      return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
    }
    @RequestMapping("/logout")
    public String logout(HttpServletRequest req){
        req.getSession().invalidate();
        return "index";
    }
    
    @RequestMapping("/xray")
    public ModelAndView xraydemo(@RequestParam("pname") String pname, HttpServletRequest request)
    {
      ModelAndView mv = new ModelAndView("addxray","xray",new Xray());
      HttpSession session = request.getSession();
      String puname = (String) session.getAttribute("pname");
      mv.addObject("pname",pname);
      return mv;
    }
    

    
    @PostMapping("/addxray")
    public ModelAndView addxraydemo(@ModelAttribute("xray") Xray xray,HttpServletRequest request)
    {
      receptionistService.addxray(xray);
      ModelAndView mv = new ModelAndView();
      mv.setViewName("receptionisthome");
      
    return mv;
      
    }
    

    
    @GetMapping("/viewallpatslist")
    public ModelAndView viewallpatslistdemo(HttpServletRequest request)
    {
      ModelAndView mv = new ModelAndView("viewpatientslist");
     // long c2 = adminService.countpatients();
      List<Patient> patlist = adminService.viewallpatients();
      mv.addObject("patlist",patlist);
     // mv.addObject("cou2",c2);
      return mv;
    }
    

    
    @GetMapping("/viewscans")
    public ModelAndView viewscansdemo(HttpServletRequest request)
    {
      HttpSession session = request.getSession();
      String euname = (String) session.getAttribute("euname");
      ModelAndView mv = new ModelAndView("viewscans");
      List<Xray> xraylist = employeeService.viewscans(euname);
      mv.addObject("xraylist",xraylist);
      return mv;
    }
}
