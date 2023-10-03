package com.gg.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.gg.registration.modal.Admin;
import com.gg.registration.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService adservice;

	@PostMapping("/loginAdmin")
	@CrossOrigin(origins="http://localhost:4200")
	public Admin loginAdmin(@RequestBody Admin admin) throws Exception{
		String tempemailId= admin.getEmailId();
		String temppass= admin.getPassword();
		Admin adminObj=null;
		if(tempemailId != null && temppass !=null) {
			adminObj=adservice.fetchAdminByEmailIdAndPassword(tempemailId,temppass);
		}
		if(adminObj==null) {
			throw new Exception("Admin does not exist");
		}
		return adminObj;
		
	}
}
