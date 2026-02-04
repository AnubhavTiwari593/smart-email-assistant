package com.example.emailassistant.controller;

import com.example.emailassistant.dto.EmailRequest;
import com.example.emailassistant.service.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/generate-reply")
    public String generateReply(@RequestBody EmailRequest request) {

        return emailService.generateReply(
                request.getEmailText(),
                request.getType()
        );
    }
}