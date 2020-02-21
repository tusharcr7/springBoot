package com.dev.desigRest.SPRINGrestf.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService implements StackHolder {

	private static List<User> users = new ArrayList<User>();
	private static Integer usersCount;

	static {

		users.add(new User(1, "mjhgkgbl", new Date()));
		users.add(new User(2, "mjhgl", new Date()));
		users.add(new User(3, "mjhgkgbl", new Date()));
		users.add(new User(4, "jhgkgbl", new Date()));
		usersCount = users.size();
	}

	public List<User> findAll() {

		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		} else {
			users.add(user);
		}
		return user;
	}

	public User findOne(int id) {
		for (User s : users) {
			if (s.getId() == id)
				return s;
		}
		return null;

	}

}
