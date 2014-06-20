/*
 * devjav [http://devjav.com]
 * Copyright (C) 2014-2014 Pham Thai Thinh
 * Contact:phamthaithinh@gmail.com
 * 
 */
package com.devjav.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 * 
 * @author Pham Thai Thinh
 * 
 */
public class CustomAuthenticate implements AuthenticationManager {

	@Override
	public Authentication authenticate(Authentication auth)
			throws AuthenticationException {
		// call third party to authentication here
		// username: auth.getName()
		// password: auth.getCredentials()
		// simple demo check user=dejav and password is 1234
		if (auth.getName().equals("devjav")
				&& auth.getCredentials().equals("1234")) {
			UsernamePasswordAuthenticationToken authenticate = new UsernamePasswordAuthenticationToken(
					auth.getName(), auth.getCredentials(),
					grantAuthorities("user"));
			return authenticate;
		}
		throw new BadCredentialsException(
				"Your login attempt was not successful.Please check your username or password and try again.");
	}

	public Collection<GrantedAuthority> grantAuthorities(String role) {
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
		authList.add(new SimpleGrantedAuthority("ROLE_" + role.toUpperCase()));
		return authList;
	}
}
