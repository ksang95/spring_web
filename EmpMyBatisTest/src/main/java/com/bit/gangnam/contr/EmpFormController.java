package com.bit.gangnam.contr;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.gangnam.beans.Emp;
import com.bit.gangnam.service.EmpService;
import com.bit.gangnam.validator.EmpValidator;

@Controller
@RequestMapping("/emp/insert.do")
public class EmpFormController {

	@Autowired
	private EmpService empService;

	@RequestMapping(method = RequestMethod.GET)
	public String form(@ModelAttribute("emp2") Emp emp, Model model) {
		//@ModelAttribute : 파라미터로 넘겨 준 타입의 객체를 자동으로 생성한다. 생성된 객체에 HTTP로 넘어 온 값들을 자동으로 바인딩, 객체를 Model 객체에 추가
		model.addAttribute("emp",emp);
		return "emp/empform";
	}

	@ModelAttribute("emp2")
	public Emp formBacking(HttpServletRequest request) {
		Emp emp = new Emp();
		String empnoStr = request.getParameter("empno");
		if (empnoStr != null) {
			int empno = Integer.parseInt(empnoStr);
			emp = empService.getEmp(empno);
		}
		if (request.getMethod().equalsIgnoreCase("GET")) {
			emp.setEmps(empService.getEmpList());
		}
		return emp;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(@Valid Emp emp, BindingResult result) {
		//@Valid+BindingResult : 설정된 validator 통해 바인딩된 객체의 유효성 검증
		if (result.hasErrors()) {
			System.out.println(result.toString());
			emp.setEmps(empService.getEmpList());
			return "emp/empform";
		}

		empService.insertEmp(emp);
		return "redirect:/emp/insert.do?empno=" + emp.getEmpno();
	}

	@InitBinder  //@Valid annotation으로 검증이 필요한 객체를 가져오기 전에 수행할 method를 지정해주는 annotation
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new EmpValidator());  //유효성 검사 위한 validator 설정
	}

}
