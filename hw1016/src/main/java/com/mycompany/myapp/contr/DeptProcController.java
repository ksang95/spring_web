package com.mycompany.myapp.contr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
public class DeptProcController {
	public void mm() {
		
	}
	
	@RequestMapping("/login")
	public void login() { //입력된 url(value)와 호출할 jsp이름같으면 리턴 필요없다 대신 value전달
		
	}
	
	@RequestMapping("/empList")
	public void empList() {
		
	}
}
