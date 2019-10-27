package com.binoykr.examples.datajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.binoykr.examples.datajpa.model.UserModel;
import com.binoykr.examples.datajpa.service.UserService;

@RestController
public class Controller {

	@Autowired
	private UserService userService;

	@RequestMapping(path = "/user", method = RequestMethod.POST)
	public void create(@RequestBody UserModel model) {
		userService.create(model);
	}

	@RequestMapping(path = "/user/{userid}", method = RequestMethod.PUT)
	public void update(@PathVariable(value = "userid") int userId, @RequestBody UserModel model) {
		userService.update(userId, model);
	}

	@RequestMapping(path = "/user/{userid}", method = RequestMethod.GET)
	public UserModel get(@PathVariable(value = "userid") int userId) {
		return userService.get(userId);
	}

}
