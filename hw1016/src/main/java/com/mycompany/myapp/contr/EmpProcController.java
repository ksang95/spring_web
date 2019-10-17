package com.mycompany.myapp.contr;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.myapp.service.EmpService;
import com.mycompany.myapp.service.EmpServiceImpl;

@Controller
@RequestMapping("/emp")
public class EmpProcController {
	EmpService service = new EmpServiceImpl();
	public void mm() {

	}

	@RequestMapping("/login")  // /emp/login
	public void login() {
	}

	@RequestMapping("/loginResult")
	public void loginResult(int empno, Model model) { // 입력된 url(value)와 호출할 jsp이름같으면 리턴 필요없다 대신 value전달
		model.addAttribute("login", service.getEmp(empno));
	}

	@RequestMapping("/empList")
	public void empList(Model model) {
		// Emp 클래스
		// sql 실행
		// emp목록을 jsp로 전달
		model.addAttribute("empList", service.getEmpList());

	}
}
