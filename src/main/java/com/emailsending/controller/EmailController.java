package com.emailsending.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emailsending.utility.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailservice;
	
	@RequestMapping("/")
	public String gotoJspPage() {
		return "mailpage";
	}
	

	@RequestMapping("/myform")
	public String  callanEmailApi(@RequestParam("to")String to,
			@RequestParam("subject")String sub,
			@RequestParam("body")String body) {
//		Random random=new Random();
//		int nextInt = random.nextInt(9999);
//		while(true) {
//			if(nextInt>1000) 
//				break;
//				
//			
//			emailservice.sendEmail(to, sub, body.concat(String.valueOf(nextInt)));
//		}
		
		emailservice.sendEmail(to, sub, body);
		
		//emailservice.sendEmail("dkdkdas545@gmail.com", "Java Developer Recruitment", "Is there vacancy?");
		return "succ";
	}
}
