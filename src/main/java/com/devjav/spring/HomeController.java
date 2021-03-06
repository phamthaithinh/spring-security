package com.devjav.spring;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale) {
		logger.info("Welcome User home! The client locale is {}.", locale);

		return "home";
	}
	@RequestMapping(value = "/admin/home.do", method = RequestMethod.GET)
	public String Adminhome(Locale locale) {
		logger.info("Welcome to Admin home! The client locale is {}.", locale);

		return "adminhome";
	}
	@RequestMapping(value = "/accessdenied.do", method = RequestMethod.GET)
	public String accessDenied() {
		logger.info("Access deniend.");
		return "accessdenied";
	}
}
