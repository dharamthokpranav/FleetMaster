package com.pranav.dharamthok.Photoz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(String to, String subject, String text){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("samuser3010@gmail.com");
        message.setSubject(subject);
        message.setTo(to);
        message.setText(text);
        emailSender.send(message);
    }
}
