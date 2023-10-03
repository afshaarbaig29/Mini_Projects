package com.gg.registration.repository;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.gg.registration.modal.Quote;


	public interface QuoteRepository extends JpaRepository <Quote,Integer>{
		public Quote findByEmailId(String emailId);
		public Quote findByEmailIdAndPhone(String emailId, String Phone);



	}

