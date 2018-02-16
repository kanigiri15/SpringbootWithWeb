package com.SpringbootWithWeb.springbootweb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SpringbootWithWeb.springbootweb.model.User;
import com.SpringbootWithWeb.springbootweb.service.RegistrationService;

@Controller
public class RegisterController {

	@Autowired
	RegistrationService registrartionService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegistrationPage(@ModelAttribute("register") User user){
		return "Register";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("register") User user, ModelMap model) {
		if(registrartionService.registerUser(user)) {
			model.put("errorMsg", "Registration Successful");
			return "redirect:/login";
		}
		model.put("errorMsg", "Username has already taken");
		return "Register";
		
	}
	
	
}
