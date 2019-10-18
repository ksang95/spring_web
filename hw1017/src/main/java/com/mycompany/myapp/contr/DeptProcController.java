package com.mycompany.myapp.contr;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.myapp.beans.Emp;

@Controller
@RequestMapping("/dept")
public class DeptProcController {
	public void mm() {
		
	}
	
	@RequestMapping("/login")
	public void login() {
		
	}
	
	@RequestMapping("/empsInsert")
	public String empsInsert(Emp emps, Model model) {
		System.out.println(emps);
		model.addAttribute("emps", emps);
		return "dept/empList";
	}
}
