package com.example.emailassistant.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public String generateReply(String emailText, String type) {

        if(type == null){
            type = "general";
        }

        switch(type.toLowerCase()) {

            case "business":
                return "Thank you for your interest in our services. We will share pricing details shortly.";

            case "support":
                return "Thank you for contacting support. Our team will resolve your issue soon.";

            case "internship":
                return "Thank you for your interest in internship opportunities. Our HR team will contact you.";

            case "complaint":
                return "We apologize for the inconvenience. Your complaint has been noted and we will take action.";

            default:
                return "Thank you for your email. We have received your message and will get back to you shortly.";
        }
    }
}