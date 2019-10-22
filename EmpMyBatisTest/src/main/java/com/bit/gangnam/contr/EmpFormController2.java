package com.bit.gangnam.contr;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.gangnam.beans.Emp;
import com.bit.gangnam.beans.Emp2;
import com.bit.gangnam.service.EmpService;

@Controller
@RequestMapping("/emp/insert2.do")
public class EmpFormController2 {

	@Autowired
	private EmpService empService;

	@RequestMapping(method = RequestMethod.GET)
	public String form(@ModelAttribute("emp2") Emp2 emp) {
		//@ModelAttribute : 파라미터로 넘겨 준 타입의 객체를 자동으로 생성한다. 생성된 객체에 HTTP로 넘어 온 값들을 자동으로 바인딩, 객체를 Model 객체에 추가
		return "emp/empform2";
	}

	@ModelAttribute("emp2")
	public Emp2 formBacking(HttpServletRequest request) {
		Emp2 emp = new Emp2();
		return emp;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(@Valid Emp2 emp, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result.toString());
			//emp.setEmps(empService.getEmpList());
			return "emp/empform2";
		}

		//empService.insertEmp(emp);
		return "redirect:/emp/insert2.do?empno=" + emp.getEmpno();
	}
	

}
