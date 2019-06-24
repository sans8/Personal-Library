package com.yash.plm.dao;

import com.yash.plm.model.User;

public interface UserDAO {
	void save(User user);
	User find(String username);
}
