package com.agora.yourform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.agora.yourform.model.controller.response.UserInfo;
import com.agora.yourform.service.UserService;

@RestController
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/api/user/{id}")
	public UserInfo getUserInfoById(@PathVariable Integer id) {
		return userService.getUserInfoById(id);
	}
}
