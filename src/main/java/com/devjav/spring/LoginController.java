/*
 * devjav [http://devjav.com]
 * Copyright (C) 2014-2014 Pham Thai Thinh
 * Contact:phamthaithinh@gmail.com
 * 
 */
package com.devjav.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Pham Thai Thinh
 * 
 */
@Controller
public class LoginController {
	@RequestMapping(value = {"/login.do","/"}, method = RequestMethod.GET)
	public String showLogin() {
		return "login";
	}

}
