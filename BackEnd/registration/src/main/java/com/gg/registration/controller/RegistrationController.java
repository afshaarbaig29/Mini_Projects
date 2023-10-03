package com.gg.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gg.registration.modal.User;
import com.gg.registration.service.RegistrationService;
import java.lang.Exception;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
	@CrossOrigin(origins="http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception{
		String tempemailId= user.getEmailId();
		if(tempemailId !=null && !"".equals(tempemailId)) {
		User userobj=service.fetchUserByEmailId(tempemailId);
				if(userobj !=null) {
					throw new Exception("User with"+tempemailId+"already exists");	
				}
		}
		User userObj=null;
		userObj=service.saveUser(user);
		return userObj;
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception{
		String tempemailId= user.getEmailId();
		String temppass= user.getPassword();
		User userObj=null;
		if(tempemailId != null && temppass !=null) {
			userObj=service.fetchUserByEmailIdAndPassword(tempemailId,temppass);
		}
		if(userObj==null) {
			throw new Exception("User does not exist");
		}
		return userObj;
		
	}
	
}
