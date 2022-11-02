package com.comp5130.eAssess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.comp5130.eAssess.controller.bean.User;
import com.comp5130.eAssess.service.UserService;


@Controller
public class LoginController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model, @RequestParam String username, @RequestParam String password) {
		User user = userService.getUserByUsername(username);

		if (user.getPassword().equals(password)) {
			model.put("username", username);
			return "welcome";
		}

		model.put("errormsg", "Please enter correct username or password");
		return "login";
	}
}
