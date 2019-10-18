package com.bit.gangnam.service;

import java.util.List;

import com.bit.gangnam.beans.Emp;

public interface EmpService {
	List<Emp> getEmpList();
	int updateEmp(Emp emp);
	Emp getEmp(int empno);
}
