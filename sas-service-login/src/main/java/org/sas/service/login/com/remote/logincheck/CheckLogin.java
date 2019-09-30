package org.sas.service.login.com.remote.logincheck;

import org.sas.core.util.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value="service-logincheck")
public interface CheckLogin {
		//登录黑名单校验
		@GetMapping(value="/checklogin/loginBlackListCheck")
		Result<String> loginBlackListCheck(@RequestParam("uid") String uid);
}
