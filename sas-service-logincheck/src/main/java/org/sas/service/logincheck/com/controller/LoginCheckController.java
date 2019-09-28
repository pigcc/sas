package org.sas.service.logincheck.com.controller;

import org.sas.core.util.Result;
import org.sas.service.logincheck.com.service.BlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author 18782
 *
 */
@RestController(value="/login")
public class LoginCheckController {

	@Autowired
	private BlackListService loginService;

	@RequestMapping("/login")
	public Result<String> login(@RequestParam("uid")String uid) {
		return loginService.loginCheck(uid);
	}
	
}
