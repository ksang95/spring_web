package com.mycompany.myapp.service;

import java.util.List;

import com.mycompany.myapp.beans.Emp;

public interface EmpService {
	List<Emp> getEmpList();
	Emp getEmp(int empno);
	int updateEmp(Emp emp);
}
