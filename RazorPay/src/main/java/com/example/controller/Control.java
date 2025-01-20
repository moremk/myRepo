package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {

    @Value("${razorpay.api.key}")
    private String razorpayApiKey;
    
    @GetMapping("/index")
    public String handleAnotherRequest(Model model) {
    	model.addAttribute("apiKey", razorpayApiKey);
    	model.addAttribute("amount", 1000);  
    	model.addAttribute("orderId", "OID" + (int)(Math.random() * 1000)); 
        return "index";
    }
    @RequestMapping("/index")
    public String index() {
    	
    	return "redirect:/index";
    }
    
}
