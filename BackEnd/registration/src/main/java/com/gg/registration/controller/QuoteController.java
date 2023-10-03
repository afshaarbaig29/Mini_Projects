package com.gg.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gg.registration.modal.Quote;
import com.gg.registration.service.QuoteService;

@RestController
public class QuoteController {

	@Autowired
	private QuoteService service;
	
	@PostMapping("/getquote")
	@CrossOrigin(origins="http://localhost:4200")
	public Quote registerUser(@RequestBody Quote quote) throws Exception{
		String tempemailId= quote.getEmailId();
		if(tempemailId !=null && !"".equals(tempemailId)) {
		Quote quoteobj=service.fetchQuoteByEmailId(tempemailId);
				if(quoteobj !=null) {
					throw new Exception("User with "+tempemailId+"already exists");	
				}
		}
		Quote quoteObj=null;
		quoteObj=service.saveQuote(quote);
		return quoteObj;
	}
}
