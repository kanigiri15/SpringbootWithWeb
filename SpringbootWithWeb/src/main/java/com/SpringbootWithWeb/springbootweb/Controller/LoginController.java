package com.SpringbootWithWeb.springbootweb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SpringbootWithWeb.springbootweb.DAO.UserDAO;
import com.SpringbootWithWeb.springbootweb.model.User;
import com.SpringbootWithWeb.springbootweb.service.LoginService;

@Controller
public class LoginController { 

	@Autowired
	LoginService loginService;
	UserDAO userDao;
	@RequestMapping(value="/")
	public String loadingPage(@ModelAttribute("userv") User user) {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(@ModelAttribute("userv") User user){
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String LoginService(@ModelAttribute("userv") User user, ModelMap model) {
		int tempValue = loginService.validUser(user);
		if(tempValue==1)
		{
			model.put("name", user.getUserId());
			model.put("password", user.getPassword());
			return "Welcome";
		}
		else if(tempValue == 2) {
			model.put("errorPwd", "Incorrect Password");
			return "login";
		}
//		logger.info("All Users",userDao.findAll());
		model.put("errorMsg", "InValid Credentials");
		return "login";
	}	
}
