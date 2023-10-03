package com.gg.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gg.registration.modal.Admin;
import com.gg.registration.repository.AdminRepository;

@Service
public class AdminService {
	
	 
	@Autowired
	 private AdminRepository adrepo;

	
	public Admin saveAdmin(Admin Admin) {
		return adrepo.save(Admin);
		}
	
	public Admin fetchAdminByEmailId(String email) {
		return adrepo.findByEmailId(email);
	}
	
	public Admin fetchAdminByEmailIdAndPassword(String email,String Password) {
		return adrepo.findByEmailIdAndPassword(email, Password);
	}
	}
