package com.dev.desigRest.SPRINGrestf.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	StackHolder obj;
	
	@GetMapping(path="/allUsers")
	public List<User> getAllUsers()
	{
		return obj.findAll();
		
		
	}
	@GetMapping(path="/user/{id}" )
	public User getUserById(@PathVariable int id)
	{
		return obj.findOne(id);
		
		
	}
	
	@PostMapping(path="/users")
	public User cUSer(@RequestBody User user)
	{
		
		return obj.save(user);
	}
	
}
