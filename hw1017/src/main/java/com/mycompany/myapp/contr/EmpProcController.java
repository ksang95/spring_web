package com.mycompany.myapp.contr;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.myapp.beans.Emp;
import com.mycompany.myapp.service.EmpService;
import com.mycompany.myapp.service.EmpServiceImpl;

@Controller
@RequestMapping("/emp")
public class EmpProcController {
	private static final Logger logger = LoggerFactory.getLogger(EmpServiceImpl.class);
	EmpService service = new EmpServiceImpl();

	public void mm() {

	}

	@RequestMapping("/empUpdate")
	public void empUpdate() {
	}

	@RequestMapping("/empInfoEdit")
	public void empInfoEdit(int empno, Model model) {
		model.addAttribute("emp", service.getEmp(empno));
	}

	@RequestMapping("/empUpdateResult")
	public String empUpdateResult(int empno, String ename, String job, int mgr, Model model) {
		Emp emp = new Emp(empno, ename, job, mgr);
		int result = service.updateEmp(emp);
		if (result == 0) {
			logger.error("empUpdateResult() emp update 실패");
			model.addAttribute("emp", service.getEmp(empno));
			return "emp/empInfoEdit";
		}
		logger.info("empUpdateResult() emp update 성공");
		model.addAttribute("empList", service.getEmpList());
		return "emp/empList";

	}

	@RequestMapping("/empList")
	public void empList(Model model) {
		model.addAttribute("empList", service.getEmpList());

	}
}
