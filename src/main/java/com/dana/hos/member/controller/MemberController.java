package com.dana.hos.member.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/login/loginForm", method = RequestMethod.GET)
	public String loginForm(Locale locale, Model model) {
		return "member/login/loginForm";
	}
	
	@RequestMapping(value = "/login/accessDenied", method = RequestMethod.GET)
	public String accessDenied(Locale locale, Model model) {
		return "member/login/accessDenied";
	}
	
	@RequestMapping(value = "/join/joinForm", method = RequestMethod.GET)
	public String joinForm(Locale locale, Model model) {
		return "member/join/joinForm";
	}
}