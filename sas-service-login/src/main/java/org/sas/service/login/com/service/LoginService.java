package org.sas.service.login.com.service;

import org.sas.core.util.Result;

public interface LoginService {
	Result<String> login(String uid, String password);
}

