package com.bit.gangnam.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit.gangnam.beans.Emp;

@Service
public interface EmpMapper {
	List<Emp> getEmpList();
	int updateEmp(Emp emp);
	Emp getEmp(int empno);
	int insertEmp(Emp emp);
}
