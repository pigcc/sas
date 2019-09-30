package org.sas.service.login.com.controller;

import org.sas.core.util.Result;
import org.sas.service.login.com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author 18782
 *
 */
@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/login")
	public Result<String> login(String uid) {
		return loginService.login(uid);
	}
	
}
