package com.gg.registration.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gg.registration.modal.Quote;
import com.gg.registration.repository.QuoteRepository;

@Service
public class QuoteService {
	
	 
	@Autowired
	 private QuoteRepository quoterepo;

	
	public Quote saveQuote(Quote quote) {
		return quoterepo.save(quote);
		}
	
	public Quote fetchQuoteByEmailId(String email) {
		return quoterepo.findByEmailId(email);
	}
	
	public Quote fetchQuoteByEmailIdAndPassword(String email,String Phone) {
		return quoterepo.findByEmailIdAndPhone(email, Phone);
	}
	}


