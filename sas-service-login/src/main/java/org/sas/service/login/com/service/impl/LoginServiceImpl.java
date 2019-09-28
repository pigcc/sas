package org.sas.service.login.com.service.impl;

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
	@Override
	public Result<String> login(String uid) {
		Result<String> result=null;
		result=checkLogin.loginBlackListCheck(uid);
		if(!result.isSuccess()) {
			return result;
		}
		int count=userMapper.selectCount(new QueryWrapper<User>().eq("uid", uid));
		if(count==1) {
			result=new Result<String>(true);
		}
		return new Result<String>(false);
	}

}
