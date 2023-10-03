package com.gg.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gg.registration.modal.Admin;


public interface AdminRepository extends JpaRepository <Admin,Integer>{
	public Admin findByEmailId(String emailId);
	public Admin findByEmailIdAndPassword(String emailId, String Password);



}