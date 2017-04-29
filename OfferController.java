package com.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

public class OfferController {
	@RequestMapping("/")
	public String showHome(HttpSession session) {
		
		session.setAttribute("name", "Boris");
		
		return "home";
	}

}
