package org.sas.service.login.com.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.sas.core.util.Result;
import org.sas.service.login.com.entity.User;
import org.sas.service.login.com.mapper.UserMapper;
import org.sas.service.login.com.remote.logincheck.CheckLogin;
import org.sas.service.login.com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private CheckLogin checkLogin;
	@Autowired
	private HttpServletRequest request;
	@Override
	public Result<String> login(String uid,String password) {
		Result<String> result=null;
		
		result=checkLogin.loginBlackListCheck(uid);
		if(!result.isSuccess()) {
			return result;
		}
		
		Map<String, Object> queryMap=new HashMap<>();
		queryMap.put("uid", uid);
		queryMap.put("password", password);
		int count=userMapper.selectCount(new QueryWrapper<User>().allEq(queryMap));
		if(count==1) {
			result=new Result<String>(true);
			//創建session
			createSession(uid);
			return result;
		}
		
		result= new Result<String>(false,"用戶名或密碼錯誤");
		return result;
	}
	private void createSession(String uid) {
		HttpSession session=request.getSession();
		session.setAttribute("uid", uid);
		session.setMaxInactiveInterval(60*30);
	}
}
