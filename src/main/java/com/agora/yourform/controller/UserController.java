package com.agora.yourform.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.agora.yourform.model.controller.response.UserInfo;
import com.agora.yourform.service.UserService;

@RestController
@Validated
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(path = "/api/user/{id}", method = { RequestMethod.OPTIONS, RequestMethod.GET })
	public UserInfo getUserInfoById(@PathVariable Integer id) {
		return userService.getUserInfoById(id);
	}

	@PostMapping("/api/user")
	@ResponseStatus(HttpStatus.OK)
	public void createUser(@Valid @RequestBody UserInfo userInfo) {
		userService.createUser(userInfo);
	}
}
