package com.dev.desigRest.SPRINGrestf.user;

import java.util.List;

public interface StackHolder {

	public List<User> findAll();
	public User save(User user);
	public User findOne(int id);
	
	
}
