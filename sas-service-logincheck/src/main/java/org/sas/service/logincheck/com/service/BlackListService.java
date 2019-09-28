package org.sas.service.logincheck.com.service;

import org.sas.core.util.Result;

public interface BlackListService {

	Result<String> loginCheck(String uid);

}

