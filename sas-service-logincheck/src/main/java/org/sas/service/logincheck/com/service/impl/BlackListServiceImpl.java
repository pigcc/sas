package org.sas.service.logincheck.com.service.impl;

import org.sas.core.util.Result;
import org.sas.service.logincheck.com.entity.BlackList;
import org.sas.service.logincheck.com.mapper.BlackListMapper;
import org.sas.service.logincheck.com.service.BlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

@Service
public class BlackListServiceImpl implements BlackListService {
	@Autowired
	private BlackListMapper userMapper;

	@Override
	public Result<String> loginCheck(String uid) {
		if(userMapper.selectCount(new QueryWrapper<BlackList>().eq("uid", uid))>0) {
			return new Result<>(false, "該用戶位於黑名單，不允許登錄！");
		}
		return new Result<>(true);
	}

}
