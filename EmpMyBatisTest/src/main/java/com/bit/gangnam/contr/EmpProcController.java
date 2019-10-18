package com.bit.gangnam.contr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.gangnam.beans.Emp;
import com.bit.gangnam.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpProcController {
	private static final Logger logger = LoggerFactory.getLogger(EmpProcController.class);
//	@Autowired
//	EmpMapper empMapper;

	@Autowired
	EmpService empService;
	
	@RequestMapping("/login")
	public void login() {
		
	}
	
	@RequestMapping("/loginResult")
	public String loginResult(int empno, Model model) {
		model.addAttribute("emp", empService.getEmp(empno));
		return "emp/login";
	}
	
	@RequestMapping("/empList")
	public void empList(Model model) {
		//model.addAttribute("empList",empMapper.getEmpList());
		model.addAttribute("empList",empService.getEmpList());
	}
	
	@RequestMapping("/empUpdate")
	public void empUpdate() {
	}

	@RequestMapping("/empUpdateProc")
	public void empUpdateProc(int empno, Model model) {
		model.addAttribute("emp", empService.getEmp(empno));
	}


	@RequestMapping("/empUpdateResult")
	public String empUpdateResult(Emp emp, Model model) {
		int result = empService.updateEmp(emp);
		if (result == 0) {
			logger.error("empUpdateResult() emp update 실패");
			model.addAttribute("emp", empService.getEmp(emp.getEmpno()));
			return "emp/empInfoEdit";
		}
		logger.info("empUpdateResult() emp update 성공");
		model.addAttribute("empList", empService.getEmpList());
		return "emp/empList";

	}
}
