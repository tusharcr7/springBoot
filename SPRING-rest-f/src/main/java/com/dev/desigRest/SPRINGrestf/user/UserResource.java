package com.dev.desigRest.SPRINGrestf.user;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	StackHolder obj;

	@GetMapping(path = "/users")
	public List<User> getAllUsers() {
		return obj.findAll();

	}

	@GetMapping(path = "/users/{id}")
	public /*EntityModel<User>*/ User getUserById(@PathVariable int id) {
		User og = obj.findOne(id);
		if (null == og) {
			throw new UserNotFoundException("no User found for id= " + id);
		}
		return og;

		/*
		 * EntityModel<User> objEntityModelUser = new EntityModel<User>(og);
		 * WebMvcLinkBuilder objwmvclinkbuild =
		 * linkTo(methodOn(this.getClass()).getAllUsers());
		 * objEntityModelUser.add(objwmvclinkbuild.withRel("all-users")); return
		 * objEntityModelUser;
		 */

	}

	@PostMapping(path = "/users")
	public /*ResponseEntity<Object>*/ User cUSer(@Valid @RequestBody User user) {

		User f = obj.save(user);
		/*
		 * URI location =
		 * ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand
		 * (f.getId()).toUri(); return ResponseEntity.created(location).build();
		 */
		return f;
	}

	@DeleteMapping(path = "/users/{id}")
	public void deleteUserById(@PathVariable int id) {
		User og = obj.deletOne(id);
		if (null == og) {
			throw new UserNotFoundException("no User found for id= " + id);
		}

	}

}
