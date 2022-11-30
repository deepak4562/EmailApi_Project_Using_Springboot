package com.emailsending.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender javamailsender;

	@Override
	public void sendEmail(String to, String sub, String body) {
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setTo(to);
		smm.setSubject(sub);
		smm.setText(body);
		//we had set the value in the object of SimpleMailMessage now we will pass that object in JavaMailSender 
		javamailsender.send(smm);
		System.out.println("Mail Sent");
		
		
		
	}

}
