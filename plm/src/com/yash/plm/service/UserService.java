package com.yash.plm.service;

import com.yash.plm.exception.UserException;
import com.yash.plm.model.User;

public interface UserService {
	User getUser(String loginName,String password);
	void add(User user) throws UserException;
}
