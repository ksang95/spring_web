package com.bit.gangnam.contr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.gangnam.beans.Emp;

@Controller
public class FormCommandController {
	@RequestMapping("empForm")
	public String empForm(@ModelAttribute Emp emp, BindingResult result) {
		
		return "empForm";
	}
	
	@RequestMapping("mm")
	public void empFormView(Model model) {
		model.addAttribute("emp", new Emp());
	}
}

