package org.sas.service.login.com.controller;

import javax.servlet.http.HttpServletRequest;

import org.sas.core.util.Result;
import org.sas.service.login.com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author 18782
 *
 */
@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/dologin")
	@ResponseBody
	public Result<String> dologin(String uid,String password) {
		return loginService.login(uid,password);
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("platformName", "平安好链");
		return "login";
	}
	
	@RequestMapping("/index")
	public String index(Model model,HttpServletRequest request) {
		model.addAttribute("uid", request.getSession().getAttribute("uid"));
		return "index";
	}
	
}
