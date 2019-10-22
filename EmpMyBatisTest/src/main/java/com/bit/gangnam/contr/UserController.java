package com.bit.gangnam.contr;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.gangnam.beans.User;

@Controller
public class UserController {
	private static final Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("user/formView")
	public String form(Model model) {
		model.addAttribute("user",new User());
		return "user/form";
	}
	@RequestMapping("user/register")
	public String userRegister(Model model, @Valid User user, BindingResult result) {
		logger.info(""+result.hasErrors());
		return "user/form";
	}
}
